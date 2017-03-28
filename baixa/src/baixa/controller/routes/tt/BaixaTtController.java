/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baixa.controller.routes.tt;

import auth.annotation.Admin;
import baixa.controller.routes.AbstractCrudController;
import baixa.controller.routes.BaixaController;
import baixa.dal.tt.BaixaTtDAO;
import baixa.model.entities.StatusBaixa;
import baixa.model.entities.tt.BaixaTt;
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

    @Path("/addtt/")
    public void addTT() {

    }

    @Path("/adicionar/tt/")
    public void adicionarTT(BaixaTt baixatt) {
        try {            
            
            Calendar calendarAbertura = Calendar.getInstance();
            baixatt.setDabertura(calendarAbertura);
            
            SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
            Date date = sdf.parse(baixatt.getDataFechamento());
            Calendar calendarFechamento = Calendar.getInstance();
            calendarFechamento.setTime(date);
            
            baixatt.setDfechamento(calendarFechamento);
            baixatt.setStatus(StatusBaixa.ENVIADO);
            this.baixattDAO.cadastrar(baixatt);
            this.result.redirectTo(BaixaController.class).atendimento();
        } catch (Exception ex) {            
            //System.out.println(ex);            
            //result.include("mensagemFalha", "Falha ao cadastrar " + baixa.getInstancia() + "!");
            result.include("mensagemFalha", ex.getMessage());
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

    
    @Path("/backoffice/backlisttt/")
    public void backlisttt() {
        this.listarTT();
        this.status();
    }

    
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

        BaixaTt tratada1 = (BaixaTt) baixattDAO.buscaPorId1(m.getId());
        tratada1.setStatus(m.getStatus());

        try {
            baixattDAO.editar(tratada1);
//            result.redirectTo(BaixaController.class).b
        } catch (Exception ex) {
            Logger.getLogger(BaixaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
