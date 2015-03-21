package org.art.practicaljava.services;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class StockPriceGen {
	private static String price=null;
	private static ArrayList<String> nasdaqSymbols = new ArrayList<String>();
	
	static {
		nasdaqSymbols.add("AAPL");
		nasdaqSymbols.add("MSFT");
		nasdaqSymbols.add("YHOO");
		nasdaqSymbols.add("AMZN");
	}
	
	public static String getQuote(String symbol){
		if (nasdaqSymbols.indexOf(symbol.toUpperCase())!=-1){
			DecimalFormat df = new DecimalFormat("##.##");
			return df.format((new Double(Math.random()*100)));
		}else{
			return null;
		}
	}
	
	public static ArrayList<String> getNasdaqSymbols(){
		return nasdaqSymbols;
	}
}