<html>
<head>
    <title>Login</title>
    <script>
        function validateLogin() {
            if (document.forms["loginForm"]["username"].value === "" ||
                document.forms["loginForm"]["password"].value === "") {
                alert("All fields are required");
                return false;
            }
            return true;
        }
    </script>
</head>
<body>

<h2>Login</h2>

<form name="loginForm" action="login" method="post" onsubmit="return validateLogin()">
    Username: <input type="text" name="username"><br><br>
    Password: <input type="password" name="password"><br><br>
    <button type="submit">Login</button>
</form>

<p style="color:red">${error}</p>

<p>New user? <a href="register.jsp">Register here</a></p>

</body>
</html>
