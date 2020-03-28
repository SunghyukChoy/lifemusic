<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="my" uri="http://lifemusic.com/tags"%>

<my:base-template title="앨범 정보">
	<jsp:attribute name="head_area">
		
	</jsp:attribute>
	<jsp:attribute name="container_area">
		<div>${ album.id }</div>
		<div>${ album.imgURL }</div>
		<div>${ album.name }</div>
		<div>${ album.artist }</div>
		<div>${ album.releaseDate }</div>
		<div>${ album.writer }</div>
	</jsp:attribute>
</my:base-template>