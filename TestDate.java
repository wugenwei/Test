package cn.njust.TestDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdt = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
		Date d = sdt.parse(sdt.format(new Date()));
		// test
		System.err.println(d instanceof Date);
		System.err.println(d);
		System.err.println(sdt.format(new Date()));

		// test2 12 and 24小时制
		// HH是24小时制，hh对应12小时制
		SimpleDateFormat sdt2 = new SimpleDateFormat("yy-MM-dd hh-mm-ss");
		System.err.println(sdt2.format(new Date()));
	}
}
// 13-08-21 20-02-13
// true
// Wed Aug 21 20:02:13 CST 2013
