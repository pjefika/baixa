package auth.intercepter;


import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.interceptor.AcceptsWithAnnotations;
import auth.annotation.Admin;
import auth.controller.SessionUsuarioEfika;
import baixa.controller.routes.HomeController;
import br.com.caelum.vraptor.AroundCall;
import br.com.caelum.vraptor.interceptor.SimpleInterceptorStack;

@Intercepts
@RequestScoped
@AcceptsWithAnnotations(Admin.class)
public class AdminInterceper {

    @Inject
    private Result result;

    @Inject
    private SessionUsuarioEfika session;

    /**
     * @deprecated CDI eyes only
     */
    protected AdminInterceper() {

    }

    @Inject
    public AdminInterceper(SessionUsuarioEfika session) {
        this.session = session;
    }

    @AroundCall
    public void around(SimpleInterceptorStack stack) {

        if (session.getUsuario().getNivel() > 7) {
            stack.next();
        } else {
            result.forwardTo(HomeController.class).restrito();
        }
    }
}
