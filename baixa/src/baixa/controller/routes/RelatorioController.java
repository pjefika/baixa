package baixa.controller.routes;

import auth.annotation.Admin;
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
    public void add(Relatorio r) throws IOException {
        if (r.getRelato().equalsIgnoreCase("BA")) {
            
            result.include("relatorio", dao.relatorioba(r));
        } else {
            result.include("relatorio", dao.relatorioTt(r));
        }
    }
    
}