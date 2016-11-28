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
@Table(name = "FiKu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FiKu.findAll", query = "SELECT f FROM FiKu f")
    , @NamedQuery(name = "FiKu.findByFId", query = "SELECT f FROM FiKu f WHERE f.fId = :fId")
    , @NamedQuery(name = "FiKu.findByName", query = "SELECT f FROM FiKu f WHERE f.name = :name")})
public class FiKu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "f_id")
    private Integer fId;
    @Size(max = 45)
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "fId")
    private Collection<Site> siteCollection;

    public FiKu() {
    }

    public FiKu(Integer fId) {
        this.fId = fId;
    }

    public Integer getFId() {
        return fId;
    }

    public void setFId(Integer fId) {
        this.fId = fId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public Collection<Site> getSiteCollection() {
        return siteCollection;
    }

    public void setSiteCollection(Collection<Site> siteCollection) {
        this.siteCollection = siteCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fId != null ? fId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FiKu)) {
            return false;
        }
        FiKu other = (FiKu) object;
        if ((this.fId == null && other.fId != null) || (this.fId != null && !this.fId.equals(other.fId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kuli.entities.FiKu[ fId=" + fId + " ]";
    }
    
}
