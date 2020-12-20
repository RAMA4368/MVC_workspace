<%@page import="blood.model.BloodAdvisor"%>
<%@ page contentType="text/html;charset=utf-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<script>
function send(){
	var form =document.querySelector("form");
	form.action="/movie.do";
	form.method="post";
	form.submit();
}

</script>
</head>
<body>
	<form>
		<select name="movie">
			<option>영화를 선택하세요</option>
		<option value="신세계">신세계</option>
		<option value="도둑들">도둑들</option>
		<option value="범죄도시">범죄도시</option>
		<option value="다만악에서구하소서">다만악에서구하소서</option>
		</select>
		<button type="button" onClick="send()">분석보기</button>
	</form>
</body>
</html>