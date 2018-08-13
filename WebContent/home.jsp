<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cersie_home</title>
</head>
<body>
<h2>Home Page</h2>

            <form action="LoginBean.java">
                <table>
                    <tr>
                        <td> User Id  : </td><td> <input name="userid" size=20 type="text" /> </td> 
                    </tr>
                    <tr>
                        <td> Password  : </td><td> <input name="password" size=20 type="password" /> </td> 
                    </tr>
                </table>
                <input type="submit" value="Login" /><br>
               new user:<a href ="register.jsp">register Now</a><br>
                forget Password:<a href ="forget.jsp">reset</a>
               
            </form>
</body>
</html>