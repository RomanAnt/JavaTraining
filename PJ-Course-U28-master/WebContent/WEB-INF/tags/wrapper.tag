<%@ tag description="Page Wrapper Tag" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta name="description" content="">
		<meta name="author" content="">
		
		<title>Stock search</title>
		
		<link href="css/bootstrap.min.css" rel="stylesheet">
		<link href="css/morris-0.4.3.min.css" rel="stylesheet">
		<link href="css/sb-admin.css" rel="stylesheet">
		<link rel="stylesheet" href="font-awesome/css/font-awesome.min.css">
	</head>

	<body>
		<div id="wrapper">
			<!-- Sidebar -->
			<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
				<!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse"
						data-target=".navbar-ex1-collapse">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="index.jsp">
						Serious Stock Monitoring System
					</a>
				</div>
				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse navbar-ex1-collapse">
					<ul class="nav navbar-nav side-nav">
						<li><a href="index.jsp"><i class="fa fa-bar-chart-o"></i>
								Stock prices
							</a>
						</li>
					</ul>
					<ul class="nav navbar-nav navbar-right navbar-user">
						<li class="dropdown user-dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown">
							<i class="fa fa-user"></i> Session <b class="caret"></b></a>
							<ul class="dropdown-menu">
								<li class="divider"></li>
								<li>
									<a href="scontrol"><i class="fa fa-power-off"></i>
										Reset Session
									</a>
								</li>
							</ul>
						</li>
					</ul>
				</div>
				<!-- /.navbar-collapse -->
			</nav>
			<div id="page-wrapper">
	
				<jsp:doBody />
	
			</div>
			<!-- /#page-wrapper -->
		</div>
		<!-- /#wrapper -->
		<!-- JavaScript -->
	</body>
	<script src="js/jquery-1.10.2.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/raphael-min.js"></script>
	<script src="js/morris-0.4.3.min.js"></script>
	<script>
		    Morris.Line({
		    	// ID of the element in which to draw the chart.
		    	element: 'stockchart',
		    	// Chart data records -- each entry in this array corresponds to a point on
		    	// the chart.
		    	data: [
			    	    <c:forEach items="${jappbean.queries}" var="query">
				   			{ n: '<c:out value="${jappbean.queries.indexOf(query)}"/>', price: '<c:out value="${query.price}"/>' },
			  			</c:forEach>
		    	       ],
		    	       // The name of the data record attribute that contains x-visitss.
		    	       xkey: 'n',
		    	       // A list of names of data record attributes that contain y-visitss.
		    	       ykeys: ['price'],
		    	       // Labels for the ykeys -- will be displayed when you hover over the
		    	       // chart.
		    	       labels: ['Price'],
		    	       // Disables line smoothing
		    	       smooth: true,
		    });
    </script>
</html>