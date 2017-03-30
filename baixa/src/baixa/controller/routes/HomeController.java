/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baixa.controller.routes;

import auth.annotation.Logado;
import auth.controller.SessionUsuarioEfika;
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
public class HomeController extends AbstractCrudController {

    public HomeController() {
    }
    @Inject
    private StatusPaginaDAO paginaDAO;

    @Logado
    @Path("/")
    public void index() {
        this.verstatuspagina();
    }

    public void restrito() {
    }

    public void verstatuspagina() {
        try {
            StatusPagina pagina = this.paginaDAO.listaStatusPagina();
            this.result.include("informacao", pagina);
        } catch (Exception e) {

        }
    }

}
