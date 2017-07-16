<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" type="text/css" href="./css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="./css/jquery-ui.css">
<link rel="stylesheet" type="text/css"
	href="./css/reservation-system-theme.css">


<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script type="text/javascript" src="./js/reservation-system.js"></script>

<script>
	$(function() {
		$(".datepicker").datepicker({
			dateFormat : "yy-mm-dd"
		});
	})
</script>
<title>Searching to get the best offer!</title>
</head>
<body class="body-background">

	<div class="title-head">
		<h2>Looking For Best Offer!</h2>
	</div>
	<div align="center">

		<s:form action="search" method="post" onsubmit="return validateForm()"
			name="searchForm" cssClass="form-group reservation-form rounded">
			<s:textfield cssClass="form-control" name="userBean.regionIds"
				label="Region Ids" />
			<s:textfield cssClass="form-control" name="userBean.destinationName"
				label="Destination Name" />
			<s:textfield cssClass="form-control" name="userBean.destinationCity"
				label="Destination City" />
			<s:textfield cssClass="form-control datepicker"
				name="userBean.minTripStartDate" label="Min Trip Start Date" />
			<s:textfield name="userBean.maxTripStartDate"
				cssClass="form-control datepicker" label="Max Trip Start Date" />
			<s:textfield name="userBean.lengthOfStay" cssClass="form-control"
				label="Length Of Stay" />
			<s:textfield name="userBean.maxStarRating" cssClass="form-control"
				label="Max Star Rating" />
			<s:textfield name="userBean.minStarRating" cssClass="form-control"
				label="Min Star Rating" />
			<s:textfield name="userBean.maxTotalRate" cssClass="form-control"
				label="Max Total Rate" />
			<s:textfield name="userBean.minTotalRate" cssClass="form-control"
				label="Min Total Rate" />
			<s:textfield name="userBean.maxGuestRating" cssClass="form-control"
				label="Max Guest Rating" />
			<s:textfield name="userBean.minGuestRating" cssClass="form-control"
				label="Min Guest Rating" />

			<div align="center">
				<s:submit type="button" id="submit-button" value="Search!"
					cssClass="rounded btn btn-info" />
			</div>
		</s:form>
	</div>
</body>
</html>