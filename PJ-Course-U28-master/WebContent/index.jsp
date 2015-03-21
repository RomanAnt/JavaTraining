<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>

<t:wrapper>

	<div class="row">
		<div class="col-lg-12">
			<h1>
				Stock prices <small>Enter Your Data</small>
			</h1>
			<div class="alert alert-info alert-dismissable">
				<button type="button" class="close" data-dismiss="alert"
					aria-hidden="true">&times;</button>
				To avoid errors, it is advised to enter one of these values: <b>AAPL,
					MSFT, YHOO, AMZN.</b>
			</div>
		</div>
	</div>
	<!-- /.row -->

	<div class="row">
		<div class="col-lg-6">
			<form role="form" action="stock" method="POST">
				<div class="form-group">
					<input name="stockname" class="form-control"
						placeholder="Enter company stock symbol">
				</div>
				<button type="submit" class="btn btn-success">Search!</button>
			</form>
		</div>
		<div class="col-lg-6">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<h3 class="panel-title">
						<i class="fa fa-money"></i> Recent User Queries (session scope)
					</h3>
				</div>
				<div class="panel-body">
					<div class="table-responsive">
						<table class="table table-bordered table-hover table-striped ">
							<thead>
								<tr>
									<th>Query #</th>
									<th>Query Time</th>
									<th>Query stock name</th>
									<th>Result (USD)</th>
								</tr>
							</thead>
							<tbody>

								<c:forEach items="${jsessionbean.queries}" var="query">
									<tr>
										<td><c:out value="${jsessionbean.queries.indexOf(query)}" />
										</td>
										<td><c:out value="${query.date}" /></td>
										<td><c:out value="${query.stockName}" /></td>
										<td>$<c:out value="${query.price}" />
										</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- /.row -->

</t:wrapper>