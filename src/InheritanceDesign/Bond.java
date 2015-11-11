package InheritanceDesign;

public class Bond extends Security{

	public Bond(String name, String name2, String ticker, double price,
			int quantity) {
		super(name, name2, ticker, price, quantity);
		// TODO Auto-generated constructor stub
	}

	private int duration;

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public double getDebt() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void printSummary(){
		System.out.println("");
		System.out.printf("Asset Name: %s\n", this.getName());
		System.out.printf("Ticker: %s\n", this.getTicker());
		System.out.printf("Bond Duration: %d\n", this.getDuration());
		System.out.printf("Quantity: %d\n", this.getQuantity());
		System.out.printf("Price: %10.2f\n", this.getPrice());
		System.out.printf("Value: %10.2f\n", this.getValue());
		System.out.printf("Net Value: %10.2f\n", this.getNetValue());
		System.out.println("========================================");
		}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
