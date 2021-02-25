<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link
	href='http://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,900,300italic,400italic,600italic,700italic,900italic'
	rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700'
	rel='stylesheet' type='text/css'>
<script type="text/javascript"
	src="https://www.gstatic.com/charts/loader.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.js"></script>

<script type="text/javascript">
	$(function() {
		$("#selectnum").val(${pageVo.pageSize});
		pagingUserAjax(1, ${pageVo.pageSize});
		
		//페이지 출력 갯수 변경
		$('#example_length').on('change', function(){
			var pageSize = $("#selectnum").val();
			
			$.ajax({
				url : "/ddit/pagingUserAjaxHtml",
				data : "page=" + 1 + "&pageSize=" + pageSize,
				success : function(data) {
					var html = data.split("####################");
					$("#userTbody").html(html[0]);
					$("#pagination").html(html[1]);
				}
			});
		});
		$('#example_length').val('${pageVo.pageSize}');
	})
	
	//페이징처리
	function pagingUserAjax(page, pageSize) {
		$.ajax({
			url : "/ddit/pagingUserAjaxHtml",
			data : "page=" + page + "&pageSize=" + pageSize,
			success : function(data) {
				var html = data.split("####################");
				$("#userTbody").html(html[0]);
				$("#pagination").html(html[1]);
			}
		});
	}
	
	//상세조회
// 	$('.test').on('click', function(){
// 		var userid = $(this).data("userid");
// 		$.ajax({
// 			url : "/ddit/testAjaxHtml",
// 			data : "userid" + userid,
// 			success : function(data) {
// 				$("#userinfo").html(data);
// 			}
// 		});
// 	})
	
</script>


<div id="container">
	<!--main content start-->
	<!-- 	<section class="main-content-wrapper"> -->
	<!-- 		<section id="main-content"> -->
	<form id="frm">
		<input type="hidden" id="pageSize" name="pageSize">
	</form>

	<div class="row">
		<div class="col-md-8">
			<div class="panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title">사원리스트</h3>
					<div class="actions pull-right">
						<i class="fa fa-chevron-down"></i> <i class="fa fa-times"></i>
					</div>
				</div>
				<div class="panel-body" style="height: 600px;">
					<div class="panel-body">
						<div role="grid" id="example_wrapper"
							class="dataTables_wrapper form-inline no-footer">
							<div class="row">
								<div class="col-xs-6">
									<div class="dataTables_length" id="example_length">
										<label><select id="selectnum" name="example_length" aria-controls="example" class="form-control input-sm">
												<option	value="5">5</option>
												<option value="7">7</option>
												<option value="10">10</option>
												</select> records per page</label>
									</div>
								</div>
								<div class="col-xs-6" style="float: right;">
									<div id="example_filter" class="dataTables_filter">
										<label>Search:<input type="search" class="form-control input-sm" aria-controls="example"></label>
										<input type="button" id="schBtn" class="btn btn-default" value="검색">
									</div>
								</div>
							</div>
							<table id="example"	class="table table-striped table-bordered dataTable no-footer" cellspacing="0" width="100%" aria-describedby="example_info"	style="width: 100%;">
								<thead>
									<tr role="row">
										<th>아이디</th>
										<th>이름</th>
										<th>별명</th>
										<th>비밀번호</th>
									</tr>
								</thead>

								<tbody id="userTbody">
								</tbody>
							</table>
							<div class="row">
<!-- 								<div class="col-xs-6"></div> -->
								<div style="text-align: center;">
									<div class="dataTables_paginate paging_simple_numbers" id="example_paginate">
										<ul id="pagination" class="pagination">
										</ul>
									</div>
								</div>
							</div>
						</div>

					</div>
				</div>
			</div>
		</div>

		<div class="col-md-4" id="userinfo">
		
			<div class="panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title">상세정보</h3>
					<div class="actions pull-right">
						<i class="fa fa-chevron-down"></i> <i class="fa fa-times"></i>
					</div>
				</div>
				<div class="panel-body" style="height: 600px;">
					<div class="card">
						<div class="register-card-body">
							<form role="form" class="form-horizontal" id="frm">
								<input type="hidden" name="userid" value="${user.userid }" />
							</form>

							<div class="input-group" style="float: left;">
								<div class="mailbox-attachments clearfix"
									style="text-align: center; width: 100%;">
									<div class="mailbox-attachment-icon has-img" id="pictureView" style="border: 1px solid green; height: 150px; width: 120px; margin: 0 auto;">
										<a href="${cp }/user/profileDownload?userid=${user.userid }">
											<img id="pictureViewImg" style="width: 100%; height: 100%;"	src="${cp }/user/profile?userid=${user.userid }" />
										</a>
									</div>
								</div>
							</div>
							
<!-- 							<div class="form-group row" style="float: left;"> -->
							<div class="form-group row" >
								<label class="col-sm-2" style="font-size: 0.9em; margin-top: 20px;"> 사원번호 </label>
								<div class="col-sm-2 input-group input-group-sm" style="margin-top: 20px;">
									<span class="input-group-append-sm">a001</span>
								</div>

								<label class="col-sm-2" style="font-size: 0.9em;"> 사원id </label>
								<div class="col-sm-2 input-group input-group-sm">
									<span class="input-group-append-sm">test</span>
								</div>
								
								<label class="col-sm-2" style="font-size: 0.9em;"> 부서이름 </label>
								<div class="col-sm-2 input-group input-group-sm">
									<span class="input-group-append-sm">개발</span>
								</div>
								
								<label class="col-sm-2" style="font-size: 0.9em;"> 급여 </label>
								<div class="col-sm-2 input-group input-group-sm"">
									<span class="input-group-append-sm">2800 만원</span>
								</div>
								
							</div>
							
<!-- 							<div class="form-group row" style="float: right;" > -->
							<div class="form-group row">
								<label class="col-sm-2" style="font-size: 0.9em;"> 한글이름 </label>
								<div class="col-sm-2 input-group input-group-sm">
									<span class="input-group-append-sm">홍길동</span>
								</div>
								
								<label class="col-sm-2" style="font-size: 0.9em;"> 생년월일 </label>
								<div class="col-sm-2 input-group input-group-sm">
									<span class="input-group-append-sm">1994/05/26</span>
								</div>
							
								<label class="col-sm-2" style="font-size: 0.9em;"> 성별 </label>
								<div class="col-sm-2 input-group input-group-sm">
									<span class="input-group-append-sm">남</span>
								</div>
								
								<label class="col-sm-2" style="font-size: 0.9em;"> 개인ph </label>
								<div class="col-sm-4 input-group input-group-sm">
									<span class="input-group-append-sm">010-1234-1234</span>
								</div>

								<label class="col-sm-2" style="font-size: 0.9em;"> 부서ph </label>
								<div class="col-sm-4 input-group input-group-sm">
									<span class="input-group-append-sm">000-0000-0000</span>
								</div>
							
								<label class="col-sm-2" style="font-size: 0.9em;"> 주소 </label>
								<div class="col-sm-10 input-group input-group-sm">
									<span class="input-group-append-sm"> 34940 / 대전광역시 중구 중앙로 76 영민빌딩, 301강의실</span>
								</div>
								
								<label class="col-sm-2" style="font-size: 0.9em;"> 입사날짜 </label>
								<div class="col-sm-3 input-group input-group-sm" style="float: left;">
									<span class="input-group-append-sm">2021/01/01</span>
								</div>

								<label class="col-sm-2" style="font-size: 0.9em;"> 퇴사날짜 </label>
								<div class="col-sm-3 input-group input-group-sm">
									<span class="input-group-append-sm">2021/02/23</span>
								</div>
								
								<label class="col-sm-2" style="font-size: 0.9em;"> 재직상태 </label>
								<div class="col-sm-1 input-group input-group-sm" style="float: left;">
									<span class="input-group-append-sm">재직</span>
								</div>

								<label class="col-sm-2" style="font-size: 0.9em;"> 직급 </label>
								<div class="col-sm-1 input-group input-group-sm"style="float: left;">
									<span class="input-group-append-sm">사원</span>
								</div>
								
								<label class="col-sm-2" style="font-size: 0.9em;"> 직무 </label>
								<div class="col-sm-1 input-group input-group-sm"style="float: left;">
									<span class="input-group-append-sm">TA</span>
								</div>
							</div>
							
							<br><br>
							
							<div class="card-footer">
								<div class="row">
									<button type="button" id="modifyBtn" class="btn btn-default" style="float: right; margin-right: 20px;">사용자 수정</button>
								</div>
							</div>


						</div>
						register-card-body
					</div>
				</div>
			</div>



		</div>

	</div>


	<div class="row">
		<div class="col-md-12">
			<div class="panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title">Donut Chart</h3>
					<div class="actions pull-right">
						<i class="fa fa-chevron-down"></i> <i class="fa fa-times"></i>
					</div>
				</div>
				<div class="panel-body">
					<div id="donutchart" style="width: 1000px; height: 500px; float: left;"></div>
					test0 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="checkbox" id="test" class="js-switch" checked onchange="draw()" data-switchery="true" style="display: none;"><br><br>
					test1 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="checkbox" id="test" class="js-switch" checked onchange="draw1()" data-switchery="true" style="display: none;"><br><br>
					test2 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="checkbox" id="test" class="js-switch" checked onchange="draw2()" data-switchery="true" style="display: none;"><br><br>
					test3 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="checkbox" id="test" class="js-switch" checked onchange="draw3()" data-switchery="true" style="display: none;">
				</div>

			</div>
		</div>
	</div>

	<!-- 		</section> -->
	<!-- 	</section> -->
</div>


<script type="text/javascript">
	google.charts.load("current", {
		packages : [ "corechart" ]
	});
	google.charts.setOnLoadCallback(drawChart);

	function draw() {
		google.charts.load("current", {
			packages : [ "corechart" ]
		});
		google.charts.setOnLoadCallback(drawChart);
	}

	function drawChart() {

		if ($('#test').is(':checked') == true) {
			var data = google.visualization.arrayToDataTable([
					[ 'Task', 'Hours per Day' ], [ 'Work', 11 ], [ 'Eat', 2 ],
					[ 'Commute', 2 ], [ 'Watch TV', 2 ], [ 'Sleep', 7 ] ]);
			var options = {
				title : '기본',
				pieHole : 0.4,
			};
		} else {
			var data = google.visualization.arrayToDataTable([
					[ 'Task', 'Hours per Day' ], [ '123', 20 ], [ '456', 3 ],
					[ '76e', 2 ], [ 'Wztch TV', 2 ], [ 'Sleep', 7 ] ]);
			var options = {
				title : '부서',
				pieHole : 0.4,
			};
		}

		var chart = new google.visualization.PieChart(document
				.getElementById('donutchart'));
		chart.draw(data, options);
	}
</script>








