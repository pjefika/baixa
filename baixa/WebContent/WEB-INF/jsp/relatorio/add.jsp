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
            <th>Instancia</th>
            <th>Ordem</th>
            <th>Cidade</th>
            <th>Cod Fechamento</th>
            <th>Data</th>
            <th>Status</th>
            <th>Matrícula</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${atendimentos}" var="at">
            <tr class="leline">
                <td>${at.solucao.motivo.macroMotivo.rede.nome}</td>
                <td>${at.tipoAtividade}</td>
                <td>${at.solucao.motivo.macroMotivo.nome}</td>
                <td>${at.solucao.motivo.nome}</td>
                <td>${at.solucao.nome}</td>
                <td>
                    <c:choose>
                        <c:when test="${at.solucao.indevido == true}">
                            Sim
                        </c:when>
                        <c:otherwise>
                            Não
                        </c:otherwise>
                    </c:choose>
                </td>
                <td>${at.loginOperador}</td>
                <td>${at.loginGuru}</td>
                <c:forEach items="${colaboradoresGuru}" var="colG">
                    <c:if test="${colG.matricula == at.loginOperador}">
                        <td>${colG.nome}</td>
                        <td>${colG.supervisor}</td>	
                    </c:if>
                </c:forEach>
                <td>${at.loginRegistro}</td>
                <td>${at.terminal}</td>
                <td><fmt:formatDate type="both" dateStyle="short"
                                timeStyle="short" value="${at.dataRegistro}" /></td>
                <td>${at.observacao}</td>
                <c:forEach items="${colaboradores}" var="col">
                    <c:if test="${col.matricula == at.loginOperador}">
                        <td>${col.nome}</td>
                        <td>${col.supervisor}</td>	
                    </c:if>
                </c:forEach>

            </tr>
        </c:forEach>
    </tbody>
</table>