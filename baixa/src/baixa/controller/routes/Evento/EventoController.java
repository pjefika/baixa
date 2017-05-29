/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baixa.controller.routes.Evento;

import auth.annotation.Admin;
import auth.controller.SingletonPagina;
import baixa.dal.system.StatusPaginaDAO;
import baixa.model.entities.StatusBaixa;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.inject.Inject;
import baixa.controller.routes.AbstractCrudController;
import java.text.ParseException;

/**
 *
 * @author G0025381
 */
@Controller
public class EventoController extends AbstractCrudController {

    @Inject
    private EventoDao baixaofflineDAO;

    @Inject
    private SingletonPagina pagina;

    @Inject
    private StatusPaginaDAO paginaDAO;

//    @Admin
//    @Path("/addevento/")
//    public void addevento() {
//
//    }
    @Admin
    @Path("/addevento/")
    public void addevento(addevento addevento) {
        try {
            Calendar calendarAbertura = Calendar.getInstance();
            addevento.setabertura(calendarAbertura);
            addevento.setFechamento(this.transformaCalendar(addevento.getFechamento()));
            addevento.setStatus(StatusBaixa.ABERTO);
            addevento.setUsuario(this.sessionUsuarioEfika.getUsuario().getLogin());
//            this.EventoDao.cadastrar(addevento);
            this.result.redirectTo(EventoController.class).addevento(addevento);
        } catch (Exception ex) {
            //System.out.println(ex);            
            //result.include("mensagemFalha", "Falha ao cadastrar " + baixa.getInstancia() + "!");
            result.include("mensagemFalha", ex.getMessage());
        }
    }

    public Calendar transformaCalendar(String data) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            Date date = sdf.parse(data);
            Calendar calendarFechamento = Calendar.getInstance();
            calendarFechamento.setTime(date);
            return calendarFechamento;
        } catch (ParseException e) {
            return null;
        }
    }

    private static class addevento {

        public addevento() {
        }

        private void setabertura(Calendar calendarAbertura) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private String getFechamento() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setStatus(StatusBaixa statusBaixa) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setUsuario(String login) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setFechamento(Calendar transformaCalendar) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private static class EventoDao {

        public EventoDao() {
        }
    }

    

}
