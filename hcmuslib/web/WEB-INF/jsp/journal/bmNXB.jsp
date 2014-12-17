<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="me" uri="/WEB-INF/tlds/tags.tld"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<me:template title="Biên mục Nhà xuất bản">
    <jsp:attribute name="content">
        <header class="navbar navbar-inverse navbar-fixed-top wet-asphalt" role="banner">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="index.htm"><img src="${pageContext.request.contextPath}/images/logo.png" alt="logo"></a>
                </div>
                <div class="collapse navbar-collapse">
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="index.htm">Trang chủ</a></li>
                        <li><a href="/home/about.htm">Giới thiệu</a></li>
                        <li><a href="services.html">Thư viện</a></li>
                        <li class="dropdown active">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Biên mục <i class="icon-angle-down"></i></a>
                            <ul class="dropdown-menu">
                                <li><a href="bmAnPham.htm">Ấn phẩm</a></li>
                                <li><a href="bmKyTapChi.htm">Kỳ tạp chí</a></li>
                                <li><a href="bmChuongTapChi.htm">Chương tạp chí</a></li>
                                <li><a href="bmTacGia.htm">Tác giả</a></li>
                                <li class="active"><a href="bmNXB.htm">Nhà xuất bản</a></li>
                                <li><a href="bmSPL.htm">Số phân loại</a></li>
                                <li class="divider"></li>
                                <li><a href="privacy.html">Privacy Policy</a></li>
                                <li><a href="terms.html">Terms of Use</a></li>
                            </ul>
                        </li>
                        <li><a href="/home/contact.htm">Liên hệ - Góp ý</a></li>
                    </ul>
                </div>
            </div>
        </header>
        
        <section id="title" class="emerald">
            <div class="container">
                <div class="row">
                    <div class="col-sm-6">
                        <h1>Biên mục Nhà xuất bản</h1>
                    </div>
                    <div class="col-sm-6">
                        <ul class="breadcrumb pull-right">
                            <li><a href="index.htm">Trang chủ</a></li>
                            <li><a href="#">Biên mục</a></li>
                            <li class="active">Nhà xuất bản</li>
                        </ul>
                    </div>
                </div>
            </div>
        </section><!--/#title-->
	
        <section id="bien_muc_nha_xuat_ban" class="container">
            <div class="row">
		<div class="table-responsive">
			<table class="table table-bordered">
				<tr>
                                    <th><center>ID</center></th>
                                    <th><center>Tên nhà xuất bản</center></th>
                                    <th><center>Ngày thành lập</center></th>
                                    <th><center>Thông tin bổ sung</center></th>
                                    <th><center>Tình trạng</center></th>
                                    <th>
                                        <center>
                                            <a href="redirectCreate_NXB.htm">
                                                <button type="button" class="btn btn-default">
                                                    <span class="glyphicon glyphicon-plus"></span> Thêm
                                                </button>
                                            </a>
                                        </center>
                                    </th>
				</tr>
                                <c:forEach items="${lst}" var="bm">
                                    <tr>
                                        <td>${bm.idNxb}</td>
                                        <td>${bm.tenNxb}</td>
                                        <td>${bm.ngayThanhLap}</td>
                                        <td>${bm.thongTinBoSung}</td>
                                        <c:choose>
                                            <c:when test="${bm.tinhTrang == '1'}">
                                                <td>Hoạt động</td>
                                            </c:when>
                                            <c:otherwise>
                                                <td>Ngưng hoạt động</td>
                                            </c:otherwise>
                                        </c:choose>
                                        <td>
                                            <center>
                                                <a href="edit_NXB.htm?id=${bm.idNxb}">
                                                    <button type="button" class="btn btn-default">
                                                        <span class="glyphicon glyphicon-pencil"></span> Chỉnh sửa
                                                    </button>
                                                </a>
                                            </center>
                                        </td>
                                        <td>
                                            <center>
                                                <a href="remove_NXB.htm?id=${bm.idNxb}" onclick="return confirm('Are you sure to remove?')">
                                                    <button type="button" class="btn btn-default">
                                                        <span class="glyphicon glyphicon-minus"></span> Xóa
                                                    </button>
                                                </a>
                                            </center>
                                        </td>
                                    </tr>
                                </c:forEach>
			</table>
		</div>
            </div>
        </section>
        
    </jsp:attribute>
</me:template>

