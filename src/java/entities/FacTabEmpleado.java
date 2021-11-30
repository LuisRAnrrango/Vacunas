/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "FAC_TAB_EMPLEADO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FacTabEmpleado.findAll", query = "SELECT f FROM FacTabEmpleado f")
    , @NamedQuery(name = "FacTabEmpleado.findByIdEmpleado", query = "SELECT f FROM FacTabEmpleado f WHERE f.idEmpleado = :idEmpleado")
    , @NamedQuery(name = "FacTabEmpleado.findByCedulaEmp", query = "SELECT f FROM FacTabEmpleado f WHERE f.cedulaEmp = :cedulaEmp")
    , @NamedQuery(name = "FacTabEmpleado.findByNombreEmp", query = "SELECT f FROM FacTabEmpleado f WHERE f.nombreEmp = :nombreEmp")
    , @NamedQuery(name = "FacTabEmpleado.findByApellidoEmp", query = "SELECT f FROM FacTabEmpleado f WHERE f.apellidoEmp = :apellidoEmp")
    , @NamedQuery(name = "FacTabEmpleado.findByEmailEmp", query = "SELECT f FROM FacTabEmpleado f WHERE f.emailEmp = :emailEmp")
    , @NamedQuery(name = "FacTabEmpleado.findByFechaNacimientoEmp", query = "SELECT f FROM FacTabEmpleado f WHERE f.fechaNacimientoEmp = :fechaNacimientoEmp")
    , @NamedQuery(name = "FacTabEmpleado.findByDireccionEmp", query = "SELECT f FROM FacTabEmpleado f WHERE f.direccionEmp = :direccionEmp")
    , @NamedQuery(name = "FacTabEmpleado.findByTelefonoEmp", query = "SELECT f FROM FacTabEmpleado f WHERE f.telefonoEmp = :telefonoEmp")
    , @NamedQuery(name = "FacTabEmpleado.findByEstadoVacuna", query = "SELECT f FROM FacTabEmpleado f WHERE f.estadoVacuna = :estadoVacuna")
    , @NamedQuery(name = "FacTabEmpleado.findByTipoVacuna", query = "SELECT f FROM FacTabEmpleado f WHERE f.tipoVacuna = :tipoVacuna")
    , @NamedQuery(name = "FacTabEmpleado.findByFechaVacuna", query = "SELECT f FROM FacTabEmpleado f WHERE f.fechaVacuna = :fechaVacuna")
    , @NamedQuery(name = "FacTabEmpleado.findByNumeroDosis", query = "SELECT f FROM FacTabEmpleado f WHERE f.numeroDosis = :numeroDosis")})
public class FacTabEmpleado implements Serializable {

    private static final long serialVersionUID = 1L;
 
    
    
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_EMPLEADO")
    private Integer idEmpleado;
    @Basic(optional = false)
    @Column(name = "CEDULA_EMP")
    private String cedulaEmp;
    @Basic(optional = false)
    @Column(name = "NOMBRE_EMP")
    private String nombreEmp;
    @Basic(optional = false)
    @Column(name = "APELLIDO_EMP")
    private String apellidoEmp;
    @Basic(optional = false)
    @Column(name = "EMAIL_EMP")
    private String emailEmp;
    @Column(name = "FECHA_NACIMIENTO_EMP")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimientoEmp;
    @Column(name = "DIRECCION_EMP")
    private String direccionEmp;
    @Column(name = "TELEFONO_EMP")
    private String telefonoEmp;
    @Column(name = "ESTADO_VACUNA")
    private String estadoVacuna;
    @Column(name = "TIPO_VACUNA")
    private String tipoVacuna;
    @Column(name = "FECHA_VACUNA")
    @Temporal(TemporalType.DATE)
    private Date fechaVacuna;
    @Column(name = "NUMERO_DOSIS")
    private Integer numeroDosis;

    public FacTabEmpleado() {
    }

    public FacTabEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public FacTabEmpleado(Integer idEmpleado, String cedulaEmp, String nombreEmp, String apellidoEmp, String emailEmp) {
        this.idEmpleado = idEmpleado;
        this.cedulaEmp = cedulaEmp;
        this.nombreEmp = nombreEmp;
        this.apellidoEmp = apellidoEmp;
        this.emailEmp = emailEmp;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getCedulaEmp() {
        return cedulaEmp;
    }

    public void setCedulaEmp(String cedulaEmp) {
        this.cedulaEmp = cedulaEmp;
    }

    public String getNombreEmp() {
        return nombreEmp;
    }

    public void setNombreEmp(String nombreEmp) {
        this.nombreEmp = nombreEmp;
    }

    public String getApellidoEmp() {
        return apellidoEmp;
    }

    public void setApellidoEmp(String apellidoEmp) {
        this.apellidoEmp = apellidoEmp;
    }

    public String getEmailEmp() {
        return emailEmp;
    }

    public void setEmailEmp(String emailEmp) {
        this.emailEmp = emailEmp;
    }

    public Date getFechaNacimientoEmp() {
        return fechaNacimientoEmp;
    }

    public void setFechaNacimientoEmp(Date fechaNacimientoEmp) {
        this.fechaNacimientoEmp = fechaNacimientoEmp;
    }

    public String getDireccionEmp() {
        return direccionEmp;
    }

    public void setDireccionEmp(String direccionEmp) {
        this.direccionEmp = direccionEmp;
    }

    public String getTelefonoEmp() {
        return telefonoEmp;
    }

    public void setTelefonoEmp(String telefonoEmp) {
        this.telefonoEmp = telefonoEmp;
    }

    public String getEstadoVacuna() {
        return estadoVacuna;
    }

    public void setEstadoVacuna(String estadoVacuna) {
        this.estadoVacuna = estadoVacuna;
    }

    public String getTipoVacuna() {
        return tipoVacuna;
    }

    public void setTipoVacuna(String tipoVacuna) {
        this.tipoVacuna = tipoVacuna;
    }

    public Date getFechaVacuna() {
        return fechaVacuna;
    }

    public void setFechaVacuna(Date fechaVacuna) {
        this.fechaVacuna = fechaVacuna;
    }

    public Integer getNumeroDosis() {
        return numeroDosis;
    }

    public void setNumeroDosis(Integer numeroDosis) {
        this.numeroDosis = numeroDosis;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpleado != null ? idEmpleado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacTabEmpleado)) {
            return false;
        }
        FacTabEmpleado other = (FacTabEmpleado) object;
        if ((this.idEmpleado == null && other.idEmpleado != null) || (this.idEmpleado != null && !this.idEmpleado.equals(other.idEmpleado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "controller.FacTabEmpleado[ idEmpleado=" + idEmpleado + " ]";
    }
    
}
