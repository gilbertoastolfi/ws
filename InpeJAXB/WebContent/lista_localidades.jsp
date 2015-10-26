<%@page import="modelo.Cidades"%>
<%@page import="modelo.Cidade"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista Localidades</title>

<%
	List<Cidade> cidades = null;
	if (request.getAttribute("cidades_inpe") != null) {
		cidades = ((Cidades) request.getAttribute("cidades_inpe"))
				.getCidade();
	}
%>

<style type="text/css">
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}

th, td {
	padding: 15px;
}

.center {
    margin: auto;
    width: 60%;   
    padding: 10px;
}
</style>


</head>
<body>
	<div class="center" style="	border:3px solid #8AC007;">
		<h2>Listando localidades do web service do INPE</h2>
		<a href="http://servicos.cptec.inpe.br/XML/">Clique aqui para ver
			os serviços oferecidos</a> <br />
		<h3>Cidades</h3>
		<%
			if (cidades != null) {
		%>
		<table class="center">
			<tr>
				<th>ID</th>
				<th>Nome</th>
				<th>UF</th>
			</tr>
			<%
				for (Cidade c : cidades) {
			%>
			<tr>
				<td><%=c.getId()%></td>
				<td><%=c.getNome()%></td>
				<td><%=c.getUf()%></td>
				<td><a href="InpeWS?acao=previsao&codigo=<%=c.getId()%>" > previsão 7 dias</a></td>
			</tr>
			<%
				}
			%>
		</table>
		<%
			}
		%>
	</div>
</body>
</html>