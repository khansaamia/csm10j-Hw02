package InheritanceDesign;


import java.util.ArrayList;
import java.util.List;

import org.omg.CORBA.Environment;

public class Wealth {

	List<Asset> assetList=new ArrayList<Asset>();

	
	public Wealth() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void addAsset(Asset asset)
	{
		assetList.add(asset);
	}
	
	public double getNetWorth()
	{
		return 0.0;
	}
	
	public int getTotalAssets()
	{
		return assetList.size();
	}
	
	public double getTotalDebts()
	{
		return 0.0;
	}
	
	public String getAssetSummary()
	{
		String output=null;
		
		for(Asset asset:assetList){
			output+=asset.toString()+"\n";
			}
		return output;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder();
		sb.append("Total Net Worth: $");
		sb.append(getNetWorth());
		sb.append("; Assets: $"+getTotalAssets());
		sb.append("; Debts: $"+getTotalDebts());
		return sb.toString();
	}
	
	
}
