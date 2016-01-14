package com.dsw.datepicker;

public class WorkOrRelax {
	public int year;
	public int month;
	/**
	 * 日期
	 */
	public int day;
	/**
	 * 状态：0位班，1位休息
	 */
	public int state;
	public WorkOrRelax(int year, int month, int day, int state) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
		this.state = state;
	}
}
