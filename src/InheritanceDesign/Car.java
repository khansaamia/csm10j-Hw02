package InheritanceDesign;

public class Car extends Property{

	private String model;
	private String cheasisno;
	private int manufactureYear;
	public Car(String name, String model, String cheasisno, int manufactureYear) {
		super(name);
		this.model = model;
		this.cheasisno = cheasisno;
		this.manufactureYear = manufactureYear;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCheasisno() {
		return cheasisno;
	}
	public void setCheasisno(String cheasisno) {
		this.cheasisno = cheasisno;
	}
	public int getManufactureYear() {
		return manufactureYear;
	}
	public void setManufactureYear(int manufactureYear) {
		this.manufactureYear = manufactureYear;
	}
	
	public void printSummary() {
		System.out.println("");
		System.out.printf("Asset Name: %s\n", this.getName());
		System.out.printf("Model: %s\n", this.getModel());
		System.out.printf("Manufacture Year: %d\n", this.getManufactureYear());
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
