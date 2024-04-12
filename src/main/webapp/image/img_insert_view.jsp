<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이미지 등록</title>
<c:forEach var="arrayList" items="${arrayList}">
	<c:if test="${arrayList.img_number==param.img_number}">
		<script type="text/javascript">
			alert("입력하신 ${param.img_number}번의 이미지가 존재합니다. 다시 입력하세요.");
			location.href = "./ImgInsertView.im";
		</script>
	</c:if>
</c:forEach>
</head>
<body>
	<script type="text/javascript">
		alert("입력하신 ${imgDTO.img_number}번의 이미지 번호를 등록하였습니다.");
		location.href = "./ImgSelect.im";
	</script>
</body>
</html>