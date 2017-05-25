/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Juan Neira
 */
@Entity
@Table(name = "informacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Informacion.findAll", query = "SELECT i FROM Informacion i")
    , @NamedQuery(name = "Informacion.findByCodigo", query = "SELECT i FROM Informacion i WHERE i.codigo = :codigo")
    , @NamedQuery(name = "Informacion.findByUsuarioEliminado", query = "SELECT i FROM Informacion i WHERE i.usuarioEliminado = :usuarioEliminado")
    , @NamedQuery(name = "Informacion.findByUsuarioActualizar", query = "SELECT i FROM Informacion i WHERE i.usuarioActualizar = :usuarioActualizar")
    , @NamedQuery(name = "Informacion.findByUsuarioIngreso", query = "SELECT i FROM Informacion i WHERE i.usuarioIngreso = :usuarioIngreso")})
public class Informacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo")
    private Integer codigo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "usuario_eliminado")
    private boolean usuarioEliminado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "usuario_actualizar")
    private boolean usuarioActualizar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "usuario_ingreso")
    private boolean usuarioIngreso;

    public Informacion() {
    }

    public Informacion(Integer codigo) {
        this.codigo = codigo;
    }

    public Informacion(Integer codigo, boolean usuarioEliminado, boolean usuarioActualizar, boolean usuarioIngreso) {
        this.codigo = codigo;
        this.usuarioEliminado = usuarioEliminado;
        this.usuarioActualizar = usuarioActualizar;
        this.usuarioIngreso = usuarioIngreso;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public boolean getUsuarioEliminado() {
        return usuarioEliminado;
    }

    public void setUsuarioEliminado(boolean usuarioEliminado) {
        this.usuarioEliminado = usuarioEliminado;
    }

    public boolean getUsuarioActualizar() {
        return usuarioActualizar;
    }

    public void setUsuarioActualizar(boolean usuarioActualizar) {
        this.usuarioActualizar = usuarioActualizar;
    }

    public boolean getUsuarioIngreso() {
        return usuarioIngreso;
    }

    public void setUsuarioIngreso(boolean usuarioIngreso) {
        this.usuarioIngreso = usuarioIngreso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Informacion)) {
            return false;
        }
        Informacion other = (Informacion) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.Informacion[ codigo=" + codigo + " ]";
    }
    
}
