<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "com.company.general.GamesList"%>
<%@page import = "com.company.general.GameEngine"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="JDBCresult">
       
    <% String name = request.getParameter("username"); 
     String password = request.getParameter("password"); 
    GameEngine g = GamesList.getInstance().getForName(name);%>
    <% 
        
        session.setAttribute("nam", name);
   
    %>
 <h1>Выйграл:<h1>  <h1><%=g.status%><h1>
    
<table class="tbl" align="center" border=1><tr>
<td><a href="<%=g.getJSPReferenceValue(0, name)%>"><img src="<%=g.getImage(0)%>"></a></td>
<td><a href="<%=g.getJSPReferenceValue(1, name)%>"><img src="<%=g.getImage(1)%>" ></a></td>
<td><a href="<%=g.getJSPReferenceValue(2, name)%>"><img src="<%=g.getImage(2)%>" ></a></td></tr><tr>
<td><a href="<%=g.getJSPReferenceValue(3, name)%>"><img src="<%=g.getImage(3)%>" ></a></td>
<td><a href="<%=g.getJSPReferenceValue(4, name)%>"><img src="<%=g.getImage(4)%>" ></a></td>
<td><a href="<%=g.getJSPReferenceValue(5, name)%>"><img src="<%=g.getImage(5)%>" ></a></td></tr><tr>
<td><a href="<%=g.getJSPReferenceValue(6, name)%>"><img src="<%=g.getImage(6)%>" ></a></td>
<td><a href="<%=g.getJSPReferenceValue(7, name)%>"><img src="<%=g.getImage(7)%>" ></a></td>
<td><a href="<%=g.getJSPReferenceValue(8, name)%>"><img src="<%=g.getImage(8)%>" ></a></td>
     
</tr>
</table>

<script type="text/javascript"> 

setTimeout("window.location.reload()",3000)
 
</script>
 <% 
    session.setAttribute("st",g.status);
    %>

<input type="submit" value="Завершить игру" />

  </form>  
    </body>
</html>