/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuli.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Eduardo
 */
@Entity
@Table(name = "Offer_Product")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OfferProduct.findAll", query = "SELECT o FROM OfferProduct o")
    , @NamedQuery(name = "OfferProduct.findByOpId", query = "SELECT o FROM OfferProduct o WHERE o.opId = :opId")
    , @NamedQuery(name = "OfferProduct.findByQuantity", query = "SELECT o FROM OfferProduct o WHERE o.quantity = :quantity")
    , @NamedQuery(name = "OfferProduct.findBySalePrice", query = "SELECT o FROM OfferProduct o WHERE o.salePrice = :salePrice")})
public class OfferProduct implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "op_id")
    private Integer opId;
    @Column(name = "quantity")
    private Integer quantity;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "sale_price")
    private BigDecimal salePrice;
    @JoinColumn(name = "i_id", referencedColumnName = "i_id")
    @ManyToOne(optional = false)
    private Invoice iId;
    @JoinColumn(name = "le_id", referencedColumnName = "le_id")
    @ManyToOne
    private Leasing leId;
    @JoinColumn(name = "o_id", referencedColumnName = "o_id")
    @ManyToOne(optional = false)
    private Offer oId;
    @JoinColumn(name = "p_id", referencedColumnName = "p_id")
    @ManyToOne(optional = false)
    private Product pId;
    @OneToMany(mappedBy = "opId")
    private Collection<License> licenseCollection;

    public OfferProduct() {
    }

    public OfferProduct(Integer opId) {
        this.opId = opId;
    }

    public Integer getOpId() {
        return opId;
    }

    public void setOpId(Integer opId) {
        this.opId = opId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public Invoice getIId() {
        return iId;
    }

    public void setIId(Invoice iId) {
        this.iId = iId;
    }

    public Leasing getLeId() {
        return leId;
    }

    public void setLeId(Leasing leId) {
        this.leId = leId;
    }

    public Offer getOId() {
        return oId;
    }

    public void setOId(Offer oId) {
        this.oId = oId;
    }

    public Product getPId() {
        return pId;
    }

    public void setPId(Product pId) {
        this.pId = pId;
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
        hash += (opId != null ? opId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OfferProduct)) {
            return false;
        }
        OfferProduct other = (OfferProduct) object;
        if ((this.opId == null && other.opId != null) || (this.opId != null && !this.opId.equals(other.opId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kuli.entities.OfferProduct[ opId=" + opId + " ]";
    }
    
}
