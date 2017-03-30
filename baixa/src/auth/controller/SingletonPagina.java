/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auth.controller;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 *
 * @author G0025381
 */
@ApplicationScoped
@Named
public class SingletonPagina {

    private Boolean ativo;

    public boolean isAtivo() {
        return ativo;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
}
