/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuli.entities;

import java.io.Serializable;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Eduardo
 */
@Entity
@Table(name = "License")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "License.findAll", query = "SELECT l FROM License l")
    , @NamedQuery(name = "License.findByLId", query = "SELECT l FROM License l WHERE l.lId = :lId")
    , @NamedQuery(name = "License.findByExpirationDate", query = "SELECT l FROM License l WHERE l.expirationDate = :expirationDate")
    , @NamedQuery(name = "License.findByInstallationKey", query = "SELECT l FROM License l WHERE l.installationKey = :installationKey")})
public class License implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "l_id")
    private Integer lId;
    @Column(name = "expiration_date")
    @Temporal(TemporalType.DATE)
    private Date expirationDate;
    @Size(max = 45)
    @Column(name = "installation_key")
    private String installationKey;
    @JoinColumn(name = "op_id", referencedColumnName = "op_id")
    @ManyToOne
    private OfferProduct opId;
    @JoinColumn(name = "per_id", referencedColumnName = "per_id")
    @ManyToOne(optional = false)
    private PerKu perId;
    @JoinColumn(name = "m_id", referencedColumnName = "m_id")
    @ManyToOne
    private Maintenance mId;
    @JoinColumn(name = "p_id", referencedColumnName = "p_id")
    @ManyToOne
    private Product pId;

    public License() {
    }

    public License(Integer lId) {
        this.lId = lId;
    }

    public Integer getLId() {
        return lId;
    }

    public void setLId(Integer lId) {
        this.lId = lId;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getInstallationKey() {
        return installationKey;
    }

    public void setInstallationKey(String installationKey) {
        this.installationKey = installationKey;
    }

    public OfferProduct getOpId() {
        return opId;
    }

    public void setOpId(OfferProduct opId) {
        this.opId = opId;
    }

    public PerKu getPerId() {
        return perId;
    }

    public void setPerId(PerKu perId) {
        this.perId = perId;
    }

    public Maintenance getMId() {
        return mId;
    }

    public void setMId(Maintenance mId) {
        this.mId = mId;
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
        hash += (lId != null ? lId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof License)) {
            return false;
        }
        License other = (License) object;
        if ((this.lId == null && other.lId != null) || (this.lId != null && !this.lId.equals(other.lId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kuli.entities.License[ lId=" + lId + " ]";
    }
    
}
