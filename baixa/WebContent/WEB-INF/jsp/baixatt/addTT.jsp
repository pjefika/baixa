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

<link href="${pageContext.request.contextPath}/resources/datetimepicker/css/jquery.datetimepicker.min.css" rel="stylesheet" />

<script src="${pageContext.request.contextPath}/resources/datetimepicker/js/jquery.datetimepicker.full.min.js"></script>


<div class="container" id="form" >

    <div class="page-header">
        <h1>Cadastro Baixa Off Line TT</h1>
    </div>
    <table class="table table-bordered">

        <thead>
            <tr>
                <th>Código da SS</th>
                <th>Data e horario do Fechamento</th>
                <th>Código do Fechamento</th>
            </tr>
        </thead>
        <tbody>  
        <form action="${linkTo[BaixaTtController].adicionarTT()}">
            <tr>
                <td> <input type="text" class="form-control" name="baixatt.ss"/></td>

                <td>   
                    <input type="text" id="datafechamento" class="form-control" name="baixatt.dataFechamento">
                </td>
                <td> <input type="text" class="form-control" name="baixatt.codfechamento"/></td>

                </tbody>
                </table>

            <center>
                <button type="submit" class="btn btn-default">Salvar</button>
                <a href="${linkTo[BaixaController].atendimento()}" class="btn btn-default" role="button">Cancelar</a>
            </center>
        </form>

        <script>
            $(document).ready(function () {
                $('#datafechamento').datetimepicker({
                    format: 'Y-m-d H:i:s'
                });
                $.datetimepicker.setLocale('pt-BR');
            });
        </script>

</div>




