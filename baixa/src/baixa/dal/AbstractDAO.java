package baixa.dal;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import baixa.model.entities.EntityCrudInterface;
import javax.transaction.Transactional;

@Stateless
public class AbstractDAO {

    @PersistenceContext
    protected EntityManager entityManager;

    @Transactional
    public void cadastrar(Object param1) {
        this.entityManager.persist(param1);
    }

    @Transactional
    public void editar(Object param1) throws Exception {
        this.entityManager.merge(param1);
    }

    @Transactional
    public void excluir(Object param1) throws Exception {
        this.entityManager.remove(this.entityManager.merge(param1));
    }

    @Transactional
    public EntityCrudInterface buscarPorId(EntityCrudInterface ob) {

        try {
            Query query = this.entityManager.createQuery("FROM " + ob.getClass().getSimpleName() + " m WHERE m.id =:param1");
            query.setParameter("param1", ob.getId());
            return (EntityCrudInterface) query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    @Transactional
    public EntityCrudInterface buscarAtivosPorId(EntityCrudInterface ob) {

        try {
            Query query = this.entityManager.createQuery("FROM " + ob.getClass().getSimpleName() + " m "
                    + " WHERE "
                    + " m.id =:param1"
                    + " AND m.ativo =:param2");
            query.setParameter("param1", ob.getId());
            query.setParameter("param2", ob.getAtivo());
            return (EntityCrudInterface) query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    @Transactional
    public EntityCrudInterface buscarPorNome(EntityCrudInterface ob) {

        try {
            Query query = this.entityManager.createQuery("FROM " + ob.getClass().getSimpleName() + " m WHERE m.nome =:param1");
            query.setParameter("param1", ob.getNome());
            return (EntityCrudInterface) query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

}
