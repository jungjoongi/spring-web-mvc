<tiles:insertDefinition name="FrontLayout">
	<tiles:putAttribute name="scriptPage">
	<script src="/spring-web-project/estimate/view.js"></script>

	</tiles:putAttribute>

	<tiles:putAttribute name="cssPage">

	</tiles:putAttribute>

	<tiles:putAttribute name="contentAttr">
	
	<c:set var="payList" value="${listPay}"/>
<body>
	<div id="container" class="main">
		<section class="visual">
			<div class="visual-cont">
			<h2 style="margin-bottom:30px;text-align: center;">예산테이블</h2>
				<table style="width:100%;margin-bottom:50px;text-align:center;">
					<thead style="width:100%;margin:auto;text-align:center;"> 
						<tr>
							<th>날짜</th>
							<th>구분</th>
							<th>세부항목</th>
							<th>예산</th> 
							<th>지출여부</th>
							<th>할부여부</th>
							<th>비고</th>
						</tr>
					</thead>  
					<tbody style="width:100%;margin:auto;text-align:center;">
			 		<c:forEach var="list" items="${list}"> 
						<tr id="${list.no}" <c:if test='${list.isYn eq \'지출완료\'}'>class="isYn"</c:if>style="height:25px;border-bottom: 1px solid #eee;" onclick='estimateView.selectPop(${list.no})'>
							<td>${list.dates}</td>
							<td>${list.types}</td>
							<td>${list.list}</td>
							<td>${list.budget}</td>
							<td>${list.isYn}</td>
							<td>${list.payTypes}</td>
							<td>${list.remark}</td>
						</tr>
					</c:forEach>
					</tbody>
				</table>
				<div style="text-align:center">
					<span>총 예산 : ${payList.reTotal}원    |    지출금액 : ${payList.reCompleted} 원    |    남은 지출금액 : ${payList.reRequired}원</span>
				</div>
			</div>
		</section>
		<div id="content">
			<section>
				
				
				<div class="inputForm" style="margin:auto;text-align: center;">   
					<span>항목  </span><input id="list" type="text" placeholder="ex)세탁기" style="width:110px;">
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
					<span>날짜  </span><input id="date" type="date" style="width:120px;">
					<span>예산  </span><input id="budget" type="text" style="width:100px;" onkeyup="estimateView.comma(this);" onchange="estimateView.comma(this);">
					<span>지출여부  </span>
					<select id="isYn">
						<option value="미지출">미지출</option>
						<option value="지출완료">지출완료</option>
					</select> 
					<span>할부여부  </span>
					<select id="payTypes">
						<option value="일시불">일시불</option>
						<option value="할부">할부</option>
						<option value="미정">미정</option>
					</select> 
					<span>비고</span><input id="remark" type="text" style="width:240px;">
					<a href="javascript:estimateView.submit();">입력</a>
					<br>
					<br>
					<br>
				</div>
			</section>		
		</div>
	</div>
	
	<div id="modal" style="width:1000px;position:absolute;top:40%;left:50%;transform:translate(-50%,-50%);background-color:wheat;border: 2px dotted currentColor;padding:10px;display:none;clear:both;">
		<table style="width:100%;margin-bottom:50px;text-align:center;">
			<thead style="width:100%;margin:auto;text-align:center;"> 
				<tr> 
					<th>날짜</th>
					<th>구분</th>
					<th>세부항목</th>
					<th>예산</th> 
					<th>지출여부</th>
					<th>할부여부</th>
					<th>비고</th>
				</tr>
			</thead> 
			<tbody style="width:100%;margin:auto;text-align:center;">
				<tr style="height:25px;"> 
					<td><input id="update_date" type="date"></td>
					<td>
						<select id="update_types">
							<option value="갓피플">갓피플</option>
							<option value="집">집</option>
							<option value="결혼식">결혼식</option>
							<option value="신혼여행">신혼여행</option>
							<option value="인테리어">인테리어</option>
							<option value="가전">가전</option>
							<option value="부모님">부모님</option>
							<option value="FFFF">기타</option>
						</select>
					</td>
					<td><input id="update_list" type="text"></td>
					<td><input id="update_budget" type="text" onclick="estimateView.comma(this);" onKeyup="estimateView.comma(this);"></td>
					<td>
						<select id="update_isYn">
							<option value="지출완료">지출완료</option>
							<option value="미지출">미지출</option>
						</select>
					</td> 
					<td>
					<select id="update_payTypes">
							<option value="일시불">일시불</option>
							<option value="할부">할부</option>
							<option value="미정">미정</option>
						</select>
					</td>
					<td><input id="update_remark" type="text">
					<input id="update_no" type="hidden"></td>
					<td><a href="javascript:void(0)" id="delete-btn">삭제</a></td>
				</tr>
			</tbody>
		</table>
		<a href="javascript:void(0)" id="update-btn" style="color:black;font-weight:bold;margin:auto;font-size: 20px;display:block;text-align: center;">수정하기</a>
		<a href="javascript:estimateView.close()" style="float:right;color:black;font-weight:bold;margin-right:5px;font-size: 16px;">닫기</a>
	</div>
</body> 

	</tiles:putAttribute>

</tiles:insertDefinition>