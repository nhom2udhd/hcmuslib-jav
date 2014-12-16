<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="me" uri="/WEB-INF/tlds/tags.tld" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<me:template title="Đăng Nhập">
    <jsp:attribute name="content">
        <section id="title" class="emerald">
            <div class="container">
                <div class="row">
                    <div class="col-sm-6">
                        <h1>${title}</h1>

                    </div>
                    <div class="col-sm-6">
                        <ul class="breadcrumb pull-right">
                            <li><a href="index.htm">Trang chủ</a></li>                   
                            <li class="active">Đăng nhập</li>
                        </ul>
                    </div>
                </div>
            </div>
        </section><!--/#title-->

        <section id="registration" class="container">
            <h3 class="text-center">
                Đăng nhập<br />
                <small>Thư viện yêu cầu bạn phải là thành viên để được sử dụng các dịch vụ của thư viện</small>
            </h3>
            <div id="login-form">
                <!--@using (Html.BeginForm(null, null, new { ReturnUrl = ViewBag.ReturnUrl }, FormMethod.Post, new { @class = "form-horizontal", @role = "form", @id = "login-form" }))-->
                <f:form class = "form-horizontal" role = "form" id = "login-form" 
                        method="post"
                        action="check.htm"
                        modelAttribute="login">

                    <!--@Html.AntiForgeryToken()-->
                    <p id="error-login-message" class="error-message text-center">
                        <!--@Html.ValidationSummary(true)-->
                    </p>
                    <div class="form-group">
                        <!--@Html.LabelFor(m => m.UserName, new { @class = "col-sm-4 control-label", @for = "username" })-->
                        <label class="col-sm-4 control-label" for="username">Username</label>
                        <div class="col-sm-4">
                            <!--@Html.TextBoxFor(m => m.UserName, new { @class = "form-control", @id = "username", @placeholder = "Username", @name = "username" })-->
                            <input type="text" class = "form-control" id = "username" placeholder = "Username" name = "userName" />
                        </div>
                        <div class="col-sm-4 col-sm-pull-1">
                            <p id="error-login-message" class="error-message text-center">
                                <!--@Html.ValidationMessageFor(m => m.UserName)-->

                            </p>
                        </div>

                    </div>

                    <div class="form-group">
                        <label class = "col-sm-4 control-label" for = "password">Password</label>
                        <div class="col-sm-4">
                            <input type="password" class="form-control" name="password" placeholder = "Password"/>
                        </div>
                        <div class="col-sm-4 col-sm-pull-1">
                            <p id="error-login-message" class="error-message text-center">
                                <!--@Html.ValidationMessageFor(m => m.Password)-->
                            </p>
                        </div>
                    </div>

                    <div class="form-group">
                        <div class="col-sm-offset-4 col-sm-8">
                            <div class="checkbox">
                                <checkbox name="remember_me"/>
                                <label>
                                    <!--@Html.CheckBoxFor(m => m.RememberMe, new { @name = "remeber_me" }) Remember me-->
                                     Remember Me
                                </label>
                            </div>
                        </div>
                    </div>

                    <div class="form-group">
                        <div class="col-sm-offset-4 col-sm-8">
                            <f:button type="submit" class="btn btn-default btn-md" id="login-submit">Sign in</f:button>
                            </div>
                        </div>

                </f:form>
            </div>
        </section>
    </jsp:attribute>
</me:template>
