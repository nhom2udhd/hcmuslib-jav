<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>

<h4>Nhập Thông Tin Tác Giả: </h4>
<script type="text/javascript">
    function Save(){
    if ($("#hoten").val().length==0){    
        $('#hotencheck').html('Ho Ten Is Not Empty'); 
    }
    else{       
        $('#ajaxform').submit();
    }  
};
</script>                  
<div class="row">
    <div class="col-sm-5">
       <f:form id="ajaxform"
             action = "successtacgia.htm"
              method="POST"             
              modelAttribute="Bmtacgia">
            <div class="form-group">
                Họ Tên<span style="color:red">*</span> :<f:input type="text" path="hoTen" id="hoten" class="form-control" />
                <span style="color:red" id="hotencheck"></span>
            </div>
            <div class="form-group">
                Bút Danh : <f:input type="text" id="butdanh" class="form-control" path="butDanh" />
            </div>
            <div class="form-group">
                Thông Tin Bổ Sung : <f:input type="text" id="thongtin" class="form-control" path="thongTinBoSung"/>
            </div>
             <div class="form-group">
                Tình Trạng : 
                 <f:select class="form-control" path="tinhTrang" style="width:200px;height:40px" id="mySelect">
                     <option value=1 path="tinhTrang" id="option1">Hoạt Động</option>
                     <option value=0 path="tinhTrang" id="option2">Ngưng Hoạt Động</option>
                 </f:select>
            </div>
            <div class="form-group">
                <input type="button" class="btn btn-primary btn-lg" id="saveBtn" value="Lưu Biên Mục" onclick="Save()">
            </div>
        </f:form>           
    </div>
</div>
 