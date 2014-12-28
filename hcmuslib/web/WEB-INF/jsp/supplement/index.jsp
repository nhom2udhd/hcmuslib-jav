
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@taglib prefix="me" uri="/WEB-INF/tlds/tags.tld"%>
<me:template title="Đơn hàng">
    <jsp:attribute name="content">
        <section id="title" class="emerald">
            <div class="container">
                <div class="row">
                    <div class="col-sm-6">
                        <h1>Đơn hàng</h1>
                        <p>Pellentesque habitant morbi tristique senectus et netus et malesuada</p>
                    </div>
                    <div class="col-sm-6">
                        <ul class="breadcrumb pull-right">
                            <li><a href="index.html">Home</a></li>
                            <li><a href="#">Pages</a></li>
                            <li class="active">Đơn hàng</li>
                        </ul>
                    </div>
                </div>
            </div>

        </section><!--/#title-->    
        <section class="container">
                    <h3>Danh sách đơn hàng</h3>
                    <table class="table table-bordered">
                        <tr>
                            <th>ID</th>
                            <th>Ngày lập</th>
                            <th>Tình trạng</th>
                            <th>Địa chỉ gởi</th>
                            <th>Hình thức thanh toán</th>
                            <th>Đơn vị tiền tệ</th>
                            <th>Ngày giao hàng</th>
                            <th>Ngày thanh toán</th>
                            <th>Chi tiết</th>
                        </tr>
                    <c:forEach items="${orders}" var="em">
                        <tr>
                            <td>${em.idDonHang}</td>
                            <td>${em.ngayLap}</td>
                            <td>${em.tinhTrang}</td>
                            <td>${em.diaChiGoi}</td>
                            <td>${em.hinhThucThanhToan}</td>
                            <td>${em.donViTienTe}</td>
                            <td>${em.ngayGiaoHang}</td>
                            <td>${em.ngayThanhToan}</td>
                            <td><a href="detail.htm?id=${em.idDonHang}">Chi tiết</a></td>
                        </tr>
                    </c:forEach>
                    </table>
                    <a href="create.htm">
                        <button type="button" class="btn btn-default btn-lg">
                            <span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Thêm
                        </button>
                    </a>
        </section><!--/#terms-->
    </jsp:attribute>
</me:template>

