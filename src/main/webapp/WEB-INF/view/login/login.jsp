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
				<h2 style="text-align:center">로그인</h2>
				<form id="loginData" style="text-align:center">
					<span>이름:</span> <input type="text" id="mem_name"> <br>
					<span>패스워드:</span> <input type="password" id="mem_password">
					<a href="javascript:login.login()" style="color:black;border:1px solid black;padding:2px;">로그인</a>
				</form>
			</div>
		</section>
	</div>
			
</body>
	</tiles:putAttribute>

</tiles:insertDefinition>