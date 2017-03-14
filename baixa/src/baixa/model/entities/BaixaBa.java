package baixa.model.entities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author G0025381
 */
@Entity
@Table(name = "baixa_BaixaBa")
public class BaixaBa implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String instancia;
    private String cidade;
    private String ordem;
    private String codigofech;  
    private StatusBaixa status;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar data;
              

    public BaixaBa(){
                
    }
          
                    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
   }

    public String getInstancia() {
        return instancia;
    }

    public void setInstancia(String instancia) {
        this.instancia = instancia;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getOrdem() {
        return ordem;
    }

    public void setOrdem(String ordem) {
        this.ordem = ordem;
    }

   

    public String getCodigofech() {
        return codigofech;
    }

    public void setCodigofech(String codigofech) {
        this.codigofech = codigofech;
    }

    public StatusBaixa getStatus() {
        return status;
    }

    public void setStatus(StatusBaixa status) {
        this.status = status;
    }


    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }
    
    
    
}
