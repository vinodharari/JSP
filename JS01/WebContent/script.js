function square(x) {
	return (x * x);
}

function double(x) {
	return (x + x);
}

function triple(x) {
	return (x * 3);
}

function flipCoin() {
	if (Math.random() < 0.5) 
		return ("Heads");
	else
		return ("Tails");
}

function max(n1, n2) {
	if (n1 >= n2) 
		return (n1);
	else
		return (n2);
}

function dayName(dayNumber) {
	var dayName;
	switch(dayNumber) {
		case 0: dayName = "Sunday"; break;
		case 1: dayName = "Monday"; break;
		case 2: dayName = "Tuesday"; break;
		case 3: dayName = "Wednesday"; break;
		case 4: dayName = "Thursday"; break;
		case 5: dayName = "Friday"; break;
		case 6: dayName = "Saturday"; break;
		default: dayName = "Invalid Day"; break;
	}
	return dayName;
}

function fors() {
	var cars = ["BMW", "Volvo", "Saab", "Ford"];
	var text = "";
	var i;
	for (i = 0; i < cars.length; i++) {
	    text += cars[i] + "<br>";
	}
	return text;
}

function whiles(){
	var a = 0;
	var b = 0;
	while ( a > 10 ){
		console.log(a);
		a = a + 1;
		b = b + a;
	}
	return b;
}