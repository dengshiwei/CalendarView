package com.dsw.datepicker;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dsw.calendarview.R;
import com.dsw.datepicker.MonthDateView.DateClick;

public class CalendarView extends LinearLayout {
	private ImageView iv_left;
	private ImageView iv_right;
	private TextView tv_date;
	private TextView tv_week;
	private TextView tv_today;
	private MonthDateView monthDateView;
	private DateViewClick dateViewClick;
	private List<DayAndPrice> listDayAndPrice = new ArrayList<DayAndPrice>();
	private List<WorkOrRelax> listWorkOrRelax = new ArrayList<WorkOrRelax>();
	public CalendarView(Context context, AttributeSet attrs) {
		super(context, attrs);
		View view = LayoutInflater.from(context).inflate(R.layout.activity_date, this);
		iv_left = (ImageView) view.findViewById(R.id.iv_left);
		iv_right = (ImageView) view.findViewById(R.id.iv_right);
		monthDateView = (MonthDateView) view.findViewById(R.id.monthDateView);
		tv_date = (TextView) view.findViewById(R.id.date_text);
		tv_week  =(TextView) view.findViewById(R.id.selectDate_text);
		tv_today = (TextView) view.findViewById(R.id.tv_today);
		monthDateView.setTextView(tv_date,tv_week);
		monthDateView.setDayAndPriceList(listDayAndPrice);
		monthDateView.setDaysWorkOrRelaxList(listWorkOrRelax);
		monthDateView.setDateClick(new DateClick() {
			
			@Override
			public void onClickOnDate() {
				if(dateViewClick != null){
					dateViewClick.dateClick();
				}
			}
		});
		setOnlistener();
	}
	/**
	 * 设置监听
	 */
	private void setOnlistener(){
		iv_left.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				monthDateView.onLeftClick();
			}
		});
		
		iv_right.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				monthDateView.onRightClick();
			}
		});
		
		tv_today.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				monthDateView.setTodayToView();
			}
		});
	}
	
	
	/**
	 * 设置有事务的号码
	 * @param listDayAndPrice
	 */
	public void setListDayAndPrice(List<DayAndPrice> listDayAndPrice) {
		this.listDayAndPrice = listDayAndPrice;
		monthDateView.setDayAndPriceList(listDayAndPrice);
	}
	/**
	 * 设置哪天是休息天的号码
	 * @param listWorkOrRelax
	 */
	public void setListWorkOrRelax(List<WorkOrRelax> listWorkOrRelax) {
		this.listWorkOrRelax = listWorkOrRelax;
		monthDateView.setDaysWorkOrRelaxList(listWorkOrRelax);
	}
	
	/**
	 * 获取所选择的年份
	 * @return
	 */
	public int getSelectYear(){
		return monthDateView.getmSelYear();
	}
	
	/**
	 * 获取所选择的月份
	 * @return
	 */
	public int getSelectMonth(){
		return monthDateView.getmSelMonth();
	}
	/**
	 * 获取所选择的日期
	 * @return
	 */
	public int getSelectDay(){
		return monthDateView.getmSelDay();
	}
	
	/**
	 * 设置日期的click事件
	 * @param dateViewClick
	 */
	public void setDateViewClick(DateViewClick dateViewClick) {
		this.dateViewClick = dateViewClick;
	}
	public interface DateViewClick{
		public void dateClick();
	}

}
