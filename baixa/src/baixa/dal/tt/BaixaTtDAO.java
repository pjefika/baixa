/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baixa.dal.tt;

import baixa.dal.AbstractDAO;
import baixa.model.entities.baixa.BaixaTt;
import baixa.model.entities.StatusBaixa;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import javax.transaction.Transactional;

/**
 *
 * @author G0025381
 */
public class BaixaTtDAO extends AbstractDAO {

    public BaixaTtDAO() {
    }

    @Transactional
    public List<BaixaTt> listarporstatus1(String login) {
        try {
            Query query = this.entityManager.createQuery("FROM BaixaTt i WHERE i.usuario =:param1 AND (i.status =:param2 OR i.status =:param3)");
            query.setParameter("param1", login);
            query.setParameter("param3", StatusBaixa.ANALISE);
            query.setParameter("param2", StatusBaixa.ENVIADO);
            return query.getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
///////////////////
//    Negada

    @Transactional
    public List<BaixaTt> listarporstatusnegadatt(String login) {
        try {
            Query query = this.entityManager.createQuery("FROM BaixaTt i WHERE i.usuario =:param1 AND (i.status =:param2 OR i.status =:param3)");
            query.setParameter("param1", login);
            query.setParameter("param3", StatusBaixa.NEGADO);
            query.setParameter("param2", StatusBaixa.ENCERRADO);
            return query.getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    @Transactional
    public BaixaTt buscaPorId1(Long id) {
        try {
            Query query = this.entityManager.createQuery("FROM BaixaTt b WHERE b.id =:param1");
            query.setParameter("param1", id);

            return (BaixaTt) query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

//    @Transactional
//    public List<BaixaTt> listarporstatusnegadatt() {
//        try {
//            Query query = this.entityManager.createQuery("FROM BaixaTt b WHERE b.status =:param1 OR b.status =:param2");
//            query.setParameter("param1", StatusBaixa.ENCERRADO);
//            query.setParameter("param2", StatusBaixa.NEGADO);
//
//            return query.getResultList();
//        } catch (Exception e) {
//            return new ArrayList<>();
//        }
//    }
//
//    private static class BaixaTtNegada {
//
//        public BaixaTtNegada() {
//        }
//    }
//    @Transactional
//    public List<BaixaTt> listarporstatusnegadatt(String login) {
//        try {
//            Query query = this.entityManager.createQuery("FROM BaixaTt i WHERE i.usuario =:param1 AND (i.status =:param2 OR i.status =:param3)");
//            query.setParameter("param1", login);
//            query.setParameter("param3", StatusBaixa.ENCERRADO);
//            query.setParameter("param2", StatusBaixa.NEGADO);
//            return query.getResultList();
//        } catch (Exception e) {
//            return new ArrayList<>();
//        }
//    }
}
