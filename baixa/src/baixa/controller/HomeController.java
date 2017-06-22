/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baixa.controller;

import auth.annotation.Logado;
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

    @Inject
    private StatusPaginaDAO paginaDAO;

    public HomeController() {
    }

    @Logado
    @Path("/")
    public void index() {
        StatusPagina p = paginaDAO.obterStatusAtual();
        this.result.include("informacao", p);
    }

    public void restrito() {
    }
}
