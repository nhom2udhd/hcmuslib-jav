<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="me" uri="/WEB-INF/tlds/tags.tld" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>

<me:template title="Sách">
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
                        <h1>Sách</h1>
                        
                    </div>
                    <div class="col-sm-6">
                        <ul class="breadcrumb pull-right">
                            <li><a href="index.htm">Trang chủ</a></li>
                            <li class="active"><a href="">Sách</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </section><!--/#title-->

        <section id="blog" class="container">
        <div class="row">
            <aside class="col-sm-4 col-sm-push-8">
                <div class="widget search">
                    <form role="form">
                        <div class="input-group">
                            <input type="text" class="form-control" autocomplete="off" placeholder="Search">
                            <span class="input-group-btn">
                                <button class="btn btn-danger" type="button"><i class="icon-search"></i></button>
                            </span>
                        </div>
                    </form>
                </div><!--/.search-->

                <div class="widget ads">
                    <div class="row">
                        <div class="col-xs-6">
                            <a href="#"><img class="img-responsive img-rounded" src="${pageContext.request.contextPath}/images/ads/ad1.png" alt=""></a>
                        </div>

                        <div class="col-xs-6">
                            <a href="#"><img class="img-responsive img-rounded" src="${pageContext.request.contextPath}/images/ads/ad2.png" alt=""></a>
                        </div>
                    </div>
                    <p> </p>
                    <div class="row">
                        <div class="col-xs-6">
                            <a href="#"><img class="img-responsive img-rounded" src="${pageContext.request.contextPath}/images/ads/ad3.png" alt=""></a>
                        </div>

                        <div class="col-xs-6">
                            <a href="#"><img class="img-responsive img-rounded" src="${pageContext.request.contextPath}/images/ads/ad4.png" alt=""></a>
                        </div>
                    </div>
                </div><!--/.ads-->     

                <div class="widget categories">
                    <h3>Blog Categories</h3>
                    <div class="row">
                        <div class="col-sm-6">
                            <ul class="arrow">
                                <li><a href="#">Development</a></li>
                                <li><a href="#">Design</a></li>
                                <li><a href="#">Updates</a></li>
                                <li><a href="#">Tutorial</a></li>
                                <li><a href="#">News</a></li>
                            </ul>
                        </div>
                        <div class="col-sm-6">
                            <ul class="arrow">
                                <li><a href="#">Joomla</a></li>
                                <li><a href="#">Wordpress</a></li>
                                <li><a href="#">Drupal</a></li>
                                <li><a href="#">Magento</a></li>
                                <li><a href="#">Bootstrap</a></li>
                            </ul>
                        </div>
                    </div>                     
                </div><!--/.categories-->
                <div class="widget tags">
                    <h3>Tag Cloud</h3>
                    <ul class="tag-cloud">
                        <li><a class="btn btn-xs btn-primary" href="#">CSS3</a></li>
                        <li><a class="btn btn-xs btn-primary" href="#">HTML5</a></li>
                        <li><a class="btn btn-xs btn-primary" href="#">WordPress</a></li>
                        <li><a class="btn btn-xs btn-primary" href="#">Joomla</a></li>
                        <li><a class="btn btn-xs btn-primary" href="#">Drupal</a></li>
                        <li><a class="btn btn-xs btn-primary" href="#">Bootstrap</a></li>
                        <li><a class="btn btn-xs btn-primary" href="#">jQuery</a></li>
                        <li><a class="btn btn-xs btn-primary" href="#">Tutorial</a></li>
                        <li><a class="btn btn-xs btn-primary" href="#">Update</a></li>
                    </ul>
                </div><!--/.tags-->

                <div class="widget facebook-fanpage">
                    <h3>Facebook Fanpage</h3>
                    <div class="widget-content">
                        <div class="fb-like-box" data-href="https://www.facebook.com/shapebootstrap" data-width="292" data-show-faces="true" data-header="false" data-stream="false" data-show-border="false"></div>
                    </div>
                </div>
            </aside>        
            <div class="col-sm-8 col-sm-pull-4">
                <div class="blog">
                    <div class="blog-item">
                        
                            <img src="${pageContext.request.contextPath}/images/portfolio/thumb/item4.jpg" width="200" height="200" alt="" style="margin: 30px" />
                        
                            <span style="color: #000; font-size: x-large">${book.bmnhandechinh.nhanDeChinh}</span> 

                       
                        
                        <div class="blog-content">
                            
                            <div class="entry-meta">
                                <span><i class="icon-user"></i> <a href="#">${book.bmtacgia.butDanh}</a></span>
                                <span><i class="icon-folder-close"></i> <a href="#">${book.noiXuatBan}</a></span>
                                <span><i class="icon-calendar"></i> ${book.ngayNhap}</span>
                                <span><i class="icon-comment"></i> <a href="blog-item.html#comments">3 Comments</a></span>
                            
                                <hr>
                                <h4>Thông Tin Chi Tiết: </h4>
                                <table class="table table-bordered" style="width: 600px" cellspacing="0">
                                   
                                     <tr>
                                        <td style="width: 50px">Nhà Xuất Bản</td>
                                        <td>${book.bmnxb.tenNxb}</td>
                                     </tr>
                                     <tr>
                                        <td style="width: 50px">Năm Xuất Bản</td>
                                        <td>${book.namXuatBan}</td>
                                     </tr>
                                     <tr>
                                        <td style="width: 50px">Ngôn Ngữ</td> 
                                        <td>${book.ngonNgu}</td>
                                     </tr>
                                     <tr>
                                        <td style="width: 50px">Minh Họa</td> 
                                        <td>${book.ghiChu}</td>
                                     </tr>                           
                                </table>
                           
                            </div>
                                      <p style="margin: 20px">
                            <button type="button" class="btn btn-info">Mượn</button>
                        </p>
                            <hr>

                            <div class="tags">
                                <i class="icon-tags"></i> Tags <a class="btn btn-xs btn-primary" href="#">CSS3</a> <a class="btn btn-xs btn-primary" href="#">HTML5</a> <a class="btn btn-xs btn-primary" href="#">WordPress</a> <a class="btn btn-xs btn-primary" href="#">Joomla</a>
                            </div>

                            <p>&nbsp;</p>

                            <div class="author well">
                                <div class="media">
                                    <div class="pull-left">
                                        <img class="avatar img-thumbnail" src="${pageContext.request.contextPath}/images/blog/avatar.jpg" alt="">
                                    </div>
                                    <div class="media-body">
                                        <div class="media-heading">
                                            <strong>John Doe</strong>
                                        </div>
                                        <p> </p>
                                    </div>
                                </div>
                            </div><!--/.author-->

                            <div id="comments">
                                <div id="comments-list">
                                    <h3>3 Comments</h3>
                                    <div class="media">
                                        <div class="pull-left">
                                            <img class="avatar img-circle" src="${pageContext.request.contextPath}/images/blog/avatar1.png" alt="">
                                        </div>
                                        <div class="media-body">
                                            <div class="well">
                                                <div class="media-heading">
                                                    <strong> Anonymous</strong>&nbsp; <small>27 Aug 2013</small>
                                                    <a class="pull-right" href="#"><i class="icon-repeat"></i> Reply</a>
                                                </div>
                                                <p> </p>
                                            </div>
                                            <div class="media">
                                                <div class="pull-left">
                                                    <img class="avatar img-circle" src="${pageContext.request.contextPath}/images/blog/avatar3.png" alt="">
                                                </div>
                                                <div class="media-body">
                                                    <div class="well">
                                                        <div class="media-heading">
                                                            <strong> Anonymous</strong>&nbsp; <small>27 Aug 2013</small>
                                                            <a class="pull-right" href="#"><i class="icon-repeat"></i> Reply</a>
                                                        </div>
                                                        <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante.</p>
                                                    </div>
                                                </div>
                                            </div><!--/.media-->
                                        </div>
                                    </div><!--/.media-->
                                    <div class="media">
                                        <div class="pull-left">
                                            <img class="avatar img-circle" src="${pageContext.request.contextPath}/images/blog/avatar2.png" alt="">
                                        </div>
                                        <div class="media-body">
                                            <div class="well">
                                                <div class="media-heading">
                                                    <strong> Anonymous</strong>&nbsp; <small>27 Aug 2013</small>
                                                    <a class="pull-right" href="#"><i class="icon-repeat"></i> Reply</a>
                                                </div>
                                                <p> </p>
                                            </div>
                                        </div>
                                    </div><!--/.media-->
                                </div><!--/#comments-list-->  

                                <div id="comment-form">
                                    <h3>Leave a comment</h3>
                                    <form class="form-horizontal" role="form">
                                        <div class="form-group">
                                            <div class="col-sm-6">
                                                <input type="text" class="form-control" placeholder="Name">
                                            </div>
                                            <div class="col-sm-6">
                                                <input type="email" class="form-control" placeholder="Email">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="col-sm-12">
                                                <textarea rows="8" class="form-control" placeholder="Comment"></textarea>
                                            </div>
                                        </div>
                                        <button type="submit" class="btn btn-danger btn-lg">Submit Comment</button>
                                    </form>
                                </div><!--/#comment-form-->
                            </div><!--/#comments-->
                        </div>
                    </div><!--/.blog-item-->
                </div>
            </div><!--/.col-md-8-->
        </div><!--/.row-->
    </section><!--/#blog-->

    <section id="bottom" class="wet-asphalt">
        <div class="container">
            <div class="row">
                <div class="col-md-3 col-sm-6">
                    <h4>About Us</h4>
                    
                </div><!--/.col-md-3-->

                <div class="col-md-3 col-sm-6">
                    <h4>Company</h4>
                    <div>
                        <ul class="arrow">
                            <li><a href="#">The Company</a></li>
                            <li><a href="#">Our Team</a></li>
                            <li><a href="#">Our Partners</a></li>
                            <li><a href="#">Our Services</a></li>
                            <li><a href="#">Faq</a></li>
                            <li><a href="#">Conatct Us</a></li>
                            <li><a href="#">Privacy Policy</a></li>
                            <li><a href="#">Terms of Use</a></li>
                            <li><a href="#">Copyright</a></li>
                        </ul>
                    </div>
                </div><!--/.col-md-3-->

                <div class="col-md-3 col-sm-6">
                    <h4>Latest Blog</h4>
                    <div>
                        <div class="media">
                            <div class="pull-left">
                                <img src="${pageContext.request.contextPath}/images/blog/thumb1.jpg" alt="">
                            </div>
                            <div class="media-body">
                                <span class="media-heading"><a href="#">Pellentesque habitant morbi tristique senectus</a></span>
                                <small class="muted">Posted 17 Aug 2013</small>
                            </div>
                        </div>
                        <div class="media">
                            <div class="pull-left">
                                <img src="${pageContext.request.contextPath}/images/blog/thumb2.jpg" alt="">
                            </div>
                            <div class="media-body">
                                <span class="media-heading"><a href="#">Pellentesque habitant morbi tristique senectus</a></span>
                                <small class="muted">Posted 13 Sep 2013</small>
                            </div>
                        </div>
                        <div class="media">
                            <div class="pull-left">
                                <img src="${pageContext.request.contextPath}/images/blog/thumb3.jpg" alt="">
                            </div>
                            <div class="media-body">
                                <span class="media-heading"><a href="#">Pellentesque habitant morbi tristique senectus</a></span>
                                <small class="muted">Posted 11 Jul 2013</small>
                            </div>
                        </div>
                    </div>  
                </div><!--/.col-md-3-->

                <div class="col-md-3 col-sm-6">
                    <h4>Address</h4>
                    <address>
                        <strong>Twitter, Inc.</strong><br>
                        795 Folsom Ave, Suite 600<br>
                        San Francisco, CA 94107<br>
                        <abbr title="Phone">P:</abbr> (123) 456-7890
                    </address>
                    <h4>Newsletter</h4>
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
  


    </jsp:attribute>
</me:template>