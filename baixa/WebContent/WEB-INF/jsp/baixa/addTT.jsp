<%-- 
    Document   : create
    Created on : 20/02/2017, 15:59:44
    Author     : G0025381
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
           prefix="decorator"%>

<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 

<div class="container" id="form" >

    <div class="page-header">
        <h1>Cadastro Baixa Off Line TT</h1>
    </div>
    <table class="table table-bordered">

        <thead>
            <tr>
                <th>Código da SS</th>
                <th>Data da Fechamaneto</th>
                <th>Horário do Fechamaneto</th>
                <th>Código do Fechamento</th>
            </tr>
        </thead>
        <tbody>  
        <form action="<c:url value='/baixa/adicionar/tt/'/>">
            <tr>
                <td> <input type="text" class="form-control" name="baixatt.ss"/></td>

                <td>   <div class="input-group date" data-provide="datepicker">
                        <input type="date" class="form-control" value="today" value="dd/mm/yy"name="baixatt.dabertura">

                    </div>

                    </div></td>
                <td>   <input type="time" class="form-control" value="today"name="baixatt.dfechamento"></td>

                <td> <input type="text" class="form-control" name="baixatt.codfechamento"/></td>

                </tbody>
                </table>

            <center>
                <button type="submit" class="btn btn-default">Salvar</button>
                <a href="${linkTo[BaixaController].atendimento()}" class="btn btn-default" role="button">Cancelar</a>
            </center>
        </form>

</div>




