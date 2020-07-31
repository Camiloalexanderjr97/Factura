<%-- 
    Document   : Crear
    Created on : 29/07/2020, 06:10:21 PM
    Author     : Alexander
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="../CSS/styloCrear.css">
    </head>
    <body>
     <div class="wrapper">
  <form class="login">
    <p class="title">Log in</p>
    <input type="text" placeholder="Username" autofocus/>
    <i class="fa fa-user"></i>
    <input type="password" placeholder="Password" />
    <i class="fa fa-key"></i>
    <a href="#">Forgot your password?</a>
    <button>
      <i class="spinner"></i>
      <span class="state">Log in</span>
    </button>
  </form>
  <footer><a target="blank" href="http://boudra.me/">boudra.me</a></footer>
  </p>
</div>
          <script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
          <script src="../JS/action.js"></script>
    </body>
</html>
