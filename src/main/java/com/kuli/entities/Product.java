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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Eduardo
 */
@Entity
@Table(name = "Product")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Product.findAll", query = "SELECT p FROM Product p")
    , @NamedQuery(name = "Product.findByPId", query = "SELECT p FROM Product p WHERE p.pId = :pId")
    , @NamedQuery(name = "Product.findByVersion", query = "SELECT p FROM Product p WHERE p.version = :version")
    , @NamedQuery(name = "Product.findByOs", query = "SELECT p FROM Product p WHERE p.os = :os")
    , @NamedQuery(name = "Product.findByRequirements", query = "SELECT p FROM Product p WHERE p.requirements = :requirements")
    , @NamedQuery(name = "Product.findByListPrice", query = "SELECT p FROM Product p WHERE p.listPrice = :listPrice")
    , @NamedQuery(name = "Product.findByDescription", query = "SELECT p FROM Product p WHERE p.description = :description")})
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "p_id")
    private Integer pId;
    @Size(max = 45)
    @Column(name = "version")
    private String version;
    @Size(max = 45)
    @Column(name = "os")
    private String os;
    @Size(max = 45)
    @Column(name = "requirements")
    private String requirements;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "list_price")
    private BigDecimal listPrice;
    @Size(max = 45)
    @Column(name = "description")
    private String description;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pId")
    private Collection<OfferProduct> offerProductCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pId")
    private Collection<Leasing> leasingCollection;
    @OneToMany(mappedBy = "pId")
    private Collection<License> licenseCollection;

    public Product() {
    }

    public Product(Integer pId) {
        this.pId = pId;
    }

    public Integer getPId() {
        return pId;
    }

    public void setPId(Integer pId) {
        this.pId = pId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public BigDecimal getListPrice() {
        return listPrice;
    }

    public void setListPrice(BigDecimal listPrice) {
        this.listPrice = listPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlTransient
    public Collection<OfferProduct> getOfferProductCollection() {
        return offerProductCollection;
    }

    public void setOfferProductCollection(Collection<OfferProduct> offerProductCollection) {
        this.offerProductCollection = offerProductCollection;
    }

    @XmlTransient
    public Collection<Leasing> getLeasingCollection() {
        return leasingCollection;
    }

    public void setLeasingCollection(Collection<Leasing> leasingCollection) {
        this.leasingCollection = leasingCollection;
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
        hash += (pId != null ? pId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        if ((this.pId == null && other.pId != null) || (this.pId != null && !this.pId.equals(other.pId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kuli.entities.Product[ pId=" + pId + " ]";
    }
    
}
