<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Board</title>
  <link href="/css/base.css" type="text/css" rel="stylesheet"/>
  
  <script>

  </script>
  <style>
	/* ${pageName} */
    table.album_list {
      margin: 0 auto;
      border-collapse: collapse;
    }
	
	.album_list th {
		border-bottom: 1px solid #999;
	}
	
	.album_list td.empty_line {
		height: 20px !important;
	}
	
    .album_list th,
    .album_list td {
      height: 50px;
      width: 200px;
      text-align: center;
    }

    .search-tool {
      margin: 0 auto;
      width: 300px;
      height: 24px;
    }
    
    .album_list img {
    	width: 50px;
    	height: 50px;
    }
  </style>
</head>
<body>

<jsp:include page="../navbar.jsp"/>
<!-- 헤더 -->
  <div class="header">
    <h2>목록</h2>

  </div>
  <!-- 헤더 끝 -->

  <!-- 컨테이너 -->
  <div class="container">
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
          <td><a href="#"><img src="/imgs/sample/thestandin.jpg" alt="cover"></a></td>
          <td><a href="#">${ album.name }</a></td>
          <td><a href="#">Caitlin Rose</a></td>
          <td>2015.01.23</td>
          <td>Choi</td>
        </tr>
   		</c:forEach>
        <!-- <tr>
          <td class="">3</td>
          <td><a href="#"><img src="/imgs/sample/thestandin.jpg" alt="cover"></a></td>
          <td><a href="#">The Stand-in</a></td>
          <td><a href="#">Caitlin Rose</a></td>
          <td>2015.01.23</td>
          <td>Choi</td>
        </tr>
        <tr>
          <td>2</td>
          <td><a href="#"><img src="/imgs/sample/loveisdead.jpg" alt="cover"></a></td>
          <td><a href="#">Love is Dead</a></td>
          <td><a href="#">CHVRCHES</a></td>
          <td>2017.11.21</td>
          <td>Seon</td>
        </tr>
        <tr>
          <td>1</td>
          <td><a href="#"><img src="/imgs/sample/the1975.jpg" alt="cover"></a></td>
          <td><a href="#">The 1975</a></td>
          <td><a href="#">The 1975</a></td>
          <td>2016.02.01</td>
          <td>Kim</td>
        </tr> -->
      </tbody>
      <!-- 테이블 바디 끝 -->
    </table>
    <!-- 테이블 끝 -->
  </div>
  <!-- 컨테이너 끝 -->

  <!-- 푸터 -->
  <div class="footer">

    <!-- 검색 도구 -->
    <div class="search-tool">
      <select name="search-filter" id="selFilterOption">
        <option value="artist">Artist</option>
        <option value="title">Title</option>
      </select>
      <input type="text" name="search-box" placeholder="검색어 입력" id="txtKeyword">
      <input type="submit" value="검색">
    </div>
	
  </div>
  <!-- 푸터 끝 -->
</body>
</html>