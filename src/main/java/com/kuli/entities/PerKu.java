/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuli.entities;

import java.io.Serializable;
import java.util.Collection;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Eduardo
 */
@Entity
@Table(name = "PerKu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PerKu.findAll", query = "SELECT p FROM PerKu p")
    , @NamedQuery(name = "PerKu.findByPerId", query = "SELECT p FROM PerKu p WHERE p.perId = :perId")
    , @NamedQuery(name = "PerKu.findByFirstName", query = "SELECT p FROM PerKu p WHERE p.firstName = :firstName")
    , @NamedQuery(name = "PerKu.findByLastName", query = "SELECT p FROM PerKu p WHERE p.lastName = :lastName")
    , @NamedQuery(name = "PerKu.findByPosition", query = "SELECT p FROM PerKu p WHERE p.position = :position")
    , @NamedQuery(name = "PerKu.findByTelephone", query = "SELECT p FROM PerKu p WHERE p.telephone = :telephone")
    , @NamedQuery(name = "PerKu.findByEmail", query = "SELECT p FROM PerKu p WHERE p.email = :email")})
public class PerKu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "per_id")
    private Integer perId;
    @Size(max = 45)
    @Column(name = "first_name")
    private String firstName;
    @Size(max = 45)
    @Column(name = "last_name")
    private String lastName;
    @Size(max = 45)
    @Column(name = "position")
    private String position;
    @Size(max = 45)
    @Column(name = "telephone")
    private String telephone;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 45)
    @Column(name = "email")
    private String email;
    @JoinColumn(name = "s_id", referencedColumnName = "s_id")
    @ManyToOne
    private Site sId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "perId")
    private Collection<Offer> offerCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "perId")
    private Collection<Leasing> leasingCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "perId")
    private Collection<License> licenseCollection;

    public PerKu() {
    }

    public PerKu(Integer perId) {
        this.perId = perId;
    }

    public Integer getPerId() {
        return perId;
    }

    public void setPerId(Integer perId) {
        this.perId = perId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Site getSId() {
        return sId;
    }

    public void setSId(Site sId) {
        this.sId = sId;
    }

    @XmlTransient
    public Collection<Offer> getOfferCollection() {
        return offerCollection;
    }

    public void setOfferCollection(Collection<Offer> offerCollection) {
        this.offerCollection = offerCollection;
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
        hash += (perId != null ? perId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PerKu)) {
            return false;
        }
        PerKu other = (PerKu) object;
        if ((this.perId == null && other.perId != null) || (this.perId != null && !this.perId.equals(other.perId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kuli.entities.PerKu[ perId=" + perId + " ]";
    }
    
}
