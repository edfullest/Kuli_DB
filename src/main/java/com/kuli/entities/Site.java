/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuli.entities;

import java.io.Serializable;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Eduardo
 */
@Entity
@Table(name = "Site")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Site.findAll", query = "SELECT s FROM Site s")
    , @NamedQuery(name = "Site.findBySId", query = "SELECT s FROM Site s WHERE s.sId = :sId")
    , @NamedQuery(name = "Site.findByCity", query = "SELECT s FROM Site s WHERE s.city = :city")
    , @NamedQuery(name = "Site.findByState", query = "SELECT s FROM Site s WHERE s.state = :state")
    , @NamedQuery(name = "Site.findByCountry", query = "SELECT s FROM Site s WHERE s.country = :country")
    , @NamedQuery(name = "Site.findByStreet", query = "SELECT s FROM Site s WHERE s.street = :street")
    , @NamedQuery(name = "Site.findByStreetNo", query = "SELECT s FROM Site s WHERE s.streetNo = :streetNo")
    , @NamedQuery(name = "Site.findByZip", query = "SELECT s FROM Site s WHERE s.zip = :zip")
    , @NamedQuery(name = "Site.findByIsHQ", query = "SELECT s FROM Site s WHERE s.isHQ = :isHQ")})
public class Site implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "s_id")
    private Integer sId;
    @Size(max = 45)
    @Column(name = "city")
    private String city;
    @Size(max = 45)
    @Column(name = "state")
    private String state;
    @Size(max = 45)
    @Column(name = "country")
    private String country;
    @Size(max = 45)
    @Column(name = "street")
    private String street;
    @Size(max = 45)
    @Column(name = "street_no")
    private String streetNo;
    @Size(max = 45)
    @Column(name = "zip")
    private String zip;
    @Column(name = "is_HQ")
    private Boolean isHQ;
    @JoinColumn(name = "f_id", referencedColumnName = "f_id")
    @ManyToOne
    private FiKu fId;
    @OneToMany(mappedBy = "sId")
    private Collection<PerKu> perKuCollection;

    public Site() {
    }

    public Site(Integer sId) {
        this.sId = sId;
    }

    public Integer getSId() {
        return sId;
    }

    public void setSId(Integer sId) {
        this.sId = sId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public Boolean getIsHQ() {
        return isHQ;
    }

    public void setIsHQ(Boolean isHQ) {
        this.isHQ = isHQ;
    }

    public FiKu getFId() {
        return fId;
    }

    public void setFId(FiKu fId) {
        this.fId = fId;
    }

    @XmlTransient
    public Collection<PerKu> getPerKuCollection() {
        return perKuCollection;
    }

    public void setPerKuCollection(Collection<PerKu> perKuCollection) {
        this.perKuCollection = perKuCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sId != null ? sId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Site)) {
            return false;
        }
        Site other = (Site) object;
        if ((this.sId == null && other.sId != null) || (this.sId != null && !this.sId.equals(other.sId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kuli.entities.Site[ sId=" + sId + " ]";
    }
    
}
