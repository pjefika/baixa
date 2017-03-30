/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baixa.dal.tt;

import baixa.dal.AbstractDAO;
import baixa.model.entities.tt.BaixaTt;
import baixa.model.entities.StatusBaixa;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Query;
import javax.transaction.Transactional;

/**
 *
 * @author G0025381
 */
public class BaixaTtDAO extends AbstractDAO {    
    
    @Transactional
    public List<BaixaTt> listarporstatus1() {
        try {
            Query query = this.entityManager.createQuery("FROM BaixaTt b WHERE b.status =:param1 OR b.status =:param2");
            query.setParameter("param1", StatusBaixa.ANALISE);
            query.setParameter("param2", StatusBaixa.ENVIADO);

            return query.getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
    @Transactional
    public BaixaTt buscaPorId1(Long id){
        try {
            Query query = this.entityManager.createQuery("FROM BaixaTt b WHERE b.id =:param1" );
            query.setParameter("param1", id);
                      
            return (BaixaTt) query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
}
