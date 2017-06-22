package baixa.dal.Eventos;

import baixa.dal.AbstractDAO;
import baixa.model.entities.StatusBaixa;
import baixa.model.entities.system.EventoAbstract;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import javax.transaction.Transactional;

/**
 *
 * @author G0025381
 */
public class EventoDao extends AbstractDAO {

    @Transactional
    public List<EventoAbstract> listarEvento() {
        try {
            Query query = this.entityManager.createQuery("FROM Evento b WHERE b.status =:param1 OR b.status =:param2");
            query.setParameter("param1", StatusBaixa.ABERTO);
            query.setParameter("param2", StatusBaixa.ENCERRADO);

            return query.getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    @Transactional
    public EventoAbstract buscaPorId1(Long id) {
        try {
            Query query = this.entityManager.createQuery("FROM Evento b WHERE b.id =:param1");
            query.setParameter("param1", id);

            return (EventoAbstract) query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
 
    @Transactional
    public void cadastrar(EventoAbstract t) throws Exception {
        try {
            this.entityManager.persist(t);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
            //throw new PersistenciaException("Falha ao cadastrar " + c.getClass().getSimpleName() + ".");
        }
    }
    
    

}
