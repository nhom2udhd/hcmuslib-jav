<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="me" uri="/WEB-INF/tlds/tags.tld" %>
<me:template title="Biên Mục Tác Giả">
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
                        <li><a href="about.htm">Giới thiệu</a></li>
                        <li><a href="services.html">Thư viện</a></li>
                        <li class="active"><a href="contact.htm">Liên hệ - Góp ý</a></li>
                    </ul>
                </div>
            </div>
        </header>
        <section id="title" class="emerald">
            <div class="container">
                <div class="row">
                    <div class="col-sm-6">
                        <h1>Biên Mục Tác Giả</h1>
                        
                    </div>
                    <div class="col-sm-6">
                        <ul class="breadcrumb pull-right">
                            <li><a href="index.htm">Trang chủ</a></li>
                            <li class="active"><a href="">Biên Mục Tác Giả</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </section><!--/#title-->

        <section id="contact-page" class="container">
            <div class="row">
                <div class="col-sm-8">
                    <h4>Nhập Thông Tin Tác Giả: </h4>
                    <div class="status alert alert-success">
                        ${Result}
                    </div>                   
                    <div class="row">
                        <div class="col-sm-5">
                            <form action="validtacgia.htm"
                                    method="POST"
                                modelAttribute="Bmtacgia">
                                <div class="form-group">
                                    Họ Tên<span style="color:red">*</span> :<input type="text" class="form-control" name="hoTen" value="${hoTen}">
                                    <span style="color:red">${hoTencheck}</span>
                                </div>
                                <div class="form-group">
                                    Bút Danh: <input type="text" class="form-control" name="butDanh" value="${butDanh}">
                                </div>
                                <div class="form-group">
                                    Thông Tin Bổ Sung: <input type="text" class="form-control" name="thongTinBoSung" value="${thongTinBoSung}">
                                </div>
                                 <div class="form-group">
                                     Tình Trạng<span style="color:red">*</span> : 
                                     <select class="form-control" name="tinhTrang" style="width:200px;height:40px" id="mySelect" name="MSType">
                                         <option value="Hoat Dong" ${option1}>Hoạt Động</option>
                                         <option value="Ngung Hoat Dong" ${option2}>Ngưng Hoạt Động</option>
                                     </select>
                                    <span style="color:red">${tinhTrang}</span>
                                </div>
                                <div class="form-group">
                                    <button type="submit" tabindex="5" class="btn btn-primary btn-lg">Lưu Biên Mục</button>
                                </div>         
                            </form>

                        </div>
                    </div>
                </div><!--/.col-sm-8-->
            </div>
        </section><!--/#contact-page-->


    </jsp:attribute>
</me:template>
