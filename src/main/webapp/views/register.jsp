<%--
  Created by IntelliJ IDEA.
  User: ycode
  Date: 23/10/2024
  Time: 12:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Login</title>
  <style>
    Body {
      width: 50%;
      font-family: Calibri, Helvetica, sans-serif;
      background-color: pink;
    }
    button {
      background-color: #4CAF50;
      width: 100%;
      color: orange;
      padding: 15px;
      margin: 10px 0px;
      border: none;
      cursor: pointer;
    }
    form {
      border: 3px solid #f1f1f1;
    }
    input[type=text], input[type=password] {
      width: 100%;
      margin: 8px 0;
      padding: 12px 20px;
      display: inline-block;
      border: 2px solid green;
      box-sizing: border-box;
    }
    button:hover {
      opacity: 0.7;
    }
    .cancelbtn {
      width: auto;
      padding: 10px 18px;
      margin: 10px 5px;
    }


    .container {
      padding: 25px;
      background-color: lightblue;
    }
  </style>
</head>
<body>
<center> <h1> Assurance Login Form </h1> </center>
<form action="registerClient" method="post">
  <div class="container">
    <label>Name : </label>
    <input type="text" placeholder="Enter Ur name" name="name" required>
    <label>Email : </label>
    <input type="text" placeholder="Enter email" name="email" required>
    <label>Password : </label>
    <input type="password" placeholder="Enter Password" name="password" required>
    <label>Phone : </label>
    <input type="text" placeholder="Enter Phone number" name="phone" required>
    <button type="submit">Register</button>

  </div>
</form>

</body>
</html>
