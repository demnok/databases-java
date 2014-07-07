<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<div>
	<h2>Create an account</h2>
	<sf:form method="POST" modelAttribute="account" >
		<fieldset>
			<table cellspacing="0">
				<tr>
					<th><label for="account_name">Full name:</label></th>
					<td>
						<sf:input path="name" size="15" id="account_name" /><br/>
						<sf:errors path="name" cssClass="error" />
					</td>
					<th></th>
					<td><input type="submit" value="Create account"/></td>
				</tr>
			</table>
		</fieldset>
	</sf:form>
</div>