package labmodule3;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class GettingDuration {
	void printDate(int year, Month month, int days) {

		LocalDate tdate = LocalDate.of(year, month, days);
		LocalDate now = LocalDate.now();
		Period diff = Period.between(tdate, now);
		System.out.print("difference is"+diff.getYears()+" "+diff.getMonths()+" "+diff.getDays());
	}

	public static void main(String[] args) {

		GettingDuration thatday = new GettingDuration();
		thatday.printDate(1999, Month.APRIL, 18);

	}
}
