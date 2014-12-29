<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="me" uri="/WEB-INF/tlds/tags.tld" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<div class="search_result">
    
        <h4><em>Tìm thấy <strong>${result}</strong> sách</em></h4> 

        <ul class="portfolio-items col-4">
            <c:forEach items="${lst}" var="b">
                
                                
                    <li class="portfolio-item apps" style="margin: 20px">
                        
                        <div class="item-inner" id="demo">
                            <f:form
                                    action="home/bookdetail.htm"
                                    method="POST" 
                                    modelAttribute="Sach"
                                >
                            <button type="submit">
                                <img src="${pageContext.request.contextPath}/images/portfolio/thumb/item4.jpg" alt="">
                            </button>
                                <span style="color: #000; font-size: large">${b.bmnhandechinh.nhanDeChinh}</span>
                                <br>
                                <i class="icon-user"> </i><span style="color: #7f8c8d">${b.bmtacgia.butDanh}</span>
                                <br>
                                <!-- <div class="overlay">
                                        <a class="preview btn btn-danger" href="images/portfolio/full/item1.jpg" rel="prettyPhoto"><i class="icon-eye-open"></i></a>             
                                </div> -->        
                                
                                    <f:hidden path="idSach" value="${b.idSach}"></f:hidden>
                                    
                                    
                                    
                                    
                                    <button type="submit" class="btn btn-info" style="margin: 10px">Xem chi tiết</button>
                                    <button type="button" class="btn btn-info">Mượn</button>
                                     
                                
                                <br>
                                </f:form>  
                        </div>
                   
                    </li><!--/.portfolio-item-->  
                                                 
            </c:forEach>
        </ul>
</div>