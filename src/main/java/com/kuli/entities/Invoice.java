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
import javax.persistence.CascadeType;
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
@Table(name = "Invoice")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Invoice.findAll", query = "SELECT i FROM Invoice i")
    , @NamedQuery(name = "Invoice.findByIId", query = "SELECT i FROM Invoice i WHERE i.iId = :iId")
    , @NamedQuery(name = "Invoice.findByInvoiceDate", query = "SELECT i FROM Invoice i WHERE i.invoiceDate = :invoiceDate")
    , @NamedQuery(name = "Invoice.findByIsPaid", query = "SELECT i FROM Invoice i WHERE i.isPaid = :isPaid")
    , @NamedQuery(name = "Invoice.findByQuantity", query = "SELECT i FROM Invoice i WHERE i.quantity = :quantity")
    , @NamedQuery(name = "Invoice.findByPrice", query = "SELECT i FROM Invoice i WHERE i.price = :price")})
public class Invoice implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "i_id")
    private Integer iId;
    @Column(name = "invoice_date")
    @Temporal(TemporalType.DATE)
    private Date invoiceDate;
    @Column(name = "is_paid")
    private Boolean isPaid;
    @Column(name = "quantity")
    private Integer quantity;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "price")
    private BigDecimal price;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iId")
    private Collection<OfferProduct> offerProductCollection;

    public Invoice() {
    }

    public Invoice(Integer iId) {
        this.iId = iId;
    }

    public Integer getIId() {
        return iId;
    }

    public void setIId(Integer iId) {
        this.iId = iId;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public Boolean getIsPaid() {
        return isPaid;
    }

    public void setIsPaid(Boolean isPaid) {
        this.isPaid = isPaid;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @XmlTransient
    public Collection<OfferProduct> getOfferProductCollection() {
        return offerProductCollection;
    }

    public void setOfferProductCollection(Collection<OfferProduct> offerProductCollection) {
        this.offerProductCollection = offerProductCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iId != null ? iId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Invoice)) {
            return false;
        }
        Invoice other = (Invoice) object;
        if ((this.iId == null && other.iId != null) || (this.iId != null && !this.iId.equals(other.iId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kuli.entities.Invoice[ iId=" + iId + " ]";
    }
    
}
