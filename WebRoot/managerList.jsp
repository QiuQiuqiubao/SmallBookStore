<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <base href="<%=basePath %>">
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title></title>
	<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
	<link rel="stylesheet" href="<%=basePath %>assets/materialize/css/materialize.min.css" media="screen,projection" />
    <!-- Bootstrap Styles-->
    <link href="<%=basePath %>assets/css/bootstrap.css" rel="stylesheet" />
    <!-- FontAwesome Styles-->
    <link href="<%=basePath %>assets/css/font-awesome.css" rel="stylesheet" />
    <!-- Morris Chart Styles-->
    <link href="<%=basePath %>assets/js/morris/morris-0.4.3.min.css" rel="stylesheet" />
    <!-- Custom Styles-->
    <link href="<%=basePath %>assets/css/custom-styles.css" rel="stylesheet" />
    <!-- Google Fonts-->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
    <link rel="stylesheet" href="<%=basePath %>assets/js/Lightweight-Chart/cssCharts.css"> 
</head>
<body>

<%
    if(session.getAttribute("adminname")!=null){
     %>
  <div id="wrapper">
        <nav class="navbar navbar-default top-navbar" role="navigation">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle waves-effect waves-dark" data-toggle="collapse" data-target=".sidebar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand waves-effect waves-dark" href="#"><i class="large material-icons">insert_chart</i> <strong>后台</strong></a>
				
		<div id="sideNav" href="#"><i class="material-icons dp48">toc</i></div>
            </div>

   <% 
         	String name=(String)session.getAttribute("adminname");	
         %>
            <ul class="nav navbar-top-links navbar-right"> 
				  <li><a class="dropdown-button waves-effect waves-dark" href="#!" data-activates="dropdown1"><i class="fa fa-user fa-fw"></i> <b><%=name %></b> <i class="material-icons right">arrow_drop_down</i></a></li>
            </ul>
            
        </nav>
        
		<!-- Dropdown Structure -->
<ul id="dropdown1" class="dropdown-content">
<li><a href="login.html"><i class="fa fa-sign-out fa-fw"></i>登出</a>
</li>
</ul>
	   <!--/. NAV TOP  -->
        <nav class="navbar-default navbar-side" role="navigation">
            <div class="sidebar-collapse">
                <ul class="nav" id="main-menu">
                    <li>
                        <a class="active-menu waves-effect waves-dark" href="index.html"><i class="material-icons dp48">perm_identity</i>账号管理<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                        <li>
                          <a href="servlet/ManagerListSelvert?flag1=List1" method="post">管理员账号管理</a>
                          </li>
                        <li>
                          <a href="servlet/CustomerListSelvert?flag2=List2" method="post">会员账号管理</a>
                          </li>
                        </ul>
                    </li>
                    <li>
                        <a href="ui-elements.html" class="waves-effect waves-dark"><i class="material-icons">store</i>书店管理<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="servlet/BookTypeListSelvert?flag3=List3">种类管理</a>
                            </li>
                            <li>
                                <a href="#">购物车管理<span class="fa arrow"></span></a>
                                <ul class="nav nav-third-level">
                                    <li>
                                        <a href="#">订单管理</a>
                                    </li>
                                </ul>
                                </ul>
                    </li>
                        </ul>
                    </li>
                </ul>
            </div>
        </nav>
        
         
        <!-- /. NAV SIDE  -->
		<div id="page-wrapper">
		<div id="page-inner"> 
            <div class="row">
                <div class="col-md-12">
                    <div class="card">
                        <div class="card-content">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                        <tr>
                                            <th class="center">管理员ID</th>
                                            <th class="center">管理员账号</th>
                                           <th class="center">管理员密码</th>
                                        </tr>
                                        
                                    </thead>
                                    
                                    <tbody>
                                    <c:forEach var="p" items="${list1}">
                                        <tr class="odd gradeX">
                                            <td class="center">${p.adminId}</td>
                                            <td class="center">${p.adminName }</td>
                                            <td class="center">${p.adminPwd}</td>
                                        </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                    <!--End Advanced Tables -->
                </div>
            </div>
               
                    </div>
                    <!--  end  Context Classes  -->
                </div>
                </div>
				<footer><p>Copyright &copy; 2018.Company name All rights reserved.</p>
			<%
     }else{    	
      %>
      <script>alert('注意：请您登录后进入后台系统');window.location.href='login.html'</script>
      <%
         }
       %>
				</footer>
            </div>
             <!-- /. PAGE INNER  -->
            </div>
    <!-- JS Scripts-->
    <!-- jQuery Js -->
    <script src="<%=basePath %>assets/js/jquery-1.10.2.js"></script>
	
	<!-- Bootstrap Js -->
    <script src="<%=basePath %>assets/js/bootstrap.min.js"></script>
	
	<script src="<%=basePath %>assets/materialize/js/materialize.min.js"></script>
	
    <!-- Metis Menu Js -->
    <script src="assets/js/jquery.metisMenu.js"></script>
    <!-- Morris Chart Js -->
    <script src="assets/js/morris/raphael-2.1.0.min.js"></script>
    <script src="assets/js/morris/morris.js"></script>
	<script src="assets/js/easypiechart.js"></script>
	<script src="assets/js/easypiechart-data.js"></script>
	 <script src="assets/js/Lightweight-Chart/jquery.chart.js"></script>
	 <!-- DATA TABLE SCRIPTS -->
    <script src="assets/js/dataTables/jquery.dataTables.js"></script>
    <script src="assets/js/dataTables/dataTables.bootstrap.js"></script>
        <script>
            $(document).ready(function () {
                $('#dataTables-example').dataTable();
            });
    </script>
    <!-- Custom Js -->
    <script src="assets/js/custom-scripts.js"></script> 
 

</body>

</html>