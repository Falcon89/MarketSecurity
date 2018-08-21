<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="au theme template">
    <meta name="author" content="Hau Nguyen">
    <meta name="keywords" content="au theme template">

    <!-- Title Page-->
    <title>Home</title>

<jsp:include page="css.jsp"/>
</head>
<body class="animsition">
<div class="page-wrapper">
<jsp:include page="header.jsp"/>
<%--<jsp:include page="sidebar.jsp"/>--%>
    <!-- PAGE CONTAINER-->
    <div class="page-container2">
        <jsp:include page="header2.jsp"/>
        <!-- MAIN CONTENT-->
        <jsp:include page="sidebar.jsp"/>
        <div class="main-content">
            <div class="section__content section__content--p30">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-md-12">
                            <%--<div class="overview-wrap">--%>
                                <%--<h2 class="title-1">overview</h2>--%>

                            <%--</div>--%>
                        </div>
                    </div>
                    <div class="row m-t-25">
                        <div class="col-sm-6 col-lg-3">
                            <div class="overview-item overview-item--c1">
                                <div class="overview__inner">
                                    <div class="overview-box clearfix">
                                        <div class="icon">
                                            <i class="zmdi zmdi-account-o"></i>
                                        </div>
                                        <div class="text">
                                            <h2>13</h2>
                                            <span>Пользователи</span>
                                        </div>
                                    </div>
                                    <div class="overview-chart">
                                        <canvas id="widgetChart1"></canvas>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="col-sm-6 col-lg-3">
                            <div class="overview-item overview-item--c3">
                                <div class="overview__inner">
                                    <div class="overview-box clearfix">
                                        <div class="icon">
                                            <i class="zmdi zmdi-calendar-note"></i>
                                        </div>
                                        <div class="text">
                                            <h2>216</h2>
                                            <span>Всех записей</span>
                                        </div>
                                    </div>
                                    <div class="overview-chart">
                                        <canvas id="widgetChart3"></canvas>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                    <div class="col-lg-6">
                        <div class="au-card au-card--no-shadow au-card--no-pad m-b-40 au-card--border">
                            <div class="au-card-title" style="background-image:url('images/bg-title-02.jpg');">
                                <div class="bg-overlay bg-overlay--blue"></div>
                                <h3>
                                    <i class="zmdi zmdi-comment-text"></i>Chat</h3>
                                <button class="au-btn-plus">
                                    <i class="zmdi zmdi-plus"></i>
                                </button>
                            </div>
                            <div class="au-inbox-wrap">
                                <div class="au-chat au-chat--border">
                                    <div class="au-chat__title">
                                        <div class="au-chat-info">
                                            <div class="avatar-wrap online">
                                                <div class="avatar avatar--small">
                                                    <img src="images/icon/avatar-02.jpg" alt="John Smith">
                                                </div>
                                            </div>
                                            <span class="nick">
                                                                <a href="#">John Smith</a>
                                                            </span>
                                        </div>
                                    </div>
                                    <div class="au-chat__content au-chat__content2 js-scrollbar5">
                                        <div class="recei-mess-wrap">
                                            <span class="mess-time">12 Min ago</span>
                                            <div class="recei-mess__inner">
                                                <div class="avatar avatar--tiny">
                                                    <img src="images/icon/avatar-02.jpg" alt="John Smith">
                                                </div>
                                                <div class="recei-mess-list">
                                                    <div class="recei-mess">Lorem ipsum dolor sit amet elit</div>
                                                    <div class="recei-mess">Donec tempor viverra</div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="send-mess-wrap">
                                            <span class="mess-time">30 Sec ago</span>
                                            <div class="send-mess__inner">
                                                <div class="send-mess-list">
                                                    <div class="send-mess">Lorem ipsum dolor sit amet elit</div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="au-chat-textfield">
                                        <form class="au-form-icon">
                                            <input class="au-input au-input--full au-input--h65" type="text" placeholder="Type a message">
                                            <button class="au-input-icon">
                                                <i class="zmdi zmdi-camera"></i>
                                            </button>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>


                <div class="row">
                        <div class="col-md-12">
                            <div class="copyright">
                                <p>Copyright © 2018 WebeSecurity</p>
                            </div>
                        </div>
                    </div>


                </div>
            </div>
        </div>
        <!-- END MAIN CONTENT-->
        <!-- END PAGE CONTAINER-->
    </div>

</div>
<jsp:include page="js.jsp"/>
</body>
</html>
<!-- end document-->
