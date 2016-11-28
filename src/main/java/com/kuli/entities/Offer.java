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
import javax.persistence.CascadeType;
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
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Eduardo
 */
@Entity
@Table(name = "Offer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Offer.findAll", query = "SELECT o FROM Offer o")
    , @NamedQuery(name = "Offer.findByOId", query = "SELECT o FROM Offer o WHERE o.oId = :oId")
    , @NamedQuery(name = "Offer.findByDate", query = "SELECT o FROM Offer o WHERE o.date = :date")
    , @NamedQuery(name = "Offer.findByLimitDate", query = "SELECT o FROM Offer o WHERE o.limitDate = :limitDate")})
public class Offer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "o_id")
    private Integer oId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Basic(optional = false)
    @NotNull
    @Column(name = "limit_date")
    @Temporal(TemporalType.DATE)
    private Date limitDate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "oId")
    private Collection<OfferProduct> offerProductCollection;
    @JoinColumn(name = "per_id", referencedColumnName = "per_id")
    @ManyToOne(optional = false)
    private PerKu perId;

    public Offer() {
    }

    public Offer(Integer oId) {
        this.oId = oId;
    }

    public Offer(Integer oId, Date date, Date limitDate) {
        this.oId = oId;
        this.date = date;
        this.limitDate = limitDate;
    }

    public Integer getOId() {
        return oId;
    }

    public void setOId(Integer oId) {
        this.oId = oId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getLimitDate() {
        return limitDate;
    }

    public void setLimitDate(Date limitDate) {
        this.limitDate = limitDate;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (oId != null ? oId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Offer)) {
            return false;
        }
        Offer other = (Offer) object;
        if ((this.oId == null && other.oId != null) || (this.oId != null && !this.oId.equals(other.oId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kuli.entities.Offer[ oId=" + oId + " ]";
    }
    
}
