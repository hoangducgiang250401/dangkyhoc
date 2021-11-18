<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Xem và in kết quả đăng ký học</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/views/css/inketqua.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/views/fontawesome-free-5.15.4-web/css/all.css">
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/views/js/trangchu.js">
</head>

<body>
	<div id="print">

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
					<img
						src="${pageContext.request.contextPath}/views/img/Logo-VNU.png"
						alt="Logo-VNU">
				</div>
				<div>
					<h1 class="title">CỔNG THÔNG TIN ĐÀO TẠO ĐẠI HỌC QUỐC GIA HÀ
						NỘI</h1>
				</div>
				<div class="user">
					<button id="btn">
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
		<div class="print_area">
			<table style="width: 100%; border: none; border-collapse: collapse;">
				<tr>
					<td style="width: 40%; text-align: center; vertical-align: top;">
						<p
							style="text-transform: uppercase; font-weight: normal; margin: 0; padding: 0; font-size: 12pt;">ĐẠI
							HỌC QUỐC GIA HÀ NỘI</p>
						<p
							style="text-transform: uppercase; margin: 0; padding: 0; font-size: 12pt; font-weight: bold;">TRƯỜNG
							ĐẠI HỌC C&#212;NG NGHỆ</p>
					</td>
					<td style="width: 60%; text-align: center; vertical-align: top;">
						<p
							style="text-transform: uppercase; font-weight: bold; margin: 0; padding: 0; font-size: 12pt;">CỘNG
							HÒA XÃ HỘI CHỦ NGHĨA VIỆT NAM</p>
						<p style="margin: 0; padding: 0; font-weight: bold;">Độc lập -
							Tự do - Hạnh phúc</p>
					</td>
				</tr>
			</table>
			<h1
				style="text-align: center; text-transform: uppercase; font-weight: bold; font-size: 14pt; margin: 30px 0 0 0; padding: 0;">KẾT
				QUẢ ĐĂNG KÝ MÔN HỌC - HỌC KỲ 1 NĂM HỌC 2021-2022</h1>
			<p
				style="text-align: center; font-weight: bold; margin: 0; padding: 0; font-size: 14pt;">
				Ngày ${date } tháng ${month } năm ${year }</p>
			<table
				style="width: 60%; border: none; border-collapse: collapse; margin-top: 30px;">
				<tr>
					<td>Họ và tên</td>
					<td><b>${sessionScope.name}</b></td>
					<td>Mã sinh viên</td>
					<td><b>${sessionScope.id}</b></td>
				</tr>
				<tr>
					<td>Khóa</td>
					<td><b>QH-2019-I/CQ</b></td>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
				</tr>
			</table>
			<br />
			<table style="border: none; width: 100%; border-collapse: collapse;">

				<thead>
					<tr>
						<th
							style="border-top: 1px solid #000; border-left: 1px solid #000; text-align: center;">STT</th>
						<th
							style="border-top: 1px solid #000; border-left: 1px solid #000; text-align: center;">Mã
							môn học</th>
						<th
							style="border-top: 1px solid #000; border-left: 1px solid #000; text-align: center;">Môn
							học</th>
						<th
							style="border-top: 1px solid #000; border-left: 1px solid #000; text-align: center;">Số
							tín chỉ</th>
						<th
							style="border-top: 1px solid #000; border-left: 1px solid #000; text-align: center;">Trạng
							thái</th>
						<th
							style="border-top: 1px solid #000; border-left: 1px solid #000; text-align: center;">Học
							phí</th>
						<th
							style="border-top: 1px solid #000; border-left: 1px solid #000; text-align: center;">Thứ</th>
						<th
							style="border-top: 1px solid #000; border-left: 1px solid #000; text-align: center;">Tiết</th>
						<th
							style="border-top: 1px solid #000; border-left: 1px solid #000; border-right: 1px solid #000; text-align: center;">
							Giảng đường</th>
					</tr>
				</thead>
				<c:forEach items="${listSubjectRegisted}" var="g"
					varStatus="theCount">
					<tr>
						<td
							style="border-top: 1px solid #000; border-left: 1px solid #000; text-align: center;">${theCount.index + 1 }</td>
						<td
							style="border-top: 1px solid #000; border-left: 1px solid #000;">&nbsp;${g.className }</td>
						<td
							style="border-top: 1px solid #000; border-left: 1px solid #000;">&nbsp;${g.subjectName }</td>
						<td
							style="border-top: 1px solid #000; border-left: 1px solid #000; text-align: center;">${g.credis }</td>
						<td
							style="border-top: 1px solid #000; border-left: 1px solid #000;">
							<c:if test="${empty g.status}">
    							Đăng ký học lần đầu
							</c:if>
							<c:if test="${not empty g.status}">
    							${g.status }
							</c:if>
						</td>
						<td
							style="border-top: 1px solid #000; border-left: 1px solid #000; text-align: right;">${g.credis*315000 }</td>
						<td
							style="border-top: 1px solid #000; border-left: 1px solid #000; text-align: center;">T${g.date }</td>
						<td
							style="border-top: 1px solid #000; border-left: 1px solid #000; text-align: center;">${g.period }
							</td>
						<td
							style="border-top: 1px solid #000; border-left: 1px solid #000; border-right: 1px solid #000; text-align: center;">${g.room }
							</td>
					</tr>
				</c:forEach>

				<tr>
					<td
						style="border-top: 1px solid #000; border-left: 1px solid #000; border-bottom: 1px solid #000; text-align: center;">
						&nbsp;</td>
					<td
						style="border-top: 1px solid #000; border-left: 1px solid #000; border-bottom: 1px solid #000;">&nbsp;
					</td>
					<td
						style="border-top: 1px solid #000; border-left: 1px solid #000; border-bottom: 1px solid #000; text-align: center;">
						&nbsp;Tổng</td>
					<td
						style="border-top: 1px solid #000; border-left: 1px solid #000; border-bottom: 1px solid #000; text-align: center;">
						${sumCredis }</td>
					<td
						style="border-top: 1px solid #000; border-left: 1px solid #000; border-bottom: 1px solid #000;">&nbsp;
					</td>
					<td
						style="border-top: 1px solid #000; border-left: 1px solid #000; border-bottom: 1px solid #000; text-align: right;">${sumCredis*315000 }</td>
					<td
						style="border-top: 1px solid #000; border-left: 1px solid #000; border-bottom: 1px solid #000;">&nbsp;
					</td>
					<td
						style="border-top: 1px solid #000; border-left: 1px solid #000; border-bottom: 1px solid #000; text-align: center;">
						&nbsp;</td>
					<td
						style="border-top: 1px solid #000; border-left: 1px solid #000; border-bottom: 1px solid #000; border-right: 1px solid #000; text-align: center;">
						&nbsp;</td>
				</tr>
			</table>
			<table
				style="width: 100%; border: none; border-collapse: collapse; margin-top: 30px;">
				<tr>
					<td style="width: 50%; vertical-align: top; text-align: center;">
						<p
							style="font-weight: bold; margin: 0; padding: 0; font-size: 12pt; text-transform: uppercase;">SINH
							VIÊN</p>
						<p
							style="margin: 0; padding: 0; font-size: 11pt; font-style: italic;">(Ký
							và ghi rõ họ tên)</p>
						<p style="margin-top: 80px;">
							<b>${sessionScope.name}</b>
						</p>
					</td>
					<td style="width: 50%; text-align: center; vertical-align: top;">
						<p style="font-size: 12pt; margin: 0; padding: 0;">Hà Nội,
							ngày ${date} tháng ${month } năm ${year }</p>
						<p
							style="font-weight: bold; margin: 0; padding: 0; text-transform: uppercase; font-size: 12pt;">XÁC
							NHẬN CỦA PHÒNG ĐÀO TẠO</p>
						<p style="font-weight: bold; margin-top: 80px;">&nbsp;</p>
					</td>
				</tr>
			</table>

		</div>

	</div>
	<div class="btn_print">
		<button id="btnExport">
			<i class="fas fa-print"></i> In kết quả
		</button>
	</div>
	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.22/pdfmake.min.js"></script>
	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/html2canvas/0.4.1/html2canvas.min.js"></script>
	<script src="${pageContext.request.contextPath}/views/js/inketqua.js"></script>
</body>

</html>