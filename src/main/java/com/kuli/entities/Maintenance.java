/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuli.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "Maintenance")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Maintenance.findAll", query = "SELECT m FROM Maintenance m")
    , @NamedQuery(name = "Maintenance.findByMId", query = "SELECT m FROM Maintenance m WHERE m.mId = :mId")
    , @NamedQuery(name = "Maintenance.findByStartDate", query = "SELECT m FROM Maintenance m WHERE m.startDate = :startDate")
    , @NamedQuery(name = "Maintenance.findByExpirationDate", query = "SELECT m FROM Maintenance m WHERE m.expirationDate = :expirationDate")
    , @NamedQuery(name = "Maintenance.findByPrice", query = "SELECT m FROM Maintenance m WHERE m.price = :price")
    , @NamedQuery(name = "Maintenance.findByPaidUntil", query = "SELECT m FROM Maintenance m WHERE m.paidUntil = :paidUntil")})
public class Maintenance implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "m_id")
    private Integer mId;
    @Column(name = "start_date")
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @Column(name = "expiration_date")
    @Temporal(TemporalType.DATE)
    private Date expirationDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "price")
    private BigDecimal price;
    @Column(name = "paid_until")
    @Temporal(TemporalType.DATE)
    private Date paidUntil;
    @OneToMany(mappedBy = "mId")
    private Collection<License> licenseCollection;

    public Maintenance() {
    }

    public Maintenance(Integer mId) {
        this.mId = mId;
    }

    public Integer getMId() {
        return mId;
    }

    public void setMId(Integer mId) {
        this.mId = mId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getPaidUntil() {
        return paidUntil;
    }

    public void setPaidUntil(Date paidUntil) {
        this.paidUntil = paidUntil;
    }

    @XmlTransient
    public Collection<License> getLicenseCollection() {
        return licenseCollection;
    }

    public void setLicenseCollection(Collection<License> licenseCollection) {
        this.licenseCollection = licenseCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mId != null ? mId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Maintenance)) {
            return false;
        }
        Maintenance other = (Maintenance) object;
        if ((this.mId == null && other.mId != null) || (this.mId != null && !this.mId.equals(other.mId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kuli.entities.Maintenance[ mId=" + mId + " ]";
    }
    
}
