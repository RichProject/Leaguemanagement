var dict = {
    en: {
        'languange': 'English',
        'dateType': 'Goodbye',
        'image': 'castle'
    },
    vi: {
        'languange': 'Vietnamese',
        'dateType': 'Au revoir',
        'image': 'chateau'
    },
    korea: {
        'languange': 'Korean',
        'dateType': 'Auf Wiedersehen',
        'image': 'schloss'
    }
}

	
	var currentDate = new Date();
    var year = currentDate.getFullYear();
    var month_number = currentDate.getMonth()+1;
    var date = currentDate.getDate(); 
    var month_english = new Array();
    month_english[0] = "January";
    month_english[1] = "February";
    month_english[2] = "March";
    month_english[3] = "April";
    month_english[4] = "May";
    month_english[5] = "June";
    month_english[6] = "July";
    month_english[7] = "August";
    month_english[8] = "September";
    month_english[9] = "October";
    month_english[10] = "November";
    month_english[11] = "December";

    
    var stringDatevi = date +"/"+month_number+"/"+year; 
    
    document.getElementById("time_vi").innerHTML = stringDatevi;
    document.getElementById("month_eng").innerHTML =  month_english[currentDate.getMonth()];
    document.getElementById("date_eng").innerHTML = date;
    document.getElementById("sup").innerHTML = getsup(date);
    document.getElementById("year_eng").innerHTML = year;
    
    function getsup(m){
    	if ((m == 1) || (m == 21) || (m==31))
    		return "st";
    	else {
    		if ((m == 2) || (m == 22))
    			return "nd";
    		else{
    			if ((m == 3) || (m == 23))
    				return "rd";
    			else return "th";
    		}
    	}
    }
    
