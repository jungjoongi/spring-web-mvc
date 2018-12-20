var count = 2;
var checkCnt = 0;
var estimateView = {
		submit : function() {
			
			if(isNaN(estimateView.removeComma($("#budget").val()))) {
				alert("예산은 숫자만 입력가능")
				return;
			}
			
			param = {
					types : $("#type").val(),
					dates : $("#date").val(),
					list : $("#list").val(),
					budget : estimateView.removeComma($("#budget").val()),
					isYn : $("#isYn").val(), 
					remark : $("#remark").val(),
					payTypes : $("#payTypes").val()
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
		removeComma : function(obj) {
			var n = obj
			if ( typeof n == "undefined" || n == null || n == "" ) {
		        return "";
		    }
		    var txtNumber = '' + n;
		    return txtNumber.replace(/(,)/g, "");
		},
		selectPop : function(seq) {
			param = {
				no : seq
			}
			$.ajax({
				url:"/spring-web-project/estimate/selectOne.json",
				type:"POST",
				data:param,
				success: function(data) {
		        	var rt = data.rt;
		        	var rtMsg = data.rtMsg;
		        	var list = data.list
		        	if(rt == 'SUCCESS') {
		        		$("#update_date").val(list.dates)
		        		$("#update_types").val(list.types)
		        		$("#update_list").val(list.list)
		        		$("#update_budget").val(list.budget)
		        		$("#update_isYn").val(list.isYn)
		        		$("#update_payTypes").val(list.payTypes)
		        		$("#update_remark").val(list.remark)
		        		$("#update_no").val(list.no)
		        		$("#update_budget").trigger("click")
		        		$("#modal").css("display", "block")
		        		$("#update-btn").attr("href", "javascript:estimateView.update("+list.no+")")
		        		$("#delete-btn").attr("href", "javascript:estimateView.delete("+list.no+")")
		        		$('html, body').css({'overflow': 'hidden'});
		        	} else {
		        		alert("입력실패")
		        	}
		        }
			}); 
		},
		close : function() {
			$("#modal").css("display", "none")
			$(".delete-form").css("display", "none")
			$("#update-btn").attr("href", "javascript:void(0)")
			$("#delete-btn").attr("href", "javascript:void(0)")
			$('html, body').css({'overflow': 'auto'});
		},
		deleteBtn : function() {
			$(".delete-form").css("display", "block")
		},
		update : function(paramNo) {
			if(isNaN(estimateView.removeComma($("#update_budget").val()))) {
				alert("예산은 숫자만 입력가능")
				return;
			}
			param = {
					types : $("#update_types").val(),
					dates : $("#update_date").val(),
					list : $("#update_list").val(),
					budget : estimateView.removeComma($("#update_budget").val()),
					isYn : $("#update_isYn").val(), 
					remark : $("#update_remark").val(),
					payTypes : $("#update_payTypes").val(),
					no : paramNo
			}
			$.ajax({
				url:"/spring-web-project/estimate/update.json",
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
		delete : function(paramNo) {
			param = {
					no : paramNo
			}
			$.ajax({
				url:"/spring-web-project/estimate/delete.json",
				type:"POST",
				data:param,
				success: function(data) {

		        	var rt = data.rt;
		        	var rtMsg = data.rtMsg;
		        	if(rt == 'SUCCESS') {
		        		alert("삭제완료")
		        		location.reload();
		        	} else {
		        		alert("입력실패")
		        	}
		        }
			}); 
		},
		keyup : function(e, seq) {
			$(e).on("keyup", function() {
				$("#memoBtn_"+seq).attr("href", "javascript:estimateView.saveMemo("+seq+")");
				$("#memoBtn_"+seq).css("background", "#fff7ef")
			})
			count = 2;
			
			setTimeout(function() {
				if(checkCnt > 0) {
					clearTimeout(cntFn);
				}
		    },1000);
			
			var cntFn = setInterval(function(){
				checkCnt = 1;
				if (count==00){
					isCnt = false;
					count = 2;
					checkCnt = 0;
					clearInterval(cntFn);
					estimateView.saveMemo(seq);
				}
				count -= 1;  // 1씩 감소
				if (count<10){
					count = "0"+count;  // 9->09로
				}
				$("#count").html(count)
			},1000);
		},
		saveMemo : function(seq) {
			var memo = $("#memoText").val()
			param = {
				memMemo : memo
			}
			$.ajax({
				url : "/spring-web-project/estimate/saveMemo.json",
				type : "post",
				data : param,
				success : function(data) {
					
					if(data.rt == "SUCCESS") {
						$("#saveMsg").css("top","0px")
						$("#memoBtn_"+seq).css("background", "")
						$("#memoBtn_"+seq).attr("href", "javascript:void(0)");
						
						setTimeout(function(){
							$("#saveMsg").css("top","-20px")
						},2000)
					} else {
						alert("입력실패")
						location.reload();
					}
				}
			
			})
		}
		
		
		    
}










