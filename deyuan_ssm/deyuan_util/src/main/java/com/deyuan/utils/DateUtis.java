package com.deyuan.utils;

import java.nio.file.StandardWatchEventKinds;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtis {

    //日期转字符串
    public  static String  date2String(Date date,String patt){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(patt);// yyyy-MM-dd HH MM dd
        String format = simpleDateFormat.format(date);
        return format;
    }
    //字符串转日期
    public static  Date string2Date(String str,String patt){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(patt);
        try {
            Date date = simpleDateFormat.parse(str);
            return date;
        } catch (ParseException e) {
           throw  new RuntimeException("日期格式转换异常"+e);
        }
    }
}
