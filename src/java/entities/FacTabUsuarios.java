/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "FAC_TAB_USUARIOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FacTabUsuarios.findAll", query = "SELECT f FROM FacTabUsuarios f")
    , @NamedQuery(name = "FacTabUsuarios.findByIdUsuario", query = "SELECT f FROM FacTabUsuarios f WHERE f.idUsuario = :idUsuario")
    , @NamedQuery(name = "FacTabUsuarios.findByUsuarioCed", query = "SELECT f FROM FacTabUsuarios f WHERE f.usuarioCed = :usuarioCed")
    , @NamedQuery(name = "FacTabUsuarios.findByContrasenia", query = "SELECT f FROM FacTabUsuarios f WHERE f.contrasenia = :contrasenia")})
public class FacTabUsuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_USUARIO")
    private Integer idUsuario;
    @Size(max = 50)
    @Column(name = "USUARIO_CED")
    private String usuarioCed;
    @Size(max = 15)
    @Column(name = "CONTRASENIA")
    private String contrasenia;
    @JoinColumn(name = "ID_ROL", referencedColumnName = "ID_ROL")
    @ManyToOne(optional = false)
    private FacTabRol idRol;

    public FacTabUsuarios() {
    }

    public FacTabUsuarios(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuarioCed() {
        return usuarioCed;
    }

    public void setUsuarioCed(String usuarioCed) {
        this.usuarioCed = usuarioCed;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public FacTabRol getIdRol() {
        return idRol;
    }

    public void setIdRol(FacTabRol idRol) {
        this.idRol = idRol;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacTabUsuarios)) {
            return false;
        }
        FacTabUsuarios other = (FacTabUsuarios) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "controller.FacTabUsuarios[ idUsuario=" + idUsuario + " ]";
    }
    
}
