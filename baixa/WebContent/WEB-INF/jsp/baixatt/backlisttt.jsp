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
    <h1>Baixas enviadas - TT</h1>
</div>


<table class="table table-bordered">
    <thead>
        <tr>
            <th>Ordem</th>
            <th>Status</th>
            <th>Comentário</th>
            <th>Alterar</th>

        </tr>
    </thead>
    <tbody>
        <c:forEach items="${listastatus1}" var="m">
        <form action="${linkTo[BaixaTtController].update2}">
            <tr>
                <td>${m.ss}</td>
                <td>	
                    <select class="form-control" name="m.status" id="novostatus">
                        <c:forEach items="${todosStatus}" var="status">
                            <option <c:if test="${status == m.status}">selected </c:if> >${status}</option>
                        </c:forEach>
                    </select>
                </td>
                <td>
                    <textarea class="form-control" name="m.comentario">${m.comentario}</textarea>
                    <input type="hidden" name="m.id" value="${m.id}">
                </td>
                <td>
                    <button class="btn btn-default glyphicon-pencil" type='submit'></button>
                </td>
            </tr>
        </form>


    </c:forEach>

</tbody>
</table>

