package baixa.controller;

import auth.annotation.Admin;
import auth.annotation.Logado;
import baixa.model.entities.Relatorio;
import java.io.IOException;

import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;

@Controller
@RequestScoped
public class RelatorioController extends AbstractCrudController {

    @Inject
    private baixa.dal.BaixaDAO dao;

    public RelatorioController() {

    }

    @Admin
    public void create() {
    }

    @Admin
    public void lista() {
    }

    @Admin
    public void add(Relatorio r) throws IOException {
        if (r.getRelato().equalsIgnoreCase("BA")) {
            result.include("relatorioba", dao.relatorioBa(r));
        } else {
            result.include("relatoriott", dao.relatorioTt(r));
        }
    }

}
