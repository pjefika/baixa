package baixa.controller.baixa;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import auth.annotation.Admin;
import baixa.controller.AbstractCrudController;
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
    private StatusPaginaDAO paginaDAO;

    public BaixaController() {
    }

    @Admin
    @Path("/baixa/backoffice/")
    public void backOffice() {

    }

//    @Logado
//    @Path("/addba/")
//    public void atendimento() {
//        StatusPagina p = paginaDAO.obterStatusAtual();
//        if (!p.getAtivo()) {
//            this.result.redirectTo(HomeController.class).index();
//        }
//    }

    void addBA() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
