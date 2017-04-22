<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
           prefix="decorator"%>

<script src="${pageContext.request.contextPath}/resources/switch/js/bootstrap-toggle.min.js"></script>
<link href="${pageContext.request.contextPath}/resources/switch/css/bootstrap-toggle.min.css" rel="stylesheet" />


<div class="container">

    <div class="page-header">
        <h1>Ativação da Página Baixa Off Line</h1>
    </div>

    <h3>Para liberar a página deixe a tecla em <b>ON</b>.</h3> 

    <div class="row">
        <div class="col-md-3">
            <label>
                Status Atual:
            </label>        

        </div >
        <div class="col-md-3">
            ${statusdapagina.ativo}
        </div>


        <div class="col-md-3">
            <label>
                <b>True - On | False - Off</b>  
            </label>        

        </div >
    </div>
    <div class="row">
        <div class="col-md-3">
            <label>
                Comentário:
            </label>        

        </div>
        <div class="col-md-6">
            ${statusdapagina.comentario}
        </div>
        <div class="col-md-3">
            <label>
                <b></b>  
            </label>        

        </div >
    </div>


    <br>
    <button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#confirma">
        Alterar
    </button>

    <div class="modal fade" id="confirma" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="myModalLabel">Favor inserir as informações quanto a abertura da Baixa Off Line.</h4>
                </div>

                <form action="${linkTo[StatusPaginaController].editarpaginastatus}">
                    <div class="modal-body">
                        <textarea class="form-control" name="s.comentario"></textarea>
                        <br>
                        <div class="checkbox">
                            <label>
                                <input type="checkbox" data-toggle="toggle" data name="s.ativo" data-onstyle="primary" value="1" data-offstyle="danger" value="2">                            </label>
                        </div>
                        <input type="hidden" name="s.id" value="${statusdapagina.id}"/>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Fechar</button>
                        <button type="submit" class="btn btn-primary">Salvar</button>
                    </div>
                </form>


            </div>
        </div>
    </div>


</div>