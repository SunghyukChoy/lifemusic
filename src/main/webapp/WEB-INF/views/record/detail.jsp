<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="my" uri="http://lifemusic.com/tags"%>

<my:base-template title="Albums">
  <jsp:attribute name="head_area">
    <script>
    /* Active Show More / Close Button */
    const closeText = 'Close';
    const closeBs4ButtonClass = 'btn-secondary';
    const showMoreText = 'Show More';
    const showMoreBs4ButtonClass = 'btn-success'

    $(function () {
      $('.review-show-more.collapse')
        .on('show.bs.collapse', function () {
          changeShowMoreButton($(this).prop('id'), closeText);
        }).on('hide.bs.collapse', function () {
          changeShowMoreButton($(this).prop('id'), showMoreText);
        })
    })

    function changeShowMoreButton(hiddenAreaId, buttonText) {
      let $button = $('button[data-target="#' + hiddenAreaId + '"');
      $button.text(buttonText);

      if (buttonText === closeText) {
        $button.removeClass(showMoreBs4ButtonClass);
        $button.addClass(closeBs4ButtonClass);
      } else {
        $button.removeClass(closeBs4ButtonClass);
        $button.addClass(showMoreBs4ButtonClass);
      }
    }

  </script>
  </jsp:attribute>
  <jsp:attribute name="container_area">
    <div id="record-info">
      <div class="record-info d-flex row">
        <div class="col-auto">
          <img class="record-jacket rounded img-thumbnail" src="/images/sample/albumcover14.jpg"
            alt="여자친구 - Time for us" />
        </div>
        <div class="col-12 col-md-7">
          <ul class="list-unstyled">
            <li class="row pt-2">
              <label class="col-md-4">Title</label>
              <div class="col-md-8 record-info-item">
                <span>Time for us</span>
              </div>
            </li>
            <li class="row pt-2">
              <label class="col-md-4">Artist</label>
              <div class="col-md-8 record-info-item">
                <a href="/artist/detail.html">여자친구(Gfriend)</a>
              </div>
            </li>
            <li class="row pt-2">
              <label class="col-md-4">Genres</label>
              <div class="col-md-8 record-info-item">
                <a href="#">Pop</a>,
                <a href="#">R&B</a>,
                <a href="#">Dance</a>,
                <a href="#">Mixed</a>
              </div>
            </li>
            <li class="row pt-2">
              <label class="col-md-4">Release Date</label>
              <div class="col-md-8 record-info-item">
                <span>2019-01-04</span>
              </div>
            </li>
            <li class="row pt-2">
              <label class="col-md-4">총 재생 시간</label>
              <div class="col-md-8 record-info-item">
                <span>46:10</span>
              </div>
            </li>
            <li class="row pt-2">
              <label class="col-md-4">녹음</label>
              <div class="col-md-8 record-info-item">
                <span>쏘스뮤직</span>
              </div>
            </li>
            <li class="row pt-2">
              <label class="col-md-4">레이블</label>
              <div class="col-md-8 record-info-item">
                <span>카카오M</span>
              </div>
            </li>
            <li class="row pt-2">
              <label class="col-md-4">음반코드</label>
              <div class="col-md-8 record-info-item">
                <p>L200001694 (Daybreak 버전)</p>
                <p>L200001695 (Daytime 버전)</p>
                <p>L200001696 (Midnight 버전)</p>
                <p>L200001709 (한정반)</p>
              </div>
            </li>
          </ul>
        </div>
      </div>
      <div class="row">
        <div class="offset-4 col-4 border-top pb-4 mt-4"></div>
      </div>
      <ul class="nav nav-tabs" role="tablist">
        <li class="nav-item">
          <a class="nav-link active" id="track-tab" data-toggle="tab" href="#track" role="tab" aria-controls="track"
            aria-selected="true">Track</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" id="review-tab" data-toggle="tab" href="#review" role="tab" aria-controls="review"
            aria-selected="false">Reviews</a>
        </li>
      </ul>
      <div class="tab-content">
        <div class="tab-pane fade show active" id="track" role="tabpanel" aria-labelledby="track-tab">
          <table class="table">
            <thead class="thead-light">
              <tr>
                <th>#</th>
                <th>Title</th>
                <th class="text-center d-none d-md-table-cell">Lyricist</th>
                <th class="text-center d-none d-md-table-cell">Composer</th>
                <th>Time</th>
                <th>Lyric</th>
              </tr>
            </thead>
            <tbody>
              <tr>
                <th>1</th>
                <td>해야 (Sunrise)</td>
                <td class="d-none d-md-table-cell">노주환</td>
                <td class="d-none d-md-table-cell">노주환, 이원종</td>
                <td class="text-center">3:37</td>
                <td class="text-center">
                  <button class="btn btn-success"><i class="fa fa-file-text" aria-hidden="true"></i></button>
                </td>
              </tr>
              <tr>
                <th>2</th>
                <td>You are not alone</td>
                <td class="d-none d-md-table-cell">이기, 용배</td>
                <td class="d-none d-md-table-cell">이기, 용배</td>
                <td class="text-center">3:33</td>
                <td class="text-center">
                  <button class="btn btn-success"><i class="fa fa-file-text" aria-hidden="true"></i></button>
                </td>
              </tr>
              <tr>
                <th>3</th>
                <td>기적을 넘어 (L.U.V.)</td>
                <td class="d-none d-md-table-cell">이스란</td>
                <td class="d-none d-md-table-cell">Darren Ellis Smith, Sean Michael Alexander</td>
                <td class="text-center">3:15</td>
                <td class="text-center">
                  <button class="btn btn-success"><i class="fa fa-file-text" aria-hidden="true"></i></button>
                </td>
              </tr>
              <tr>
                <th>4</th>
                <td>GLOW (만화경)</td>
                <td class="d-none d-md-table-cell">이미소</td>
                <td class="d-none d-md-table-cell">Daniel Sherman, Val Del Prete, Caroline Gustavsson</td>
                <td class="text-center">3:43</td>
                <td class="text-center">
                  <button class="btn btn-success"><i class="fa fa-file-text" aria-hidden="true"></i></button>
                </td>
              </tr>
              <tr>
                <th>5</th>
                <td>비밀 이야기 (Our Secret)</td>
                <td class="d-none d-md-table-cell">이스란</td>
                <td class="d-none d-md-table-cell">B.EYES</td>
                <td class="text-center">3:26</td>
                <td class="text-center">
                  <button class="btn btn-success"><i class="fa fa-file-text" aria-hidden="true"></i></button>
                </td>
              </tr>
              <tr>
                <th>6</th>
                <td>Only 1</td>
                <td class="d-none d-md-table-cell">이기, 용배</td>
                <td class="d-none d-md-table-cell">이기, 용배</td>
                <td class="text-center">3:10</td>
                <td class="text-center">
                  <button class="btn btn-success"><i class="fa fa-file-text" aria-hidden="true"></i></button>
                </td>
              </tr>
              <tr>
                <th>7</th>
                <td>Truly Love</td>
                <td class="d-none d-md-table-cell">림고, 웅킴</td>
                <td class="d-none d-md-table-cell">웅킴</td>
                <td class="text-center">3:40</td>
                <td class="text-center">
                  <button class="btn btn-success"><i class="fa fa-file-text" aria-hidden="true"></i></button>
                </td>
              </tr>
              <tr>
                <th>8</th>
                <td>보호색 (Show Up)</td>
                <td class="d-none d-md-table-cell">노주환</td>
                <td class="d-none d-md-table-cell">노주환, 이원종</td>
                <td class="text-center">3:31</td>
                <td class="text-center">
                  <button class="btn btn-success"><i class="fa fa-file-text" aria-hidden="true"></i></button>
                </td>
              </tr>
              <tr>
                <th>9</th>
                <td>겨울, 끝 (It’s You)</td>
                <td class="d-none d-md-table-cell">Miyao, JADE, 김아름</td>
                <td class="d-none d-md-table-cell">스페이스카우보이</td>
                <td class="text-center">4:02</td>
                <td class="text-center">
                  <button class="btn btn-success"><i class="fa fa-file-text" aria-hidden="true"></i></button>
                </td>
              </tr>
              <tr>
                <th>10</th>
                <td>A Starry Sky</td>
                <td class="d-none d-md-table-cell">손고은</td>
                <td class="d-none d-md-table-cell">손고은</td>
                <td class="text-center">3:12</td>
                <td class="text-center">
                  <button class="btn btn-success"><i class="fa fa-file-text" aria-hidden="true"></i></button>
                </td>
              </tr>
              <tr>
                <th>11</th>
                <td>Love Oh Love</td>
                <td class="d-none d-md-table-cell">제리, 감성자판기</td>
                <td class="d-none d-md-table-cell">Megatone, stereo14</td>
                <td class="text-center">3:22</td>
                <td class="text-center">
                  <button class="btn btn-success"><i class="fa fa-file-text" aria-hidden="true"></i></button>
                </td>
              </tr>
              <tr>
                <th>12</th>
                <td>Memoria (Korean Ver.)</td>
                <td class="d-none d-md-table-cell">노주환</td>
                <td class="d-none d-md-table-cell">Carlos K., JOE</td>
                <td class="text-center">4:09</td>
                <td class="text-center">
                  <button class="btn btn-success"><i class="fa fa-file-text" aria-hidden="true"></i></button>
                </td>
              </tr>
              <tr>
                <th>13</th>
                <td>해야 (Sunrise) (Inst.)</td>
                <td class="d-none d-md-table-cell">&nbsp;</td>
                <td class="d-none d-md-table-cell">노주환, 이원종</td>
                <td class="text-center">3:37</td>
                <td class="text-center">
                  <button class="btn btn-secondary disabled"><i class="fa fa-file-text" aria-hidden="true"></i></button>
                </td>
              </tr>
            </tbody>
          </table>
        </div>
        <div class="tab-pane fade" id="review" role="tabpanel" aria-labelledby="review-tab">
          <div class="review-main">
            <div class="review-post">
              <div class="review-header row">
                <div class="col-12 col-md-9">
                  <h2 class="review-post-title"><a href="#">The Greatest Albums</a></h2>
                  <p class="review-post-meta">January 1, 2020 by <a href="#">Choi</a></p>
                </div>
                <div class="col-12 col-md-3 d-flex justify-content-end">
                  <div class="btn-group mb-3" role="group" aria-label="Recommendation">
                    <button type="button" class="btn btn-primary review-updown">
                      <i class="fa fa-thumbs-up" aria-hidden="true"></i>
                      <p class="mb-0">123</p>
                    </button>
                    <button type="button" class="btn btn-outline-primary review-updown">
                      <i class="fa fa-thumbs-o-down" aria-hidden="true"></i>
                      <p class="mb-0">0</p>
                    </button>
                  </div>
                </div>
              </div>

              <div class="review-content review-content-cut">
                <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Ab at vero commodi explicabo similique
                  ipsum
                  voluptate, id, dignissimos animi fugit officia nulla cumque amet asperiores officiis, non error est
                  ad.
                </p>
                <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Ab at vero commodi explicabo similique
                  ipsum
                  voluptate, id, dignissimos animi fugit officia nulla cumque amet asperiores officiis, non error est
                  ad.
                </p>
                <div class="review-show-more collapse" id="review-more-001">
                  <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Ab at vero commodi explicabo similique
                    ipsum
                    voluptate, id, dignissimos animi fugit officia nulla cumque amet asperiores officiis, non error est
                    ad.
                  </p>
                  <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Ab at vero commodi explicabo similique
                    ipsum
                    voluptate, id, dignissimos animi fugit officia nulla cumque amet asperiores officiis, non error est
                    ad.
                  </p>
                </div>
                <button class="btn btn-block btn-success" data-toggle="collapse" data-target="#review-more-001"
                  aria-expanded="false" aria-controls="review-more-001">Show More</button>
              </div>
            </div><!-- /.review-post -->

            <div class="review-divider row">
              <div class="offset-3 col-3 divider-left"></div>
              <div class="col-3 divider-right"></div>
            </div>

            <div class="review-post">
              <div class="review-header row">
                <div class="col-12 col-md-9">
                  <h2 class="review-post-title"><a href="#">90년대 얼터너티브 락의 진면목</a></h2>
                  <p class="review-post-meta">October 12, 2019 by <a href="#">Seon</a></p>
                </div>
                <div class="col-12 col-md-3 d-flex justify-content-end">
                  <div class="btn-group mb-3" role="group" aria-label="Recommendation">
                    <button type="button" class="btn btn-primary review-updown">
                      <i class="fa fa-thumbs-up" aria-hidden="true"></i>
                      <p class="mb-0">123</p>
                    </button>
                    <button type="button" class="btn btn-outline-primary review-updown">
                      <i class="fa fa-thumbs-o-down" aria-hidden="true"></i>
                      <p class="mb-0">0</p>
                    </button>
                  </div>
                </div>
              </div>

              <div class="review-content review-content-cut">
                <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Ab at vero commodi explicabo similique
                  ipsum
                  voluptate, id, dignissimos animi fugit officia nulla cumque amet asperiores officiis, non error est
                  ad.
                </p>
                <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Ab at vero commodi explicabo similique
                  ipsum
                  voluptate, id, dignissimos animi fugit officia nulla cumque amet asperiores officiis, non error est
                  ad.
                </p>
                <div class="review-show-more collapse" id="review-more-002">
                  <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Ab at vero commodi explicabo similique
                    ipsum
                    voluptate, id, dignissimos animi fugit officia nulla cumque amet asperiores officiis, non error est
                    ad.
                  </p>
                  <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Ab at vero commodi explicabo similique
                    ipsum
                    voluptate, id, dignissimos animi fugit officia nulla cumque amet asperiores officiis, non error est
                    ad.
                  </p>
                </div>
                <button class="btn btn-block btn-success" data-toggle="collapse" data-target="#review-more-002"
                  aria-expanded="false" aria-controls="review-more-002">Show More</button>
              </div>
            </div><!-- /.review-post -->

            <div class="review-divider row">
              <div class="offset-3 col-3 divider-left"></div>
              <div class="col-3 divider-right"></div>
            </div>

            <div class="review-post">
              <div class="review-header row">
                <div class="col-12 col-md-9">
                  <h2 class="review-post-title"><a href="#">너의 생각을 뛰어넘는 상상 이상의 음악</a></h2>
                  <p class="review-post-meta">January 1, 2020 by <a href="#">Choi</a></p>
                </div>
                <div class="col-12 col-md-3 d-flex justify-content-end">
                  <div class="btn-group mb-3" role="group" aria-label="Recommendation">
                    <button type="button" class="btn btn-primary review-updown">
                      <i class="fa fa-thumbs-up" aria-hidden="true"></i>
                      <p class="mb-0">123</p>
                    </button>
                    <button type="button" class="btn btn-outline-primary review-updown">
                      <i class="fa fa-thumbs-o-down" aria-hidden="true"></i>
                      <p class="mb-0">0</p>
                    </button>
                  </div>
                </div>
              </div>

              <div class="review-content review-content-cut">
                <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Ab at vero commodi explicabo similique
                  ipsum
                  voluptate, id, dignissimos animi fugit officia nulla cumque amet asperiores officiis, non error est
                  ad.
                </p>
                <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Ab at vero commodi explicabo similique
                  ipsum
                  voluptate, id, dignissimos animi fugit officia nulla cumque amet asperiores officiis, non error est
                  ad.
                </p>
                <div class="review-show-more collapse" id="review-more-003">
                  <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Ab at vero commodi explicabo similique
                    ipsum
                    voluptate, id, dignissimos animi fugit officia nulla cumque amet asperiores officiis, non error est
                    ad.
                  </p>
                  <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Ab at vero commodi explicabo similique
                    ipsum
                    voluptate, id, dignissimos animi fugit officia nulla cumque amet asperiores officiis, non error est
                    ad.
                  </p>
                </div>
                <button class="btn btn-block btn-success" data-toggle="collapse" data-target="#review-more-003"
                  aria-expanded="false" aria-controls="review-more-003">Show More</button>
              </div>
            </div><!-- /.review-post -->
          </div><!-- /.review-main -->
        </div>
      </div>  
  </div>
  </jsp:attribute>
</my:base-template>