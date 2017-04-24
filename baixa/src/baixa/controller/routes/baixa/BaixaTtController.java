/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baixa.controller.routes.baixa;

import auth.annotation.Admin;
import auth.annotation.Logado;
import auth.controller.SingletonPagina;
import baixa.controller.routes.AbstractCrudController;
import baixa.controller.routes.HomeController;
import baixa.dal.system.StatusPaginaDAO;
import baixa.dal.tt.BaixaTtDAO;
import baixa.model.entities.StatusBaixa;
import baixa.model.entities.baixa.BaixaTt;
import baixa.model.entities.system.StatusPagina;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Inject;

/**
 *
 * @author G0025381
 */
@Controller
public class BaixaTtController extends AbstractCrudController {

    @Inject
    private BaixaTtDAO baixattDAO;

    @Inject
    private SingletonPagina pagina;

    @Inject
    private StatusPaginaDAO paginaDAO;

//    @Logado
//    @Path("/addtt/")
//    public void addTT() {
//        this.verificaSiteOnline();
//            }
@Logado
    @Path("/addTT/")
    public void addTT() {
        StatusPagina p = paginaDAO.obterStatusAtual();
        if (!p.getAtivo()) {
            this.result.redirectTo(HomeController.class).index();
        }
    }
    @Logado
    @Path("/adicionar/tt/")
    public void adicionarTT(BaixaTt baixatt) {
        try {
            Calendar calendarAbertura = Calendar.getInstance();
            baixatt.setDabertura(calendarAbertura);
            baixatt.setDfechamento(this.transformaCalendar(baixatt.getDataFechamento()));
            baixatt.setStatus(StatusBaixa.ENVIADO);
            baixatt.setUsuario(this.sessionUsuarioEfika.getUsuario().getLogin());
            this.baixattDAO.cadastrar(baixatt);
            this.result.redirectTo(BaixaTtController.class).addTT();
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
        } catch (Exception e) {
            return null;
        }
    }

    public void listarTT() {
        try {
            List<BaixaTt> l = this.baixattDAO.listarporstatus1();
            result.include("listastatus1", l);
        } catch (Exception e) {
            List<BaixaTt> l = new ArrayList<>();
        }
    }

    public void modificstatustt(BaixaTt bb) {
        try {
            this.baixattDAO.editar(bb);
            this.result.include("mensagem", "Status modificado com sucesso");
        } catch (Exception e) {
            this.result.include("mensagemFalha", "erro ao modificar");
        }
    }

    public void status() {
        result.include("todosStatus", StatusBaixa.values());
    }

    public void listartt() {

        listarTT();
    }

    @Admin
    @Path("/backoffice/backlisttt/")
    public void backlisttt() {
        this.listarTT();
        this.status();
    }

    @Admin
    @Path("/backoffice/backlisttt/{id}")
    public void backlisttt(Long id) throws Exception {
        BaixaTt b = baixattDAO.buscaPorId1(id);
        b.setStatus(StatusBaixa.ANALISE);
        baixattDAO.editar(b);
        result.include("resultado", b);
        StatusBaixa[] listaBaixa = StatusBaixa.values();
        result.include("StatusBaixa", listaBaixa);

    }

    public void update2(BaixaTt m) {

        System.out.println(m.getId());
        BaixaTt tratada1 = (BaixaTt) baixattDAO.buscaPorId1(m.getId());
        //System.out.println(tratada1.getId());
        Calendar calendar = Calendar.getInstance();
        tratada1.setDfechamentousr(calendar);
        tratada1.setStatus(m.getStatus());
        tratada1.setComentario(m.getComentario());
        tratada1.setUserbackoffice(this.sessionUsuarioEfika.getUsuario().getLogin());

        try {
            baixattDAO.editar(tratada1);
            this.result.redirectTo(BaixaTtController.class).backlisttt();
//            result.redirectTo(BaixaController.class).b
        } catch (Exception ex) {
            Logger.getLogger(BaixaTtController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void verificaSiteOnline() {
        try {
            this.pagina.setAtivo(this.paginaDAO.listaStatusPagina().getAtivo());
        } catch (Exception e) {

        }
    }

}
