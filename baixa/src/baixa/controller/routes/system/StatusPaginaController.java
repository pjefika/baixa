/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baixa.controller.routes.system;

import auth.controller.SessionUsuarioEfika;
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
public class StatusPaginaController extends AbstractCrudController {

    @Inject
    private StatusPaginaDAO paginaDAO;
    
    @Inject
    private SessionUsuarioEfika session;

    @Path("/system/editarpaginastatus/")
    public void editarpaginastatus(StatusPagina s) {
        try {
            this.paginaDAO.editar(s);
            this.result.redirectTo(HomeController.class).index();
        } catch (Exception e) {

        }
    }

    @Path("/system/administracao/")
    public void administracao() {
        try {
            StatusPagina pagina = this.paginaDAO.listaStatusPagina();
            this.result.include("statusdapagina", pagina);

        } catch (Exception e) {
        }
    }

    
}
