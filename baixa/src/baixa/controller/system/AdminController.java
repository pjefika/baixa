/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baixa.controller.system;

import auth.annotation.Admin;
import auth.controller.SessionUsuarioEfika;
import baixa.controller.AbstractCrudController;
import baixa.dal.system.StatusPaginaDAO;
import baixa.model.entities.system.StatusPagina;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import java.util.Calendar;
import javax.inject.Inject;

/**
 *
 * @author G0025381
 */
@Controller
public class AdminController extends AbstractCrudController {

    @Inject
    private StatusPaginaDAO paginaDAO;

    @Inject
    private SessionUsuarioEfika session;

    @Path("/system/administracao/")
    @Admin
    public void administracao() {
        try {
            StatusPagina pagina = this.paginaDAO.listaStatusPagina();
            this.result.include("statusdapagina", pagina);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Admin
    public void ativarbaixa() {
        result.include("s", paginaDAO.obterStatusAtual());
    }

    @Admin
    @Post
    public void editar(StatusPagina s) {
        try {
            s.setUsuario(session.getUsuario().getLogin());
            s.setData(Calendar.getInstance());
            this.paginaDAO.cadastrar(s);
            this.result.redirectTo(this).administracao();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
