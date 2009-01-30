<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<%@ include file="../includes/tagLibrary.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>Gooey Templates : CMS Style App</title>
		<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<meta http-equiv="Pragma" content="no-cache" />
		<link rel="stylesheet" href="<%=request.getContextPath() %>/stylesheets/reset-fonts.css" type="text/css" media="screen, projection" />
		<link rel="stylesheet" href="<%=request.getContextPath() %>/stylesheets/gt-styles.css" type="text/css" media="screen, projection" />
		<link rel="stylesheet" href="<%=request.getContextPath() %>/stylesheets/style.css" type="text/css" media="screen, projection" />
		<script type="text/javascript" src="<%=request.getContextPath() %>/javascripts/jquery-1.2.3.min.js"></script>
		<script type="text/javascript" src="<%=request.getContextPath() %>/javascripts/jquery.form.js"></script>
		<script type="text/javascript" src="<%=request.getContextPath() %>/javascripts/ui.core.js"></script>
		<script type="text/javascript" src="<%=request.getContextPath() %>/javascripts/ui.sortable.js"></script>
		<decorator:head />
	</head>
	<body>
		<!-- head -->
		<div class="gt-hd clearfix">
			<!-- logo -->
			<div class="gt-logo">
						</div>
			<!-- / logo -->
			
			<!-- navigation -->
			<div class="gt-nav">
				
			</div>
			
			
			<!-- / navigation -->
			
		</div>
		<!-- / head -->
		
		<!-- body -->
		<div class="gt-bd clearfix">
			
			<!-- main content -->
			<div class="gt-content">
				<decorator:body />
				
				

				
			</div>
			<!-- / main content -->
			
		</div>
		<!-- / body -->
		
		<!-- footer -->
		<div class="gt-footer">
			<p>Copyright &copy; 2008 Gooey Templates - <a href="http://www.gooeytemplates.com" target="_blank">GooeyTemplates.com</a></p>
		</div>
		<!-- /footer -->
	</body>
</html>