
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
        <div class="header-content">
            <div class="inner">
                <h1 >Arastirdiginiz hastaliklar :</h1>
                <h4>Bu hastaliklarla iliskili hastaliklar asagidadir</h4>
                <hr>
                <c:if test = "${empty birliktelikListesi}">
                    <div class="col-md-4">
                        <label></label>

                    </div>


                    <div class="col-md-4">
                        <label></label>
                        <input type="text" class="form-control"  name="hastalik" value="Iliskili hastalik bulunamadi...">
                    </div>

                    <div class="col-md-4">

                    </div>
                </c:if>
                <c:forEach var="tempBirliktelikListesi" items="${birliktelikListesi}">
                  <div class="col-lg-10 col-lg-offset-1 text-center">
                    
                        <div class="col-md-4">
                            <label></label>
                            
                        </div>



                        <div class="col-md-4">
                            <label></label>
                            <input type="text" class="form-control"  name="hastalik" value="${tempBirliktelikListesi}">
                        </div>

                        
                        <div class="col-md-4">
                            
                        </div>
       
                  </div>

                </c:forEach>
                
            
                  
                
            </div>
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