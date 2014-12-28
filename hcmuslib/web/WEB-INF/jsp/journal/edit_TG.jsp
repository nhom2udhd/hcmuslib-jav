

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="me" uri="/WEB-INF/tlds/tags_journal.tld"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<me:tpl_journal title="Chỉnh sửa Tác giả">
    <jsp:attribute name="content">
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
                                <input type="text" name="hoTen" value="${t_g.hoTen}" class="form-control" required="required">
                            </div></div>
                        </div>
                        <h4>Bút danh:</h4>
                        <div class="row">
                            <div class="col-sm-11"><div class="form-group">
                                <input type="text" name="butDanh" value="${t_g.butDanh}" class="form-control" required="required">
                            </div></div>
                        </div>
                        <h4>Thông tin bổ sung:</h4>
                        <div class="row">
                            <div class="col-sm-11"><div class="form-group">
                                <input type="text" name="thongTinBoSung" value="${t_g.thongTinBoSung}" class="form-control" required="required">
                            </div></div>
                        </div>
                        <h4>Tình trạng:</h4>
                        <div class="row">
                            <div class="col-sm-11"><div class="form-group">
                                <input type="text" name="tinhTrang" value="${t_g.tinhTrang}" class="form-control" required="required">
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
</me:tpl_journal>

