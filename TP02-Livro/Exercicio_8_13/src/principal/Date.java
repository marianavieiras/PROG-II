package principal;

public class Date {
	private int month;
	private int day;
	private int year;

	public Date(int month, int day, int year) {
		this.month = checkMonth(month);
		this.day = checkDay(day);
		this.year = year;
	}

	private int checkMonth(int month) {
		if (month > 0 && month <= 12) {
			return month;
		} else {
			System.out.printf("Invalido");
			return 1;
		}
	}

	private int checkDay(int day) {
		int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (day > 0 && day <= daysPerMonth[month]) {
			return day;
		}
		if (month == 2 && day == 29 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
			return day;
		}
		System.out.printf("Invalido");
		return 1;
	}

	public String toString() {
		return String.format("%d/%d/%d", month, day, year);
	} 

}