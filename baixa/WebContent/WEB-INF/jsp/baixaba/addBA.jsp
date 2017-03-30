<%-- 
    Document   : create
    Created on : 20/02/2017, 15:59:44
    Author     : G0025381
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
           prefix="decorator"%>



<div class="container" id="form" >

    <div class="page-header">
        <h1>Cadastro Baixa Off Line BA</h1>
    </div>

    <table class="table table-bordered">
        <thead>
            <tr>
                <th>Cidade</th>
                <th>Instancia</th>
                <th>Ordem</th>
                
            </tr>
        </thead>   

        <tbody>

        <form action="${linkTo[BaixaBaController].adicionarBA()}">
            <tr>
                <td> <input type="text" class="form-control" name="baixaba.cidade"></></td>
                <td><input type="text" class="form-control" name="baixaba.instancia"></></td>
                <td><input type="text" class="form-control" name="baixaba.ordem"></></td>
                              
            </tr>
            </tbody>
    </table>
    <center>
        <button type="submit" class="btn btn-default">Salvar</button>
        <a href="${linkTo[BaixaController].atendimento()}" class="btn btn-default" role="button">Cancelar</a>
    </center>
</form>

</div>
