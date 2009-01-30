<%@ include file="../../includes/tagLibrary.jsp" %>
<style>
	.jersey {
		border-bottom: 2px solid #ccc;
		padding: 10px 0;
	}
	
	.buttons {
		padding: 10px 0;
	}
</style>


<form:form commandName="jerseyCommand">


<h1>Please select a quantity:</h1>


<c:forEach items="${jerseyCommand.footballJerseyOrderTo}" var="jerseyTo" varStatus="jerseyToIndex">

	<div class="jersey">
		<img src="<%=request.getContextPath() %>/images/${jerseyTo.footballJersey.image}" />

	
	<spring:bind path="jerseyCommand.footballJerseyOrderTo[${jerseyToIndex.index}].footballJersey.id">
		<form:hidden path="${status.expression}"  />
	</spring:bind>
	
	 <spring:bind path="jerseyCommand.footballJerseyOrderTo[${jerseyToIndex.index}].quantity">
	   		<form:select path="${status.expression}">
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
</c:forEach>


<div class="buttons">

	<input type="submit" name="_cancel" value="Cancel" />
	<input type="submit" name="_target1" value="Add Selected Quantity" />
	</div>

</form:form>