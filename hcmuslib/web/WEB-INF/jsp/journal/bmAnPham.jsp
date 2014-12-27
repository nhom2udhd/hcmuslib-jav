<%-- 
    Document   : bmAnPham
    Created on : Dec 27, 2014, 8:59:10 PM
    Author     : Phu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="me" uri="/WEB-INF/tlds/tags.tld"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<me:template title="Biên mục Ấn phẩm">
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
                                <li class="active"><a href="bmAnPham.htm">Ấn phẩm</a></li>
                                <li><a href="bmKyTapChi.htm">Kỳ tạp chí</a></li>
                                <li><a href="bmChuongTapChi.htm">Chương tạp chí</a></li>
                                <li><a href="bmTacGia.htm">Tác giả</a></li>
                                <li><a href="bmNXB.htm">Nhà xuất bản</a></li>
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
                        <h1>Biên mục Ấn phẩm</h1>
                    </div>
                    <div class="col-sm-6">
                        <ul class="breadcrumb pull-right">
                            <li><a href="index.htm">Trang chủ</a></li>
                            <li><a href="#">Biên mục</a></li>
                            <li class="active">Ấn phẩm</li>
                        </ul>
                    </div>
                </div>
            </div>
        </section><!--/#title-->
	
        <section id="bien_muc_an_pham" class="container">
            <div class="row">
		<div class="table-responsive">
			<table class="table table-bordered">
				<tr>
                                    <th><center>ID</center></th>
                                    <th><center>Tên ấn phẩm</center></th>
                                    <th><center>cqChuquan</center></th>
                                    <th><center>Địa chỉ tòa soạn</center></th>
                                    <th><center>ĐKXB</center></th>
                                    <th><center>Tác giả</center></th>
                                    <th><center>Nhà xuất bản</center></th>
                                    <th><center>Số phân loại</center></th>
                                    <th><center>Chương</center></th>
                                    <th><center>Kỳ</center></th>
                                    <th>
                                        <center>
                                            <a href="redirectCreate_TG.htm">
                                                <button type="button" class="btn btn-default">
                                                    <span class="glyphicon glyphicon-plus"></span> Thêm
                                                </button>
                                            </a>
                                        </center>
                                    </th>
				</tr>
                                <c:forEach items="${lst}" var="bm">
                                    <tr>
                                        <td>${bm.idAnpham}</td>
                                        <td>${bm.tenAnpham}</td>
                                        <td>${bm.cqChuquan}</td>
                                        <td>${bm.dcToasoan}</td>
                                        <td>${bm.dkxb}</td>
                                        <td>${bm.bmtacgia}</td>
                                        <td>${bm.bmnxb}</td>
                                        <td>${bm.bmsophanloai}</td>
                                        <td>Các chương</td>
                                        <td>Các kỳ</td>
                                        <td>
                                            <center>
                                                <a href="edit_TG.htm?id=${bm.idAnpham}">
                                                    <button type="button" class="btn btn-default">
                                                        <span class="glyphicon glyphicon-pencil"></span> Chỉnh sửa
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
