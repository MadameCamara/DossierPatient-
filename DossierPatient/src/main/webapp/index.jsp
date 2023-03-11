<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Connexion</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
 <div class="main" style=" background-image:  url('images/1.jpg')">
        <div class="navbar">
            <div class="icon">
                <h2 class="logo">MediCal</h2>
            </div>

            <div class="menu">
                <ul>
                    <li><a href="#">HOME</a></li>
                    <li><a href="#">ABOUT</a></li>
                </ul>
            </div>
            <div class="search">
                <input class="srch" type="search" name="" placeholder="Type To text">
                <a href="#"> <button class="btn">Search</button></a>
            </div>

        </div>
         <div class="content">
            <h1>Stay  <br><span>Safe &</span> <br>Healthy</h1>
                <div class="form">
                    <h2>Login Here</h2>
       
                    <form method=POST action=LoginServlet>
                    
                       <input  class="iv" placeholder="Enter Email Here" type="email" name="email"  required autofocus />
                       <input class="iv" placeholder="Enter Password Here"type="password"name="password"required autocomplete="current-password" />
                        <div class="lab"> 
                        <input id="remember_me" type="checkbox"  name="remember">
                       <span >Remember me</span>    
                        </div>      
                        <div class="flex items-center justify-end mt-4">
                         
                    <a class="fg" href="passe.jsp">
                        Forgot your password?
                    </a>
                
                </div> 
                       <button class="btnn">Log in</button>
                    </form>
                                  
        
                </div>
                    </div>
                </div>
       
    <script src="'js/ionicons.js'"></script>
        
</body>
</html>