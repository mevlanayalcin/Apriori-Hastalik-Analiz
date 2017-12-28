
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
    <meta charset="utf-8">
    <title>Hastalik Arastirma Platformu</title>
    
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="generator" content="Codeply">
    <link rel="stylesheet" href="./css/bootstrap.min.css" />
    <link rel="stylesheet" href="./css/animate.min.css" />
    <link rel="stylesheet" href="./css/ionicons.min.css" />
    <link rel="stylesheet" href="./css/styles.css" />
  </head>
  <body>
    <nav id="topNav" class="navbar navbar-default navbar-fixed-top">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand page-scroll" href="#first"><i class="ion-ios-analytics-outline"></i> Hastalik Arastirma Platformu</a>
            </div>
         
        </div>
    </nav>


    <header id="first">





                  <div class="col-lg-3 col-lg-offset-5 text-center">

                      <h1 >En cok gorulen hastaliklar :</h1>
                            <c:forEach var="tempEnCokListesi" items="${enCok}">
                                <br>
                            <input type="text" class="form-control"  name="hastalik" value="${tempEnCokListesi}">
                            </c:forEach>
                            <br/>

                  </div>



        
    </header>


  

    <!--scripts loaded here -->
    <script src="./js/jquery.min.js"></script>
    <script src="./js/bootstrap.min.js"></script>
    <script src="./js/jquery.easing.min.js"></script>
    <script src="./js/wow.js"></script>
    <script src="./js/scripts.js"></script>
  </body>
</html>