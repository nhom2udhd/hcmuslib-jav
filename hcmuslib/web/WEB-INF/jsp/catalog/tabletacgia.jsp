<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="me" uri="/WEB-INF/tlds/tags.tld" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>

<table class="table table-bordered" style="width: 750px">
    <tr>

        <th style="display: none">ID</th>

        <th style="width: 20%;">Họ Tên</th>
        <th style="width: 20%;">Bút Danh</th>

        <th style="width: 30%;">Tình Trạng</th>   
        

    </tr>
    <c:forEach items="${lst}" var="tg">
        
            <tr>
                

                <td style="display: none">${tg.idTacGia}</td>

                <td style="width: 20%;">${tg.hoTen}

                </td>

                <td style="width: 20%;">${tg.butDanh}</td>
                <td style="width: 30%;"><c:if test = "${tg.tinhTrang == 1}">
                        <c:out value="Hoạt Động"></c:out>
                    </c:if>
                    <c:if test = "${tg.tinhTrang == 0}">
                        <c:out value="Ngưng Hoạt Động"></c:out>
                    </c:if>
                </td>
                <td style="width: 10%">
                    <button type="button" onclick="showEditDiv('${tg.idTacGia}','${tg.hoTen}','${tg.butDanh}','${tg.tinhTrang}')">
                        <img src="${pageContext.request.contextPath}/images/edit.png" 
                             alt="" width="15px" height="15px" title="Edit Tác Giả"/>

                    </button>
                    <br>
                    <f:form action="removetacgia.htm" method="POST" modelAttribute="Bmtacgia">
                        <f:hidden path="idTacGia" value="${tg.idTacGia}"></f:hidden>
                        <button type="submit" onclick="return confirm('Bạn Có Thực Sự Muốn Xóa TG này không ?')" style="">
                        <img src="${pageContext.request.contextPath}/images/delete.png" 
                             alt="" width="15px" height="15px" title="Xóa Tác Giả"/>
                        </button>
                    </f:form>
                </td> 
            </tr>
        
    </c:forEach>                                                                  
</table>