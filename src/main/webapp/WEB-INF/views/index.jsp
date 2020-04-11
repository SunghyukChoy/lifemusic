<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="my" uri="http://lifemusic.com/tags"%>

<my:base-template title="HOME">
	<jsp:attribute name="head_area">
		
	</jsp:attribute>
	<jsp:attribute name="container_area">
    <div class="top">
      <div id="main-carousel" class="carousel slide" data-ride="carousel">
        <ol class="carousel-indicators">
          <li data-target="#main-carousel" data-slide-to="0" class="active"></li>
          <li data-target="#main-carousel" data-slide-to="1" class=""></li>
          <li data-target="#main-carousel" data-slide-to="2" class=""></li>
        </ol>
        <div class="carousel-inner">
          <div class="carousel-item active">
            <svg class="bd-placeholder-img bd-placeholder-img-lg d-block w-100" width="800" height="400" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img" aria-label="Placeholder: First slide"><title>Placeholder</title><rect width="100%" height="100%" fill="#777"></rect><text x="50%" y="50%" fill="#555" dy=".3em">First slide</text></svg>
          </div>
          <div class="carousel-item">
            <svg class="bd-placeholder-img bd-placeholder-img-lg d-block w-100" width="800" height="400" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img" aria-label="Placeholder: Second slide"><title>Placeholder</title><rect width="100%" height="100%" fill="#666"></rect><text x="50%" y="50%" fill="#444" dy=".3em">Second slide</text></svg>
          </div>
          <div class="carousel-item">
            <svg class="bd-placeholder-img bd-placeholder-img-lg d-block w-100" width="800" height="400" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img" aria-label="Placeholder: Third slide"><title>Placeholder</title><rect width="100%" height="100%" fill="#555"></rect><text x="50%" y="50%" fill="#333" dy=".3em">Third slide</text></svg>
          </div>
        </div>
        <a class="carousel-control-prev" href="#main-carousel" role="button" data-slide="prev">
          <span class="carousel-control-prev-icon" aria-hidden="true"></span>
          <span class="sr-only">Previous</span>
        </a>
        <a class="carousel-control-next" href="#main-carousel" role="button" data-slide="next">
          <span class="carousel-control-next-icon" aria-hidden="true"></span>
          <span class="sr-only">Next</span>
        </a>
      </div>
      <div class="row">
        <div class="col-12">
          <h3 class="mb-4 pb-4 border-bottom font-italic font-weight-bold">Recent Released</h3>
        </div>
        <div class="col-md-6">
          <div
            class="row no-gutters border rounded overflow-hidden flex-md-row mb-4 shadow-sm h-md-250 position-relative">
            <div class="col p-4 d-flex flex-column position-static">
              <strong class="d-inline-block mb-2 text-primary">Domestics</strong>
              <h3 class="mb-0">Time For Us</h3>
              <div class="mb-1 text-muted">Jan 14</div>
              <p class="card-text mb-auto">여자친구</p>
              <a href="/record/detail.html" class="stretched-link">Show more..</a>
            </div>
            <div class="col-auto">
              <img class="bd-placeholder-img" src="/images/sample/albumcover14.jpg" alt="여자친구 - Time for us" />
            </div>
          </div>
        </div>
        <div class="col-md-6">
          <div
            class="row no-gutters border rounded overflow-hidden flex-md-row mb-4 shadow-sm h-md-250 position-relative">
            <div class="col p-4 d-flex flex-column position-static">
              <strong class="d-inline-block mb-2 text-success">Worlds</strong>
              <h3 class="mb-0">The 1975</h3>
              <div class="mb-1 text-muted">Oct 2</div>
              <p class="mb-auto">The 1975</p>
              <a href="/record/detail.html" class="stretched-link">Show more..</a>
            </div>
            <div class="col-auto">
              <img class="bd-placeholder-img" src="/images/sample/albumcover2.jpg"
                alt="The 1975 - The 1975 (album)" />
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="review-contents">
      <div class="row">
        <div class="col-md-8 review-main">
          <h3 class="pb-4 mb-4 font-italic border-bottom font-weight-bold">
            New Reviews
          </h3>

          <div class="review-post">
            <h2 class="review-post-title">
              <a href="#">The Greatest Albums</a>
            </h2>
            <p class="review-post-meta">January 1, 2020 by <a href="#">Choi</a></p>

            <div class="review-content-cut">
              <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Ab at vero commodi explicabo similique ipsum
                voluptate, id, dignissimos animi fugit officia nulla cumque amet asperiores officiis, non error est ad.
              </p>
              <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Ab at vero commodi explicabo similique ipsum
                voluptate, id, dignissimos animi fugit officia nulla cumque amet asperiores officiis, non error est ad.
              </p>
              <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Ab at...
              </p>
              <a href="#">MORE..</a>
            </div>
          </div><!-- /.review-post -->

          <div class="review-divider row">
            <div class="offset-3 col-3 divider-left"></div>
            <div class="col-3 divider-right"></div>
          </div>

          <div class="review-post">
            <h2 class="review-post-title"><a href="#">90년대 얼터너티브 락의 진면목</a></h2>
            <p class="review-post-meta">October 12, 2019 by <a href="#">Seon</a></p>

            <div class="review-content-cut">
              <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Ab at vero commodi explicabo similique ipsum
                voluptate, id, dignissimos animi fugit officia nulla cumque amet asperiores officiis, non error est ad.
              </p>
              <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Ab at vero commodi explicabo similique ipsum
                voluptate, id, dignissimos animi fugit officia nulla cumque amet asperiores officiis, non error est ad.
              </p>
              <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Ab at...
              </p>
              <a href="#">MORE..</a>
            </div>
          </div><!-- /.review-post -->

          <div class="review-divider row">
            <div class="offset-3 col-3 divider-left"></div>
            <div class="col-3 divider-right"></div>
          </div>

          <div class="review-post">
            <h2 class="review-post-title"><a href="#">너의 생각을 뛰어넘는 상상 이상의 음악</a></h2>
            <p class="review-post-meta">January 1, 2020 by <a href="#">Choi</a></p>

            <div class="review-content-cut">
              <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Ab at vero commodi explicabo similique ipsum
                voluptate, id, dignissimos animi fugit officia nulla cumque amet asperiores officiis, non error est ad.
              </p>
              <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Ab at vero commodi explicabo similique ipsum
                voluptate, id, dignissimos animi fugit officia nulla cumque amet asperiores officiis, non error est ad.
              </p>
              <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Ab at...
              </p>
              <a href="#">MORE..</a>
            </div>
          </div><!-- /.review-post -->
        </div><!-- /.review-main -->

        <aside class="col-md-4 blog-sidebar">
          <div class="p-4 mb-3 bg-light rounded">
            <h4 class="font-italic">About</h4>
            <p class="mb-0">
              Lorem ipsum dolor sit amet consectetur, adipisicing elit. Odit sapiente blanditiis veritatis repudiandae
              esse officiis omnis, cum amet labore accusantium modi. Quibusdam obcaecati ratione libero incidunt dolorem
              asperiores magni facere.
            </p>
          </div>

          <div class="p-4">
            <h4 class="font-italic">Popular - Domestic</h4>
            <table class="table popular-rank">
              <thead class="thead-light">
                <tr>
                  <th scope="col">#</th>
                  <th scope="col">Song / Artist</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <th scope="row">1</th>
                  <td>
                    <a href="#">
                      <h4>Blinding Lights</h4>
                      <h5>The Weeknd</h5>
                    </a>
                  </td>
                </tr>
                <tr>
                  <th scope="row">2</th>
                  <td>
                    <a href="#">
                      <h4>Blinding Lights</h4>
                      <h5>The Weeknd</h5>
                    </a>
                  </td>
                </tr>
                <tr>
                  <th scope="row">3</th>
                  <td>
                    <a href="#">
                      <h4>Don't Start Now</h4>
                      <h5>Dua Lipa</h5>
                    </a>
                  </td>
                </tr>
                <tr>
                  <th scope="row">4</th>
                  <td>
                    <a href="#">
                      <h4>Heartless</h4>
                      <h5>The Weeknd</h5>
                    </a>
                  </td>
                </tr>
                <tr>
                  <th scope="row">5</th>
                  <td>
                    <a href="#">
                      <h4>Circles</h4>
                      <h5>Post Malone</h5>
                    </a>
                  </td>
                </tr>
              </tbody>
            </table>
          </div>

          <div class="p-4">
            <h4 class="font-italic">Melon Domestic</h4>
            <table class="table popular-rank">
              <thead class="thead-light">
                <tr>
                  <th scope="col">#</th>
                  <th scope="col">Song / Artist</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <th scope="row">1</th>
                  <td>
                    <a href="#">
                      <h4>처음처럼</h4>
                      <h5>M.C the MAX</h5>
                    </a>
                  </td>
                </tr>
                <tr>
                  <th scope="row">2</th>
                  <td>
                    <a href="#">
                      <h4>시작</h4>
                      <h5>Gaho</h5>
                    </a>
                  </td>
                </tr>
                <tr>
                  <th scope="row">3</th>
                  <td>
                    <a href="#">
                      <h4>그때 그 아인</h4>
                      <h5>김필</h5>
                    </a>
                  </td>
                </tr>
                <tr>
                  <th scope="row">4</th>
                  <td>
                    <a href="#">
                      <h4>흔들리는 꽃들 속에서 네 ..</h4>
                      <h5>장범준</h5>
                    </a>
                  </td>
                </tr>
                <tr>
                  <th scope="row">5</th>
                  <td>
                    <a href="#">
                      <h4>아무노래</h4>
                      <h5>ZICO</h5>
                    </a>
                  </td>
                </tr>
              </tbody>
            </table>
          </div>
        </aside><!-- /.blog-sidebar -->

      </div>
    </div>
  
	</jsp:attribute>
</my:base-template>