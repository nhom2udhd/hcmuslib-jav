<%-- 
    Document   : template
    Created on : Nov 27, 2014, 8:41:10 AM
    Author     : 11122_000
--%>

<%@tag description="put the tag description here" pageEncoding="UTF-8"%>

<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="title"%>

<%@attribute name="content" fragment="true" %>
<%-- any content can be specified here e.g.: --%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <meta name="google-site-verification" content="PvSIu_PRyAiKpq2UKa9xzKxeQbDI2-Tl27casa4KgFQ" />

        <title>${title} - Thư viện ĐH KHTN TPHCM</title>
        <link href="${pageContext.request.contextPath}/images/ico/favicon.ico" rel=" shortcut icon" type="image/x-icon" />
        <meta name="viewport" content="width=device-width" />

        <link type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
        <link type="text/css" href="${pageContext.request.contextPath}/css/font-awesome.min.css" rel="stylesheet">
        <link type="text/css" href="${pageContext.request.contextPath}/css/prettyPhoto.css" rel="stylesheet">
        <link type="text/css" href="${pageContext.request.contextPath}/css/animate.css" rel="stylesheet">
        <link type="text/css" href="${pageContext.request.contextPath}/css/main.css" rel="stylesheet">
        <link type="text/css" href="${pageContext.request.contextPath}/css/mystyle.css" rel="stylesheet">

        <link rel="shortcut icon" href="${pageContext.request.contextPath}/images/ico/favicon.ico">
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="${pageContext.request.contextPath}/images/ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="${pageContext.request.contextPath}/images/ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="${pageContext.request.contextPath}/images/ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="${pageContext.request.contextPath}/images/ico/apple-touch-icon-57-precomposed.png">

    </head>
    <body>
        <header class="navbar navbar-inverse navbar-fixed-top wet-asphalt" role="banner">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="index.htm"><img src="${pageContext.request.contextPath}/images/lib_logo.png" alt="logo" style="max-height: 50px; max-width: 50px"></a>
                </div>
                <div class="collapse navbar-collapse">
                    <ul class="nav navbar-nav navbar-right">
                        <li class="active"><a href="index.htm">Trang chủ</a></li>
                        <li><a href="home/about.htm">Giới thiệu</a></li>
                        <li><a href="services.htm">Thư viện</a></li>
                        <li><a href="home/contact.htm">Liên hệ - Góp ý</a></li>
                    </ul>
                </div>
            </div>
        </header>


        <jsp:invoke fragment="content"/>


        <section id="bottom" class="wet-asphalt">
            <div class="container">
                <div class="row">
                    <div class="col-md-3 col-sm-6">
                        <h4>Giới thiệu</h4>
                        <p></p>
                        <p></p>
                    </div><!--/.col-md-3-->
                    <div class="col-md-3 col-sm-6">
                        <h4>Tổ chức</h4>
                        <div>
                            <ul class="arrow">
                                <li><a href="#">Tổng quan</a></li>
                                <li><a href="#">Nhân lực</a></li>
                                <li><a href="#">Đối tác</a></li>
                                <li><a href="#">Dịch vụ</a></li>
                                <li><a href="#">Hỏi đáp</a></li>
                                <li><a href="#">Liên hệ</a></li>
                                <li><a href="#">Chính sách</a></li>
                                <li><a href="#">Điều khoản</a></li>
                                <li><a href="#">Bản quyền</a></li>
                            </ul>
                        </div>
                    </div><!--/.col-md-3-->
                    <div class="col-md-3 col-sm-6">
                        <h4>Sách mới</h4>
                        <div>
                            <div class="media">
                                <div class="pull-left">
                                    <img src="${pageContext.request.contextPath}/images/blog/thumb1.jpg" alt="">
                                </div>
                                <div class="media-body">
                                    <span class="media-heading"><a href="#"> </a></span>
                                    <small class="muted">Posted 17 Aug 2013</small>
                                </div>
                            </div>
                            <div class="media">
                                <div class="pull-left">
                                    <img src="${pageContext.request.contextPath}/images/blog/thumb2.jpg" alt="">
                                </div>
                                <div class="media-body">
                                    <span class="media-heading"><a href="#"> </a></span>
                                    <small class="muted">Posted 13 Sep 2013</small>
                                </div>
                            </div>
                            <div class="media">
                                <div class="pull-left">
                                    <img src="${pageContext.request.contextPath}/images/blog/thumb3.jpg" alt="">
                                </div>
                                <div class="media-body">
                                    <span class="media-heading"><a href="#"> </a></span>
                                    <small class="muted">Posted 11 Jul 2013</small>
                                </div>
                            </div>
                        </div>
                    </div><!--/.col-md-3-->
                    <div class="col-md-3 col-sm-6">
                        <h4>Địa chỉ</h4>
                        <address>
                            <strong>ĐH KHTN</strong><br>
                            226 Nguyễn Văn Cừ<br>
                            Quận 5, TP HCM<br>
                            <abbr title="Phone">SDT:</abbr> Sdt
                        </address>
                        <h4>Nhận thư</h4>
                        <form role="form">
                            <div class="input-group">
                                <input type="text" class="form-control" autocomplete="off" placeholder="Enter your email">
                                <span class="input-group-btn">
                                    <button class="btn btn-danger" type="button">Go!</button>
                                </span>
                            </div>
                        </form>
                    </div> <!--/.col-md-3-->
                </div>
            </div>
        </section><!--/#bottom-->
        <footer id="footer" class="midnight-blue">
            <div class="container">
                <div class="row">
                    <div class="col-sm-6">
                        &copy; 2013 <a target="_blank" href="http://shapebootstrap.net/" title="Free Twitter Bootstrap WordPress Themes and HTML templates">ShapeBootstrap</a>. All Rights Reserved.
                    </div>
                    <div class="col-sm-6">
                        <ul class="pull-right">
                            <li><a href="#">Trang chủ</a></li>
                            <li><a href="#">Giới thiệu</a></li>
                            <li><a href="#">Hỏi đáp</a></li>
                            <li><a href="#">Liên hệ</a></li>
                            <li><a id="gototop" class="gototop" href="#"><i class="icon-chevron-up"></i></a></li><!--#gototop-->
                        </ul>
                    </div>
                </div>
            </div>
        </footer><!--/#footer-->

        <!--@RenderSection("scripts", required: false)-->
        <script src="${pageContext.request.contextPath}/js/jquery.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/jquery.prettyPhoto.js"></script>
        <script src="${pageContext.request.contextPath}/js/main.js"></script>
        <script src="${pageContext.request.contextPath}/js/myscript.js"></script>
        <script src="${pageContext.request.contextPath}/js/modernizr.js"></script>

        <script src="${pageContext.request.contextPath}/js/main.js"></script>
        <script src="${pageContext.request.contextPath}/js/highcharts.js"></script>
        <script src="${pageContext.request.contextPath}/js/ajax.js"></script>
        <!--@RenderSection("charts", required: false)-->

    </body>
</html>
