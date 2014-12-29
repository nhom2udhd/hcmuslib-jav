<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="me" uri="/WEB-INF/tlds/tags.tld" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>

<script>
    function doAjax(key) {
        // get the form values
        $("#searchwarning").empty();
        $('#contentbook').empty().html('<img src="<%=request.getContextPath()%>/images/ajax-loader.gif" />');
        $.ajax({
            //type: "GET",
            url: "home/searchbooks.htm?keysearch="+key,
            success: function(data){
                // we have the response
                
                $('#contentbook').empty().html(data);
                /* $('#info').refresh(); */            
            },

             error: function(e){
                alert('Error: ' + e);
                $('#contentbook').empty().html("Error, please try again !?");
            } 
            });
    };
    
    function RunSearch()
    {
        if($("#searchtextbox").val().length == 0)
        {
            $("#searchwarning").html("Nhập tên sách hay tác giả bạn muốn tìm");
        }              
        else
        {
            
            doAjax($("#searchtextbox").val());
        }
    }
    
    $(document).ready(function(){
        $("#searchbutton").click(function(){
            
            //var key = $("#searchtextbox").val();
            RunSearch();
        });
        $("#searchtextbox").keyup(function(event){
            if(event.keyCode == 13){
                //$('#contentbook').empty().html('<img src="<%=request.getContextPath()%>/images/ajax-loader.gif" />');
                //var key = $("#searchtextbox").val();
                RunSearch();
            }
        });
    });
    
</script>


<me:template title="Trang Chủ">
    <jsp:attribute name="content">
        <section id="main-slider" class="no-margin">
            <div class="carousel slide wet-asphalt">
                <ol class="carousel-indicators">
                    <li data-target="#main-slider" data-slide-to="0" class="active"></li>
                    <li data-target="#main-slider" data-slide-to="1"></li>
                    <li data-target="#main-slider" data-slide-to="2"></li>
                </ol>
                <div class="carousel-inner">
                    <div class="item active" style="background-image: url(images/slider/custom_bg1.jpg)">
                        <div class="container">
                            <div class="row">
                                <div class="col-sm-12">
                                    <div class="carousel-content centered">
                                        <h2 class="boxed animation animated-item-1">Thư viện trường ĐH Khoa học Tự Nhiên TPHCM</h2>
                                        <p class="boxed animation animated-item-2"> </p>
                                        </br>
                                        <a class="btn btn-md animation animated-item-3" href="#">Learn More</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div><!--/.item-->
                    <div class="item" style="background-image: url(images/slider/custom_bg2.jpg)">
                        <div class="container">
                            <div class="row">
                                <div class="col-sm-12">
                                    <div class="carousel-content center centered">
                                        <h2 class="boxed animation animated-item-1">Thư viện trường ĐH Khoa học Tự Nhiên TPHCM</h2>
                                        <p class="boxed animation animated-item-2"> </p>
                                        <br>
                                        <a class="btn btn-md animation animated-item-3" href="#">Learn More</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div><!--/.item-->
                    <div class="item" style="background-image: url(images/slider/custom_bg3.jpg)">
                        <div class="container">
                            <div class="row">
                                <div class="col-sm-6">
                                    <div class="carousel-content centered">
                                        <h2 class="boxed animation animated-item-1">Thư viện trường ĐH Khoa học Tự Nhiên TPHCM</h2>
                                        
                                        <a class="btn btn-md animation animated-item-3" href="#">Learn More</a>
                                    </div>
                                </div>
                                <div class="col-sm-6 hidden-xs animation animated-item-4">
                                    <div class="centered">

                                    </div>
                                </div>
                            </div>
                        </div>
                    </div><!--/.item-->
                </div><!--/.carousel-inner-->
            </div><!--/.carousel-->
            <a class="prev hidden-xs" href="#main-slider" data-slide="prev">
                <i class="icon-angle-left"></i>
            </a>
            <a class="next hidden-xs" href="#main-slider" data-slide="next">
                <i class="icon-angle-right"></i>
            </a>
        </section><!--/#main-slider-->
        <section id="services" class="emerald">
            <div class="container">
                <div class="row">

                    <div class="col-md-4 col-sm-6">


                        <div class="gly-link"><a href="account/login.htm"><h3><span class="glyphicon glyphicon-user gly-bigger"></span> Đăng nhập</h3></a></div>
                        <p></p>


                    </div><!--/.col-md-4-->
                    <div class="col-md-4 col-sm-6">





                        <div class="gly-link" id="search-btn"><h3><span class="glyphicon glyphicon-search gly-bigger"></span> Tìm kiếm</h3></div><p id="searchwarning" style="color: red"></p>
                        <p></p>
                        <div class="widget search">
                            
                                <div class="input-group">
                                    <input type="text" class="form-control" id="searchtextbox" >
                                    <span class="input-group-btn">
                                        <button class="btn btn-danger" type="button" id="searchbutton"><i class="icon-search"></i></button>
                                    </span>
                                </div>
                            
                        </div><!--/.search-->


                    </div><!--/.col-md-4-->
                    <div class="col-md-4 col-sm-6">
                        <div class="gly-link"><a href="/home/contact.htm"><h3><span class="glyphicon glyphicon-envelope gly-bigger"></span> Liên hệ</h3></a></div>
                        <p></p>
                    </div><!--/.col-md-4-->
                </div>
            </div>
        </section><!--/#services-->
        <section id="recent-works">
            <div class="container">
                <div class="row" id="contentbook">
                    <div class="col-md-3">
                        <h3>Sách mới</h3>
                        <p>   </p>
                        <div class="btn-group">
                            <a class="btn btn-danger" href="#scroller" data-slide="prev"><i class="icon-angle-left"></i></a>
                            <a class="btn btn-danger" href="#scroller" data-slide="next"><i class="icon-angle-right"></i></a>
                        </div>
                        <p class="gap"></p>
                    </div>
                    <div class="col-md-9">
                        <div id="scroller" class="carousel slide">
                            <div class="carousel-inner">
                                <div class="item active">
                                    <div class="row">
                                        <div class="col-xs-4">
                                            <div class="portfolio-item">
                                                <div class="item-inner">
                                                    <img class="img-responsive" src="${pageContext.request.contextPath}/images/book/cover1.jpg" alt="">
                                                    <h5>
                                                        Harry Potter and the Philosopher 's Stone
                                                    </h5>
                                                    <div class="overlay">
                                                        <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href="${pageContext.request.contextPath}/images/portfolio/full/test_item.jpg" rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-xs-4">
                                            <div class="portfolio-item">
                                                <div class="item-inner">
                                                    <img class="img-responsive" src="${pageContext.request.contextPath}/images/book/cover2.jpg" alt="">
                                                    <h5>
                                                        The Complete Sherlock Holmes
                                                    </h5>
                                                    <div class="overlay">
                                                        <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href="${pageContext.request.contextPath}/images/portfolio/full/item1.jpg" rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-xs-4">
                                            <div class="portfolio-item">
                                                <div class="item-inner">
                                                    <img class="img-responsive" src="${pageContext.request.contextPath}/images/book/cover3.jpg" alt="">
                                                    <h5>
                                                        One Piece vol 19
                                                    </h5>
                                                    <div class="overlay">
                                                        <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href="${pageContext.request.contextPath}/images/portfolio/full/item1.jpg" rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div><!--/.row-->
                                </div><!--/.item-->
                                <div class="item">
                                    <div class="row">
                                        <div class="col-xs-4">
                                            <div class="portfolio-item">
                                                <div class="item-inner">
                                                    <img class="img-responsive" src="${pageContext.request.contextPath}/images/book/cover3.jpg" alt="">
                                                    <h5>
                                                        One Piece vol 19
                                                    </h5>
                                                    <div class="overlay">
                                                        <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href="${pageContext.request.contextPath}/images/portfolio/full/item1.jpg" rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-xs-4">
                                            <div class="portfolio-item">
                                                <div class="item-inner">
                                                    <img class="img-responsive" src="${pageContext.request.contextPath}/images/book/cover2.jpg" alt="">
                                                    <h5>
                                                        The Complete Sherlock Holmes
                                                    </h5>
                                                    <div class="overlay">
                                                        <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href="${pageContext.request.contextPath}/images/portfolio/full/item1.jpg" rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-xs-4">
                                            <div class="portfolio-item">
                                                <div class="item-inner">
                                                    <img class="img-responsive" src="${pageContext.request.contextPath}/images/book/cover1.jpg" alt="">
                                                    <h5>
                                                        Harry Potter and the Philosopher 's Stone
                                                    </h5>
                                                    <div class="overlay">
                                                        <a class="preview btn btn-danger" title="Malesuada fames ac turpis egestas" href="${pageContext.request.contextPath}/images/portfolio/full/item1.jpg" rel="prettyPhoto"><i class="icon-eye-open"></i></a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div><!--/.item-->
                            </div>
                        </div>
                    </div>
                </div><!--/.row-->
            </div>
        </section><!--/#recent-works-->
        <section id="testimonial" class="alizarin">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="center">
                            <h2>Các dịch vụ chính</h2>
                            <p>   </p>
                        </div>
                        <div class="gap"></div>
                        <div class="row">
                            <div class="col-md-6">
                                <blockquote>
                                    <p>  </p>
                                    <small>   <cite title="  ">  </cite></small>
                                </blockquote>
                                <blockquote>
                                    <p>  </p>
                                    <small>   <cite title="  ">  </cite></small>
                                </blockquote>
                            </div>
                            <div class="col-md-6">
                                <blockquote>
                                    <p>  </p>
                                    <small>   <cite title="  ">  </cite></small>
                                </blockquote>
                                <blockquote>
                                    <p>  </p>
                                    <small>   <cite title="  ">  </cite></small>
                                </blockquote>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section><!--/#testimonial-->



    </jsp:attribute>
</me:template>

