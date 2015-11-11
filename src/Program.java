import InheritanceDesign.BankAccount;
import InheritanceDesign.Bond;
import InheritanceDesign.Car;
import InheritanceDesign.House;
import InheritanceDesign.Stock;
import InheritanceDesign.Wealth;


public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Wealth wealth = new Wealth();

		BankAccount bankAccount = new BankAccount("SBI Account", "1a2b3c", 20000.0);
		Bond bond = new Bond("Rel Bond", "RB", 100, 1000.0, 0.0, 5);
		Stock stock = new Stock("Hind Univ 1", "HUL", 1000, 272.5, 0.0, "BSE");
		House house = new House("Home", 2600000, 10000, "10 BT Rd");
		Car car = new Car("Vehicle", 30000, 14000, "XYZ", 2012);
	
		wealth.addAsset(bankAccount);
		wealth.addAsset(bond);
		wealth.addAsset(stock);
		wealth.addAsset(house);
		wealth.addAsset(car);

		wealth.toString();
	}

}
