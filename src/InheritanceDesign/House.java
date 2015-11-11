package InheritanceDesign;

public class House extends Property{

	private String location;

	public House(String name, String location) {
		super(name);
		this.location = location;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public void printSummary() {
		System.out.println("");
		System.out.printf("Asset Name: %s\n", this.getName());
		System.out.printf("Address: %s\n", this.getLocation());

		System.out.printf("Value: %10.2f\n", this.getValue());
		System.out.printf("Debt: %10.2f\n", this.getDebt());
		System.out.printf("Net Value: %10.2f\n", this.getNetValue());

		System.out.println("");

		}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
