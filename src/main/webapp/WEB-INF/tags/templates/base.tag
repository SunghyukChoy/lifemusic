<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ attribute name="title" %>
<%@ attribute name="head_area" fragment="true" %>
<%@ attribute name="container_area" fragment="true" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>LIFE MUSIC - ${ title }</title>
<!-- CSS -->
<link href="/css/base.css" type="text/css" rel="stylesheet" />
<link href="/css/fullDnNav.css" type="text/css" rel="stylesheet" />

<!-- js plugins -->
<script src="http://code.jquery.com/jquery-1.12.4.min.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.4.1.min.js"></script>
<script type="text/javascript" src="/js/fullDn-1.js"></script>

<jsp:invoke fragment="head_area"/>
</head>
<body>
	<!-- 헤더 -->
	<header>
		<div id="headerWrap">
			<div id="head">
				<!-- 내비게이션 -->
				<ul id="gnb">
					<li class="nav1"><a href="#">메뉴1</a>
						<ul class="sub">
							<li><a href="#">메뉴1-1</a></li>
							<li><a href="#">메뉴1-2</a></li>
							<li><a href="#">메뉴1-3</a></li>
							<li><a href="#">메뉴1-4</a></li>
						</ul></li>
					<li class="nav2"><a href="#">메뉴2</a>
						<ul class="sub">
							<li><a href="#">메뉴2-1</a></li>
							<li><a href="#">메뉴2-2</a></li>
							<li><a href="#">메뉴2-3</a></li>
							<li><a href="#">메뉴2-4</a></li>
						</ul></li>
					<li class="nav3"><a href="#">메뉴3</a>
						<ul class="sub">
							<li><a href="#">메뉴3-1</a></li>
							<li><a href="#">메뉴3-2</a></li>
							<li><a href="#">메뉴3-3</a></li>
							<li><a href="#">메뉴3-4</a></li>
						</ul></li>
					<li class="nav4"><a href="#">메뉴4</a>
						<ul class="sub">
							<li><a href="#">메뉴4-1</a></li>
							<li><a href="#">메뉴4-2</a></li>
							<li><a href="#">메뉴4-3</a></li>
							<li><a href="#">메뉴4-4</a></li>
						</ul></li>
					<li class="nav5"><a href="#">메뉴5</a>
						<ul class="sub">
							<li><a href="#">메뉴5-1</a></li>
							<li><a href="#">메뉴5-2</a></li>
							<li><a href="#">메뉴5-3</a></li>
							<li><a href="#">메뉴5-4</a></li>
						</ul></li>
				</ul>
			</div>
		</div>
	</header>
	<!-- 헤더 끝 -->

	<!-- 컨테이너 -->
	<div class="container">
		<jsp:invoke fragment="container_area"/>
	</div>
	<!-- 컨테이너 끝 -->

	<!-- 푸터 -->
	<div class="footer">
		<div class="footer-title">Powered by Sunghyuk.Choi</div>
	</div>
	<!-- 푸터 끝 -->
</body>
</html>