<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>



<c:forEach items="${userList}" var="user">
	<tr class="odd test" data-userid="${user.userid }" >
		<td>${user.userid}</td>
		<td>${user.usernm}</td>
		<td>${user.alias}</td>
		<td>${user.pass}</td>
	</tr>
</c:forEach>

####################

<li class="paginate_button previous disabled" aria-controls="example" tabindex="0" id="example_previous">
	<a href="javascript:pagingUserAjax(1,${pageVo.pageSize });">&lt;&lt;</a></li>

<c:forEach begin="1" end="${pagination}" var="i">
	<c:choose>
		<c:when test="${pageVo.page == i}">
			<li class="paginate_button active" aria-controls="example" tabindex="0">
			<span>${i}</span></li>
<%-- 			<a href="#">${i}</a></li> --%>
		</c:when>
		<c:otherwise>
			<li class="paginate_button " aria-controls="example" tabindex="0">
				<a href="javascript:pagingUserAjax(${i }, ${pageVo.pageSize});">${i }</a></li>
		</c:otherwise>
	</c:choose>

</c:forEach>

<li class="paginate_button next" aria-controls="example" tabindex="0" id="example_next">
	<a href="javascript:pagingUserAjax(${i }, ${pageVo.pageSize});">&gt;&gt;</a></li>
	
	