/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baixa.model.entities.system;

import baixa.model.entities.AbstractEntity;
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 *
 * @author G0025381
 */
@Entity
@Table(name = "baixa_StatusPagina")
public class StatusPagina extends AbstractEntity {

    private Boolean ativo;

    @Lob
    private String comentario;

    private Calendar data;

    private String usuario;

    public StatusPagina() {
        this.ativo = false;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;

    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

}
