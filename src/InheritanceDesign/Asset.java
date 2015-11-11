package InheritanceDesign;

public abstract class Asset {

	private String name;
	
	public Asset(String name)
	{
		this.name=name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public double getNetValue(){
		return getAssetValue()-getDebt();
	}
	
	public abstract double getDebt();
	
	public abstract double getAssetValue();
	
	public abstract void printSummary();
}
