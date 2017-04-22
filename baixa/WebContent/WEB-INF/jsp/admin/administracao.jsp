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

    <h3>Para liberar a página deixe a tecla em <b>ON</b>.</h3>

    <div class="row">
        <div class="col-md-3">
            <label>Status Atual:</label>
        </div>
        <div class="col-md-3">
            <c:if test="${statusdapagina.ativo}">
                ON
            </c:if>
            <c:if test="${!statusdapagina.ativo}">
                OFF
            </c:if>
        </div>
    </div>
    <div class="row">
        <div class="col-md-3">
            <label>Comentário:</label> ${statusdapagina.comentario}
        </div>
    </div>
    <a class="btn btn-primary btn-lg" href="${linkTo[AdminController].form}">Alterar</a>
</div>