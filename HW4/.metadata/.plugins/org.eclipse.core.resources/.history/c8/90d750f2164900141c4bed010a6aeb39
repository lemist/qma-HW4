//Name: QIYUE MA
//AndrewID: qma
//Classs: 08-600
//Date: Sept. 19

import java.util.*;


public class HW4Data{
	private Date date;
	private String description;
	private double amt;
	private boolean isDeposit;
	private double fee;
	private int checkNumber;
	public HW4Data(Date d, String desc, double amount){
		date = d;
		description = desc;
		amt = amount;
		isDeposit = false;								//Whether the transaction is a deposit 
		fee = 0;
		checkNumber = 101;
	}

	public Date getDate() {return date;};
	public String getDescription() {return description;}
	public double getAmount(){return amt;}
	public boolean isDeposit(){ return false; }
	public double getFee(){ return 1; }
	public int getCheckNumber(){return 0; }
	public static void sort(HW4Data[] transaction){
		Arrays.sort(transaction,  new dateComp());		//sort transcations by date


	}

}


class dateComp implements Comparator<HW4Data>{		//sort in ascending order by date
	@Override 
	public int compare(HW4Data h1, HW4Data h2){	
		if((h1.getDate()).after(h2.getDate()))	return -1;		//does it work?
		else return 1;
	}
}