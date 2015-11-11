package InterfaceDesign;

import java.util.ArrayList;
import java.util.List;

import InheritanceDesign.Asset;

public class Wealth implements Debt,Asset{

	List<Debt> DebtList=new ArrayList<Debt>();
	List<Asset> AssetList=new ArrayList<Asset>();
	
	public double getAssetValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getDebtAmount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void addDebt(Debt debt)
	{
		DebtList.add(debt);
	}
	
	public void addAsset(Asset asset)
	{
		AssetList.add(asset);
	}
	
	public double getNetWorth()
	{
		return 0.0;
	}
	
	public double getTotalAssets()
	{
		return 0.0;
	}
	
	public double getTotalDebts()
	{
		return 0.0;
	}
	
	public String getAssetSummary()
	{
		String output=null;
		
		for(Asset asset:AssetList){
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
