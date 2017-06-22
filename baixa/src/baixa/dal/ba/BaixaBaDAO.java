/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baixa.dal.ba;

import baixa.dal.AbstractDAO;
import baixa.model.entities.baixa.BaixaBa;
import baixa.model.entities.StatusBaixa;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import javax.transaction.Transactional;

/**
 *
 * @author G0025381
 */
public class BaixaBaDAO extends AbstractDAO {

    public BaixaBaDAO() {
    }

//    @Transactional
//    public List<BaixaBa> listarporstatus() {
//        try {
//            Query query = this.entityManager.createQuery("FROM BaixaBa b WHERE b.status =:param1 OR b.status =:param2");
//            query.setParameter("param1", StatusBaixa.ANALISE);
//            query.setParameter("param2", StatusBaixa.ENVIADO);
//
//            return query.getResultList();
//        } catch (Exception e) {
//            return new ArrayList<>();
//        }
//    }
    @Transactional
    public List<BaixaBa> listarporstatus(String login) {
        try {
            Query query = this.entityManager.createQuery("FROM BaixaBa i WHERE i.usuario =:param1 AND (i.status =:param2 OR i.status =:param3)");
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
    public List<BaixaBa> listarporstatusnegada(String login) {
        try {
            Query query = this.entityManager.createQuery("FROM BaixaBa i WHERE i.usuario =:param1 AND (i.status =:param2 OR i.status =:param3)");
            query.setParameter("param1", login);
            query.setParameter("param3", StatusBaixa.NEGADO);
            query.setParameter("param2", StatusBaixa.ENCERRADO);
            return query.getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
            
            
            
    @Transactional
    public BaixaBa buscaPorId(Long Id) {
        try {
            Query query = this.entityManager.createQuery("FROM BaixaBa b WHERE b.id =:param1");
            query.setParameter("param1", Id);

            return (BaixaBa) query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

//    @Transactional
//    public List<BaixaBa> listarporstatusnegada(String login) {
//        try {
//            Query query = this.entityManager.createQuery("FROM BaixaBa i WHERE i.usuario =:param1 AND (i.status =:param2 OR b.status =:param3)");
//            query.setParameter("param1", login);
//            query.setParameter("param3", StatusBaixa.ENCERRADO);
//            query.setParameter("param2", StatusBaixa.NEGADO);
//            return query.getResultList();
//        } catch (Exception e) {
//            return new ArrayList<>();
//        }
//    }

//    private static class BaixaBaNegada {
//
//        public BaixaBaNegada() {
//        }
//    }

    public List<BaixaBa> listarIdeiasPorLogin(String login) {
        try {
            Query query = this.entityManager.createQuery("FROM BaixaBa i WHERE i.usuario =:param1 AND (i.status =:param2 OR i.status =:param3)");
            query.setParameter("param1", login);
            query.setParameter("param3", StatusBaixa.ANALISE);
            query.setParameter("param2", StatusBaixa.ENVIADO);
            return query.getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    public List<BaixaBa> listarporstatusnegada() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}