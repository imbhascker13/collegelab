<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
body{
 background: url(https://i.pinimg.com/474x/e3/07/86/e3078619d29f9db2338e8986cb24e573--fall-wallpaper-snow-falls.jpg);
  background-repeat: no-repeat;
  background-size:100%;
}
header {
text-align: center;
}
</style>
<title  class="text-primary">College Management Application</title>
      <!-- Latest compiled and minified CSS -->
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
     <!-- jQuery library -->
     <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
     <!-- Popper JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body >
  <h1 style="text-align:center;"  class="text-primary">College Management Application</h1>
  <hr>
  <div class="container">
    <form action="/addCollege" > 
      <button type="submit"   class="btn btn-info btn-lg" ><span class="glyphicon glyphicon-log-in" ></span> AddCollege</button>
    </form>
  </div>
  <br><br>
  <div class="container">
    <form action="/addBranch">
      <button type="submit"   class="btn btn-info btn-lg"><span class="glyphicon glyphicon-log-in"></span> AddBranch</button>
    </form>
  </div>
  <br><br>
  <div class="container">
    <form action="/display" method="get">
      <button type="submit"   class="btn btn-info btn-lg"><span class="glyphicon glyphicon-log-in"></span> Display</button>
    </form>
  </div>
  
</body>
</html>