<%-- 
    Document   : edit_TG
    Created on : Dec 13, 2014, 4:59:31 PM
    Author     : Phu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="me" uri="/WEB-INF/tlds/tags.tld"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<me:template title="Chỉnh sửa Tác giả">
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
                                <li class="active"><a href="bmTacGia.htm">Tác giả</a></li>
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
                        <h1>Biên mục Tác giả</h1>
                    </div>
                    <div class="col-sm-6">
                        <ul class="breadcrumb pull-right">
                            <li><a href="index.htm">Trang chủ</a></li>
                            <li><a href="#">Biên mục</a></li>
                            <li><a href="journal/bmNXB.htm">Tác giả</a></li>
                            <li class="active">Chỉnh sửa</li>
                        </ul>
                    </div>
                </div>
            </div>
        </section><!--/#title-->
	
        <section id="chinh_sua_tac_gia" class="container">
            <div class="row">
                <f:form action="update_TG.htm" modelAttribute="TG">
                    <input type="hidden" name="idTacGia" value="${t_g.idTacGia}"/>
                    <div class="col-sm-6">
			<h4>Họ tên:</h4>
                        <div class="row">
                            <div class="col-sm-11"><div class="form-group">
                                <input type="text" name="soPhanLoai" value="${t_g.hoTen}" class="form-control" required="required">
                            </div></div>
                        </div>
                        <h4>Bút danh:</h4>
                        <div class="row">
                            <div class="col-sm-11"><div class="form-group">
                                <input type="text" name="soPhanLoai" value="${t_g.butDanh}" class="form-control" required="required">
                            </div></div>
                        </div>
                        <h4>Thông tin bổ sung:</h4>
                        <div class="row">
                            <div class="col-sm-11"><div class="form-group">
                                <input type="text" name="soPhanLoai" value="${t_g.thongTinBoSung}" class="form-control" required="required">
                            </div></div>
                        </div>
                        <h4>Tình trạng:</h4>
                        <div class="row">
                            <div class="col-sm-11"><div class="form-group">
                                <input type="text" name="soPhanLoai" value="${t_g.tinhTrang}" class="form-control" required="required">
                            </div></div>
                        </div>
                        <div class="form-group">
                            <input type="submit" class="btn btn-success"  value="Sửa tác giả" />
                        </div>
                    </div>
                </f:form>
            </div>
        </section>
        
    </jsp:attribute>
</me:template>

