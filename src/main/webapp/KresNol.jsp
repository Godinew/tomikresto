
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<link href="setting.css" rel="stylesheet" type="text/css" >
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cool Game KrestiNol</title>
    </head>
    <body>
              <%! 
     String getFormattedDate () 
     { 
          SimpleDateFormat sdf = new SimpleDateFormat ("dd.MM.yyyy hh:mm:ss"); 
          return sdf.format (new Date ()); 
     } 
  %>
  
        <form action="StartServlet " method="Get">
            <%= getFormattedDate () %>
            <br>
            Login: <input type="text" name="username" value="" size="50" height="100" />
             <br>  <br> 
            Password: <input type="password" name="password" value="" size="50" height="100" />
               <br>
            <input type="submit" value="ENTER"/>
        </form>
    </body>
</html>

