<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:wrapper>

        <div class="row">
          <div class="col-lg-12">
            <h1>Ooops <small>We are sorry</small></h1>
            <div class="alert alert-danger alert-dismissable">
              <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
              Please, next time enter one of these: <b> AAPL, MSFT, YHOO, AMZN.</b>
            </div>
          </div>
        </div><!-- /.row -->

        <div class="row">
          <div class="col-lg-12">
			<div class="text-center">
				<h2>Something went wrong!</h2>
				<h4>Please check if you typed everything correctly</h4>
				<a href="index.jsp" class="btn btn-warning">Try Again</a>
			</div>
          </div>
        </div><!-- /.row -->
        
</t:wrapper>