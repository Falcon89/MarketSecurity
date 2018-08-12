<!-- MENU SIDEBAR-->
<aside class="menu-sidebar d-none d-lg-block">
    <div class="logo">
        <a href="#">
            <img src="images/icon/logo.png" width="68%" alt="Cool Admin" />
        </a>
    </div>
    <div class="menu-sidebar__content js-scrollbar1">
        <nav class="navbar-sidebar">
            <ul class="list-unstyled navbar__list">
                <li class="active has-sub">
                    <a class="js-arrow" href="#">
                        <i class="fas fa-tachometer-alt"></i>Home</a>
                    <ul class="list-unstyled navbar__sub-list js-sub-list">
                    </ul>
                </li>
                <%--<li>--%>
                    <%--<a href="table.html">--%>
                        <%--<i class="fas fa-table"></i>Tables</a>--%>
                <%--</li>--%>
                <li class="has-sub">
                    <a class="js-arrow" href="#">
                        <i class="fas fa-copy"></i>Pages</a>
                    <ul class="list-unstyled navbar__sub-list js-sub-list">
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
        </nav>
    </div>
</aside>
<!-- END MENU SIDEBAR-->