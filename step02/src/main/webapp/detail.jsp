<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
   div>div>span{
      display: inline-block;
      width: 150px;
      background-color: yellow;
   }
</style>

</head>
<body>
   <h1>상세 페이지</h1>
   <div>
      <div><span>사번${bean.sabun }</span></div>
      <div><span>이름${bean.name }</span></div>
      <div><span>날짜${bean.nalja }</span></div>
      <div><span>금액${bean.pay }</span></div>
      <div>
      <a href="edit.action?sabun=${bean.sabun }">수정</a>
      <a href="del.action?sabun=${bean.sabun }">삭제</a>
      </div>
   </div>
</body>
</html>