package baixa.model.entities.tt;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import baixa.model.entities.BaixaAbstract;
import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author G0025381
 */
@Entity
@Table(name = "baixa_BaixaTT")
public class BaixaTt extends BaixaAbstract implements Serializable {

    private String ss;
    private String codfechamento;
    private Calendar dfechamentousr;
    @Lob
    private String comentario;

    @Transient
    private String dataFechamento;

    public BaixaTt() {

    }

    public String getSs() {
        return ss;
    }

    public void setSs(String ss) {
        this.ss = ss;
    }

    public String getCodfechamento() {
        return codfechamento;
    }

    public void setCodfechamento(String codfechamento) {
        this.codfechamento = codfechamento;
    }

    public String getDataFechamento() {
        return dataFechamento;
    }

    public void setDataFechamento(String dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    public Calendar getDfechamentousr() {
        return dfechamentousr;
    }

    public void setDfechamentousr(Calendar dfechamentousr) {
        this.dfechamentousr = dfechamentousr;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
