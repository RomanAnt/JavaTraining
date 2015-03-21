package org.art.practicaljava.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Query {
	
	private String date,
				   stockName,
				   price;
	
	public Query(Date d, String stock, String prc){
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		date = sdf.format(d);
		stockName = stock;
		price = prc;
	}
	
	public String getDate() {
		return date;
	}
	public String getStockName() {
		return stockName;
	}
	public String getPrice() {
		return price;
	}
}
