<%-- 
    Document   : create
    Created on : 20/02/2017, 15:59:44
    Author     : G0025381
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
           prefix="decorator"%>




    <h1>Consulta Status Baixa - BA</h1>
    <table class="table table-bordered">
        <thead>
        <form action="<c:url value='/listastatus/'/>">
            <tr>
                <th>Instancia</th>
                <th>Status</th>
                <th>Comentário</th>
               

            </tr>
            </thead>
            <tbody>

                <c:forEach items="${listastatus}" var="status">
                    <tr>
                        <td>${status.instancia}</td>
                        <td>${status.status}</td>
                        <td>${status.comentario}</td>
                        
                    </tr>
                </c:forEach>

            </tbody>

    </table>                


    