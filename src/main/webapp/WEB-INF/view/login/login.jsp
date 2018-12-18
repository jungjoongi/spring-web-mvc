<tiles:insertDefinition name="FrontLayout">
	<tiles:putAttribute name="scriptPage">

	<script src="/spring-web-project/login/login.js"></script>
	</tiles:putAttribute>

	<tiles:putAttribute name="cssPage">

	</tiles:putAttribute>

	<tiles:putAttribute name="contentAttr">
<body>
	<div id="container" class="main">
		<section class="visual">
			<div class="visual-cont"> 
				<h2 style="text-align:center">로그인</h2>
				<div class="loginData" style="text-align:center">
					<span>이름: <input type="text" id="mem_name"></span><br>
					<span>패스워드: <input type="password" id="mem_password"> </span>
					<a href="javascript:login.login()" style="color:black;border:1px solid black;padding:2px;">로그인</a>
				</div>
			</div>
		</section>
	</div>
			
</body>
	</tiles:putAttribute>

</tiles:insertDefinition>