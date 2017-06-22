package baixa.controller;

import auth.controller.SessionUsuarioEfika;
import javax.inject.Inject;

import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.validator.Validator;

public abstract class AbstractCrudController {

    /**
     *
     */
    @Inject
    protected Result result;

    @Inject
    protected Validator validation;

    @Inject
    protected SessionUsuarioEfika sessionUsuarioEfika;
    
    @Inject
    protected SessionUsuarioEfika session;
}
