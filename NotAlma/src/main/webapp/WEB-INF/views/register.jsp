<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ page contentType= "text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page session="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
	<title>Giriş</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="asset/Login/images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="asset/Login/vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="asset/Login/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="asset/Login/fonts/iconic/css/material-design-iconic-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="asset/Login/vendor/animate/animate.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="asset/Login/vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="asset/Login/vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="asset/Login/vendor/select2/select2.min.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="asset/Login/vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="asset/Login/css/util.css">
	<link rel="stylesheet" type="text/css" href="asset/Login/css/main.css">
<!--===============================================================================================-->
</head>
<body>
	
	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100">
				<div class="login100-form validate-form">
					<span class="login100-form-title p-b-26">
						Not Alma
					</span>
					<span class="login100-form-title p-b-48">
						<i class="zmdi zmdi-font"></i>
					</span>

					<div class="wrap-input100 validate-input" data-validate = "Ad Girin">
						<input class="input100" type="text" name="name" id="name">
						<span class="focus-input100" data-placeholder="Adınız"></span>
					</div>
					
					<div class="wrap-input100 validate-input" data-validate = "Soyad Girin">
						<input class="input100" type="text" name="surname" id="surname">
						<span class="focus-input100" data-placeholder="Soyadınız"></span>
					</div>
					
					<div class="wrap-input100 validate-input" data-validate = "Kullanıcı Adı Girin">
						<input class="input100" type="text" name="username" id="username">
						<span class="focus-input100" data-placeholder="Kullanıcı Adı"></span>
					</div>
					
					<div class="wrap-input100 validate-input" data-validate = "Email Girin">
						<input class="input100" type="text" name="email" id="email">
						<span class="focus-input100" data-placeholder="Email"></span>
					</div>

					<div class="wrap-input100 validate-input" data-validate="Parola Girin">
						<span class="btn-show-pass">
							<i class="zmdi zmdi-eye"></i>
						</span>
						<input class="input100" type="password" name="pass" id="pass">
						<span class="focus-input100" data-placeholder="Parola"></span>
					</div>
					
					<div class="wrap-input100 validate-input" data-validate="Parola Tekrarı Girin">
						<span class="btn-show-pass">
							<i class="zmdi zmdi-eye"></i>
						</span>
						<input class="input100" type="password" name="pass2" id="pass2">
						<span class="focus-input100" data-placeholder="Parola Tekrarı"></span>
					</div>

					<div class="container-login100-form-btn">
						<div class="wrap-login100-form-btn">
							<div class="login100-form-bgbtn"></div>
							<button class="login100-form-btn" id="registerBtn" onclick="addUser()">
								Kayıt Ol
							</button>
						</div>
					</div>

					<div class="text-center p-t-115">
					<a href="Login">Giriş Yap</a>
						
					</div>
				</div>
			</div>
		</div>
	</div>
	

	<div id="dropDownSelect1"></div>
	
<!--===============================================================================================-->
	<script src="asset/Login/vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="asset/Login/vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script src="asset/Login/vendor/bootstrap/js/popper.js"></script>
	<script src="asset/Login/vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="asset/Login/vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="asset/Login/vendor/daterangepicker/moment.min.js"></script>
	<script src="asset/Login/vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
	<script src="asset/Login/vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
	<script src="asset/Login/js/main.js"></script>

	<script src="asset/custom/register.js"></script>

</body>
</html>
