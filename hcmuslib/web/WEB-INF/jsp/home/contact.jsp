<%-- 
    Document   : contact
    Created on : Nov 27, 2014, 10:21:30 AM
    Author     : 11122_000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="me" uri="/WEB-INF/tlds/tags.tld" %>
<me:template title="Liên Hệ">
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
                        <h1>Liên hệ</h1>
                        <p>Pellentesque habitant morbi tristique senectus et netus et malesuada</p>
                    </div>
                    <div class="col-sm-6">
                        <ul class="breadcrumb pull-right">
                            <li><a href="index.htm">Trang chủ</a></li>
                            <li class="active"><a href="">Liên hệ</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </section><!--/#title-->

        <section id="contact-page" class="container">
            <div class="row">
                <div class="col-sm-8">
                    <h4>Vui lòng điền vào mẫu tin</h4>
                    <div class="status alert alert-success">
                        ${Result}
                        ${role}
                    </div>
                    <form action="/Home/SendMail" method="post" class="form-horizontal" role="form">
                        <div class="row">
                            <div class="col-sm-5">
                                <div class="form-group">
                                    <input type="text" tabindex="1" class="form-control" name="first_name" required="required" placeholder="First Name">
                                </div>
                                <div class="form-group">
                                    <input type="text" tabindex="2" class="form-control" name="last_name" required="required" placeholder="Last Name">
                                </div>
                                <div class="form-group">
                                    <input type="text" tabindex="3" class="form-control" name="email" required="required" placeholder="Email address">
                                </div>
                                <div class="form-group">
                                    <button type="submit" tabindex="5" class="btn btn-primary btn-lg">Gửi tin nhắn</button>
                                </div>
                            </div>
                            <div class="col-sm-7">
                                <textarea name="message" tabindex="4" id="message" required="required" class="form-control" rows="8" placeholder="Message"></textarea>
                            </div>
                        </div>
                    </form>
                </div><!--/.col-sm-8-->
                <div class="col-sm-4">
                    <h4>Địa điểm trên Google Maps</h4>
                    <iframe src="https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d3919.6333219757607!2d106.68231000000002!3d10.762717!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0000000000000000%3A0x043900f1d4539a3d!2zVHLGsOG7nW5nIMSQSCBLaG9hIGjhu41jIFThu7Egbmhpw6pu!5e0!3m2!1svi!2s!4v1413557250256" width="400" height="300" frameborder="0" style="border:0"></iframe>
                </div><!--/.col-sm-4-->
            </div>
        </section><!--/#contact-page-->


    </jsp:attribute>
</me:template>
