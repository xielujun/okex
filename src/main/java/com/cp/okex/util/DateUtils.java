package com.cp.okex.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	
	public enum DateFormat{
		
		短时间格式("yyyy-MM-dd"),
		长时间格式("yyyy-MM-dd HH:mm:ss"),
		短时间格式_无符号("yyyyMMdd"),
		长时间类型_无符号("yyyyMMddHHmmss");
		
		private String value;
		
		DateFormat(String value){
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}
		
	}
	
	private DateUtils() {}
	
	
	public static String getCurrentDate(DateFormat format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format.getValue());
		return sdf.format(new Date());
	}
	
	public static String getCurrentDate() {
		return getCurrentDate(DateFormat.长时间格式);
	}

}
