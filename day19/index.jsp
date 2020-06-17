<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script src="https://apis.google.com/js/platform.js" async defer></script>
<meta name="google-signin-client_id" content="551746054662-m1023hueouim8ndjcrhh8516c1364aqt.apps.googleusercontent.com"> 
</head>
<body>
 
<div class="g-signin2" data-onsuccess="onSignIn" id="myP">
</div> <img id="myImg"><br> 
<p id="name">
</p> <div id="status">
</div> <script type="text/javascript"> 
function onSignIn(googleUser) {
	// window.location.href='success.jsp';
	var profile = googleUser.getBasicProfile();
	var imagurl=profile.getImageUrl();
	var name=profile.getName();
	var email=profile.getEmail();
	document.getElementById("myImg").src = imagurl; document.getElementById("name").innerHTML = name; document.getElementById("myP").style.visibility = "hidden"; document.getElementById("status").innerHTML = 'Welcome '+name+'!<a href=success.jsp?email='+email+'&name='+name+'/>Continue with Google login</a></p>' } function myFunction() { gapi.auth2.getAuthInstance().disconnect(); location.reload(); } </script> 
<button onclick="myFunction()">Sign Out</button> 

</body>
</html>