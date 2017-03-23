package baixa.dal;

import java.util.List;
import java.util.ArrayList;
import javax.persistence.Query;
import javax.transaction.Transactional;
import baixa.model.entities.BaixaBa;
import baixa.model.entities.BaixaTt;
import baixa.model.entities.StatusBaixa;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class BaixaDAO extends AbstractDAO {

    public BaixaDAO() {
    }

    @Transactional
    public void cadastrar(BaixaBa baixa) throws Exception {
        try {
            this.entityManager.persist(baixa);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
            //throw new PersistenciaException("Falha ao cadastrar " + c.getClass().getSimpleName() + ".");
        }
    }

    @Transactional
    public void cadastrar(BaixaTt baixa) throws Exception {
        try {
            this.entityManager.persist(baixa);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
            //throw new PersistenciaException("Falha ao cadastrar " + c.getClass().getSimpleName() + ".");
        }
    }

    @Transactional
    public void editar(BaixaBa baixa) throws Exception {
        try {
            this.entityManager.merge(baixa);
        } catch (Exception e) {
            throw new Exception();
        }
    }
    @Transactional
    public void editar1(BaixaTt baixa) throws Exception {
        try {
            this.entityManager.merge(baixa);
        } catch (Exception e) {
            throw new Exception();
        }
    }
    

    @Transactional
    public void editar1(BaixaTt baixa) throws Exception {
        try {
            this.entityManager.merge(baixa);
        } catch (Exception e) {
            throw new Exception();
        }
    }

    @Transactional
    public void excluir(BaixaBa baixa) throws Exception {
        try {
            this.entityManager.remove(this.entityManager.merge(baixa));
        } catch (Exception e) {
            throw new Exception();
        }
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
    public void editar(BaixaTt baixa) throws Exception {
        try {
            this.entityManager.merge(baixa);
        } catch (Exception e) {
            throw new Exception();
        }
    }

    @Transactional
    public void excluir(BaixaTt baixa) throws Exception {
        try {
            this.entityManager.remove(this.entityManager.merge(baixa));
        } catch (Exception e) {
            throw new Exception();
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

    @Transactional
    public void cadastrar1(BaixaBa coment) throws Exception {
        try {
            this.entityManager.merge(coment);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
            //throw new PersistenciaException("Falha ao cadastrar " + c.getClass().getSimpleName() + ".");
        }
    }

    @Column(name = "data_inclusao")
    @Temporal(value = TemporalType.DATE)
//    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dataInclusao;

}
