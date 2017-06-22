<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
           prefix="decorator"%>

<script src="${pageContext.request.contextPath}/resources/switch/js/bootstrap-toggle.min.js"></script>
<link href="${pageContext.request.contextPath}/resources/switch/css/bootstrap-toggle.min.css" rel="stylesheet" />


<div class="container">

    <div class="page-header">
        <h1>Ativação da Página Baixa Off Line</h1>
    </div>


    <form action="${linkTo[AdminController].editar}" method="POST">
        <div class="modal-body">
            <textarea required="required" class="form-control" name="s.comentario"></textarea>
            <br>
            <div class="checkbox">
                <label>
                    <input type="checkbox" data-toggle="toggle" name="s.ativo" data-onstyle="primary" value="1" data-offstyle="danger" value="2">
                    
                </label>
            </div>
        </div>
        <div class="modal-footer">
            <button type="button" class="btn btn-info" data-dismiss="modal">Fechar</button>
            <button type="submit" class="btn btn-primary">Salvar</button>
        </div>
    </form>

</div>