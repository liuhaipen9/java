<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  <script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"56063",secure:"56064"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
 <%
	Context initContext = new InitialContext();
	DataSource ds = (DataSource)initContext.lookup("java:comp/env/jdbc/test");
	out.print(ds);
	
%>  
  <body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc2-0" data-genuitec-path="/jdniServlet/WebRoot/index.jsp">
    This is my JSP page. <br data-genuitec-lp-enabled="false" data-genuitec-file-id="wc2-0" data-genuitec-path="/jdniServlet/WebRoot/index.jsp">
  </body>
</html>
