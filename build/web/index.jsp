<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
  <!-- Theme Made By www.w3schools.com - No Copyright -->
  <title>E-VOTING</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <style>
  body {
    font: 400 15px/1.8 Lato, sans-serif;
    color: #777;
  }
  h3, h4 {
    margin: 10px 0 30px 0;
    letter-spacing: 10px;      
    font-size: 20px;
    color: #111;
  }
  .container {
    padding: 80px 120px;
  }
  .person {
    border: 10px solid transparent;
    margin-bottom: 25px;
    width: 80%;
    height: 80%;
    opacity: 0.7;
  }
  .person:hover {
    border-color: #f1f1f1;
  }
  .carousel-inner img {
    -webkit-filter: grayscale(90%);
    filter: grayscale(95%); /* make all photos black and white */ 
    width: 100%;
    /* Set width to 100% */
    margin: auto;
  }
  .carousel-caption h3 {
    color: #fff !important;
  }
  @media (max-width: 600px) {
    .carousel-caption {
      display: none; /* Hide the carousel text when the screen is less than 600 pixels wide */
    }
  }
  .bg-1 {
    background: #2d2d30;
    color: #bdbdbd;
  }
  .bg-1 h3 {color: #fff;}
  .bg-1 p {font-style: italic;}
  .list-group-item:first-child {
    border-top-right-radius: 0;
    border-top-left-radius: 0;
  }
  .list-group-item:last-child {
    border-bottom-right-radius: 0;
    border-bottom-left-radius: 0;
  }
  .thumbnail {
    padding: 0 0 15px 0;
    border: none;
    border-radius: 0;
  }
  .thumbnail p {
    margin-top: 15px;
    color: #555;
  }
  .btn {
    padding: 10px 20px;
    background-color: #333;
    color: #f1f1f1;
    border-radius: 0;
    transition: .2s;
  }
  .btn:hover, .btn:focus {
    border: 1px solid #333;
    background-color: #fff;
    color: #000;
  }
  .modal-header, h4, .close {
    background-color: #333;
    color: #fff !important;
    text-align: center;
    font-size: 30px;
  }
  .modal-header, .modal-body {
    padding: 40px 50px;
  }
  .nav-tabs li a {
    color: #777;
  }
  #googleMap {
    width: 100%;
    height: 400px;
    -webkit-filter: grayscale(100%);
    filter: grayscale(100%);
  }  
  .navbar {
    font-family: Montserrat, sans-serif;
    margin-bottom: 0;
    background-color: #808000;
    border: 0;
    font-size: 11px !important;
    letter-spacing: 4px;
    opacity: 0.9;
  }
  .navbar li a, .navbar .navbar-brand { 
    color: #d5d5d5 !important;
  }
  .navbar-nav li a:hover {
    color: #fff !important;
  }
  .navbar-nav li.active a {
    color: #fff !important;
    background-color: #29292c !important;
  }
  .navbar-default .navbar-toggle {
    border-color: transparent;
  }
  .open .dropdown-toggle {
    color: #fff;
    background-color: #555 !important;
  }
  .dropdown-menu li a {
    color: #000 !important;
  }
  .dropdown-menu li a:hover {
    background-color: red !important;
  }
  footer {
    background-color: #2d2d30;
    color: #f5f5f5;
    padding: 32px;
  }
  footer a {
    color: #f5f5f5;
  }
  footer a:hover {
    color: #777;
    text-decoration: none;
  }  
  .form-control {
    border-radius: 0;
  }
  textarea {
    resize: none;
  }
  
  </style>
</head>
<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="50">

<nav class="navbar navbar-default navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#myPage">VoTE StAR</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#band">CANDIDATE</a></li>
        <li><a href="#band">VOTER</a></li>
        <li><a href="#band">LIVEVOTING</a></li>
        <li><a href="#tour">ABOUT ME</a></li>
        <li><a href="#contact">CONTACT</a></li>
        <li><a href="#band">ADMIN</a></li>
     
      </ul>
    </div>
  </div>
</nav>

<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
     <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="img/nitraipur1.jpg" alt="New York" width="1200" height="500">
        <div class="carousel-caption">
          <h3>Online Voting System</h3>
          <p>Fully Secured Software to cast votes online.</p>
        </div>      
      </div>

      <div class="item">
        <img src="img/nitraipur2.jpg" alt="Chicago" width="1200" height="500">
        <div class="carousel-caption">
          <h3>Complete Efficient</h3>
          <p>Cast votes at your own free time!</p>
        </div>      
      </div>
    
      <div class="item">
        <img src="img/concert.jpg" alt="Los Angeles" width="1000" height="200" >
        <div class="carousel-caption">
          <h3>Live Voting</h3>
          <p>Voting for cultural events.</p>  
        </div>      
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
</div>

<!-- Container (The Band Section) -->
<div id="band" class="container text-center">
  <h3>E-VOTING</h3>
  <p><em>Cast votes at your own free time!</em></p>
  <p>At their core, online voting systems protect the integrity of your vote by preventing voters from being able to vote multiple times. As a digital platform, they eliminate the need to gather in-person, cast votes using paper, or by any other means.The cost savings and efficiencies you’ll gain are unparalleled to any other method of voting. Groups switching to web-based online voting systems from more expensive and less efficient voting technologies like voting machines, paper ballots, and in-person meetings will reap these benefits without increasing risk.</p>
  <br>
  <div class="row">
    <div class="col-sm-3">
        <%-- <p class="text-center"><button><strong>ADMIN</strong></button></p><br> --%>
        <a href="adminlogin.jsp" class="btn btn-dark" role="button"><strong>ADMIN</strong></a>
      <a href="#demo" data-toggle="collapse">
        <img src="img/adminpic.jpg" class="img-circle person" alt="Random Name" width="255" height="255">
      </a>
      <div id="demo" class="collapse">
        <p>MANAGE CANDIDATE</p>
        <p>MANAGE VOTER</p>
        <p>LIVE VOTING</p>
      </div>
    </div>
    <div class="col-sm-3">
       <%-- <p class="text-center"><strong><button href="userlogin.jsp">VOTER</button></strong></p><br> --%>
       <a href="userlogin.jsp" class="btn btn-dark" role="button"> <strong>VOTER </strong></a>
      <a href="#demo2" data-toggle="collapse">
        <img src="img/midvote.jpg" class="img-circle person" alt="Random Name" width="255" height="255">
      </a>
      <div id="demo2" class="collapse">
        <p>CHOOSE POST</p>
        <p>VOTE</p>
        <p>LIVE VOTE</p>
      </div>
    </div>
    <div class="col-sm-3" >
      <%--  <p class="text-center"><strong><button>CANDIDATE</button></strong></p><br> --%>
      <a href="candidate.jsp" class="btn btn-dark" role="button"><strong>CANDIDATE</strong></a>
      <a href="#demo3" data-toggle="collapse">
          <img src="img/candidate12.jpg" class="img-circle person" alt="Random Name" width="255" height="255">
      </a>
      <div id="demo3" class="collapse">
        <p>VIEW  CANDIDATE</p>
        <p>VIEW  PROCLAIMATION</p>
        
      </div>
    </div>
      <div class="col-sm-3" >
      <%--  <p class="text-center"><strong><button>CANDIDATE</button></strong></p><br> --%>
      <a href="lvform.jsp" class="btn btn-dark" role="button"><strong>LIVE VOTING</strong></a>
      <a href="#demo4" data-toggle="collapse">
          <img src="img/concert.jpg" class="img-circle person" alt="Random Name" width="255" height="255">
      </a>
      <div id="demo4" class="collapse">
        <p>OPEN LINK</p>
        <p>SELECT CULTURAL CLUB</p>
        <p>CHOOSE TEAM</p>
        
      </div>
    </div>
  </div>
</div>

<!-- Container (TOUR Section) -->
<div id="tour" class="bg-1">
  <div class="container">
       <h3 class="text-center">ABOUT ME</h3>
    <p class="text-center">Know me better!</p>
      <div class="row" style="padding-left:230px">
   
    <!--<h2 style="padding-left: 580px;padding-top: 200px">|About us|</h2>-->
    <div class="card-group" style="width:400px ;padding-left:20px;padding-top:5px "></div>
     
    <div class="col-md-8">
            
        <center>   
        <img class="card-img-top" src="img/yaminipic.jpeg" alt="Card image cap" width="400px"     >
    <div class="card-body">
        <h5 class="card-title">Yamini Namdev</h5>
      <p class="card-text" >I am working as a promising front-end developer and backend too. I completed  Masters in Computer Application from NIT Raipur</p>
    </div>
    
    <div class="card-footer">
      <small class="text-muted">Last updated 3 mins ago</small>
    </div>
            </center>
      </div>
  
         
          
  </div>
   </div>  
</div>
    
    

  
   

<!-- Container (Contact Section) -->
<div id="contact" class="container">
  <h3 class="text-center">Contact</h3>
  <p class="text-center"><em>Send feedback!</em></p>

  <div class="row">
    <div class="col-md-4">
      <p>Drop a note:</p>
      <p><span class="glyphicon glyphicon-map-marker"></span>Raipur, India</p>
      <p><span class="glyphicon glyphicon-phone"></span>Phone: +91 8515151515</p>
      <p><span class="glyphicon glyphicon-envelope"></span>Email: mail@mail.com</p>
    </div>
    <div class="col-md-8">
      <div class="row">
        <div class="col-sm-6 form-group">
          <input class="form-control" id="name" name="name" placeholder="Name" type="text" required>
        </div>
        <div class="col-sm-6 form-group">
          <input class="form-control" id="email" name="email" placeholder="Email" type="email" required>
        </div>
      </div>
      <textarea class="form-control" id="comments" name="comments" placeholder="Comment" rows="5"></textarea>
      <br>
      <div class="row">
        <div class="col-md-12 form-group">
          <button class="btn pull-right" type="submit">Send</button>
        </div>
      </div>
    </div>
  </div>
  <br>
  <h3 class="text-center">From The Blog</h3>  
  <ul class="nav nav-tabs">
    <li class="active"><a data-toggle="tab" href="#home">Mike</a></li>
    <li><a data-toggle="tab" href="#menu1">Chandler</a></li>
    <li><a data-toggle="tab" href="#menu2">Peter</a></li>
  </ul>

  <div class="tab-content">
    <div id="home" class="tab-pane fade in active">
      <h2>Mike Ross, Manager</h2>
      <p>Man, we've been on the road for some time now. Looking forward to lorem ipsum.</p>
    </div>
    <div id="menu1" class="tab-pane fade">
      <h2>Chandler Bing, Guitarist</h2>
      <p>Always a pleasure people! Hope you enjoyed it as much as I did. Could I BE.. any more pleased?</p>
    </div>
    <div id="menu2" class="tab-pane fade">
      <h2>Peter Griffin, Bass player</h2>
      <p>I mean, sometimes I enjoy the show, but other times I enjoy other things.</p>
    </div>
  </div>
</div>

<!-- Image of location/map -->


<!-- Footer -->
<footer class="text-center">
  <a class="up-arrow" href="#myPage" data-toggle="tooltip" title="TO TOP">
    <span class="glyphicon glyphicon-chevron-up"></span>
  </a><br><br>
  <p>Copyright  Â©  2021  by  Yamini Namdev</p> 
</footer>

<script>
$(document).ready(function(){
  // Initialize Tooltip
  $('[data-toggle="tooltip"]').tooltip(); 
  
  // Add smooth scrolling to all links in navbar + footer link
  $(".navbar a, footer a[href='#myPage']").on('click', function(event) {

    // Make sure this.hash has a value before overriding default behavior
    if (this.hash !== "") {

      // Prevent default anchor click behavior
      event.preventDefault();

      // Store hash
      var hash = this.hash;

      // Using jQuery's animate() method to add smooth page scroll
      // The optional number (900) specifies the number of milliseconds it takes to scroll to the specified area
      $('html, body').animate({
        scrollTop: $(hash).offset().top
      }, 900, function(){
   
        // Add hash (#) to URL when done scrolling (default click behavior)
        window.location.hash = hash;
      });
    } // End if
  });
});
</script>

</body>
</html>
