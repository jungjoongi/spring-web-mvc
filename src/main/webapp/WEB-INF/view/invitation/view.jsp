<tiles:insertDefinition name="FrontLayout">
	<tiles:putAttribute name="scriptPage">
		<script src="/spring-web-project/invitation/view.js?ver=1"></script>



	</tiles:putAttribute>

	<tiles:putAttribute name="cssPage">

	</tiles:putAttribute>

	<tiles:putAttribute name="contentAttr">


		<body>
			<div id="container" class="main">
				<section class="visual">
					<div class="visual-cont">
						<h1 id="count" style="display:none"></h1>
						<h2 style="margin-bottom:20px;text-align: center;">명단</h2>
						<div style="position:relative;">
							<table class="main-table" style="width:100%;margin-bottom:50px;text-align:center;">
								<thead style="width:100%;margin:auto;text-align:center;">
									<tr>
										<th style="min-width:100px;">구분</th>
										<th style="min-width:80px;">이름</th>
										<th style="min-width:120px;">비고</th>
										<th style="min-width:80px;">지금여부</th>
									</tr>
								</thead>
								<tbody style="width:100%;margin:auto;text-align:center;">
									<%-- <c:forEach var="list" items="${list}">
										<c:if test="${list.memId eq memId}"> --%>
										<tr>
										<td>친구</td>
										<td>홍길동</td>
										<td>대학</td>
										<td>지급완료</td>
										</tr>
										<%-- </c:if>
									</c:forEach> --%>
								</tbody>
							</table>
							<div id="modal" style="position:absolute;top:40%;left:50%;transform:translate(-50%,-50%);background-color:wheat;border: 2px dotted currentColor;padding:10px;display:none;clear:both;">

								<table class="frm">
									<colgroup>
										<col width="195">
										<col width="*">
									</colgroup>
									<tbody>
										<tr>
											<th>날짜</th>
											<td>
												<input id="update_date" type="date" style="width:125px;">
											</td>
										</tr>
										<tr>
											<th>구분</th>
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
										</tr>
										<tr>
											<th>세부항목</th>
											<td><input id="update_list" type="text"></td>
										</tr>
										<tr>
											<th>예산</th>
											<td><input id="update_budget" type="text" onclick="estimateView.comma(this);" onKeyup="estimateView.comma(this);"
												 style="width:90px"></td>
										</tr>
										<tr>
											<th>지출여부</th>
											<td>
												<select id="update_isYn">
													<option value="지출완료">지출완료</option>
													<option value="미지출">미지출</option>
												</select>
											</td>
										</tr>
										<tr>
											<th>할부여부</th>
											<td>
												<select id="update_payTypes">
													<option value="일시불">일시불</option>
													<option value="할부">할부</option>
													<option value="미정">미정</option>
												</select>
											</td>
										</tr>
										<tr>
											<th>비고</th>
											<td>
												<input id="update_remark" type="text">
												<input id="update_no" type="hidden">
											</td>
										</tr>
									</tbody>
								</table>
								<div class="pop-btn-group">
									<a href="javascript:void(0)" id="update-btn" style="color: black;font-weight: bold;font-size: 20px;display: block;text-align: center;margin: 20px 0 20px 0;background: #b1b1b1;">수정하기</a>
									<a href="javascript:estimateView.deleteBtn()" id="delete-Yn" style="color:red;font-weight:bold;font-size:16px;">삭제하기</a>
									<a href="javascript:estimateView.close()" style="float:right;color:black;font-weight:bold;margin-right:5px;font-size: 16px;">닫기</a>
								</div>
								<div class="delete-form" style="display:none;position: absolute;background: white;z-index: 2;height: calc(100% - 100px);top: 0;left: 0;padding: 50px;width: calc(100% - 100px);">
									<h1 style="font-size: 24px;text-align: center;font-weight: bold;">정말로 삭제하시겠습니까?</h1>
									<a href="javascript:void(0)" id="delete-btn" style="color: red;font-weight: bold;font-size: 20px;display: block;text-align: center;margin: 20px 0 20px 0;background: #b1b1b1;">삭제하기</a>
									<a href="javascript:estimateView.close()" style="color: black;font-weight: bold;font-size: 20px;display: block;text-align: center;margin: 20px 0 20px 0;background: #b1b1b1;">닫기</a>
								</div>
							</div>
						</div>
						<div style="text-align:center">
							<span>총 인원 : 1명 | 보낸명단 : 1명 | 남은명단 : 0명</span>
						</div>
					</div>
				</section>
				<div id="content">
					<section>
						<div class="inputForm" style="margin:auto;text-align: center;">
							<span>이름 </span><input id="ivt_name" type="text" placeholder="ex)홍길동" style="width:110px;">
							<span>구분</span>
							<select id="ivt_type">
								<option value="평안교회">평안교회</option>
								<option value="가족">가족</option>
								<option value="친구">친구</option>
								<option value="기타">기타</option>
							</select>
							<span>비고</span><input id="ivt_remark" type="text" style="width:200px;">
							<span>지급여부</span>
							<select id="ivt_isGive">
								<option value="지금완료">지급완료</option>
								<option value="미지급">미지급</option>
							</select>
							<a href="javascript:void(0);" style="color: black;border: 1px dotted #444444;padding: 2px;">입력</a>
							<br>
							<br>
							<br>
						</div>
					</section>

				</div>
			</div>

			<div id="modal" style="position:absolute;top:40%;left:50%;transform:translate(-50%,-50%);background-color:wheat;border: 2px dotted currentColor;padding:10px;display:none;clear:both;">

				<table class="frm">
					<colgroup>
						<col width="195">
						<col width="*">
					</colgroup>
					<tbody>
						<tr>
							<th>날짜</th>
							<td>
								<input id="update_date" type="date" style="width:125px;">
							</td>
						</tr>
						<tr>
							<th>구분</th>
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
						</tr>
						<tr>
							<th>세부항목</th>
							<td><input id="update_list" type="text"></td>
						</tr>
						<tr>
							<th>예산</th>
							<td><input id="update_budget" type="text" onclick="estimateView.comma(this);" onKeyup="estimateView.comma(this);"
								 style="width:90px"></td>
						</tr>
						<tr>
							<th>지출여부</th>
							<td>
								<select id="update_isYn">
									<option value="지출완료">지출완료</option>
									<option value="미지출">미지출</option>
								</select>
							</td>
						</tr>
						<tr>
							<th>할부여부</th>
							<td>
								<select id="update_payTypes">
									<option value="일시불">일시불</option>
									<option value="할부">할부</option>
									<option value="미정">미정</option>
								</select>
							</td>
						</tr>
						<tr>
							<th>비고</th>
							<td>
								<input id="update_remark" type="text">
								<input id="update_no" type="hidden">
							</td>
						</tr>
					</tbody>
				</table>
				<div class="pop-btn-group">
					<a href="javascript:void(0)" id="update-btn" style="color: black;font-weight: bold;font-size: 20px;display: block;text-align: center;margin: 20px 0 20px 0;background: #b1b1b1;">수정하기</a>
					<a href="javascript:estimateView.deleteBtn()" id="delete-Yn" style="color:red;font-weight:bold;font-size:16px;">삭제하기</a>
					<a href="javascript:estimateView.close()" style="float:right;color:black;font-weight:bold;margin-right:5px;font-size: 16px;">닫기</a>
				</div>
				<div class="delete-form" style="display:none;position: absolute;background: white;z-index: 2;height: calc(100% - 100px);top: 0;left: 0;padding: 50px;width: calc(100% - 100px);">
					<h1 style="font-size: 24px;text-align: center;font-weight: bold;">정말로 삭제하시겠습니까?</h1>
					<a href="javascript:void(0)" id="delete-btn" style="color: red;font-weight: bold;font-size: 20px;display: block;text-align: center;margin: 20px 0 20px 0;background: #b1b1b1;">삭제하기</a>
					<a href="javascript:estimateView.close()" style="color: black;font-weight: bold;font-size: 20px;display: block;text-align: center;margin: 20px 0 20px 0;background: #b1b1b1;">닫기</a>
				</div>
			</div>
			<div id="saveMsg"><span>자동저장 완료</span></div>
		</body>

	</tiles:putAttribute>

</tiles:insertDefinition>