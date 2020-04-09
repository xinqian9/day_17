package com.xinqian.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.xinqian.common.utils.DateUtil;
import com.xinqian.common.utils.FileUtil;

public class TestUtils {

	@Test
	public void testInitMonth() {
		try {
			Date initMonth = DateUtil.getDateByInitMonth(new Date());
			System.out.println(initMonth);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testFullMonth() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date parse = sdf.parse("2020-02-01 12:23:02");
		Date dateByFullMonth = DateUtil.getDateByFullMonth(parse);
		System.out.println(dateByFullMonth);
	}
	
	@Test
	public void testExtendName() {
		String extendName = FileUtil.getExtendName("aaa.jpg");
		System.out.println(extendName);
	}
	
	@Test
	public void testSql() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String sql="select * from t_order where create_time>='"+sdf.format(DateUtil.getDateByInitMonth(new Date()))+"' and create_time<='"+sdf.format(DateUtil.getDateByFullMonth(new Date()))+"'";
		System.out.println(sql);
	}
}
