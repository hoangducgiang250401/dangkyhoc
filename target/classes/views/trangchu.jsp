<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url var="APIurl" value="/api-register" />
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/views/fontawesome-free-5.15.4-web/css/all.css">

<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/views/css/trangchu.css">
<script src="${pageContext.request.contextPath}/views/js/trangchu.js"></script>

<title>Đăng ký VNU</title>
</head>

<body>
	<div class="fex">
		<!-- khoi header -->
		<!-- top bar -->
		<div class="top_bar">
			<span>Hỗ Trợ: 0969108437 - daotao@vnu.edu.vn</span> <span>Thời
				gian đăng ký học: 11/11 - 12/12</span> <span></span>
		</div>
		<!--header-->
		<div class="box_header">
			<div class="logo">
				<img src="${pageContext.request.contextPath}/views/img/Logo-VNU.png"
					alt="Logo-VNU">
			</div>
			<div>
				<h1 class="title">CỔNG THÔNG TIN ĐÀO TẠO ĐẠI HỌC QUỐC GIA HÀ
					NỘI</h1>
			</div>
			<div class="user">
				<button>
					<i class="fas fa-user-graduate"></i>
				</button>
				<div class="info_user">
					<div class="user_header">
						<div class="user_logo">
							<i class="fas fa-user-secret fa-2x"></i>
						</div>
						<span>${sessionScope.name}</span>
					</div>
					<div class="user_items printRegister">
						<div class="user_logo_items">
							<i class="fas fa-file-word"></i>
						</div>
						<span>In đăng ký học</span>
					</div>
					<div class="user_items sign_out">
						<div class="user_logo_items">
							<i class="fas fa-sign-out-alt"></i>
						</div>
						<span>Đăng xuất</span>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- khối main -->
	<div class="main_box">
		<div class="container">
			<div class="row">
				<div class="panel panel-primary filterable">
					<div class="panel-heading">
						<h3 class="panel-title">Đăng ký học</h3>
						<div class="pull-right">
							<!-- btn btn-default btn-xs  -->
							<button class="btn-filter submition">
								<i class="fas fa-filter" style="color: #00803d;"></i>
							</button>
						</div>
					</div>
					<table class="table list_subject">
						<thead>
							<tr class="filters">
								<th class="column0"></th>
								<th class="column9"><input type="text" class="form-control"
									placeholder="Stt" disabled></th>
								<th class="column1"><input type="text" class="form-control"
									placeholder="Môn học" disabled></th>
								<th class="column2"><input type="text" class="form-control"
									placeholder="Tín chỉ" disabled></th>
								<th class="column3"><input type="text" class="form-control"
									placeholder="Mã lớp" disabled></th>
								<th class="column4"><input type="text" class="form-control"
									placeholder="Tổng sv" disabled></th>
								<th class="column5"><input type="text" class="form-control"
									placeholder="Đã đk" disabled></th>
								<th class="column6"><input type="text" class="form-control"
									placeholder="Giáo viên" disabled></th>
								<th class="column7"><input type="text" class="form-control"
									placeholder="Trạng thái" disabled></th>
								<th class="column8"><input type="text" class="form-control"
									placeholder="Lịch học" disabled></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${list_sj}" var="g" varStatus="theCount">
								<tr data-id_sj="${g.id_sj }">
									<td class="column0 choose"><input type="checkbox"></td>
									<td class="column9">${theCount.index + 1}</td>
									<td class="column1">${g.subjectname}</td>
									<td class="column2">${g.credis}</td>
									<td class="column3">${g.classname}</td>
									<td class="column4">${g.maxsd}</td>
									<td class="column5">${g.dk}</td>
									<td class="column6">${g.giaovien}</td>
									<td class="column7">${g.trang_thai}</td>
									<td class="column8">T${g.thu}-(${g.period})-${g.room}</td>
								</tr>
							</c:forEach>

						</tbody>
					</table>
				</div>
			</div>
		</div>
		<!-- khối đã đăng ký -->
		<div class="container">
			<form>
				<div class="row">
					<div class="panel panel-primary filterable">
						<div class="panel-heading ph_flex">
							<h3 class="panel-title column1">MÔN ĐĂNG KÝ</h3>
							<h3 class="panel-title column1">
								Tổng số tín[<span class="total-credis"></span>]
							</h3>
							<h3 class="panel-title column1">
								Tổng số môn[<span class="total-subject"></span>]
							</h3>
							<div class="">
								<button type="submit" class="submition" id="submition">
									<i class="far fa-paper-plane" style="color: #00803d;"></i>
								</button>
							</div>
						</div>
						<table class="table registered" id="tblCustomers">
							<thead>
								<tr class="filters">
									<th><input type="text" class="form-control"
										placeholder="Môn học" disabled></th>
									<th><input type="text" class="form-control"
										placeholder="Tín chỉ" disabled></th>
									<th><input type="text" class="form-control"
										placeholder="Mã lớp" disabled></th>
									<th><input type="text" class="form-control"
										placeholder="Giáo viên" disabled></th>
									<th><input type="text" class="form-control"
										placeholder="Trạng thái" disabled></th>
									<th><input type="text" class="form-control"
										placeholder="Lịch học" disabled></th>
									<th><input type="text" class="form-control"
										placeholder="Huỷ" disabled></th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${registed}" var="g" varStatus="theCount">
									<tr data-id_sj="${g.id_sj }">
										<td class="">${g.subjectName }</td>
										<td class="column4">${g.credis }</td>
										<td class="column3">${g.className }</td>
										<td class="">${g.lecturerName }</td>
										<td class="">${g.status }</td>
										<td class="">T${g.date}-(${g.period})-${g.room}</td>
										<td class="column2"><i class="fas fa-trash"
											style="color: #00803d;"></i></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</form>
		</div>
	</div>
	<div class="footer_box">
		<div class="content_footer">
			<p>
				© 2017 Trường Đại học Công nghệ, Đại học Quốc Gia Hà Nội <br>Địa
				chỉ: E3, 144 Xuân Thủy, Cầu Giấy, Hà Nội <br>Điện thoại:
				024.37547.461; Fax: 024.37547.460; Email: uet@vnu.edu.vn
			</p>
		</div>
	</div>
	<div class="backtop">
		<i class="fas fa-arrow-alt-circle-up fa-3x"></i>
	</div>
	<script>
		$(document).on("click", "#submition", function(e) {
			e.preventDefault();
			var data = [];
			$(".registered>tbody").find("tr").each(function(index, value) {
				var sub = {}
				var tdArr = $(this).find('td')
				sub["id_sj"] = $(this).data('id_sj')
				sub["subjectName"] = "";
				sub["credis"] = 0;
				sub["className"] = "";
				sub["lecturerName"] = "";
				sub["status"] = "";
				sub["date"] = 0;
				sub["period"] = "";
				sub["room"] = "";
				data.push(sub)
			})
			data = JSON.stringify(data)
			console.log("đang gọi submit");
			console.log(data);
			dang_ky(data);
		});
		function dang_ky(data) {
			$.ajax({
				type : "POST",
				url : "${APIurl}",
				contentType : "application/json",
				data : data,
				dataType : "json",
				success : function(response) {
					console.log(response);
				}
			});
		}
	</script>
	<!-- <button id="btnExport">HTML to PDF</button> -->
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jspdf/1.3.2/jspdf.min.js"></script>
	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.22/pdfmake.min.js"></script>
	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/html2canvas/0.4.1/html2canvas.min.js"></script>
</body>
</html>