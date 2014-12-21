<%-- 
    Document   : order
    Created on : Dec 16, 2014, 9:38:38 PM
    Author     : RONNY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="me" uri="/WEB-INF/tlds/tags.tld"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<me:template title="Lập đơn hàng">
    <jsp:attribute name="content">
        <section id="title" class="emerald">
            <div class="container">
                <div class="row">
                    <div class="col-sm-6">
                        <h1>Blank page</h1>
                        <p>Pellentesque habitant morbi tristique senectus et netus et malesuada</p>
                    </div>
                    <div class="col-sm-6">
                        <ul class="breadcrumb pull-right">
                            <li><a href="index.html">Home</a></li>
                            <li><a href="#">Pages</a></li>
                            <li class="active">Blank page</li>
                        </ul>
                    </div>
                </div>
            </div>
        </section><!--/#title-->    
        <section class="container">
                    <h3>Lập đơn hàng</h3>

                    <form class="form-horizontal" role="form" action="create.htm" method="POST">
                        <div class="form-group">
                              <label for="order-des" class="col-sm-2 control-label">Địa chỉ gởi</label>
                              <div class="col-sm-6">
                                <input type="text" class="form-control" id="order-des" name="order-des" placeholder="Địa chỉ gởi">
                              </div>
                        </div>
                        <div class="form-group">
                            <label for="payment-type" class="col-sm-2 control-label">Hình thức thanh toán</label>
                            <div class="col-sm-3">
                                <select name="payment-type" id="payment-type" class="form-control">
                                    <option value="Chuyen Khoan">Chuyển khoản</option>
                                    <option value="Truc Tiep">Trực tiếp</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="currency-type" class="col-sm-2 control-label">Đơn vị tiền tệ</label>
                            <div class="col-sm-2">
                                <select name="currency-type" id="currency-type" class="form-control">
                                    <option value="VND">VNĐ</option>
                                    <option value="USD">USD</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                              <div class="col-sm-offset-1" id="order-list" >
                                      <h4>Danh sách hàng hóa</h4>
                              </div>
                        </div>
                        <div id="item-container" data-number-item="0">
<!--                        <div class="form-group" style="display:none" class="item">
                              <div class="col-sm-8">
                                      <label for="itemname" class="col-sm-2 control-label">Tên</label>
                                      <div class="col-sm-10">
                                        <input type="text" class="form-control" class="item-name" placeholder="Tên">
                                      </div>
                              </div>
                              <div class="col-sm-4">
                                      <label for="itemname" class="col-sm-4 control-label">Số lượng</label>
                                      <div class="col-sm-8">
                                        <input type="text" class="form-control" class="item-number" placeholder="Số lượng">
                                      </div>
                              </div>
                        </div>-->
                        </div>
                        <div class="form-group">
                              <div class="col-sm-1 col-sm-offset-1">
                                      <button type="button" class="btn btn-default" aria-label="Left Align" id="additem">
                                        <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
                                      </button>
                              </div>
                        </div>
                        
                        <input type="hidden" name="number-items" id="number-items">
                        <button type="submit" class="btn btn-default">Tạo</button>
                    </form>

        </section><!--/#terms-->
    </jsp:attribute>
</me:template>

