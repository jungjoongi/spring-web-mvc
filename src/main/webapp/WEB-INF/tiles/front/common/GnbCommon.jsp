<!-- header start -->
<header id="header">
    <section class="section">
        <h1 class="logo"><a href="/spring-web-project/estimate/view.do" style="border: 1px solid #ffd8d8;padding: 10px;border-radius: 25px;color: #ff6666;">예산노트</a></h1>
        <h1 class="logo" style="left:150px;"><a href="/spring-web-project/invitation/view.do" style="border: 1px solid #ffd8d8;padding: 10px;border-radius: 25px;color: #ff6666;">명단확인</a></h1>
        <nav id="nav">
            <ul class="gnb">
                <li><a id="login" href="javascript:void(0);"></a></li>
                <%-- <li><a href="javascript:void(0);">My신청현황 보기</a></li> --%>
            </ul>
        </nav>
    </section>
</header> 
<!--// header end -->

<script>
$.ajax({ 
	url:"/spring-web-project/isLogin.json",
	type:"post",
	success : function(data) {
		var rt = data.rt
		var msg = data.rtMsg
		var link = data.link
		var html = data.html
		if(rt == "0000") {
			$("#login").html(html)
			$("#login").attr("href", link)
		}
		if (rt == "0001"){
			$("#login").html(html)
			$("#login").attr("href", link)
		}
	}
})
</script>