<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/views/fontawesome-free-5.15.4-web/css/all.css">

    <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/views/css/trangchu.css">
    <script src="${pageContext.request.contextPath}/views/js/trangchu.js"></script>
    <title>Document</title>
</head>
<body>
    <div class="fex">
        <!-- khoi header -->
        <!-- top bar -->
        <div class="top_bar">
            <span>Hỗ Trợ: 0969108437 - daotao@vnu.edu.vn</span>
            <span>Thời gian đăng ký học: 11/11 - 12/12</span>
            <span></span>
        </div>
        <!--header-->
        <div class="box_header">
            <div class="logo">
                <img src="${pageContext.request.contextPath}/views/img/Logo-VNU.png" alt="Logo-VNU">
            </div>
            <div>
                <h1 class="title">CỔNG THÔNG TIN ĐÀO TẠO ĐẠI HỌC QUỐC GIA HÀ NỘI</h1>
            </div>
            <div class="user">
                <button id="btn"><i class="fas fa-user-graduate"></i></button>
                <div class="info_user">
                    <div class="user_header">
                        <div class="user_logo"><i class="fas fa-user-secret fa-2x"></i></div>
                        <span>HOÀNG ĐỨC GIANG</span>
                    </div>
                    <div class="user_items printRegister">
                        <div class="user_logo_items"><i class="fas fa-file-word"></i></div>
                        <span>In đăng ký học</span>
                    </div>
                    <div class="user_items sign_out">
                        <div class="user_logo_items"><i class="fas fa-sign-out-alt"></i></div>
                        <span>Đăng xuất</span>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="offRegister">
        <h2>Đăng ký học đã tắt</h2>
    </div>
    <div class="footer_box">
        <div class="content_footer">
            <p>
                © 2017 Trường Đại học Công nghệ, Đại học Quốc Gia Hà Nội
                <br>Địa chỉ: E3, 144 Xuân Thủy, Cầu Giấy, Hà Nội
                <br>Điện thoại: 024.37547.461; Fax: 024.37547.460; Email: uet@vnu.edu.vn
            </p>
        </div>
    </div>
</body>
</html>