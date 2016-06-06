package com.antteam.pagination;

public class Pagination {
	private int pageSize=10;
	private int min;//
	
	public Pagination(int currentPage) {
		super();
		setMin(currentPage,pageSize);
	}
	
	public Pagination(int currentPage, int pageSize) {
		super();
		this.pageSize = pageSize;
		setMin(currentPage,pageSize);
	}
	
	private int setMin(int currentPage,int pageSize){
		if(currentPage>1){
			this.min=(currentPage-1)*pageSize;
			return min;
		}
		return 0;
	}
	
	
}
