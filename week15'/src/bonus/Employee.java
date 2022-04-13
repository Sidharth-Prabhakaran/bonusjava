package bonus;

public class Employee {
	final static double overtimePay = 16.5;
	final static double regPay = 15;
	public String name;
	public double totalPay;
	public double hours;
	
	public Employee() {
		this.name = "default";
		this.hours = 40.5;
		setTotalPay();
	}
	
	public Employee(String n, double h) {
		this.name = n;
		this.hours = h;
		setTotalPay();
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setTotalPay() {
		if (hours > 0 && hours <= 40) {
			this.totalPay = hours * regPay;
			
		}else {
			this.totalPay = (40 * regPay) + ((hours - 40) *  overtimePay);
		}
		 
	}
	
	public double getTotalPay() {
		return totalPay;
	}
}
