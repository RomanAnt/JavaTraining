<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<t:wrapper>

	<div class="row">
		<div class="col-lg-12">
			<h1>
				Congratulations! <small>We successfuly processed your query</small>
			</h1>
		</div>
	</div>
	<!-- /.row -->
	<div class="row">
		<div class="col-lg-5">
			<div class="text-center" style="margin-top: 90px">
				<div style="margin-bottom: 40px">
					<h4>
						Stock price for 
						<b><c:out value="${jsessionbean.queries[jsessionbean.queries.size()-1].stockName}" /></b>
						for <b><c:out value="${jsessionbean.queries[jbean.queries.size()-1].date}" /></b> is:
					</h4>
				</div>
				<h1><c:out value="${jsessionbean.queries[jsessionbean.queries.size()-1].price}" /> USD</h1>
				<a style="margin-top: 30px" href="index.jsp" class="btn btn-success">Check Another Stock</a>
			</div>
		</div>
		<div class="col-lg-7">
			<div class="text-center" style="margin-top: 20px" id="stockchart"></div>
			<div class="text-center">
				<div class="alert alert-warning alert-dismissable">
					<button type="button" class="close" data-dismiss="alert"
						aria-hidden="true">&times;</button>
					<h5>
						Price values graph of <b>ALL</b> queries of <b>ALL</b> sessions! (application scope)
					</h5>
				</div>
			</div>
		</div>
	</div>
	<!-- /.row -->

</t:wrapper>