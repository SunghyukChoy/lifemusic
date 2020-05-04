<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="my" uri="http://lifemusic.com/tags"%>

<my:base-template title="Login">
  <jsp:attribute name="head_area">
    <link rel="stylesheet" type="text/css" media="screen" href="/css/signin.css" />
  </jsp:attribute>
  <jsp:attribute name="container_area">
    <form:form id="login-form" name="login-form" class="form-signin" modelAttribute="loginModel">
      <img class="mb-4" src="/images/favicon/android-icon-72x72.png" alt="" width="72" height="72" />
      <h1 class="h3 mb-3 font-weight-normal">Please sign in</h1>
      <label for="inputId" class="sr-only">ID</label>
      <form:input path="memberId" cssClass="form-control" />
      <label for="inputPassword" class="sr-only">Password</label>
      <form:password path="password" cssClass="form-control" />
      <div class="checkbox mb-3">
        <label>
          <input type="checkbox" value="remember-me" /> Remember me
        </label>
      </div>
      <form:hidden path="redirectUrl" />
      <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
      <p class="mt-5 mb-3 text-muted">&copy; 2020</p>
    </form:form>
  </jsp:attribute>
</my:base-template>