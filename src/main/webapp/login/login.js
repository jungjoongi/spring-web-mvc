var login = {
	login : function() {
		var name = $("#mem_name").val()
		var pw = $("#mem_password").val()
		if(name == ""
		|| pw == "") {
			alert("아이디 또는 암호를 입력해주세요!")
			return;
		}
		$.ajax({
			url : "/spring-web-project/login.json",
			type : "post",
			data : {
				memName : name,
				memPassword : pw
			},
			success : function(data) {
				
				if(data.rt != "FFFF") {
					location.href=data.location;
				}
				
			}
			
		})
	}
}