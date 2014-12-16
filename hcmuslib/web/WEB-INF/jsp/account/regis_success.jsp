
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="me" uri="/WEB-INF/tlds/tags.tld" %>
<me:template title="Đăng ký">
    <jsp:attribute name="content">
        <section id="title" class="emerald">
            <div class="container">
                <div class="row">
                    <div class="col-sm-6">
                        <h1>${title}</h1>
                        <p>Pellentesque habitant morbi tristique senectus et netus et malesuada</p>
                    </div>
                    <div class="col-sm-6">
                        <ul class="breadcrumb pull-right">
                            <li><a href="index.html">Home</a></li>
                            <li><a href="#">Pages</a></li>
                            <li class="active">Registration</li>
                        </ul>
                    </div>
                </div>
            </div>
        </section><!--/#title-->

        <section id="registration" class="container">
            <h3 class="text-center">
                Đăng ký<br />
                <small>Tạo tài khoản cho độc giả</small>
            </h3>
            <!--Dang ky thanh cong-->
            <p id="success-regist" class="status alert alert-success text-center"> 
                Đăng ký thành công
            </p>
            <button class="btn btn-default btn-md" onclick="window.location.assign('${pageContext.request.contextPath}/registry/index.htm')">Quay về trang đăng ký</button>
        </section>
    </jsp:attribute>
</me:template>
