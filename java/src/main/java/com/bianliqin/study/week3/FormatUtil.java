package com.bianliqin.study.week3;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
/**
 * @ClassName FormaUtil
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/10/19
 **/
public class FormaUtil {
    /**
     * 将Date对象格式化为"yyyy-MM-dd HH:mm:ss"的格式
     * @param date
     * @return
     */
    public  static String format(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }

    /**
     * 将Date对象格式化为指定时区的字符串时间
     * @param date
     * @param tz
     * @return
     */
    public static String format(Date date , Locale tz){
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:ss zzz yy");
        sdf.setTimeZone(TimeZone.getTimeZone("GTM+8"));
        return sdf.format(date);
    }

    /**
     * 将Date对象格式化为传入的指定格式返回
     * @param date
     * @param regex
     * @return
     */
    public  static String format(Date date,String regex){
        DateFormat df = new SimpleDateFormat(regex);
        return df.format(date);
    }

    //方法重复定义 删去重复定义函数吧 或者重命名 或者想办法改变参数的个数和类型触发函数的重载

    /**
     *将入参的double数据格式化为指定格式返回
     * @param number
     * @return
     */
    public static String format(double number){
        DecimalFormat decimalFormat = new DecimalFormat();
        return  decimalFormat.format(number);
    }
}
