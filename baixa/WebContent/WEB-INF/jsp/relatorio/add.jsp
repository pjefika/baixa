<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%
    response.setContentType("application/vnd.ms-excel");
    response.setHeader("Content-Disposition", "inline; filename=" + "excel.xls");
%>

<table>
    <thead>
        <tr>
            <th>Data de Abertura</th>
            <th>Data de Fechamaento</th>
            <th>Status</th>
            <th>Usuario Back Office</th>
            <th>Usuário</th>
            <th>Cidade</th>
            <th>Comentário</th>
            <th>Instancia</th>
            <th>Ordem</th>

        </tr>
    </thead>
    <tbody>
        <c:forEach items="${relatorio}" var="at">
            <tr class="leline">
                <td><fmt:formatDate type="both"  dateStyle="short" timeStyle="short" value="${at.dabertura.time}"/></td>
                <td><fmt:formatDate type="both"  dateStyle="short" timeStyle="short" value="${at.dfechamento.time}"/></td>
                <td>${at.status}</td>
                <td>${at.userbackoffice}</td>
                <td>${at.usuario}</td>
                <td>${at.cidade}</td>
                <td>${at.comentario}</td>
                <td>${at.instancia}</td>
                <td>${at.ordem}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>