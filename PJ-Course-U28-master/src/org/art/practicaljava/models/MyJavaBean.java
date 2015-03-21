package org.art.practicaljava.models;

import java.io.Serializable;
import java.util.ArrayList;

import org.art.practicaljava.dto.Query;

public class MyJavaBean implements Serializable{
	public MyJavaBean(){
		
	}
	public ArrayList<Query> getQueries() {
		return queries;
	}
	public void setQueries(ArrayList<Query> queries) {
		this.queries = queries;
	}
	private ArrayList<Query> queries = new ArrayList<>();
}
