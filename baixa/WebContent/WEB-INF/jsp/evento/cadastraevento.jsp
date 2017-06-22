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


<div class="container" id="cadastraevento" >

    <div class="page-header">
        <h1>Adicionar Evento</h1>
    </div>
    <table class="table table-bordered">
        <thead>
            <tr>
<!--                <c:if test="${not empty mensagem}">${mensagem}</c:if> -->
            <div class="col-xs-7">
                <form action="${linkTo[EventoController].adicionar()}" method="post">

                <th>
                    <div class="form-group <c:if test="${not empty errors.from('e.abertura')}">has-error</c:if>">
                            <label class="control-label" for="inputSuccess1">Data de Abertura</label>
                            <input type="text"
                                   class="form-control" id="abertura"
                                   placeholder="Abertura" name="e.dataAbertura"/>
                            <span id="helpBlock2" class="help-block">${errors.from('e.abertura')}</span>
                    </div>
                </th>
                <th>
                    <div class="form-group <c:if test="${not empty errors.from('e.fechamento')}">has-error</c:if>">
                            <label class="control-label" for="inputSuccess1">Data de Fechamento</label>
                            <input type="text"
                                   class="form-control" id="fechamento"
                                   placeholder="Fechamento" name="e.dataFechamento"/>
                            <span id="helpBlock2" class="help-block">${errors.from('e.fechamento')}</span>
                    </div>
                </th>
                <th>
                    <div class="form-group <c:if test="${not empty errors.from('e.motivo')}">has-error</c:if>">
                            <label class="control-label" for="inputSuccess1">Motivo da Abertura</label>
                            <input type="text"
                                   class="form-control" id="fechamento"
                                   placeholder="Motivo" name="e.motivo"/>
                            <span id="helpBlock2" class="help-block">${errors.from('e.motivo')}</span>
                    </div>                    
                </th>
                <th>
                    <div class="form-group <c:if test="${not empty errors.from('e.observacao')}">has-error</c:if>">
                            <label class="control-label" for="inputSuccess1">Observações</label>
                            <input type="text"
                                   class="form-control" id="fechamento"
                                   placeholder="Observacao" name="e.observacao"/>
                            <span id="helpBlock2" class="help-block">${errors.from('e.observacao')}</span>
                    </div>

                </th>
        </div>
        </tr>
        </thead>   
    </table>


    <center>
        <button type="submit" class="btn btn-info">Salvar</button>
    </center>
</form>


</div>



<script>
    $(document).ready(function () {
        $.datetimepicker.setLocale('pt-BR');
        $('#abertura').datetimepicker({
            format: 'Y-m-d H:i:s'
        });
        $('#fechamento').datetimepicker({
            format: 'Y-m-d H:i:s'
        });

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


