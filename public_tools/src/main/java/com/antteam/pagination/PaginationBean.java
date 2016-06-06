package com.antteam.pagination;

import java.io.Serializable;

public class PaginationBean<T> implements Serializable{

	private static final long serialVersionUID = -5587249940635839267L;

	private T bean;
	private int page=1;//当前页码
	private int rows=10;//每页几条记录
	private int min=0;
	public PaginationBean() {
	}
	public PaginationBean(T bean, Pagination pagination) {
		super();
		this.bean = bean;
	}
	
	public T getBean() {
		return bean;
	}
	public void setBean(T bean) {
		this.bean = bean;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getMin() {
		if(page>1){
			return (page-1)*rows;
		}
		return 0;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	
}
