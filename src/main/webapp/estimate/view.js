var estimateView = {
		submit : function() {
			param = {
					types : $("#type").val(),
					date : $("#date").val(),
					list : $("#list").val(),
					budget : estimateView.removeComma(),
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
		removeComma : function() {
			var n = $("#budget").val()
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
					console.log(data)
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
		        		$("#update_budget").trigger("click")
		        		$("#modal").css("display", "block")
		        		$('html, body').css({'overflow': 'hidden'});
		        	} else {
		        		alert("입력실패")
		        	}
		        }
			}); 
		},
		close : function() {
			$("#modal").css("display", "none")
			$('html, body').css({'overflow': 'auto'});
		}
}