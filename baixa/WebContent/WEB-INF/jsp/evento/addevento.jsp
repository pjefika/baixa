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
        <h1>Adicionar Evento</h1>
    </div>
    <table class="table table-bordered">

        <thead>
            <tr>
                <th>Data início</th>
                <th>Data Final</th>
                <th>Motivo</th>
                <th>Observação</th>
            </tr>
        </thead>
        <tbody>  
        <form action="${linkTo[EventoController].addevento()}">
            <tr>
                <td> 
                    <input required="required" type="text" id="abertura"class="form-control" name="evento.abertura">                   
                </td>
                <td> 
                    <input required="required" type="text" id="fechamento" class="form-control" name="evento.fechamento">
                </td>
                
                <td> 
                    <input required="required" type="text" class="form-control" name="evento.motivo">
                </td>
                <td> 
                    <input required="required" type="text" class="form-control" name="evento.observacao">
                </td>
            </tr>
            </tbody>
    </table>


    <center>
        <button type="submit" class="btn btn-info">Salvar</button>
        <a href="${linkTo[BaixaTtController].listartt()}" class="btn btn-info" role="button">Consultas</a>
    </center>
</form>


</div>
    
    <script>
            $(document).ready(function () {
                $('#abertura').datetimepicker({
                    format: 'Y-m-d H:i:s'
                });
                
                $.datetimepicker.setLocale('pt-BR');
            });
            $(document).ready(function () {
                $('#fechamento').datetimepicker({
                    format: 'Y-m-d H:i:s'
                });
                
                $.datetimepicker.setLocale('pt-BR');
            });
        </script>

<!--<script>
    $(document).ready(function () {
    $('#fechamento').datetimepicker({
    format: 'Y-m-d H:i:s',
            minDate: moment(),
            maxDate: moment().add(1, 'days').calendar();
    });
    $.datetimepicker.setLocale('pt-BR');
    });
    $(document).ready(function () {
    $('#abertura').datetimepicker({
    format: 'Y-m-d H:i:s',
            minDate: moment(),
            maxDate: moment().add(1, 'days').calendar();
    });
    $.datetimepicker.setLocale('pt-BR');
    });
</script>-->


