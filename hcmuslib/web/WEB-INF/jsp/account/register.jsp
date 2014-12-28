<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="me" uri="/WEB-INF/tlds/tags.tld"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<script src="/hcmuslib/js/jquery.js"></script>
<script type="text/javascript">
    $(this).ready(function() {
        var u = $("#error-user-message").val();
        var p = $("#error-password-message").val();
        var c = $("#error-confirm-message").val();
        if (u.length || p.length || c.length) {
            $("#regis-submit").prop("disabled");
        } else {
            $("#regis-submit").removeAttr("disabled");
        }


        $("#username").change(function() {
            var user=$("#username").val();
            $.ajax({
                type: 'POST',
                data: {username: user},
                url: "check.htm",
                success: function(data) {
                    $("#error-user-message").html(data);
                }
            });


        });
        $("#confirm-password").keyup(function() {
            var pw = $("#password").val();
            var cf = $("#confirm-password").val();
            if (cf !== pw) {
//                $("#error-confirm-message").removeClass();
//                $("#error-confirm-message").addClass("error-message text-danger");
                $("#error-confirm-message").html("Mật khẩu không trùng khớp!");
                ;
            } else {
//                $("#error-confirm-message").removeClass();
//                $("#error-confirm-message").addClass("alert-success text-center");
                $("#error-confirm-message").html("Mật khẩu đã khớp")
            }
        });
    });

</script>
<me:template title="Đăng Ký">
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
            <div id="login-form">
                <!--@using (Html.BeginForm(null, null, FormMethod.Post, new { @class = "form-horizontal", @role = "form", @id = "login-form" }))-->
                <f:form class="form-horizontal" role="form" id="login-form" method="post"
                        action="valid.htm"
                        modelAttribute="account">
                    ${success}
                    <p id="error-login-message" class="error-message text-danger">
                        <!--@Html.ValidationSummary()-->
                    </p>
                    <div class="form-group">

                        <!--@Html.LabelFor(m => m.UserName, new { @class = "col-sm-4 control-label", @for = "username" })-->
                        <label  class="col-sm-4 control-label" for="username" >Username</label>
                        <div class="col-sm-4">
                            <!--@Html.TextBoxFor(m => m.UserName, new { @class = "form-control", @id = "username", @placeholder = "Username", @name = "username" })-->
                            <f:input path="userName" type="text" class="form-control" id="username" placeholder="Username" name="username"/>
                        </div>
                        <div class="col-sm-4">
                            <p id="error-user-message" class="error-message text-danger">
                                <!--@Html.ValidationMessageFor(m => m.UserName)-->
                                ${username}
                            </p>
                        </div>
                    </div>
                    <div class="form-group">

                        <!--@Html.LabelFor(m => m.Password, new { @class = "col-sm-4 control-label", @for = "password" })-->
                        <label class="col-sm-4 control-label" for="password">Password</label>
                        <div class="col-sm-4">

                            <!--@Html.PasswordFor(m => m.Password, new { @class = "form-control", @name = "password", @id = "password", @placeholder = "Password" })-->
                            <f:input path="password" type="password" class="form-control" id="password" placeholder="Password" name="password"/>
                        </div>
                        <div class="col-sm-4 ">
                            <p id="error-pass-message" class="error-message text-danger">
                                <!--@Html.ValidationMessageFor(m => m.UserName)-->
                                ${password}
                            </p>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-4 control-label" for="password">Confirm Password</label>
                        <div class="col-sm-4">

                            <input type="password" class="form-control" id="confirm-password" placeholder="Password" name="confirm-password"/>
                        </div>
                        <div class="col-sm-4">
                            <p id="error-confirm-message" class="error-message text-danger">
                                ${password}            
                            </p>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-offset-4 col-sm-8">
                            <f:button type="submit" class="btn btn-default btn-md" id="regis-submit">Đăng ký</f:button>
                            </div>
                        </div>
                </f:form>
            </div>
        </section>
    </jsp:attribute>
</me:template>