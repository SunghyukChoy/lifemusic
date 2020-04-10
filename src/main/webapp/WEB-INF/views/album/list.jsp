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
            <select class="form-control">
              <option>Title</option>
              <option>Artist</option>
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
            <th>Artist</th>
            <th class="d-none d-md-table-cell">Release</th>
            <th>Writer</th>
            <th class="d-none d-md-table-cell">Created</th>
            <th>Like</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <th class="text-center">1</th>
            <td class="text-center">
              <i class="fa fa-star" aria-hidden="true"></i>
              <i class="fa fa-star" aria-hidden="true"></i>
              <i class="fa fa-star" aria-hidden="true"></i>
              <i class="fa fa-star" aria-hidden="true"></i>
              <i class="fa fa-star-o" aria-hidden="true"></i>
            </td>
            <td>
              <a href="/record/detail.html">NCT #127 Neo Zone</a>
            </td>
            <td>
              <a href="/artist/detail.html">NCT 127</a>
            </td>
            <td class="d-none d-md-table-cell">
              2019-12-23
            </td>
            <td>
              <a href="/reviews/user.html">Choi</a>
            </td>
            <td class="d-none d-md-table-cell">
              2020-04-07
            </td>
            <td>123</td>
          </tr>
          <tr>
            <th>2</th>
            <td class="text-center">
              <i class="fa fa-star" aria-hidden="true"></i>
              <i class="fa fa-star" aria-hidden="true"></i>
              <i class="fa fa-star" aria-hidden="true"></i>
              <i class="fa fa-star-o" aria-hidden="true"></i>
              <i class="fa fa-star-o" aria-hidden="true"></i>
            </td>
            <td>
              <a href="/record/detail.html">IT'z Me</a>
            </td>
            <td>
              <a href="/artist/detail.html">ITZY</a>
            </td>
            <td class="d-none d-md-table-cell">
              2019-11-11
            </td>
            <td>
              <a href="/reviews/user.html">Choi</a>
            </td>
            <td class="d-none d-md-table-cell">
              2020-04-07
            </td>
            <td>12</td>
          </tr>
          </tr>
          <tr>
            <th>3</th>
            <td class="text-center">
              <i class="fa fa-star" aria-hidden="true"></i>
              <i class="fa fa-star" aria-hidden="true"></i>
              <i class="fa fa-star" aria-hidden="true"></i>
              <i class="fa fa-star-half-o" aria-hidden="true"></i>
              <i class="fa fa-star-o" aria-hidden="true"></i>
            </td>
            <td>
              <a href="/record/detail.html">OOO</a>
            </td>
            <td>
              <a href="/artist/detail.html">안예은</a>
            </td>
            <td class="d-none d-md-table-cell">
              2019-12-23
            </td>
            <td>
              <a href="/reviews/user.html">Choi</a>
            </td>
            <td class="d-none d-md-table-cell">
              2020-04-07
            </td>
            <td>222</td>
          </tr>
          <tr>
            <th>4</th>
            <td class="text-center">
              <i class="fa fa-star" aria-hidden="true"></i>
              <i class="fa fa-star" aria-hidden="true"></i>
              <i class="fa fa-star" aria-hidden="true"></i>
              <i class="fa fa-star" aria-hidden="true"></i>
              <i class="fa fa-star" aria-hidden="true"></i>
            </td>
            <td>
              <a href="/record/detail.html">Is Anybody Out There?</a>
            </td>
            <td>
              <a href="/artist/detail.html">DPR LIVE</a>
            </td>
            <td class="d-none d-md-table-cell">
              2019-12-23
            </td>
            <td>
              <a href="/reviews/user.html">Kim</a>
            </td>
            <td class="d-none d-md-table-cell">
              2020-04-07
            </td>
            <td>77</td>
          </tr>
          <tr>
            <th>5</th>
            <td class="text-center">
              <i class="fa fa-star" aria-hidden="true"></i>
              <i class="fa fa-star" aria-hidden="true"></i>
              <i class="fa fa-star-o" aria-hidden="true"></i>
              <i class="fa fa-star-o" aria-hidden="true"></i>
              <i class="fa fa-star-o" aria-hidden="true"></i>
            </td>
            <td>
              <a href="/record/detail.html">Connected</a>
            </td>
            <td>
              <a href="/artist/detail.html">권순관</a>
            </td>
            <td class="d-none d-md-table-cell">
              2019-12-23
            </td>
            <td>
              <a href="/reviews/user.html">Choi</a>
            </td>
            <td class="d-none d-md-table-cell">
              2020-04-07
            </td>
            <td>88</td>
          </tr>
          <tr>
            <th>6</th>
            <td class="text-center">
              <i class="fa fa-star" aria-hidden="true"></i>
              <i class="fa fa-star" aria-hidden="true"></i>
              <i class="fa fa-star" aria-hidden="true"></i>
              <i class="fa fa-star" aria-hidden="true"></i>
              <i class="fa fa-star-o" aria-hidden="true"></i>
            </td>
            <td>
              <a href="/record/detail.html">화분</a>
            </td>
            <td>
              <a href="/artist/detail.html">세정</a>
            </td>
            <td class="d-none d-md-table-cell">
              2019-12-23
            </td>
            <td>
              <a href="/reviews/user.html">Martin</a>
            </td>
            <td class="d-none d-md-table-cell">
              2020-04-07
            </td>
            <td>123</td>
          </tr>
          <tr>
            <th>7</th>
            <td class="text-center">
              <i class="fa fa-star" aria-hidden="true"></i>
              <i class="fa fa-star" aria-hidden="true"></i>
              <i class="fa fa-star" aria-hidden="true"></i>
              <i class="fa fa-star" aria-hidden="true"></i>
              <i class="fa fa-star-o" aria-hidden="true"></i>
            </td>
            <td>
              <a href="/record/detail.html">선택받은 소년 : The Chosen One</a>
            </td>
            <td>
              <a href="/artist/detail.html">Uneducated Kid</a>
            </td>
            <td class="d-none d-md-table-cell">
              2019-12-23
            </td>
            <td>
              <a href="/reviews/user.html">Seon</a>
            </td>
            <td class="d-none d-md-table-cell">
              2020-04-07
            </td>
            <td>123</td>
          </tr>
          <tr>
            <th>8</th>
            <td class="text-center">
              <i class="fa fa-star" aria-hidden="true"></i>
              <i class="fa fa-star" aria-hidden="true"></i>
              <i class="fa fa-star" aria-hidden="true"></i>
              <i class="fa fa-star-half-o" aria-hidden="true"></i>
              <i class="fa fa-star-o" aria-hidden="true"></i>
            </td>
            <td>
              <a href="/record/detail.html">Sound and Vision</a>
            </td>
            <td>
              <a href="/artist/detail.html">Ten to Ten</a>
            </td>
            <td class="d-none d-md-table-cell">
              2019-12-23
            </td>
            <td>
              <a href="/reviews/user.html">Choi</a>
            </td>
            <td class="d-none d-md-table-cell">
              2020-04-07
            </td>
            <td>123</td>
          </tr>
          <tr>
            <th>9</th>
            <td class="text-center">
              <i class="fa fa-star" aria-hidden="true"></i>
              <i class="fa fa-star" aria-hidden="true"></i>
              <i class="fa fa-star" aria-hidden="true"></i>
              <i class="fa fa-star" aria-hidden="true"></i>
              <i class="fa fa-star-o" aria-hidden="true"></i>
            </td>
            <td>
              <a href="/record/detail.html">오방神과</a>
            </td>
            <td>
              <a href="/artist/detail.html">오방신과(OBSG)</a>
            </td>
            <td class="d-none d-md-table-cell">
              2019-12-23
            </td>
            <td>
              <a href="/reviews/user.html">hyunmui</a>
            </td>
            <td class="d-none d-md-table-cell">
              2020-04-07
            </td>
            <td>123</td>
          </tr>
          <tr>
            <th>10</th>
            <td class="text-center">
              <i class="fa fa-star" aria-hidden="true"></i>
              <i class="fa fa-star" aria-hidden="true"></i>
              <i class="fa fa-star" aria-hidden="true"></i>
              <i class="fa fa-star" aria-hidden="true"></i>
              <i class="fa fa-star" aria-hidden="true"></i>
            </td>
            <td>
              <a href="/record/detail.html">回:Labyrinth</a>
            </td>
            <td>
              <a href="/artist/detail.html">여자친구(GFriend)</a>
            </td>
            <td class="d-none d-md-table-cell">
              2019-12-23
            </td>
            <td>
              <a href="/reviews/user.html">Choi</a>
            </td>
            <td class="d-none d-md-table-cell">
              2020-04-07
            </td>
            <td>9999</td>
          </tr>
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