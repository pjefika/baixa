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
    <h1>Baixas enviadas - BA</h1>
</div>
<table class="table table-bordered">
    <thead>
        <tr>
            <th>Instancia</th>
            <th>Status</th>
            <th>Tratado por:</th>
            <th>Ação</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${listastatus}" var="status">
            <tr>
                <td>${status.instancia}</td>
                <td>${status.status}</td>
                <td>${status.userbackoffice}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/backoffice/backlistba/${status.id}" class="btn btn-warning btn-sm"> 
                        <span
                            class="glyphicon glyphicon-pencil" aria-hidden="true">
                        </span>
                    </a>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>


