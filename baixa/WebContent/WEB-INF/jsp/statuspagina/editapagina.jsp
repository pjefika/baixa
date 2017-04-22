<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
           prefix="decorator"%>

<div class="container">

    <div class="page-header">
        <h1>Início</h1>
    </div>
    
    <style>
  .toggle.ios, .toggle-on.ios, .toggle-off.ios { border-radius: 20px; }
  .toggle.ios .toggle-handle { border-radius: 20px; }
</style>
<input type="checkbox" checked data-toggle="toggle" data-style="ios" value="1">
<style>
  .toggle.android { border-radius: 0px;}
  .toggle.android .toggle-handle { border-radius: 0px; }
</style>
<input type="checkbox" checked data-toggle="toggle" data-style="android" data-onstyle="info" value="2">
    
</div>