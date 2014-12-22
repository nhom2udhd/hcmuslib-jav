
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="me" uri="/WEB-INF/tlds/tags_journal.tld"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<me:tpl_journal title="Thêm Nhà xuất bản">
    <jsp:attribute name="content">
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
                            <li><a href="journal/bmNXB.htm">Nhà xuất bản</a></li>
                            <li class="active">Thêm mới</li>
                        </ul>
                    </div>
                </div>
            </div>
        </section><!--/#title-->
	
        <section id="them_nha_xuat_ban" class="container">
            <div class="row">
                <f:form action="create_NXB.htm" modelAttribute="NXB">
                    <div class="col-sm-6">
			<h4>Tên nhà xuất bản:</h4>
                        <div class="row">
                            <div class="col-sm-11"><div class="form-group">
                                <input type="text" path="tenNxb" class="form-control" required="required">
                            </div></div>
                        </div>
                        <h4>Ngày thành lập:</h4>
                        <div class="row">
                            <div class="col-sm-11"><div class="form-group">
                                <input type="text" path="ngayThanhLap" class="form-control" required="required">
                            </div></div>
                        </div>
                        <h4>Thông tin bổ sung:</h4>
                        <div class="row">
                            <div class="col-sm-11"><div class="form-group">
                                <input type="text" path="thongTinBoSung" class="form-control" required="required">
                            </div></div>
                        </div>
                        <h4>Tình trạng:</h4>
                        <div class="row">
                            <div class="col-sm-11"><div class="form-group">
                                <input type="text" path="tinhTrang" class="form-control" required="required">
                            </div></div>
                        </div>
                        <div class="form-group">
                            <input type="submit" class="btn btn-success"  value="Thêm nhà xuất bản" />
                        </div>
                    </div>
                </f:form>
            </div>
        </section>
        
    </jsp:attribute>
</me:tpl_journal>

