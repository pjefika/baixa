///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package baixa.eventos;
//
//import baixa.dal.AbstractDAO;
//
//public class EventoDao extends AbstractDAO {
//
//    public EventoDao   }
//
//    
//    @Transactional
//    public List<Evento> listarevento() {
//        try {
//            Query query = this.entityManager.createQuery("FROM evento b WHERE b.status =:param1 OR b.status =:param2");
//            query.setParameter("param1", Evento.ANALISE);
//            query.setParameter("param2", StatusBaixa.ENVIADO);
//
//            return query.getResultList();
//        } catch (Exception e) {
//            return new ArrayList<>();
//        }
//    }
//
//    @Transactional
//    public BaixaBa buscaPorId(Long Id) {
//        try {
//            Query query = this.entityManager.createQuery("FROM BaixaBa b WHERE b.id =:param1");
//            query.setParameter("param1", Id);
//
//            return (BaixaBa) query.getSingleResult();
//        } catch (Exception e) {
//            return null;
//        }
//    }

//}
