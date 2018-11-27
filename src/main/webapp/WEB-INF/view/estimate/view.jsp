<tiles:insertDefinition name="FrontLayout">
	<tiles:putAttribute name="scriptPage">


	</tiles:putAttribute>

	<tiles:putAttribute name="cssPage">

	</tiles:putAttribute>

	<tiles:putAttribute name="contentAttr">
<body>
	<div id="container" class="main">
		<section class="visual">
			<div class="visual-cont">
			<h2 style="margin:auto;text-align: center;">예산테이블</h2>
			
			</div>
		</section>
		<div id="content">
			<section>
				<ul>
					<li></li>
				</ul>
				
				<div class="inputForm" style="margin:auto;text-align: center;">  
					<span>날짜  </span><input id="date" type="date">
					<span>구분</span> 
					<select id="type" type="text">
						<option value="갓피플">갓피플</option>
						<option value="집">집</option>
						<option value="결혼식">결혼식</option>
						<option value="신혼여행">신혼여행</option>
						<option value="인테리어">인테리어</option>
						<option value="가전">가전</option>
						<option value="부모님">부모님</option>
						<option value="FFFF">기타</option>
					</select>
					<span>세부항목  </span><input id="list" type="text" placeholder="ex)세탁기">
					<br>
					<br> 
					<span>예산  </span><input id="budget" type="text">
					<span>지출여부  </span>
					<select id="isYn" type="text">
						<option value="0">미지출</option>
						<option value="1">지출완료</option>
					</select>
					
					
					<span>비고</span><input id="remark" type="text">
					<a href="javascript:estimateView.submit();">입력</a>
					<br>
					<br>
					<br>
				</div>
			</section>		
		</div>
	</div>
</body> 
<script>
var estimateView = {
		submit : function() {
			console.log($("#type").val());
			console.log($("#date").val());
			console.log($("#list").val());
			console.log($("#budget").val());
			console.log($("#isYn").val());
			console.log($("#remark").val());
			
			param = {
					type : $("#type").val(),
					date : $("#date").val(),
					list : $("#list").val(),
					budget : $("#budget").val(),
					isYn : $("#isYn").val(),
					remark $("#remark").val(): 
			}
			
			$.ajax({
				url:"/estimate/insert.json",
				type:"POST",
				data:param,
				success: function(data) {

		        	var rt = data.rt;
		        	var rtMsg = data.rtMsg;
		        	if(rt == 'SUCCESS') {
		        		alert("입력완료")
		        	} else {
		        		alert("입력실패")
		        	}
		        }
			});
		}
}

</script>
	</tiles:putAttribute>

</tiles:insertDefinition>