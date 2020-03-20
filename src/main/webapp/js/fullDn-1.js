/* js/fullDn-1.js */

$(function() {
  
  //2차 메뉴 숨기기
  $('.sub').hide();

  //호버 기능으로 2차 메뉴 슬라이딩
  $('#gnb > li').hover(function() {
    $(this).find('.sub').slideDown(400);
  }, function() {
    $(this).find('.sub').slideUp(400);
  } );
});