
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@taglib prefix="me" uri="/WEB-INF/tlds/tags.tld"%>
<me:template title="Chi tiết đơn hàng">
    <jsp:attribute name="content">
        <section id="title" class="emerald">
            <div class="container">
                <div class="row">
                    <div class="col-sm-6">
                        <h1>Chi tiết đơn hàng</h1>
                        <p>Pellentesque habitant morbi tristique senectus et netus et malesuada</p>
                    </div>
                    <div class="col-sm-6">
                        <ul class="breadcrumb pull-right">
                            <li><a href="index.html">Home</a></li>
                            <li><a href="#">Pages</a></li>
                            <li class="active">Chi tiết đơn hàng</li>
                        </ul>
                    </div>
                </div>
            </div>

        </section><!--/#title-->    
        <section class="container">
                    <h3>Danh sách hàng hóa của đơn hàng ${id}</h3>
                    <table class="table table-bordered">
                        <tr>
                            <th>Tên sản phẩm</th>
                            <th>Số lượng</th>
                        </tr>
                    <c:forEach items="${orderdls}" var="em">
                        <tr>
                            <td>${em.tenSanPham}</td>
                            <td>${em.soLuong}</td>
                        </tr>
                    </c:forEach>
                    </table>
               
        </section><!--/#terms-->
    </jsp:attribute>
</me:template>

