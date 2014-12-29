
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="me" uri="/WEB-INF/tlds/tags_journal.tld"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<me:tpl_journal title="Biên mục Số phân loại">
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
                            <li class="active">Số phân loại</li>
                        </ul>
                    </div>
                </div>
            </div>
        </section><!--/#title-->
	
        <section id="bien_muc_so_phan_loai" class="container">
            <div class="row">
		<div class="table-responsive">
			<table class="table table-bordered">
				<tr>
                                    <th><center>ID</center></th>
                                    <th><center>Số phân loại</center></th>
                                    <th>
                                        <center>
                                            <a href="redirectCreate_SPL.htm">
                                                <button type="button" class="btn btn-default">
                                                    <span class="glyphicon glyphicon-plus"></span> Thêm
                                                </button>
                                            </a>
                                        </center>
                                    </th>
				</tr>
                                <c:forEach items="${lst}" var="bm">
                                    <tr>
                                        <td>${bm.idSpl}</td>
                                        <td>${bm.soPhanLoai}</td>
                                        <td>
                                            <center>
                                                <a href="edit_SPL.htm?id=${bm.idSpl}">
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
</me:tpl_journal>
        
