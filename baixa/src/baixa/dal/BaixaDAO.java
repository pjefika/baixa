package baixa.dal;

import auth.annotation.Admin;
import baixa.model.entities.Relatorio;
import baixa.model.entities.StatusBaixa;
import baixa.model.entities.baixa.BaixaBa;
import baixa.model.entities.baixa.BaixaTt;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.TemporalType;
import javax.transaction.Transactional;

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
    public void editar(BaixaBa baixa) throws Exception {
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
    public void cadastrar1(BaixaBa coment) throws Exception {
        try {
            this.entityManager.merge(coment);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
            //throw new PersistenciaException("Falha ao cadastrar " + c.getClass().getSimpleName() + ".");
        }
    }

    @Admin
    @Transactional
    public List<BaixaBa> relatorioBa(Relatorio rba) {
        try {
            Query query = this.entityManager.createQuery("FROM BaixaBa b WHERE (b.status =:param1 OR b.status =:param2) AND b.dabertura BETWEEN :param3 AND :param4");
            query.setParameter("param1", StatusBaixa.ENCERRADO);
            query.setParameter("param2", StatusBaixa.NEGADO);

            Calendar cal = Calendar.getInstance();
            cal.setTime(rba.getDataFinal().getTime());
            cal.add(Calendar.HOUR, 23);
            cal.add(Calendar.MINUTE, 59);
//            cal.add(Calendar.SECOND, 59);
            query.setParameter("param3", rba.getDataInicio().getTime(), TemporalType.DATE);
            query.setParameter("param4", cal.getTime(), TemporalType.DATE);

            return query.getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    @Transactional
    public List<BaixaTt> relatorioTt(Relatorio rtt) {
        try {
            Query query = this.entityManager.createQuery("FROM BaixaTt b WHERE (b.status =:param1 OR b.status =:param2) AND b.dabertura BETWEEN :param3 AND :param4");
            query.setParameter("param1", StatusBaixa.ENCERRADO);
            query.setParameter("param2", StatusBaixa.NEGADO);

            Calendar cal = Calendar.getInstance();
            cal.setTime(rtt.getDataFinal().getTime());
            cal.add(Calendar.HOUR, 23);
            cal.add(Calendar.MINUTE, 59);
//            cal.add(Calendar.SECOND, 59);
            query.setParameter("param3", rtt.getDataInicio().getTime(), TemporalType.DATE);
            query.setParameter("param4", cal.getTime(), TemporalType.DATE);

            return query.getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    public Object relatoriott(Relatorio r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
