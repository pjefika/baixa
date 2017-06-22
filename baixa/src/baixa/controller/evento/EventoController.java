/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baixa.controller.evento;

import java.text.SimpleDateFormat;
import java.util.Date;
import baixa.model.entities.system.EventoAbstract;
import java.text.ParseException;
import baixa.dal.Eventos.EventoDao;
import baixa.model.entities.StatusEvento;
import java.io.Serializable;
import auth.annotation.Admin;
import auth.controller.SingletonPagina;
import baixa.controller.AbstractCrudController;
import baixa.dal.system.StatusPaginaDAO;
import baixa.model.entities.StatusBaixa;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author G0025381
 */
@Controller
public class EventoController extends AbstractCrudController implements Serializable {
//    public class EventoAbstract extends BaixaAbstract implements Serializable {

    @Inject
    private EventoDao eventoDao;

    @Inject
    private SingletonPagina pagina;

    @Inject
    private StatusPaginaDAO paginaDAO;
    private Object EventoDAO;

//    @Admin
//    @Path("/addevento/")
//    public void addevento() {
//
//    }

    @Admin
    @Path("/addevento/")
    public void adicionar(EventoAbstract e) {
        try {
            e.setStatus(StatusEvento.ABERTO);
            this.eventoDao.cadastrar(e);
            e.setLoginAbertura(this.sessionUsuarioEfika.getUsuario().getLogin());
            this.result.redirectTo(EventoController.class).cadastraevento(e);
            this.result.include("Cadastro realizado com sucesso");
        } catch (Exception ex) {
            this.result.redirectTo(EventoController.class).cadastraevento(e);
            result.include("mensagem", ex.getMessage());
        }
    }

    @Admin
    public void cadastraevento(EventoAbstract e) {
        if (e != null) {
            this.result.include("mensagem", "Falha ao cadastrar Evento");
            this.result.include("e", e);
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

    class cadastrar {

    }

    @Path("/evento/listarevento/")
    public void listarevento() {
        try {
            List<EventoAbstract> l = this.eventoDao.listarEvento();
            result.include("listarevento", l);
        } catch (Exception e) {
            List<EventoAbstract> l = new ArrayList<>();
        }
    }

//    public void alterarevento() {
//
//        alterarevento();
//    }
    public void status() {
        result.include("todosStatus", StatusEvento.values());
    }
//
//    public void listarevento() {
//        this.listarevento();
//        this.status();
//    }

    @Path("/evento/listarevento/{id}")
    public void listarevento(Long id) throws Exception {
        EventoAbstract b = eventoDao.buscaPorId1(id);
        b.setStatus(StatusEvento.ABERTO);
        eventoDao.editar(b);
        result.include("resultado", b);
        StatusEvento[] listaevento = StatusEvento.values();
        result.include("StatusEvento", listaevento);

    }

}
