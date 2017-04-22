package baixa.controller.routes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import auth.annotation.Admin;
import auth.annotation.Logado;
import auth.controller.SingletonPagina;
import baixa.dal.system.StatusPaginaDAO;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import javax.inject.Inject;

/**
 *
 * @author G0025381
 */
@Controller
public class BaixaController extends AbstractCrudController {

    @Inject
    private SingletonPagina pagina;

    @Inject
    private StatusPaginaDAO paginaDAO;

    public BaixaController() {
    }

    @Admin
    @Path("/baixa/backoffice/")
    public void backOffice() {

    }

    @Logado
    @Path("/atendimento/")
    public void atendimento() {
        this.verificaSiteOnline();
    }

    @Admin
    @Path("/baixa/relatorio/")
    public void relatorio() {

    }

    @Admin
    @Path("/relatorio/relatorioba/")
    public void relatorioba() {

    }

    public void backlisttt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void verificaSiteOnline() {
        try {
            this.pagina.setAtivo(this.paginaDAO.listaStatusPagina().getAtivo());
        } catch (Exception e) {

        }
    }
  
}
