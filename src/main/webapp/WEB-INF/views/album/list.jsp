<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="my" uri="http://lifemusic.com/tags"%>

<my:base-template title="앨범 정보">
	<jsp:attribute name="head_area">
		<script></script>
	</jsp:attribute>
	<jsp:attribute name="container_area">
		<!-- 테이블 -->
		<table class="album_list">
			<!-- 테이블 헤더 -->
			<thead>
				<tr>
					<th>No</th>
					<th>Cover</th>
					<th>Album Title</th>
					<th>Artist</th>
					<th>Released Date</th>
					<th>Writer</th>
				</tr>
			</thead>
			<!-- 테이블 헤더 끝 -->
			<!-- 테이블 바디 -->
			<tbody>
				<tr>
					<td class="empty_line" colspan="6">&nbsp;</td>
				</tr>
				<c:forEach var="album" items="${ albums }">
					<tr>
						<td class="">${ album.id }</td>
						<td><a href="#"><img src="${album.imgURL }" alt="cover"></a></td>
						<td><a href="#">${ album.name }</a></td>
						<td><a href="#">${ album.artist }</a></td>
						<td>${ album.releasedDate }</td>
						<td>${ album.writer }</td>
					</tr>
				</c:forEach>
			</tbody>
			<!-- 테이블 바디 끝 -->
		</table>
		<!-- 테이블 끝 -->
		<!-- 검색 도구 -->
		<div class="search-tool">
			<select name="search-filter" id="selFilterOption">
				<option value="artist">Artist</option>
				<option value="title">Title</option>
			</select> <input type="text" name="search-box" placeholder="검색어 입력" id="txtKeyword">
			<input type="submit" value="검색">
		</div>
	</jsp:attribute>
</my:base-template>