/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baixa.model.entities;

import java.util.Calendar;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author G0042204
 */
@MappedSuperclass
public abstract class BaixaAbstract extends AbstractEntity {

    private Calendar dabertura;
    private Calendar dfechamento;
    private StatusBaixa status;
    private String usuario;
    private String userbackoffice;

    public String getUserbackoffice() {
        return userbackoffice;
    }

    public void setUserbackoffice(String userbackoffice) {
        this.userbackoffice = userbackoffice;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public StatusBaixa getStatus() {
        return status;
    }

    public void setStatus(StatusBaixa status) {
        this.status = status;
    }

    public Calendar getDabertura() {
        return dabertura;
    }

    public void setDabertura(Calendar dabertura) {
        this.dabertura = dabertura;
    }

    public Calendar getDfechamento() {
        return dfechamento;
    }

    public void setDfechamento(Calendar dfechamento) {
        this.dfechamento = dfechamento;
    }

}
