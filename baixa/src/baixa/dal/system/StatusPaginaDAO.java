/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baixa.dal.system;

import baixa.dal.AbstractDAO;
import baixa.model.entities.system.StatusPagina;
import javax.persistence.Query;

/**
 *
 * @author G0025381
 */
public class StatusPaginaDAO extends AbstractDAO  {

    public StatusPaginaDAO() {
    }
    public StatusPagina listaStatusPagina() {
        try {
            Query q= this.entityManager.createQuery("FROM StatusPagina");
            return (StatusPagina) q.getSingleResult();
        } catch (Exception e) {
            return new StatusPagina();
        }
    }
    
}
