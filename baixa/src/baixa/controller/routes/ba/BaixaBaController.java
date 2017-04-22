/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baixa.controller.routes.ba;

import auth.annotation.Admin;
import auth.annotation.Logado;
import auth.controller.SingletonPagina;
import baixa.controller.routes.AbstractCrudController;
import baixa.controller.routes.BaixaController;
import baixa.dal.ba.BaixaBaDAO;
import baixa.dal.system.StatusPaginaDAO;
import baixa.model.entities.StatusBaixa;
import baixa.model.entities.ba.BaixaBa;
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
public class BaixaBaController extends AbstractCrudController {

    @Inject
    private BaixaBaDAO baixabaDAO;
    
    @Inject
    private SingletonPagina pagina;
    
    @Inject
    private StatusPaginaDAO paginaDAO;

    @Logado
    @Path("/buscaba/")
    public void buscaba() {

    }
    @Logado
    @Path("/relatorio/")
    public void relatorioba() {

    }

    @Logado
    @Path("/addba/")
    public void addBA() {
        this.verificaSiteOnline();
    }

    @Admin
    @Path("/backoffice/backlistba/")
    public void backlistba() {
        this.listarBA();
        this.status();
    }

    public void status() {
        result.include("todosStatus", StatusBaixa.values());
    }

    @Logado
    @Path("/adicionar/ba/")
    public void adicionarBA(BaixaBa baixaba) {
        try {
            Calendar calendar = Calendar.getInstance();
            baixaba.setDabertura(calendar);
            baixaba.setStatus(StatusBaixa.ENVIADO);
            baixaba.setUsuario(this.sessionUsuarioEfika.getUsuario().getLogin());
            this.baixabaDAO.cadastrar(baixaba);
            this.result.redirectTo(BaixaController.class).atendimento();
        } catch (Exception ex) {
            //result.include("mensagemFalha", "Falha ao cadastrar " + baixa.getInstancia() + "!");
            result.include("mensagemFalha", ex.getMessage());
        }
    }

    public void listarBA() {
        try {
            List<BaixaBa> l = this.baixabaDAO.listarporstatus();
            result.include("listastatus", l);

        } catch (Exception e) {

            List<BaixaBa> l = new ArrayList<>();

        }
    }

    @Logado
    @Path("mod/status/ba/{baixaBa.id}")
    public void modificstatusba(BaixaBa bb) {
        try {
            this.baixabaDAO.editar(bb);
            this.result.include("mensagem", "Status modificado com sucesso");
        } catch (Exception e) {
            this.result.include("mensagemFalha", "erro ao modificar");
        }
    }

    @Logado
    @Path("/listarBA/")
    public void listar() {
        listarBA();
    }

    @Admin
    @Path("/backoffice/backlistba/{id}")
    public void backlist(Long id) throws Exception {
        BaixaBa b = baixabaDAO.buscaPorId(id);
        b.setStatus(StatusBaixa.ANALISE);
        baixabaDAO.editar(b);
        result.include("resultado", b);
        StatusBaixa[] listaBaixa = StatusBaixa.values();
        result.include("StatusBaixa", listaBaixa);

    }

    public void update(BaixaBa m) {

        BaixaBa tratada1 = baixabaDAO.buscaPorId(m.getId());
        Calendar calendar = Calendar.getInstance();
        tratada1.setDfechamento(calendar);
        tratada1.setComentario(m.getComentario());
        tratada1.setStatus(m.getStatus());
        tratada1.setUserbackoffice(this.sessionUsuarioEfika.getUsuario().getLogin());
        try {
            baixabaDAO.editar(tratada1);
            result.redirectTo(BaixaBaController.class).backlistba();
        } catch (Exception ex) {
//            Logger.getLogger(BaixaBaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void verificaSiteOnline() {
        try {            
            this.pagina.setAtivo(this.paginaDAO.listaStatusPagina().getAtivo());            
        } catch (Exception e) {
            
        }
    }
}
