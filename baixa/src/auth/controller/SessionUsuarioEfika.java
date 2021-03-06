package auth.controller;

import auth.dal.webservice.Usuario;
import javax.inject.Named;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;

@SessionScoped
@Named
public class SessionUsuarioEfika implements Serializable {

    private static final long serialVersionUID = -253139602953530465L;

    private Usuario usuario;

    private Boolean ativo;

    public SessionUsuarioEfika() {
        usuario = new Usuario();
    }

    @Inject
    public SessionUsuarioEfika(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public boolean isAdmin() {
        return this.usuario.getNivel() > 7;
    }

    public boolean isLogado() {
        return usuario.getLogin() != null;

    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

}
