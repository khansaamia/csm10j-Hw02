package InheritanceDesign;

public class Stock extends Security{

	private String StockExchange;

	public Stock(String name, String name2, String ticker, double price,
			int quantity, String stockExchange) {
		super(name, name2, ticker, price, quantity);
		StockExchange = stockExchange;
	}

	public String getStockExchange() {
		return StockExchange;
	}

	public void setStockExchange(String stockExchange) {
		StockExchange = stockExchange;
	}
	
	public void printSummary(){
		System.out.println("");
		System.out.printf("Asset Name: %s\n", this.getName());
		System.out.printf("Ticker: %s\n", this.getTicker());
		System.out.printf("Exchange: %s\n", this.getStockExchange());
		System.out.printf("Quantity: %d\n", this.getQuantity());
		System.out.printf("Price: %10.2f\n", this.getPrice());
		System.out.printf("Value: %10.2f\n", this.getValue());
		System.out.printf("Net Value: %10.2f\n", this.getNetValue());
		System.out.println("");
		}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	@Override
	public double getDebt() {
		// TODO Auto-generated method stub
		return 0;
	}

}
