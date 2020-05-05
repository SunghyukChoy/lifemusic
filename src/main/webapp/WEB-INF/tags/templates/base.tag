<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sp" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<%@ attribute name="title"%>
<%@ attribute name="showBreadcrumb"%>
<%@ attribute name="head_area" fragment="true"%>
<%@ attribute name="container_area" fragment="true"%>

<!DOCTYPE html>
<html lang="ko">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>LIFEMUSIC - ${ title }</title>
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Meta -->
<link rel="manifest" href="/images/favicon/manifest.json">
<meta name="msapplication-TileColor" content="#ffffff">
<meta name="msapplication-TileImage" content="/images/favicon/ms-icon-144x144.png">
<meta name="theme-color" content="#ffffff">

<!-- Favicon : generated by https://www.favicon-generator.org/  -->
<link rel="apple-touch-icon" sizes="57x57" href="/images/favicon/apple-icon-57x57.png">
<link rel="apple-touch-icon" sizes="60x60" href="/images/favicon/apple-icon-60x60.png">
<link rel="apple-touch-icon" sizes="72x72" href="/images/favicon/apple-icon-72x72.png">
<link rel="apple-touch-icon" sizes="76x76" href="/images/favicon/apple-icon-76x76.png">
<link rel="apple-touch-icon" sizes="114x114" href="/images/favicon/apple-icon-114x114.png">
<link rel="apple-touch-icon" sizes="120x120" href="/images/favicon/apple-icon-120x120.png">
<link rel="apple-touch-icon" sizes="144x144" href="/images/favicon/apple-icon-144x144.png">
<link rel="apple-touch-icon" sizes="152x152" href="/images/favicon/apple-icon-152x152.png">
<link rel="apple-touch-icon" sizes="180x180" href="/images/favicon/apple-icon-180x180.png">
<link rel="icon" type="image/png" sizes="192x192" href="/images/favicon/android-icon-192x192.png">
<link rel="icon" type="image/png" sizes="32x32" href="/images/favicon/favicon-32x32.png">
<link rel="icon" type="image/png" sizes="96x96" href="/images/favicon/favicon-96x96.png">
<link rel="icon" type="image/png" sizes="16x16" href="/images/favicon/favicon-16x16.png">

<!-- Bootstrap 4 -->
<link rel="stylesheet" type="text/css" href="/lib/bootstrap/dist/css/bootstrap.min.css" />
<script src="/lib/jquery/dist/jquery.min.js"></script>
<script src="/lib/popper.js/dist/umd/popper.min.js"></script>
<script src="/lib/bootstrap/dist/js/bootstrap.min.js"></script>

<!-- Bootstrap-Select -->
<link rel="stylesheet" href="/lib/bootstrap-select/dist/css/bootstrap-select.min.css">
<script src="/lib/bootstrap-select/dist/js/bootstrap-select.min.js"></script>

<!-- Font-Awesome -->
<link rel="stylesheet" type="text/css" href="/lib/font-awesome/css/font-awesome.min.css" />

<!-- CSS -->
<link rel="stylesheet" type="text/css" media="screen" href="/css/main.css">

<!-- Javascript -->
<script src="/js/main.js"></script>

<jsp:invoke fragment="head_area" />
</head>

<body>
  <header class="container-fluid">
    <div class="row d-flex">
      <div class="col-2 navbar-light d-flex justify-content-center align-items-center d-md-none">
        <button id="mobile-menu-button" class="navbar-toggler" type="button" data-toggle="collapse"
          data-target="#menu-area" aria-controls="menu-area" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
      </div>
      <div class="offset-md-2 col-8 text-center">
        <a href="/"><img id="logo-header" src="/images/logo/logo-header.png" alt="LIFEMUSIC" /></a>
      </div>
      <div class="user-buttons text-uppercase"></div>
      <sec:authorize access="isAuthenticated()">
        <div>
          안녕하세요 <a href="/myinfo"> <sec:authentication property="details.userId" />
          </a> 님 | <a href="#" onclick="document.getElementById('logout').submit();"> 로그아웃 </a>
          <form id="logout" action="/member/logout" method="post">
            <input name="${_csrf.parameterName}" type="hidden" value="${_csrf.token}" />
          </form>
        </div>
      </sec:authorize>
      <sec:authorize access="!isAuthenticated()">
        <div>
          <a href="/member/login">로그인</a> | <a href="/member/register">회원가입</a>
        </div>
      </sec:authorize>
    </div>
    <!-- if not mobile, add class 'show' -->
    <div class="row justify-content-center collapse show" id="menu-area">
      <!-- desktop -->
      <ul class="nav justify-content-between w-50">
        <li class="nav-item dropdown"><a class="nav-link dropdown-toggle" id="menu-item-record"
          data-toggle="dropdown" data-display="static" aria-haspopup="true" href="#">Record</a>
          <div class="dropdown-menu" aria-labelledby="menu-item-record">
            <a class="dropdown-item" href="#">Single</a> <a class="dropdown-item" href="#">EP</a> <a
              class="dropdown-item" href="/album/list">Album</a>
          </div></li>
        <li class="nav-item"><a class="nav-link" href="/artist/list.html">Artist</a></li>
        <li class="nav-item dropdown"><a class="nav-link dropdown-toggle" id="menu-item-genre"
          data-toggle="dropdown" data-display="static" aria-haspopup="true" href="#">Genre</a>
          <div class="dropdown-menu" aria-labelledby="menu-item-genre">
            <a class="dropdown-item" href="/genre/pop.html">Pop</a> <a class="dropdown-item" href="#">Rock</a> <a
              class="dropdown-item" href="#">Hiphop</a> <a class="dropdown-item" href="#">Electronic</a> <a
              class="dropdown-item" href="#">Jazz</a> <a class="dropdown-item" href="#">Classic</a> <a
              class="dropdown-item" href="#">Blues</a>
          </div></li>
        <li class="nav-item dropdown"><a class="nav-link dropdown-toggle" id="menu-item-review"
          data-toggle="dropdown" data-display="static" aria-haspopup="true" href="#">Reviews</a>
          <div class="dropdown-menu" aria-labelledby="menu-item-review">
            <a class="dropdown-item" href="/review/records.html">Record</a> <a class="dropdown-item" href="#">Artist</a>
            <a class="dropdown-item" href="#">Song</a>
          </div></li>
        <li class="nav-item dropdown"><a class="nav-link dropdown-toggle" id="menu-item-about"
          data-toggle="dropdown" data-display="static" aria-haspopup="true" href="#">About</a>
          <div class="dropdown-menu" aria-labelledby="menu-item-review">
            <a class="dropdown-item" href="/about/me.html">Developer Info</a> <a class="dropdown-item"
              href="/about/contact-us.html">Contact Us</a>
          </div></li>
      </ul>
    </div>
  </header>
  <main role="main" class="container">
    <c:if test="${ showBreadcrumb }">
      <h2 class="font-italic font-weight-bold pl-md-3 text-uppercase">Time For Us</h2>
      <nav class="nav-breadcrumb" aria-label="breadcrumb">
        <ol class="breadcrumb bg-transparent">
          <li class="breadcrumb-item"><a href="/"><i class="fa fa-home" aria-hidden="true"></i> Home</a></li>
          <li class="breadcrumb-item"><a href="#">Record</a></li>
          <li class="breadcrumb-item active"><a href="/record/album.html">Album</a></li>
          <li class="breadcrumb-item active"><a href="/record/detail.html">Time For Us</a></li>
        </ol>
      </nav>
    </c:if>
    <!-- START: 실제 영역 -->
    <jsp:invoke fragment="container_area" />
    <!-- END: 실제 영역 -->
  </main>
  <footer id="doc-footer" class="container">
    <div>
      <p class="text-center">
        Powered By <a href="mailto:likeaglow@gmail.com" class="mailto">Sunghyuk.Choi</a>
      </p>
    </div>
  </footer>
</body>

</html>