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
			<h2 style="margin-bottom:30px;text-align: center;">예산테이블</h2>
				<table style="width:100%;margin:auto;text-align:center;">
					<thead style="width:100%;margin:auto;text-align:center;">
						<tr>
							<th>날짜</th>
							<th>구분</th>
							<th>세부항목</th>
							<th>예산</th> 
							<th>지출여부</th>
							<th>비고</th>
						</tr>
					</thead> 
					<tbody style="width:100%;margin:auto;text-align:center;">
			 		<c:forEach var="list" items="${list}">
						<tr id="${list.no}" style="height:30px;"> 
							<td>${list.dates}</td>
							<td>${list.types}</td>
							<td>${list.list}</td>
							<td>${list.budget}</td>
							<td>${list.isYn}</td>
							<td>${list.remark}</td>
						</tr>
					</c:forEach>
					</tbody>
				</table>
			</div>
		</section>
		<div id="content">
			<section>
				
				
				<div class="inputForm" style="margin:auto;text-align: center;">   
					<span>날짜  </span><input id="date" type="date" style="width:120px;">
					<span>구분</span>  
					<select id="type">
						<option value="갓피플">갓피플</option>
						<option value="집">집</option>
						<option value="결혼식">결혼식</option>
						<option value="신혼여행">신혼여행</option>
						<option value="인테리어">인테리어</option>
						<option value="가전">가전</option>
						<option value="부모님">부모님</option>
						<option value="FFFF">기타</option>
					</select>
					<span>항목  </span><input id="list" type="text" placeholder="ex)세탁기" style="width:110px;">
					<span>예산  </span><input id="budget" type="text" style="width:100px;" onkeyup="estimateView.comma(this);" onchange="estimateView.comma(this);">
					<span>지출여부  </span>
					<select id="isYn">
						<option value="미지출">미지출</option>
						<option value="지출완료">지출완료</option>
					</select> 
					<span>비고</span><input id="remark" type="text" style="width:120px;">
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
					budget : estimateView.removeComma(),
					isYn : $("#isYn").val(), 
					remark : $("#remark").val()
			}
			
			$.ajax({
				url:"/spring-web-project/estimate/insert.json",
				type:"POST",
				data:param,
				success: function(data) {

		        	var rt = data.rt;
		        	var rtMsg = data.rtMsg;
		        	if(rt == 'SUCCESS') {
		        		alert("입력완료")
		        		location.reload();
		        	} else {
		        		alert("입력실패")
		        	}
		        }
			}); 
		},
		comma : function(obj) {
		    var firstNum = obj.value.substring(0,1); 
		    var strNum = /^[/,/,0,1,2,3,4,5,6,7,8,9,/]/;
		    var str = "" + obj.value.replace(/,/gi,'');   
		    var regx = new RegExp(/(-?\d+)(\d{3})/);  
		    var bExists = str.indexOf(".",0);  
		    var strArr = str.split('.');  
		 
		    while(regx.test(strArr[0])){  
		        strArr[0] = strArr[0].replace(regx,"$1,$2");  
		    }  
		    if (bExists > -1)  {
		        obj.value = strArr[0] + "." + strArr[1];  
		    } else  {
		        obj.value = strArr[0]; 
		    }
		},
		removeComma : function() {
			var n = $("#budget").val()
			if ( typeof n == "undefined" || n == null || n == "" ) {
		        return "";
		    }
		    var txtNumber = '' + n;
		    return txtNumber.replace(/(,)/g, "");
		}
}
 
</script>
	</tiles:putAttribute>

</tiles:insertDefinition>