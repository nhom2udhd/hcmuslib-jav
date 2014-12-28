<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="me" uri="/WEB-INF/tlds/tags_journal.tld"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<me:tpl_journal title="Chỉnh sửa Số phân loại">
    <jsp:attribute name="content">
        <section id="title" class="emerald">
            <div class="container">
                <div class="row">
                    <div class="col-sm-6">
                        <h1>Biên mục Số phân loại</h1>
                    </div>
                    <div class="col-sm-6">
                        <ul class="breadcrumb pull-right">
                            <li><a href="index.htm">Trang chủ</a></li>
                            <li><a href="#">Biên mục</a></li>
                            <li><a href="journal/bmNXB.htm">Số phân loại</a></li>
                            <li class="active">Chỉnh sửa</li>
                        </ul>
                    </div>
                </div>
            </div>
        </section><!--/#title-->
	
        <section id="chinh_sua_so_phan_loai" class="container">
            <div class="row">
                <f:form action="update_SPL.htm" modelAttribute="SPL">
                    <input type="hidden" name="idSpl" value="${s_p_l.idSpl}"/>
                    <div class="col-sm-6">
			<h4>Số phân loại:</h4>
                        <div class="row">
                            <div class="col-sm-11"><div class="form-group">
                                <input type="text" name="soPhanLoai" value="${s_p_l.soPhanLoai}" class="form-control" required="required">
                            </div></div>
                        </div>
                        <div class="form-group">
                            <input type="submit" class="btn btn-success"  value="Sửa số phân loại" />
                        </div>
                    </div>
                </f:form>
            </div>
        </section>
        
    </jsp:attribute>
</me:tpl_journal>>
