<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="http://desktop-0ubpo2n:8080/BookStore/">
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title></title>
	<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
	<link rel="stylesheet" href="http://desktop-0ubpo2n:8080/BookStore/assets/materialize/css/materialize.min.css" media="screen,projection" />
    <!-- Bootstrap Styles-->
    <link href="http://desktop-0ubpo2n:8080/BookStore/assets/css/bootstrap.css" rel="stylesheet" />
    <!-- FontAwesome Styles-->
    <link href="http://desktop-0ubpo2n:8080/BookStore/assets/css/font-awesome.css" rel="stylesheet" />
    <!-- Morris Chart Styles-->
    <link href="http://desktop-0ubpo2n:8080/BookStore/assets/js/morris/morris-0.4.3.min.css" rel="stylesheet" />
    <!-- Custom Styles-->
    <link href="http://desktop-0ubpo2n:8080/BookStore/assets/css/custom-styles.css" rel="stylesheet" />
    <!-- Google Fonts-->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
    <link rel="stylesheet" href="http://desktop-0ubpo2n:8080/BookStore/assets/js/Lightweight-Chart/cssCharts.css"> 
  </head>
  
  <body>
  <div id="wrapper">
        <nav class="navbar navbar-default top-navbar" role="navigation">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle waves-effect waves-dark" data-toggle="collapse" data-target=".sidebar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand waves-effect waves-dark" href="index.jsp"><i class="large material-icons">insert_chart</i> <strong>后台</strong></a>
				
		<div id="sideNav" href=""><i class="material-icons dp48">toc</i></div>
            </div>
		<!-- Dropdown Structure -->
<ul id="dropdown1" class="dropdown-content">
<li><a href="login.html"><i class="fa fa-sign-out fa-fw"></i>登出</a>
</li>
</ul>
        <!-- /. NAV SIDE  -->
		<div id="page-wrapper">
		  <form id="form1" name="form1" method="post" action="servlet/BookTypeUpdateListSelvert?id1=${b.bookTypeId}&flag3=List3">
		  <p>
		  <input type="submit" name="button" id="button" value="确定" />
					</p>
					<table width="100%" border="1" align="center" cellpadding="0"
						cellspacing="0" bgcolor="#E7E7E7">
						<tr>
							<td   align="right" class="txt"><span
								class="txt">图书ID：</span></td>
							<td height="30" align="left"><label for="textfield"></label>
								<input height="20" width="400" type="text" name="bookTypeId"
								id="textfield" value="${b.bookTypeId}" disabled="true"/></td>
						</tr>
						<tr>
							<td width="24%"  align="right" class="txt"><span
								class="txt">图书种类：</span></td>
							<td height="30" align="left"><input height="20" width="400"
								type="text" name="bookTypeName" id="textfield3"  value="${b.bookTypeName}"/></td>
						</tr>
					</table>
					
				</form>
                </div>
				<footer><p>Copyright &copy; 2018.Company name All rights reserved.</p>
				</footer>
            </div>
            <!-- /. PAGE INNER  -->
        </div>
        <!-- /. PAGE WRAPPER  -->
    </div>
    <!-- /. WRAPPER  -->
    <!-- JS Scripts-->
    <!-- jQuery Js -->
    <script src="assets/js/jquery-1.10.2.js"></script>
	<!-- Bootstrap Js -->
    <script src="assets/js/bootstrap.min.js"></script>
	<script src="assets/materialize/js/materialize.min.js"></script>
    <!-- Metis Menu Js -->
    <script src="assets/js/jquery.metisMenu.js"></script>
    <!-- Morris Chart Js -->
    <script src="assets/js/morris/raphael-2.1.0.min.js"></script>
    <script src="assets/js/morris/morris.js"></script>
	<script src="assets/js/easypiechart.js"></script>
	<script src="assets/js/easypiechart-data.js"></script>
	 <script src="assets/js/Lightweight-Chart/jquery.chart.js"></script>
    <!-- Custom Js -->
    <script src="assets/js/custom-scripts.js"></script> 
  </body>
</html>
