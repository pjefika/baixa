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
                <td> <input required="required" type="text" class="form-control" name="baixaba.cidade"></></td>
                <td><input required="required" type="text" class="form-control" name="baixaba.instancia"></></td>
                <td><input required="required" type="text" class="form-control" name="baixaba.ordem"></></td>

            </tr>


            </tbody>
    </table>

    <center>
        <button type="submit" class="btn btn-success">Salvar</button>
    </center>
</form>

</div>
            <div>
                
                
                
                
            </div>