<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="my" uri="http://lifemusic.com/tags"%>

<my:base-template title="Login">
  <jsp:attribute name="head_area">
    <link rel="stylesheet" type="text/css" media="screen" href="/css/signin.css" />
  </jsp:attribute>
  <jsp:attribute name="container_area">
    <form:form id="login-form" action="/login" modelAttribute="loginModel" class="form-signin">
      <img class="mb-4" src="/images/favicon/android-icon-72x72.png" alt="" width="72" height="72" />
      <h1 class="h3 mb-3 font-weight-normal">Please sign in</h1>
      <label for="inputId" class="sr-only">ID</label>
      <input type="text" id="inputId" class="form-control" placeholder="ID" required autofocus />
<label for="inputPassword" class="sr-only">Password</label>
      <input type="password" id="inputPassword" class="form-control" placeholder="Password" required />
      <div class="checkbox mb-3">
        <label>
          <input type="checkbox" value="remember-me" /> Remember me
        </label>
      </div>
      <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
      <p class="mt-5 mb-3 text-muted">&copy; 2020</p>
    </form:form>
  </jsp:attribute>
</my:base-template>