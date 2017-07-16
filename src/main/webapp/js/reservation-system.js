function validateForm() {
	var regionIds = document.forms["searchForm"]["userBean.regionIds"].value;
	var destinationName = document.forms["searchForm"]["userBean.destinationName"].value;
	var destinationCity = document.forms["searchForm"]["userBean.destinationCity"].value;
	var minTripStartDate = document.forms["searchForm"]["userBean.minTripStartDate"].value;
	var maxTripStartDate = document.forms["searchForm"]["userBean.maxTripStartDate"].value;
	var lengthOfStay = document.forms["searchForm"]["userBean.lengthOfStay"].value;
	var maxStarRating = document.forms["searchForm"]["userBean.maxStarRating"].value;
	var minStarRating = document.forms["searchForm"]["userBean.minStarRating"].value;
	var maxTotalRate = document.forms["searchForm"]["userBean.maxTotalRate"].value;
	var minTotalRate = document.forms["searchForm"]["userBean.minTotalRate"].value;
	var maxGuestRating = document.forms["searchForm"]["userBean.maxGuestRating"].value;
	var minGuestRating = document.forms["searchForm"]["userBean.minGuestRating"].value;

	if (regionIds == "" && destinationName == "" && destinationCity == ""
			&& minTripStartDate == "" && maxTripStartDate == ""
			&& lengthOfStay == "" && maxStarRating == "" && minStarRating == ""
			&& maxTotalRate == "" && minTotalRate == "" && maxGuestRating == ""
			&& minGuestRating == "") {

		alert("Please fill one of the fields to get what you're searching for!");
		return false;
	}

}

function validateJsonReturnedData() {

	if (!document.getElementById("row"))
		alert("There isn't any offer for what you're searching for, Please try again!");
	return false;
}