/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "FAC_TAB_ROL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FacTabRol.findAll", query = "SELECT f FROM FacTabRol f")
    , @NamedQuery(name = "FacTabRol.findByIdRol", query = "SELECT f FROM FacTabRol f WHERE f.idRol = :idRol")
    , @NamedQuery(name = "FacTabRol.findByNombre", query = "SELECT f FROM FacTabRol f WHERE f.nombre = :nombre")
    , @NamedQuery(name = "FacTabRol.findByDescripcion", query = "SELECT f FROM FacTabRol f WHERE f.descripcion = :descripcion")})
public class FacTabRol implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_ROL")
    private Integer idRol;
    @Size(max = 50)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 50)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRol")
    private Collection<FacTabUsuarios> facTabUsuariosCollection;

    public FacTabRol() {
    }

    public FacTabRol(Integer idRol) {
        this.idRol = idRol;
    }

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public Collection<FacTabUsuarios> getFacTabUsuariosCollection() {
        return facTabUsuariosCollection;
    }

    public void setFacTabUsuariosCollection(Collection<FacTabUsuarios> facTabUsuariosCollection) {
        this.facTabUsuariosCollection = facTabUsuariosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRol != null ? idRol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacTabRol)) {
            return false;
        }
        FacTabRol other = (FacTabRol) object;
        if ((this.idRol == null && other.idRol != null) || (this.idRol != null && !this.idRol.equals(other.idRol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "controller.FacTabRol[ idRol=" + idRol + " ]";
    }
    
}
