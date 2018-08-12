<!-- HEADER MOBILE-->
<header class="header-mobile d-block d-lg-none">
    <div class="header-mobile__bar">
        <div class="container-fluid">
            <div class="header-mobile-inner">
                <a class="logo" href="${pageContext.request.contextPath}/index">
                    <img src="images/icon/logo.png" width="50%" alt="WebSecurity" />
                </a>
                <button class="hamburger hamburger--slider" type="button">
                            <span class="hamburger-box">
                                <span class="hamburger-inner"></span>
                            </span>
                </button>
            </div>
        </div>
    </div>
    <nav class="navbar-mobile">
        <div class="container-fluid">
            <ul class="navbar-mobile__list list-unstyled">
                <li class="has-sub">
                    <a class="js-arrow" href="#">
                        <i class="fas fa-tachometer-alt"></i>Home</a>
                    <ul class="navbar-mobile-sub__list list-unstyled js-sub-list">
                    </ul>
                </li>
                <%--<li>--%>
                    <%--<a href="table.html">--%>
                        <%--<i class="fas fa-table"></i>Tables</a>--%>
                <%--</li>--%>
                <li class="has-sub">
                    <a class="js-arrow" href="#">
                        <i class="fas fa-copy"></i>Pages</a>
                    <ul class="navbar-mobile-sub__list list-unstyled js-sub-list">
                        <li>
                            <a href="${pageContext.request.contextPath}/login">Login</a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/register">Register</a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/forget">Forget Password</a>
                        </li>
                    </ul>
                </li>
            </ul>
        </div>
    </nav>
</header>
<!-- END HEADER MOBILE-->