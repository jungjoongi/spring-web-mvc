<!DOCTYPE html>
<html lang="ko">

<head>
    <tiles:insertAttribute name="headCommon" />
	<tiles:insertAttribute name="cssPage" ignore="true" />
	
	<tiles:insertAttribute name="scriptCommon" />
	<tiles:insertAttribute name="scriptPage" ignore="true" />
</head>

<body>
    <div id="wrap">
        <tiles:insertAttribute name="gnbCommon" />
    
	    <tiles:insertAttribute name="contentAttr" />

	    <tiles:insertAttribute name="footerCommon" />
    </div>
</body>
</html>

