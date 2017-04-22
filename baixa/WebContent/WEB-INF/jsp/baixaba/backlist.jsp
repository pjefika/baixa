<%-- 
    Document   : create
    Created on : 20/02/2017, 15:59:44
    Author     : G0025381
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
           prefix="decorator"%>

<div class="page-header">
    <h1>Tratativa de Baixas enviadas - BA</h1>
</div>

<form action="${linkTo[BaixaBaController].update}" method="post"  style="width: 100%;"> 
    <table class="table table-bordered">
        <thead>
            <tr>
                <th>Cidade</th>
                <th>Instancia</th>
                <th>Ordem</th>
                <th>Novo Status</th>
                <th>Comentario</th>
            </tr>
        </thead>
        <tr>
        <input type="hidden" name="m.id" value="${resultado.id}" /> 
        <td>${resultado.cidade}</td>
        <td>${resultado.instancia}</td>
        <td>${resultado.ordem}</td>
        <td>	
            <div class="form-group">
                <div class="form-inline">
                    <select class="form-control" name="m.status" id="novostatus">
                        <c:forEach items="${StatusBaixa}" var="StatusBaixa">
                            <option <c:if test="${StatusBaixa == resultado.status}">selected </c:if> >${StatusBaixa}</option>
                        </c:forEach>
                    </select>
                </div>
            </div>
        </td>
        <td>
            <textarea class="form-control" name="m.comentario">${resultado.comentario}</textarea>
        </td>
        </tr>         
        </tbody>
    </table>
    <button type="submit" class="btn btn-default">Alterar</button>
    <button type="button" onclick="history.back(-1)" class="btn btn-default" class="cancelar">Voltar</button>
</form>
