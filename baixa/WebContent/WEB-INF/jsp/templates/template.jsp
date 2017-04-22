<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
           prefix="decorator"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <title><decorator:title default="BaixaOffLine"/></title>
        <meta charset="utf-8">

        <!-- import CSS -->
        <link href="${pageContext.request.contextPath}/resources/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet" />
        <link href="${pageContext.request.contextPath}/resources/bootstrap-3.3.7-dist/css/bootstrap-theme.min.css" rel="stylesheet" />
        <link href="${pageContext.request.contextPath}/resources/custom/custom.css" rel="stylesheet" />

        <!-- import JavaScript -->
        <script src="${pageContext.request.contextPath}/resources/jquery-3.1.1/jquery-3.1.1.min.js"></script>
        <script src="${pageContext.request.contextPath}/resources/node_modules/vue/dist/vue.js"></script>
        <script src="${pageContext.request.contextPath}/resources/lodash/lodash.js"></script>
        <script src="${pageContext.request.contextPath}/resources/moment/moment.js"></script>
        <script src="${pageContext.request.contextPath}/resources/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

        <decorator:head/>
    </head>


    <!-- Jóvi -->
    <!-- Fixed navbar -->
    <body>
        <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                        <span class="sr-only">Toggle navigation</span> 
                    </button>
                    <a class="navbar-brand" href="${linkTo[HomeController].index()}">Back Office - Baixa OffLine</a>
                </div>
                <div id="navbar" class="navbar-collapse collapse">
                    <c:if test="${sessionUsuarioEfika.logado}">
                        <ul class="nav navbar-nav">
                            <li><a href="${linkTo[HomeController].index()}">Home</a></li>
                            <li><a href="${linkTo[BaixaController].atendimento()}">Registro Baixa</a></li>
                                <c:if test="${sessionUsuarioEfika.admin}">
                                <li class="dropdown">        
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Painel Encerramento 
                                        <span class="caret"></span>
                                    </a>                            
                                    <ul class="dropdown-menu" >
                                        <li class="dropdown-header">Baixa</li>
                                        <li><a href="${linkTo[BaixaBaController].backlistba()}">BA</a></li>
                                        <li><a href="${linkTo[BaixaTtController].backlisttt()}">TT</a></li>
                                        <li role="separator" class="divider"></li>
                                        <li class="dropdown-header">Relatórios</li>
                                        <li><a href="${linkTo[RelatorioController].create()}"> BA</a></li>
                              
                                    </ul>                            
                                </li>
                                <li><a href="${linkTo[StatusPaginaController].administracao()}">ADM</a></li>
                                
                                </c:if>

                        </ul>
                    </c:if>
                    <ul class="nav navbar-nav navbar-right">
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><span class="glyphicon glyphicon-user"></span>Perfil <span class="caret"></span></a>
                                <ul class="dropdown-menu">
                                    <li>
                                        <div class="navbar-login">
                                            <div class="row">
                                                <div class="col-lg-4">
                                                    <p class="text-center">
                                                        <img src="http://portalcolaboradores/idc/portalcolaboradores/userimages/${sessionUsuarioEfika.usuario.login}.jpg" alt="User" class="img-rounded" style="width: 100px; height: 100px;">
                                                    </p>
                                                </div>
                                                <div class="col-lg-7">
                                                    <p class="text-left"><strong>Nome</strong></p>
                                                    <p class="text-left small">nome.sobrenome@telefonica.com</p>
                                                    <p class="text-left">
                                                        <a href="#" class="btn btn-primary btn-block btn-sm">Meu Perfil</a>
                                                    </p>
                                                </div>
                                                <div class="col-lg-1"></div>
                                            </div>
                                        </div>
                                    </li>
                                    <li class="divider"></li>
                                    <li>
                                        <div class="navbar-login navbar-login-session">
                                            <div class="row">
                                                <div class="col-lg-12">
                                                    <p>
                                                        <a href="${linkTo[UsuarioController].logout()}" class="btn btn-danger btn-block">Sair</a>
                                                    </p>
                                                </div>
                                            </div>
                                        </div>
                                    </li>
                                </ul>
                            </li>
                        </ul>

                </div>

            </div>
        </nav>
        <br><br><br>

        <div class="container">
            <decorator:body/>
        </div>
    </body>
</html>
