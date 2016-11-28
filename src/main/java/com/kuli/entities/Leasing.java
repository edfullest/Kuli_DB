/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuli.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Eduardo
 */
@Entity
@Table(name = "Leasing")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Leasing.findAll", query = "SELECT l FROM Leasing l")
    , @NamedQuery(name = "Leasing.findByLeId", query = "SELECT l FROM Leasing l WHERE l.leId = :leId")
    , @NamedQuery(name = "Leasing.findByExpirationDate", query = "SELECT l FROM Leasing l WHERE l.expirationDate = :expirationDate")
    , @NamedQuery(name = "Leasing.findByFirstInvoice", query = "SELECT l FROM Leasing l WHERE l.firstInvoice = :firstInvoice")
    , @NamedQuery(name = "Leasing.findByLateInvoice", query = "SELECT l FROM Leasing l WHERE l.lateInvoice = :lateInvoice")
    , @NamedQuery(name = "Leasing.findByNextInvoice", query = "SELECT l FROM Leasing l WHERE l.nextInvoice = :nextInvoice")})
public class Leasing implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "le_id")
    private Integer leId;
    @Column(name = "expiration_date")
    @Temporal(TemporalType.DATE)
    private Date expirationDate;
    @Column(name = "first_invoice")
    @Temporal(TemporalType.DATE)
    private Date firstInvoice;
    @Column(name = "late_invoice")
    @Temporal(TemporalType.DATE)
    private Date lateInvoice;
    @Column(name = "next_invoice")
    @Temporal(TemporalType.DATE)
    private Date nextInvoice;
    @OneToMany(mappedBy = "leId")
    private Collection<OfferProduct> offerProductCollection;
    @JoinColumn(name = "per_id", referencedColumnName = "per_id")
    @ManyToOne(optional = false)
    private PerKu perId;
    @JoinColumn(name = "p_id", referencedColumnName = "p_id")
    @ManyToOne(optional = false)
    private Product pId;

    public Leasing() {
    }

    public Leasing(Integer leId) {
        this.leId = leId;
    }

    public Integer getLeId() {
        return leId;
    }

    public void setLeId(Integer leId) {
        this.leId = leId;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Date getFirstInvoice() {
        return firstInvoice;
    }

    public void setFirstInvoice(Date firstInvoice) {
        this.firstInvoice = firstInvoice;
    }

    public Date getLateInvoice() {
        return lateInvoice;
    }

    public void setLateInvoice(Date lateInvoice) {
        this.lateInvoice = lateInvoice;
    }

    public Date getNextInvoice() {
        return nextInvoice;
    }

    public void setNextInvoice(Date nextInvoice) {
        this.nextInvoice = nextInvoice;
    }

    @XmlTransient
    public Collection<OfferProduct> getOfferProductCollection() {
        return offerProductCollection;
    }

    public void setOfferProductCollection(Collection<OfferProduct> offerProductCollection) {
        this.offerProductCollection = offerProductCollection;
    }

    public PerKu getPerId() {
        return perId;
    }

    public void setPerId(PerKu perId) {
        this.perId = perId;
    }

    public Product getPId() {
        return pId;
    }

    public void setPId(Product pId) {
        this.pId = pId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (leId != null ? leId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Leasing)) {
            return false;
        }
        Leasing other = (Leasing) object;
        if ((this.leId == null && other.leId != null) || (this.leId != null && !this.leId.equals(other.leId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kuli.entities.Leasing[ leId=" + leId + " ]";
    }
    
}
