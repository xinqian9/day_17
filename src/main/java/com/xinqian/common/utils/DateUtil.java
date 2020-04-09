package com.xinqian.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	/*
	* 方法1：(10分)
	* 给一个时间对象，返回该时间所在月的1日0时0分0秒。例如一个Date对象的值是2019-05-18 11:37:22
	* 则返回的结果为2019-05-01 00:00:00
	*/
	public static Date getDateByInitMonth(Date src) throws ParseException{
	//TODO 实现代码
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String format = sdf.format(src);
		String str = format.substring(0, 7);
		String initMonth="";
		initMonth=str+"-01 00:00:00";
		return sdf.parse(initMonth);
	}
	/*
	* 方法2：(10分)
	* 给任意一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。
	* 例如一个Date对象的值是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
	* 例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
	*/
	public static Date getDateByFullMonth(Date src) throws ParseException{
	//TODO 实现代码

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String format = sdf.format(src);
		String month = format.substring(6, 7);
		String ny=format.substring(0, 7);
		String n=format.substring(0, 4);
		int nn = Integer.parseInt(n);
		String fullMonthDay="";
		if (month.equals("1")||month.equals("3")||month.equals("5")||month.equals("7")||month.equals("8")||month.equals("10")||month.equals("12")) {
			
			fullMonthDay=ny+"-31 23:59:59";
			System.out.println(fullMonthDay);
		}else if(month.equals("4")||month.equals("6")||month.equals("9")||month.equals("11")) {
			fullMonthDay=ny+"-30 23:59:59";
		}
		else if(nn%4==0){
			fullMonthDay=ny+"-29 23:59:59";
		}else {
			fullMonthDay=ny+"-28 23:59:59";
		}
		return sdf.parse(fullMonthDay);
	}
	
	

}
