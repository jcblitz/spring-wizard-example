<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/include.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
<style type="text/css">
	.clear {
		clear: both;
	}
	
	.card-face {
		float: left;
	}
</style>
</head>
<body>

<form:form commandName="giftCard">

	<h1>Review selection </h1>
	<div class="clear" />		
	
	<c:forEach items="${giftCard.cardInstances}" var="currentGiftCard" varStatus="currentCard">
	
	<div class="card">
			<div class="card-face">
				<img class="card" src="<%=request.getContextPath() %>/images/<c:out value="${currentGiftCard.cardFace}"/>" />
			</div>
			<div class="card-details">
			
			
				<table>
					<tr>
						<td><label>Amount:</label></td>
						<td>${currentGiftCard.giftAmount }</td>
					</tr>
					<tr>
						<td><label>To (recipient's name): </label></td>
						<td>${currentGiftCard.toName }</td>
					</tr>
					<tr>
						<td><label>From (sender's name): </label></td>
						<td>${currentGiftCard.fromName}</td>
					</tr>
					<tr>
						<td><label>Recipient's email address: </label></td>
						<td>${currentGiftCard.toAddress}</td>
					</tr>
					<tr>
						<td> <label>Message: </label></td>
						<td>${currentGiftCard.message}</td>
					</tr>
				
				</table>
			
			    
			</div>
		</div>
		<div class="clear" />
	</c:forEach>



	<input type="submit" alignment="center" name="_target1" value="Go Back" />
	<input type="submit" alignment="center" name="_finish" value="Add to cart" />



</form:form>

</body>
</html>