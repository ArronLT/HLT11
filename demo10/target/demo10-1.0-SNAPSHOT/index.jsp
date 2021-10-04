<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>HLT11</title>
</head>
<body>
<center>
    <form action="hello-servlet">
        Register here<br>
        <label for="fname">First name</label><br>
        <input type="text" id="fname" name="fname" value=""><br>
        <label for="lname">Last name:</label><br>
        <input type="text" id="lname" name="lname" value=""><br>
        <label for="email">Email Address:</label><br>
        <input type="text" id="email" name="email" value=""><br>
        <label for="pass">Password:</label><br>
        <input type="text" id="pass" name="pass" value=""><br>
        <label for="Cpass">Confirm Password:</label><br>
        <input type="text" id="Cpass" name="Cpass" value=""><br>

        <input type="submit" value="Register now">

    </form>
</center>
</body>
</html>