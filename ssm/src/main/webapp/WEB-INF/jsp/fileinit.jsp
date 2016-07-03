<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath }" />
<html>  
  <head>  
    <title>文件上传下载测试页面</title>  
  </head>  
    
  <body>  
    <h1>文件上传下载测试页面</h1>
    <hr>
    <h2>上传</h2>
    <form action="${ctx }/file/upload.do" method="post" enctype="multipart/form-data">  
		<input type="file" name="file" /> <input type="submit" value="Submit" />
	</form> 
    <hr>
    <h2>下载</h2>
    <a href="${ctx }/file/download.do">点我</a>
  </body>  
</html>  