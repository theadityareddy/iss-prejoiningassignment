<html>
<head>
    <title>Register</title>
    <script>
        function validateRegister() {
            if (document.forms["regForm"]["username"].value === "" ||
                document.forms["regForm"]["password"].value === "") {
                alert("All fields are required");
                return false;
            }
            return true;
        }
    </script>
</head>
<body>

<h2>Register</h2>

<form name="regForm" action="register" method="post" onsubmit="return validateRegister()">
    Username: <input type="text" name="username"><br><br>
    Password: <input type="password" name="password"><br><br>
    <button type="submit">Register</button>
</form>

</body>
</html>
