<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
           prefix="decorator"%>

<div class="container">

    <div class="page-header">
        <h1>Início</h1>
    </div>


    <c:if test="${not empty informacao.comentario}">
        <div class="alert alert-info" role="alert">
            <label>${informacao.comentario}</label>
        </div>
    </c:if>
    <c:if test="${!not empty informacao.comentario}">
        <div class="alert alert-danger" role="alert">
            <label>Baixa Offline fechada no momento.</label>
        </div>
    </c:if>

</div>

