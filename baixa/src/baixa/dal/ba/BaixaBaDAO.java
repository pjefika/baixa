/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baixa.dal.ba;

import baixa.dal.AbstractDAO;
import baixa.model.entities.ba.BaixaBa;
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

    
    @Transactional
    public List<BaixaBa> listarporstatus() {
        try {
            Query query = this.entityManager.createQuery("FROM BaixaBa b WHERE b.status =:param1 OR b.status =:param2");
            query.setParameter("param1", StatusBaixa.ANALISE);
            query.setParameter("param2", StatusBaixa.ENVIADO);

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

}
