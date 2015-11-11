package InheritanceDesign;

public abstract class Property extends Asset{

	private double debt;
	private double value;
	
	public Property(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public Property(String name, double debt, double value) {
		super(name);
		this.debt = debt;
		this.value = value;
	}

	public double getDebt() {
		return debt;
	}

	public void setDebt(double debt) {
		this.debt = debt;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	
	@Override
	public double getAssetValue() {
		// TODO Auto-generated method stub
		return getValue();
	}
	
	
	
}
