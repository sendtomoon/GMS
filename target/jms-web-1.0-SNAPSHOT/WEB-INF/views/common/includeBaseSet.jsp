﻿<title>爱克综合信息管理系统</title>
<script src="/static/js/jquery/jquery-2.0.3.min.js"></script>
<script>
	function getRealPath() {
		var localObj = window.location;
		var contextPath = localObj.pathname.split("/")[1];
		var basePath = localObj.protocol + "//" + localObj.host;
		return basePath;
	}
	var jypath = getRealPath();
</script>
<script>
	function getUser() {
		var result;
		$.ajax({
			type : 'POST',
			url : jypath + '/backstage/getCurrentUser',
			dataType : 'json',
			success : function(data) {
				var _infoStr = data;
				var _info = _infoStr.substring(_infoStr.indexOf('[') + 1,
						_infoStr.lastIndexOf(']')).split(",");
				var map = {}, _curUser = {};
				for (var i = 0; i < _info.length; i++) {
					var ele = _info[i].trim();
					map[ele.substring(0, ele.indexOf('='))] = ele.substring(ele
							.indexOf('=') + 1, ele.length);
				}
				_curUser.id = map.accountId;
				_curUser.name = map.name;
				_curUser.loginName = map.loginName;
				_curUser.orgId = map.orgId;
				_curUser.orgRootId = map.orgRootId;
				_curUser.orgRootCode = map.orgCode;
				_curUser.distRootCode = map.distCode;
				return _curUser;
			}
		});
	}
</script>
<script>
	var curUser = getUser();
	
</script>

<script type="text/javascript">
	if ("ontouchend" in document) {
		//手机适应;
		document
				.write("<script src='"+jypath+"/static/js/jquery/jquery.mobile.custom.min.js'><"+"/script>");
	}
</script>
<link rel="stylesheet"
	href="${jypath}/static/js/jquery/layer/skin/default/layer.css" />
<!--提示组件start-->
<script type="text/javascript"
	src="${jypath}/static/js/jquery/jquery.tips.js"></script>
<script type="text/javascript"
	src="${jypath}/static/js/jquery/layer/layer.js"></script>
<!--提示组件end-->
<link rel="icon" href="${jypath}/favicon.ico" type="image/x-icon" />
<link rel="shortcut icon" href="${jypath}/favicon.ico"
	type="image/x-icon" />
<link rel="bookmark" href="${jypath}/favicon.ico" type="image/x-icon" />
<script type="text/javascript">
	$(document).ajaxComplete(function(event, xhr, settings) {
		if (xhr.getResponseHeader("sessionstatus") == "sessionLimit") {
			alert("抱歉，此账号在另一处被登录。您被迫下线！");
			window.location.replace(xhr.getResponseHeader("loginPath"));
		}
	});
</script>