<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Đăng nhập hệ thống đăng ký học</title>

    <link href="http://fonts.googleapis.com/css?family=Lato:100italic,100,300italic,300,400italic,400,700italic,700,900italic,900" rel="stylesheet" type="text/css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/views/assets/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/views/assets/css/styles.css" />
</head>

<body>
    <section class="container">
        <section class="login-form">
            <form method="POST" action="/dangkyhoc/login" role="login">
                <section>
                    <h2>Sign in</h2>
                    <div class="form-group">
                        <div class="input-group">
                              <div class="input-group-addon"><span class="text-primary glyphicon glyphicon-envelope"></span></div>
                            <input type="email" id = "email" name="email" placeholder="Email" required class="form-control" />
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="input-group">
                              <div class="input-group-addon"><span class="text-primary glyphicon glyphicon-lock"></span></div>
                            <input type="password" id="password" name="password" placeholder="Password" required class="form-control" />
                        </div>
                    </div>
                    
                    <div class="form-group">
                        <input type="checkbox" name="remember" value="1" /> Remember me
                    </div>
                    
                    <button type="submit" name="go" class="btn btn-block btn-success">Sign in</button>
                </section>
                <div>
                    <a href="#">Forgot password ?</a>
                </div>
            </form>
        </section>
</section>

<script src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/views/assets/bootstrap/js/bootstrap.min.js"></script>
</body>

</html>