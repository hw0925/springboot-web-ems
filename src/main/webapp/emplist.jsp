<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"
         contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set  var="path" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>emplist</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="${path}/css/style.css" />
</head>
<body>
<div id="wrap">
    <div id="top_content">
        <div id="header">
            <div id="rightheader">
                <p>
                    2009/11/20
                    <br />
                    安全退出
                </p>
            </div>
            <div id="topheader">
                <h1 id="title">
                    <a href="#">main</a>
                </h1>
            </div>
            <div id="navigation">
            </div>
        </div>
        <div id="content">
            <p id="whereami">
            </p>
            <h1>
                Welcome!
            </h1>
            <table class="table">
                <tr class="table_header">
                    <td>
                        ID
                    </td>
                    <td>
                        Name
                    </td>
                    <td>
                        Salary
                    </td>
                    <td>
                        Age
                    </td>

                    <td>
                        Operation
                    </td>
                </tr>

                <c:forEach items="${requestScope.allEmp}" var="emp" varStatus="vs">
                    <c:if test="${vs.count%2==0}">
                        <tr class="row1">

                            <td>${vs.count}</td>
                            <td>${emp.name}</td>
                            <td>${emp.salary}</td>
                            <td>${emp.age}</td>
                            <td>
                                <a href="${path}/emp/deleteEmp?id=${emp.id}">delete emp</a>&nbsp;
                                <a href="${path}/emp/getEmpById?id=${emp.id}">update emp</a>
                            </td>
                        </tr>
                    </c:if>



                    <c:if test="${vs.count%2==1}">
                        <tr class="row2">
                            <td>${vs.count}</td>
                            <td>${emp.name}</td>
                            <td>${emp.salary}</td>
                            <td>${emp.age}</td>
                            <td>
                                <a href="${path}/emp/deleteEmp?id=${emp.id}">delete emp</a>&nbsp;
                                <a href="${path}/emp/getEmpById?id=${emp.id}">update emp</a>
                            </td>
                        </tr>
                    </c:if>


               </c:forEach>
               <%-- <tr class="row1">
                    <td>
                        1
                    </td>
                    <td>
                        zhangshan
                    </td>
                    <td>
                        20000
                    </td>
                    <td>
                        20
                    </td>
                    <td>
                        <a href="emplist.html">delete emp</a>&nbsp;<a href="updateEmp.html">update emp</a>
                    </td>
                </tr>
                <tr class="row2">
                    <td>
                        2
                    </td>
                    <td>
                        lishi
                    </td>
                    <td>
                        20000
                    </td>
                    <td>
                        20
                    </td>
                    <td>
                        <a href="emplist.html">delete emp</a>&nbsp;<a href="updateEmp.html">update emp</a>
                    </td>
                </tr>--%>
            </table>
            <p>
                <input type="button" class="button" value="Add Employee" onclick="location='${path}/addEmp.jsp'"/>
            </p>
        </div>
        <a href="">1</a>
        <a href="">2</a>
        <a href="">3</a>
    </div>
    <div id="footer">
        <div id="footer_bg">
            ABC@126.com
        </div>
    </div>
</div>
</body>
</html>
