<%-- 
    Document   : welcomeResult
    Created on : Jan 26, 2014, 4:10:24 PM
    Author     : benja_000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Result</title>
    </head>
    <body>
        <p>
            <%
                Object result = "";
                Object res = request.getAttribute("Answer");
                if (res != null) {
                    result = res.toString();
                }
            %>
        <p><%= result%></p>
    </p>
</body>
</html>
