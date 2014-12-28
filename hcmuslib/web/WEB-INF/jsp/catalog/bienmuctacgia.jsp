<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="me" uri="/WEB-INF/tlds/tags.tld" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>

<script type="text/javascript">
    function doAjaxPost() {
        // get the form values
        $.ajax({
            type: "GET",
            url: "bmtacgia.htm",
            success: function(data){
                // we have the response

                 $('#createForm').html(data); 
                /* $('#info').refresh(); */              
            },

             error: function(e){
                alert('Error: ' + e);
            } 
            });
    };   
    
    function doAjax(page) {
        // get the form values
        
        $.ajax({
            //type: "GET",
            url: "tabletacgia.htm?jtStartIndex="+page,
            success: function(data){
                // we have the response

                 $('#ajaxTable').html(data);
                /* $('#info').refresh(); */              
            },

             error: function(e){
                alert('Error: ' + e);
            } 
            });
    };
    
    
    function showEditDiv(id,hoTen,butDanh,TinhTrang){
        $("#idedit").val(id);
        $("#hotenedit").val(hoTen);
        $("#butdanhedit").val(butDanh);
        if(TinhTrang == 1)
            $("#option1edit").attr("selected","selected");
        else
            $("#option2edit").attr("selected","selected");
        $("#editDiv").toggle();
    };
    
    function closeEditDiv(){
        $("#editDiv").hide();
    };
    
    function Edit(){
        if ($("#hotenedit").val().length==0){    
            $('#hoteneditcheck').html('Ho Ten Is Not Empty'); 
        }
        else{       
            $('#editForm').submit();
        }
    };
        
    function Load(){       
        $('#ajaxTable').empty().html('<img src="<%=request.getContextPath()%>/images/ajax-loader.gif" />');
        
        $("#ajaxTable").load('tabletacgia.htm?jtStartIndex=0');
    };
    
    $(document).ready(function (){
        
        
        Load();
        
        
        
        $("#prevBtn").click(function(){
            $("#nextBtn").removeAttr('disabled');
            var temp = parseInt($("#pageCur").val())-1;
            if(temp == 0)
                 $("#prevBtn").attr('disabled','disabled');
            if(temp >= 0)
            {
                $('#ajaxTable').empty().html('<img src="<%=request.getContextPath()%>/images/ajax-loader.gif" />');
                $("#pageCur").val(temp);
                doAjax(temp);
            }
            
        });
        
        $("#nextBtn").click(function(){           
            $("#prevBtn").removeAttr('disabled');
            var temp = parseInt($("#pageCur").val())+1;
            if(temp > ${pageSum})
                $("#nextBtn").attr('disabled','disabled');
            if(temp <= ${pageSum})
            {
                $('#ajaxTable').empty().html('<img src="<%=request.getContextPath()%>/images/ajax-loader.gif" />'); 
                $("#pageCur").val(temp);
                doAjax(temp);
            }            
        });
        
        $("#createBtn").click(function (){
            doAjaxPost();
            $("#createForm").show();
            $("#createBtn").hide();
            $("#hideBtn").show();
            
        });
        $("#hideBtn").click(function (){
            $("#createForm").hide();
            $("#createBtn").show();
            $("#hideBtn").hide();
        });  
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
                    <div class="row">
                        
                        <div class="col-sm-5">
                            <h4>Thông Tin Biên Mục Tác Giả: </h4>
                            <div id="not1" class="status alert alert-success">
                                ${Result}
                            </div>
                           
                            
                            <button class="btn btn-primary btn-lg" id="createBtn">Tạo Mới</button>
                            <button class="btn btn-primary btn-lg" id="hideBtn" style="display: none">Đóng Tạo Mới</button>
                            <br>
                            <br>
                            <div id="createForm"></div><br>
                            <div id="ajaxTable">
                            
                            </div>
                            <br>
                            <input type="hidden" id="pageCur" value=0 />
                            
                            <button class="btn btn-danger" id="prevBtn" type="button">
                                <
                            </button>
                            <button class="btn btn-danger" id="nextBtn" type="button">
                                >
                            </button>
                            
                            
                            
                        </div>
                        
                    </div>
                    
                </div><!--/.col-sm-8-->
                <div class="col-sm-5">
                    
                    <div id="editDiv" style="display: none">
                    <button class="btn btn-primary btn-lg" id="createBtn" onclick="closeEditDiv()">Đóng Thay Đổi</button>
                    <f:form id="editForm"
                            action = "edittacgia.htm"
                             method="POST"             
                             modelAttribute="Bmtacgia">
                           <div class="form-group">
                               <f:hidden path="idTacGia" id="idedit"></f:hidden>
                               Họ Tên<span style="color:red">*</span> :<f:input type="text" path="hoTen" id="hotenedit" class="form-control" />
                               <span style="color:red" id="hoteneditcheck"></span>
                           </div>
                           <div class="form-group">
                               Bút Danh : <f:input type="text" id="butdanhedit" class="form-control" path="butDanh" />
                           </div>                          
                            <div class="form-group">
                               Tình Trạng : 
                                <f:select class="form-control" path="tinhTrang" style="width:200px;height:40px" id="tinhtrangedit">
                                    <option value=1 path="tinhTrang" id="option1edit">Hoạt Động</option>
                                    <option value=0 path="tinhTrang" id="option2edit">Ngưng Hoạt Động</option>
                                </f:select>
                           </div>
                           <div class="form-group">
                               <input type="button" onclick="Edit()" class="btn btn-primary btn-lg" id="editBtn" value="Lưu Thay Đổi">
                           </div>
                       </f:form>
                </div>
                </div>
                
            </div>
        </section><!--/#contact-page-->


    </jsp:attribute>
</me:template>