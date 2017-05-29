package baixa.model.entities.eventos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import baixa.model.entities.BaixaAbstract;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;
import java.util.Calendar;

/**
 *
 * @author G0025381
 */
@Entity
@Table(name = "baixa_evento")
public class BaixaOffline extends BaixaAbstract implements Serializable {

    private Calendar abertura;
    private Calendar fechamento;
    private String motivo;
    private String observacao;

    private String loginAbertura;
    private String loginFechamento;
 ;

    @Lob
    private String comentario;

    public BaixaOffline() {
    }

    public Calendar getAbertura() {
        return abertura;
    }

    public void setAbertura(Calendar abertura) {
        this.abertura = abertura;
    }

    public Calendar getFechamento() {
        return fechamento;
    }

    public void setFechamento(Calendar fechamento) {
        this.fechamento = fechamento;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getLoginAbertura() {
        return loginAbertura;
    }

    public void setLoginAbertura(String loginAbertura) {
        this.loginAbertura = loginAbertura;
    }

    public String getLoginFechamento() {
        return loginFechamento;
    }

    public void setLoginFechamento(String loginFechamento) {
        this.loginFechamento = loginFechamento;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

}
