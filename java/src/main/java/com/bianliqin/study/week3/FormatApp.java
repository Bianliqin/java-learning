package com.bianliqin.study.week3;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
/**
 * @ClassName FormatApp
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/10/19
 **/

public class FormatApp {
    public static void main(String[] args) throws ParseException, InterruptedException {
        //Date对象的原始输出
        System.out.println(new Date());
        //将CST转成GMT时间
        String format = FormatUtil.format(new Date(), Locale.US);
        System.out.printf(format);
        //统一格式化时间
        System.out.println(FormatUtil.format(new Date()));
        //自定义格式时间
        System.out.printf(FormatUtil.format(new Date(),"yyyy年MM月dd日 HH:mm:ss"));
        //格式化数字
        System.out.printf(FormatUtil.format(5.6666677777));

        System.out.println("************");
        long start = System.currentTimeMillis();
        System.out.printf("现在的时间戳"+start);
        //让主线程休眠3秒
        Thread.sleep(2000);
        long end = System.currentTimeMillis();
        System.out.println("现在的时间戳"+start);
        System.out.printf("两个时间戳的差值"+(end -start));
        System.out.printf("经过了"+(end - start) / 1000+"秒");

        System.out.println("************");
        //将指定格式的时间表达式，解析为一个Date对象
        //时间戳是从1970-01-11 00:00:00+0000开始的，我们在东八区，规范的表示为：2020-09-12 08:00:00+0800
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ");
        long unknown = sdf.parse("2020-10-19 15:37:20+0000").getTime();
        System.out.printf("一个未知的时间戳"+unknown);
        System.out.printf("和我们此刻的时间相差"+Math.abs(unknown - System.currentTimeMillis())/1000/3600+"小时");

        System.out.println("************");
        //时区的设置
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long some = sdf1.parse("2020-10-19 08:00:00").getTime();
        System.out.println(some);
        System.out.println(System.currentTimeMillis());
        System.out.printf("和我们此刻的时间相差"+Math.abs(unknown - System.currentTimeMillis())/1000/3600+"小时");

    }
}