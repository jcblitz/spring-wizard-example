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

	<h1>Add recipient details </h1>


	<c:forEach items="${giftCard.cardInstances}" var="currentGiftCard" varStatus="currentCard">
		
	 	<div class="card">
			<div class="card-face">
				<img class="card" src="<%=request.getContextPath() %>/images/<c:out value="${currentGiftCard.cardFace}"/>" />
			</div>
			<div class="card-details">
			
			
				<table>
					<tr>
						<td><label>Amount:</label></td>
						<td><spring:bind path="giftCard.cardInstances[${currentCard.index}].giftAmount">
						Value: ${status.value}
			   		<form:select path="${status.expression}">
			   			  <form:option value="-1" label="- Value -"/>
			              <form:option value="5.0" label="$5.00" />
			              <form:option value="10.0" label="$10.00" />
			              <form:option value="15.0" label="$15.00" />
			              <form:option value="20.0" label="$20.00" />
			              <form:option value="25.0" label="$25.00" />
			        </form:select>
			    </spring:bind></td>
					</tr>
					<tr>
						<td><label>To (recipient's name): </label></td>
						<td>   <spring:bind path="giftCard.cardInstances[${currentCard.index}].toName">
			   		<form:input path="${status.expression}" />
			    </spring:bind></td>
					</tr>
					<tr>
						<td><label>From (sender's name): </label></td>
						<td>    <spring:bind path="giftCard.cardInstances[${currentCard.index}].fromName">
			   		<form:input path="${status.expression}" />
			    </spring:bind></td>
					</tr>
					<tr>
						<td><label>Recipient's email address: </label></td>
						<td> 
			    <spring:bind path="giftCard.cardInstances[${currentCard.index}].toAddress">
			   		<form:input path="${status.expression}" />
			    </spring:bind></td>
					</tr>
					<tr>
						<td> <label>Message (max 200): </label></td>
						<td>    <spring:bind path="giftCard.cardInstances[${currentCard.index}].message">
			   		<form:textarea path="${status.expression}" />
			    </spring:bind></td>
					</tr>
				
				</table>
			
			
			
			    
			</div>
		</div>
		<div class="clear" />
		
	</c:forEach>
	
	<input type="submit" alignment="center" name="_target0" value="Go Back" />
	<input type="submit" alignment="center" name="_target2" value="Continue" />



</form:form>

</body>
</html>