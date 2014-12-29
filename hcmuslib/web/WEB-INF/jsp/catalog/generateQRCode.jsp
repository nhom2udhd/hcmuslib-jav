<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="me" uri="/WEB-INF/tlds/tags.tld" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>

<script>
    $(document).ready(function () {
        $('#result').hide();
    });
</script>
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
                        <li><a href="../index.htm">Trang chủ</a></li>
                        <li><a href="../home/about.htm">Giới thiệu</a></li>
                        <li><a href="../home/services.html">Thư viện</a></li>
                        <li class="active"><a href="contact.htm">Liên hệ - Góp ý</a></li>
                    </ul>
                </div>
            </div>
        </header>
        <section id="title" class="emerald">
    <div class="container">
        <div class="row">
            <div class="col-sm-6">
                <h1>Phát Sinh Mã Vạch(QRCode)</h1>
            </div>
            <div class="col-sm-6">
                <ul class="breadcrumb pull-right">
                    <li><a href="index.html">Home</a></li>
                    <li><a href="#">Pages</a></li>
                    <li class="active">Phát Sinh Mã Vạch(QRCode)</li>
                </ul>
            </div>
        </div>
    </div>
</section><!--/#title-->

<section class="container printMe">
    <div class="row printMe">
        <div class="col-md-9" align="center">
            <div class="panel panel-primary" style="width:350px">
                <div class="panel-heading">
                    <h3 class="panel-title">Nhập Mã Vạch Ở Đây: </h3>
                </div>
                <div class="panel-body">
                    <form action="/Circulator/QrCodeGenerate" method="post" id="myForm" enctype="multipart/form-data">
                        <input class="form-group-border" type="text" name="filename" id="data" onchange="Create();" />
                    </form>
                    <script>
                        function Create() {
                            $('#result').show();
                            var data = document.getElementById('data').value;
                            document.getElementById('qrimage').innerHTML = "<img class='printMe' src=https://chart.googleapis.com/chart?chs=250x250&cht=qr&chl=" + data + "/>";
                        }
                        function printHandler() {
                            $(":not(.printMe)").addClass("hideInPrint");

                            $("button").addClass("hideInPrint");
                            $("html").addClass("printMe");
                            $("body").addClass("printMe");
                            $("tbody").addClass("printMe");
                            $("html").removeClass("hideInPrint");
                            $("body").removeClass("hideInPrint");
                            $("tbody").removeClass("hideInPrint");

                            window.print();
                            $("button").removeClass("hideInPrint");
                            $(":not(.printMe)").removeClass("hideInPrint");
                        }
                    </script>
                    <br />
                    <input class="btn" type="button" value="Create" onclick="Create();" />
                </div>
            </div>
        </div>
        <div class="col-md-9 printMe" id="result" align="center">
            <div class="panel panel-primary printMe" style="width:350px">
                <div class="panel-heading">
                    <h3 class="panel-title">QRCode: </h3>
                </div>
                <div class="panel-body printMe">
                    <div class="printMe">
                        <div id="qrimage" class="printMe">
                        </div>
                    </div>
                    <input type="button" class="btn-social" style="color:red" value="Print" onclick="printHandler()" />
                </div>
            </div>


        </div>
    </div>

</section><!--/#terms-->


    </jsp:attribute>
</me:template>

<link type="text/css" href="${pageContext.request.contextPath}/css/print.css" rel="stylesheet">
