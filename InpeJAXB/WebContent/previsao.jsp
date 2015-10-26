<%@page import="modelo.Previsao"%>
<%@page import="java.util.List"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Locale"%>
<%@page import="modelo.Cidade"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Previsão</title>

<%
	Cidade cidade = (Cidade) request.getAttribute("cidade");
	Locale localeBR = new Locale("pt", "BR");
	SimpleDateFormat fmt = new SimpleDateFormat("EEEEEE',' dd ' de 'MMMM ' de ' yyyy", localeBR);
%>


<style type="text/css">

.center {
    margin: auto;
    width: 60%;   
    padding: 10px;
}

.font {
    font-size: 150%;
    color: #3B9C00;
}

</style>

</head>
<body>
	<%
		if (cidade != null) {
			List<Previsao> previsoes = cidade.getPrevisao();
	%>
	<div class="center" style="border:3px solid #8AC007;">
		<p>
			<span class="font"><%=cidade.getNome()%> - <%=cidade.getUf()%> </span><br /> 
			<span class="font">Data atualização: <%=fmt.format(cidade.getAtualizacao())%></span><br />
		</p>
		<hr/>
	
			<%
				for (Previsao p : previsoes) {
			%>
		
		<p>
			<span><b><%=fmt.format(p.getDia())%></b></span><br /> 
			<span>Máxima: <%=p.getMaxima()%></span><br /> 
			<span>Mínima: <%=p.getMinima()%></span><br />
			<span>UV: <%=p.getIuv()%></span><br /> 
			<span>Tempo: <%=p.getTempo()%></span><br />
		</p>
		<%
			}
	
			} else {
		%>
		<p>
			<span>Cidade não encontrada</span>
		</p>
		<%
			}
		%>
	</div>
</body>
</html>