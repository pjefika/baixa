<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="pt-br">
    <header class="tbheader">
        <title><decorator:title default="Baixa Off Line" /></title>
        <meta charset="utf-8">
        <link
            href="${pageContext.request.contextPath}/resources/bootstrap-3.3.7-dist/css/bootstrap.min.css"
            rel="stylesheet" />
        <link
            href="${pageContext.request.contextPath}/resources/bootstrap-3.3.7-dist/css/bootstrap-theme.min.css"
            rel="stylesheet" />

        <script
        src="${pageContext.request.contextPath}/resources/jquery-3.1.1/jquery-3.1.1.min.js"></script>
        <script
        src="${pageContext.request.contextPath}/resources/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>


        <decorator:head/>
    </header>

    <!-- Jóvi -->
    <!-- Fixed navbar -->
    <nav class="navbar navbar-default navbar-fixed-top">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                    <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="/index/">Back Office - Baixa Off Line</a>
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
                                    <li><a href="/baixa/index/">BA</a></li>
                                    <li><a href="/baixa/index/">TT</a></li>
                                </ul>                            
                            </li>
                            <li><a href="${linkTo[StatusPaginaController].administracao()}">ADM</a></li>
                            </c:if>

                    </ul>
                </c:if>
                <ul class="nav navbar-nav navbar-right">
                    <li class="dropdown">
                    </li>
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><span class="glyphicon glyphicon-user"></span>Perfil <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li>
                            <div class="navbar-login">
                                <div class="row">
                                    <div class="col-lg-4">
                                        <p class="text-center">
                                            <img src="http://portalcolaboradores/idc/portalcolaboradores/userimages/${sessionUsuarioEfika.usuario.login}.jpg" alt="User" class="img-rounded" style="width: 90px; height: 100px;">
                                        </p>
                                    </div>
                                    <div class="col-lg-1">

                                    </div>
                                </div>
                            </div>
                        </li>
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
                </ul>

            </div>

        </div>
    </nav>
    <br><br><br>
    <div class="container">
        <decorator:body/>
    </div>

</html>




