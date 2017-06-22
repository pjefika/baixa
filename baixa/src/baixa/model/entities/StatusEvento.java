/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baixa.model.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author G0025381
 */
public enum StatusEvento {

    ENCERRADO("Encerrado"),
    ABERTO("Aberto");
    

    private final String status;

    private StatusEvento(String valueStatus) {
        status = valueStatus;
    }

    public String getStatus() {
        return status;

    }

    public static List<StatusEvento> toList() {
        List<StatusEvento> a = new ArrayList<>();
        for (StatusEvento v : StatusEvento.values()) {
            a.add(v);
        }
        return a;

    }
}
