public class Time {
	public Time () {
		hour = 0;
		minute = 0;
		second = 0;
	}
	public Time (int hr) {
		hour = hr;
	}
	public Time (int hou, int min) {
		hour = hou;
		minute = min;
	}
	public Time (int ho,int mi, int sec) {
		hour = ho;
		minute = mi;
		second = sec;
	}
	int hour = 0;
	int minute = 0;
	int second = 0;

	void nextSecond() {
		if(second < 59) {
			second = second + 1;
		}
		else if (second == 59) {
			second = 0;
			if (minute == 59){
				if( hour == 23) {
					hour = 00;
					minute = 00;
					second = 00;
				}
				else{
					minute = 0;
					hour = hour + 1;

				}

			}
			else{
				minute = minute + 1;
			}	
		}
	}

	void nextMinute() {
		if (minute == 59) {
			minute = 0;
			if( hour == 23) {
					hour = 00;
					minute = 00;
				}
				else{
					hour = hour + 1;

				}

		}
		else {
			minute = minute + 1;
		}
	}

	void nextHour() {
		if( hour == 23) {
					hour = 00;
				}
				else{
					hour = hour + 1;
				}
	}

	void previousHour() {
		if( hour == 00) {
					hour = 23;
				}
				else{
					hour = hour - 1;

				}
			}

	void previousMinute() {
		if (minute == 0){
				minute =59;
				if( hour == 00) {
					hour = 23;
				}
				else{
					hour = hour - 1;

				}

			}
			else{
				minute = minute - 1;
			}
	}

	void previousSecond() {
		if (second == 0) {
			second = 59;
			if (minute == 0){
				minute =59;
				if( hour == 00) {
					hour = 23;
				}
			}
		}
		else {
			second = second - 1;
		}
	}


	void print() {
		if(hour >= 10 && minute >= 10 && second >= 10)
			System.out.println(hour+":"+minute+":"+second);
		else if (hour < 10 && minute < 10 && second < 10)
			System.out.println("0"+hour+":0"+minute+":0"+second);
		else if (hour < 10 && minute < 10)
			System.out.println("0"+hour+":0"+minute+":"+second);
		else if (hour < 10 && second < 10)
			System.out.println("0"+hour+":"+minute+":0"+second);
		else if (minute < 10 && second <10)
			System.out.println(hour+":0"+minute+":0"+second);
		else if(hour < 10)
			System.out.println("0"+hour+":"+minute+":"+second);
		else if (minute < 10)
			System.out.println(hour+":0"+minute+":"+second);
		else if (second < 10)
			System.out.println(hour+":"+minute+":0"+second);

	}

}