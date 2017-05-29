/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baixa.dal.eventos;

import baixa.dal.AbstractDAO;
import baixa.model.entities.StatusBaixa;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import javax.transaction.Transactional;

/**
 *
 * @author G0025381
 */
public class BaixaOffLineDAO extends AbstractDAO {

    @Transactional
    public List<evento> listarevento() {
        try {
            Query query = this.entityManager.createQuery("FROM evento b WHERE b.status =:param1 OR b.status =:param2");
            query.setParameter("param1", StatusBaixa.ABERTO);
            query.setParameter("param2", StatusBaixa.ENCERRADO);

            return query.getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    @Transactional
    public evento buscaPorId1(Long id) {
        try {
            Query query = this.entityManager.createQuery("FROM evento b WHERE b.id =:param1");
            query.setParameter("param1", id);

            return (evento) query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    class evento {

    }
}
