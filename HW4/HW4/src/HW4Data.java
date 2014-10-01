//Name: QIYUE MA
//AndrewID: qma
//Classs: 08-600
//Date: Sept. 19

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

class dateComp implements Comparator<HW4Data> { // sort in ascending order by
												// date
	@Override
	public int compare(HW4Data h1, HW4Data h2) {
		if (h1 == null)
			return 1;
		if (h2 == null)
			return -1;
		return h1.getDate().compareTo(h2.getDate());
	}
}

public class HW4Data {

	public static void sort(HW4Data[] transaction) {
		Arrays.sort(transaction, new dateComp()); // sort transactions by date
	}

	private Date date;
	private String description;
	private double amount;
	private boolean isDeposit;
	private double fee;
	private int checkNumber;

	private static int nextCheckNumber = 101;

	public HW4Data(Date d, String desc, double amount) {
		date = d;
		description = desc;
		this.amount = amount;
		isDeposit = this.amount > 0; // Whether the transaction is a deposit
		if (!isDeposit) {
			checkNumber = nextCheckNumber;
			nextCheckNumber++;
		} else
			checkNumber = 0;
		calculateFeeByAmount(amount);
	}

	private void calculateFeeByAmount(double amount) {
		if (isDeposit) {
			if (amount < 100)
				fee = 0.25;
			else
				fee = amount * 0.25 / 100.;
		} else {
			double realAmount = -amount;
			if (realAmount < 10)
				fee = 0.01;
			else if (realAmount < 100) {
				fee = realAmount * 0.01;
			} else {
				fee = 1;
			}
		}
	}

	public double getAmount() {
		return amount;
	}

	public int getCheckNumber() {
		return checkNumber;
	}

	public Date getDate() {
		return date;
	}

	public String getDescription() {
		return description;
	}

	public double getFee() {
		return fee;
	}

	public boolean isDeposit() {
		return isDeposit;
	}

	public void setDeposit(boolean isDeposit) {
		this.isDeposit = isDeposit;
	}

	public String asTableRowString(String formate, double balance) {
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		String dateString = df.format(this.date);
		return String.format(
				formate,
				dateString,
				this.getCheckNumber() == 0 ? "" : this.getCheckNumber(),
				this.getDescription().subSequence(0,
						Math.min(this.getDescription().length(), 25)),
				this.getAmount(), this.getFee(), balance);
	}

}