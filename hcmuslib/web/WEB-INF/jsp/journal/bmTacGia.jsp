<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="me" uri="/WEB-INF/tlds/tags_journal.tld"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<me:tpl_journal title="Biên mục Tác giả">
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
                            <li class="active">Tác giả</li>
                        </ul>
                    </div>
                </div>
            </div>
        </section><!--/#title-->
	
        <section id="bien_muc_tac_gia" class="container">
            <div class="row">
		<div class="table-responsive">
			<table class="table table-bordered">
				<tr>
                                    <th><center>ID</center></th>
                                    <th><center>Họ tên</center></th>
                                    <th><center>Bút danh</center></th>
                                    <th><center>Thông tin bổ sung</center></th>
                                    <th><center>Tình trạng</center></th>
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
                                        <td>${bm.idTacGia}</td>
                                        <td>${bm.hoTen}</td>
                                        <td>${bm.butDanh}</td>
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
                                                <a href="edit_TG.htm?id=${bm.idTacGia}">
                                                    <button type="button" class="btn btn-default">
                                                        <span class="glyphicon glyphicon-pencil"></span> Chỉnh sửa
                                                    </button>
                                                </a>
                                            </center>
                                        </td>
                                        <td>
                                            <center>
                                                <a href="remove_TG.htm?id=${bm.idTacGia}" onclick="return confirm('Are you sure to remove?')">
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
</me:tpl_journal>
