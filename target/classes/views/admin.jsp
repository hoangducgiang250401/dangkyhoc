<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/views/fontawesome-free-5.15.4-web/css/all.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/views/css/admin.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/views/css/trangchu.css">
	<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
	<script src="${pageContext.request.contextPath}/views/js/trangchu.js"></script>
</head>
<body>
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
            <button><i class="fas fa-user-graduate"></i></button>
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
    <div class="box_body">
        <div class="box_submition">
            <div class="form_input">
                <form action="/dangkyhoc/api-insert_student" method="POST">
                    <h3>ADD STUDENT</h3>
                    <label for="fname">ID:</label>
                    <input type="text" name="id_sd"><br>
                    <label for="lname">Full name:</label>
                    <input type="text" name="fullname"><br>
                    <label for="fname">Class:</label>
                    <input type="text" name="course"><br>
                    <label for="fname">Birthday:</label>
                    <input type="text" name="dateofbirth" placeholder="year-month-date"><br>
                    <label for="fname">Difficult:</label>
                    <input type="text" name="disadvantaged" placeholder="1 or 0"><br>
                    <label for="fname">Village:</label>
                    <input type="text" name="birthplace"><br>
                    <label for="fname">IsAdmin:</label>
                    <input type="text" name="isadmin" placeholder="1 or 0"><br>
                    <input type="submit" value="ADD">
                </form>
            </div>
            <div class="form_input">
                <form>
                    <h3>ADD LECTURERS</h3>
                    <label for="fname">ID:</label>
                    <input type="text"><br>
                    <label for="lname">Full name</label>
                    <input type="text"><br>
                    <label for="fname">Birthday:</label>
                    <input type="text" placeholder="year-month-date"><br>
                    <label for="fname">Lever:</label>
                    <input type="text"><br>
                    <label for="fname">Working:</label>
                    <input type="text" placeholder="1 or 0"><br>
                    <label for="fname">Village:</label>
                    <input type="text"><br>
                    <input type="submit" value="ADD">
                </form>
            </div>

        </div>
        <div class="box_submition">
            <div class="form_input">
                <form action="/dangkyhoc/api-insert_subject" method="POST">
                    <h3>ADD SUBJECT</h3>
                    <label for="fname">IdSubject</label>
                    <input type="text" name="id_sj"><br>
                    <label for="lname">Subject name</label>
                    <input type="text" name="subjectname"><br>
                    <label for="fname">Credis</label>
                    <input type="text" name="credis"><br>
                    <label for="fname">Class name</label>
                    <input type="text" name="classname"><br>
                    <label for="fname">Maximum</label>
                    <input type="text" name="maxsd"><br>
                    <label for="fname">Day</label>
                    <input type="text" name="thu"><br>
                    <label for="fname">Period</label>
                    <input type="text" name="period"><br>
                    <label for="fname">Room</label>
                    <input type="text" name="room"><br>
                    <label for="fname">IdLecturers</label>
                    <input type="text" name="id_lt"><br>
                    <input type="submit" value="ADD">
                </form>
            </div>
            <div class="form_input">
                <form action="export-data" method="POST">
                    <h3>GET REGISTRATION</h3>
                    <input type="submit" value="update registed" />
                </form>
                <a href="${pageContext.request.contextPath}/file/file.xlsx" download>download file registed</a>
            </div>
            <div class="form_input">
                <form action="OffRegister" method="POST">
                    <h3>ON/OFF REGISTER</h3>
                    <label for="fname">ON/OFF:</label>
                    <input type="submit" value="${on }" id="OnOff"/>
                </form>
            </div>

        </div>
    </div>
    <script>
        $(document).ready(function () {
            $(document).on("click", "#OnOff", function (e) {
                e.preventDefault();
                if($(this).val() == "ON"){
                    $(this).val("OFF");
                }
                else{
                    $(this).val("ON");
                }
            });
        });
    </script>
</body>
</html>