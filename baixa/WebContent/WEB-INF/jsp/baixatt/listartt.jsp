<%-- 
    Document   : create
    Created on : 20/02/2017, 15:59:44
    Author     : G0025381
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
           prefix="decorator"%>




<h1>Consulta Status Baixa - TT</h1>
<table class="table table-bordered">
    <thead>
    <form action="<c:url value='/listastatus1/'/>">
        <tr>
            <th>Ordem</th>
            <th>Status</th>
            <th>Comentário</th>

        </tr>
        </thead>
        <tbody>

            <c:forEach items="${listastatus1}" var="status">

            <td> ${status.ss} </td>
            <td>${status.status} </td>
            <td>${status.comentario} </td>
            </tr>
        </c:forEach>
    </form>    
</tbody>

</table>
</div>


