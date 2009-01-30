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

body {
	font-family: Arial;
}


div img {
	border: 1px solid #000;
	padding: 2px;
	display: block;
	margin: 0 auto;
}

div.card {
	text-align: center;
	width: 320px;
	float: left;
}

div.buttons {
	padding: 20px 0 0 0;
	clear: both;
	
}

div.card select {
	margin: 15px 0;
}
</style>
<script src="http://www.google.com/jsapi"></script>
<script>
  // Load jQuery
  google.load("prototype", "1.6.0.3");

  // on page load complete, fire off a jQuery json-p query
  // against Google web search
  google.setOnLoadCallback(function() {
	  $$('.quantity').each(function(tab_group){  
		  $(tab_group).observe('change', calculateTotal);  
		});  

	    
    });
  

  function calculateTotal(event) {
	  total = 0;
	  $$('.quantity').each(function(element){  
		  if (Form.Element.getValue(element) * 1 > 0) {
		  	total+= 1 * Form.Element.getValue(element);  
		  }
		});  
	  $("count").innerHTML = total;	  
  }
</script>
<script type="text/javascript">


</script>
</head>
<body>
<h1>Card Faces</h1>

<p id='target'>This event stuff is <strong>cool</strong>.</p>

<form:form commandName="giftCard">

<div id="cards">

	<c:forEach items="${giftCard.cards}" varStatus="currentCard">
	
	<div class="card">
	
	  <spring:bind path="giftCard.cards[${currentCard.index}].card.cardFace">
		  <img class="card" src="<%=request.getContextPath() %>/images/<c:out value="${status.value}"/>" />
	  </spring:bind>
	  
	  <spring:bind path="giftCard.cards[${currentCard.index}].card.id">
		  <form:hidden path="${status.expression}" />
	  </spring:bind>

	Quantity: 
	   <spring:bind path="giftCard.cards[${currentCard.index}].quantity">
	   		<form:select path="${status.expression}" cssClass="quantity">
	   			  <form:option value="-1" label="Please Select"/>
	              <form:option value="1"/>
	              <form:option value="2"/>
	              <form:option value="3"/>
	              <form:option value="4"/>
	              <form:option value="5"/>
	              <form:option value="6"/>
	              <form:option value="7"/>
	              <form:option value="8"/>
	              <form:option value="9"/>
	              <form:option value="10"/>	             
	        </form:select>
	    </spring:bind>
	    
	    </div>
	    
	    <c:if test="${currentCard.index == 2}">
  			<br style="clear: both; margin: 20px 0; padding: 20px 0;" />
		</c:if>
	          
	</c:forEach>
	
	</div>
	
	<div class="count">
		You have selected <span id="count">0</span> out of 10 total
	</div>
	
	<div class="buttons">
	
	<input type="submit" name="_cancel" value="Cancel" />
	<input type="submit" name="_target1" value="Add Selected Quantity" />
	
	</div>

</form:form>

</body>
</html>