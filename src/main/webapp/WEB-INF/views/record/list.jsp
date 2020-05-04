<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="my" uri="http://lifemusic.com/tags"%>

<my:base-template title="HOME">
  <jsp:attribute name="head_area">
  <script>
    $(function () {
      $('#genres').selectpicker();
    })
  </script>
  </jsp:attribute>
  <jsp:attribute name="container_area">
          
    <form class="board-filter">
      <fieldset>
        <div class="form-group row">
          <div class="col-12 col-md-3 mb-2">
            <select id="genres" class="form-control" data-live-search="true">
              <optgroup label="Genres">
                <option>All Genre</option>
                <option>Pop</option>
                <option>Rock</option>
                <option>Electronic</option>
                <option>Classic</option>
                <option>Jazz</option>
              </optgroup>
            </select>
          </div>
          <div class="col-12 col-md-3 mb-2">
            <select name="search-filter" class="form-control">
              <option>Title</option>
              <option>Musician</option>
              <option>Writer</option>
            </select>
          </div>
          <div class="col-12 col-md-4 mb-2">
            <input type="text" name="keywords" id="keywords" class="form-control" placeholder="enter keywords..." />
          </div>
          <div class="col-12 col-md-2 mb-2">
            <button class="btn btn-primary btn-block" type="submit">Search</button>
          </div>
        </div>
      </fieldset>
    </form>
    <div class="board">
      <table class="table">
        <thead class="thead-light">
          <tr>
            <th>#</th>
            <th>Rate</th>
            <th>Title</th>
            <th>Musician</th>
            <th class="d-none d-md-table-cell">Release</th>
            <th>Writer</th>
            <th class="d-none d-md-table-cell">Created</th>
            <th>Views</th>
            <th>Like</th>
          </tr>
        </thead>
        <tbody>
        <c:forEach var="record" items="${ records }">
          <tr>
            <th class="text-center">${ record.id }</th>
            <td class="text-center">
            <!-- TODO: 평가(별) 로직 추가 필요 -->
             <!--  <i class="fa fa-star" aria-hidden="true"></i>
              <i class="fa fa-star" aria-hidden="true"></i>
              <i class="fa fa-star" aria-hidden="true"></i>
              <i class="fa fa-star" aria-hidden="true"></i>
              <i class="fa fa-star-o" aria-hidden="true"></i> -->
              <%-- ${ record.rate } --%>
            </td>
            <td>
              <a href="/record/detail?id=${ record.id }">${ record.name }</a>
            </td>
            <td>
              <!-- TODO: Musician Link 수정 요망 -->
              <a href="/musician/detail.html">${ record.musician.name }</a>
            </td>
            <td class="d-none d-md-table-cell">
              ${ record.releaseDate }
            </td>
            <td>
              <a href="/reviews/user.html">${ record.writer }</a>
            </td>
            <td class="d-none d-md-table-cell">
              ${ record.createdDateTime }
            </td>
            <td>
              <%-- ${ record.views } --%>
            </td>
            <td>
              ${ record.likeCount }
            </td>
          </tr>
        </c:forEach>
        </tbody>
      </table>
      <nav aria-label="Page navigation example">
        <ul class="pagination justify-content-center">
          <li class="page-item disabled">
            <a class="page-link" href="#" tabindex="-1">Previous</a>
          </li>
          <li class="page-item active"><a class="page-link" href="#">1</a></li>
          <li class="page-item"><a class="page-link" href="#">2</a></li>
          <li class="page-item"><a class="page-link" href="#">3</a></li>
          <li class="page-item"><span class="page-link">...</span></li>
          <li class="page-item"><a class="page-link" href="#">12</a></li>
          <li class="page-item">
            <a class="page-link" href="#">Next</a>
          </li>
        </ul>
      </nav>
    </div>
  
  </jsp:attribute>
</my:base-template>