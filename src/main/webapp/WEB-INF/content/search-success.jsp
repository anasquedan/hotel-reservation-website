<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>

<link rel="stylesheet" type="text/css" href="./css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="./css/jquery-ui.css">
<link rel="stylesheet" type="text/css"
	href="./css/reservation-system-theme.css">


<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>.
<script src="./js/reservation-system.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hotel Reservation!</title>
<meta charset="UTF-8">
</head>
<body onload="return validateJsonReturnedData()">
	<div class="container py-3">
		<s:iterator var="hotel" value="hotelList" >

			<div class="card card-padding">
				<div class="row" id= "row">
					<div class="col-md-2 img-div">
						<img class="w-100"
							src='<s:property value="#hotel.HotelInfo.hotelImageUrl" />' />
					</div>
					<div class="col-md-8 px-3">

						<div class="card-block px-0">
							<h4 class="card-title">
								<s:property value="#hotel.HotelInfo.hotelName" />
							</h4>
						</div>
						<div class="hotel-price">
							<p>
								Price per Night:
								<s:property
									value="#hotel.hotelPricingInfo.originalPricePerNight" />
								<s:property value="#hotel.hotelPricingInfo.currency" />
							</p>
						</div>
						<div class="hotel-price">
							<p>
								Hotel Rating:
								<s:property value="#hotel.HotelInfo.hotelStarRating" />
								/ 5.0
							</p>
						</div>
						<div>
							<p>
								Hotel Destination:
								<s:property value="#hotel.HotelInfo.hotelDestination" />
							</p>
						</div>
						<div>
							<p class="card-text">
								Hotel Description:
								<s:property value="#hotel.HotelInfo.description" />
							</p>
						</div>
						<div>
							<a
								href=" <s:property value='#hotel.hotelUrls.hotelInfositeUrl'/>"
								target="__blank">Hotel Link!</a>
						</div>

					</div>
				</div>
			</div>
		</s:iterator>
	</div>
</body>
</html>