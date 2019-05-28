<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
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
                <a class="navbar-brand waves-effect waves-dark" href="index.jsp"><i class="large material-icons">insert_chart</i> <strong>后台</strong></a>
				
		<div id="sideNav" href=""><i class="material-icons dp48">toc</i></div>
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
                          <a href="servlet/ManagerListSelvert?flag1=List1" method="post" >管理员账号管理</a>
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
		  <img src="images/page.jpg" width=100% height:auto></img>
			
 </div>
				<%
     }else{    	
      %>
      <script>alert('注意：请您登录后进入后台系统');window.location.href='login.html'</script>
      <%
         }
       %>
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
