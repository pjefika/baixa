package baixa.controller.routes.baixa;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import auth.annotation.Admin;
import auth.annotation.Logado;
import baixa.controller.routes.AbstractCrudController;
import baixa.controller.routes.HomeController;
import baixa.dal.system.StatusPaginaDAO;
import baixa.model.entities.system.StatusPagina;
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
