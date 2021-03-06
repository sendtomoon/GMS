<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html >
<html lang="en">
<head>
<%@include file="../../common/includeBaseSet.jsp" %>
<%@include file="../../common/includeSystemSet.jsp" %>

<link rel="stylesheet" href="${jypath}/static/plugins/zTree/3.5/zTreeStyle.css" />
<script src="${jypath}/static/plugins/zTree/3.5/jquery.ztree.core-3.5.min.js"></script>
<script src="${jypath}/static/js/bootstrap/bootstrap3-typeahead.min.js"></script>

</head>
<body>
<div class="page-content">
		<div class="row-fluid">	
			<div class="col-xs-12">
				<div class="row">
					<div class="col-sm-3">
						<div class="widget-box"><ul id="orgTree" class="ztree orgTree"></ul></div>
					</div>
				
				
				<div class="col-sm-9">
					<form id="attrBaseForm" class="form-inline" method="POST" onsubmit="return false;">
					<div class="row">
						<div class="widget-main">	
							&ensp;&nbsp;<input type="text" name="keyWord" placeholder="这里输入关键词"   class="input-large">
							<button id='searchBtn' class="btn btn-success  btn-xs" title="过滤" type="button" style="border-radius: 5px; " onclick="getbaseList(1)">搜索</button>													
<!-- 							<button id='searchBtn' class="btn btn-warning  btn-xs" title="过滤" type="button" onclick="getbaseList(1)"><i class="icon-search bigger-110 icon-only"></i></button> -->
						</div>				
					</div>
					<input type='hidden' class='pageNum' name='pageNum' value='1'/>
					<input type='hidden' class='pageSize'  name='pageSize' value='10'/>
					<input type='hidden' name='categoryId'/>
					<input type='hidden' name='categoryName'/>
					</form>
					<c:forEach var="pbtn" items="${permitBtn}">
						<button  id="${pbtn.btnId}" type="button" class="btn btn-success btn-xs" style="border-radius:4px" >${pbtn.name}</button>
					</c:forEach>
					<table id="attrList" class="table table-striped table-bordered table-hover" >
						<thead>
							<tr>
								
								<th style="width:5%"  class="center hidden-480">序号</th>
								<th style="width:10%" class="center">分类名称</th>
								<th style="width:15%" class="center">属性组名称</th>
								<th style="width:10%" class="center">操作</th>
							</tr>
						</thead>
						<tbody></tbody>
					</table>
					<div class="row">
						<div class="col-sm-8 col-sm-offset-4">
							<!--设置分页位置-->
							<div id="pageing" class="dataTables_paginate paging_bootstrap">
								<ul class="pagination"></ul>
							</div>
						</div>
					</div>
				</div>
				</div>
			<!-- #addorUpdateFrom -->
			<%@include file="attr_form.jsp" %>
			<!-- #dialog-confirm -->
			<%@include file="../../common/dialog.jsp" %>	
			</div>
		</div>
	</div>	
<script src="${jypath}/static/js/system/attribute/attribute.js"></script>	
	
</body>
</html>