package InheritanceDesign;

public abstract class Security extends Asset{

	private String name;
	private String ticker;
	private double price;
	private int quantity;
	private double value;

	public Security(String name, String name2, String ticker, double price,
			int quantity) {
		super(name);
		name = name2;
		this.ticker = ticker;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
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
