package baixa.model.entities.system;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import baixa.model.entities.AbstractEntity;
import baixa.model.entities.StatusEvento;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.Transient;

/**
 *
 * @author G0025381
 */
@Entity
@Table(name = "baixa_evento")
public class EventoAbstract extends AbstractEntity implements Serializable {

    private Calendar abertura;
    private Calendar fechamento;

    @Transient
    private String dataAbertura;
    @Transient
    private String dataFechamento;
    @Transient
    private String dataEncerramento;

    private String motivo;
    private String observacao;
    private String loginAbertura;
    private String loginFechamento;
    private StatusEvento status;

    public EventoAbstract() {
    }

    protected Calendar parse(String data) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            Date date = sdf.parse(data);
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            return cal;
        } catch (Exception e) {
            return null;
        }

    }

    public String getDataEncerramento() {
        return dataEncerramento;
    }

    public void setDataEncerramento(String dataEncerramento) {
        this.dataEncerramento = dataEncerramento;
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

    public StatusEvento getStatus() {
        return status;
    }

    public void setStatus(StatusEvento status) {
        this.status = status;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.abertura = this.parse(dataAbertura);
        this.dataAbertura = dataAbertura;
    }

    public String getDataFechamento() {
        return dataFechamento;
    }

    public void setDataFechamento(String dataFechamento) {
        this.fechamento = this.parse(dataFechamento);
        this.dataFechamento = dataFechamento;
    }

    public void getLoginAbertura(String login) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
