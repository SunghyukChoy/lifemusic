<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="my" uri="http://lifemusic.com/tags"%>

<my:base-template title="Login">
  <jsp:attribute name="head_area">
  </jsp:attribute>
  <jsp:attribute name="container_area">
    <form:form id="login-form" action="/login" modelAttribute="loginModel">
      <form:input path="id" />
      <br />
      <form:password path="password" />
      <br />
      <form:hidden path="redirectUrl" />
      <button type="submit">로그인</button>
    </form:form>
  </jsp:attribute>
</my:base-template>