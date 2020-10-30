package com.bianliqin.study.javadaily;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.MonthDay;
import java.util.Date;

/**
 * @ClassName LocalDateTest
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/10/30
 **/
public class LocalDateTest {
    public static void main(String[] args) {
        getCurrentDate();
    }

    /**
     * 获取今天的日期
     */
    public static void getCurrentDate() {
        LocalDate today = LocalDate.now();
        System.out.println("Today's Local date :" + today);
        //这个是作为对比
        Date date = new Date() {
        };
        System.out.println(date);
        System.out.println("**************");
        getDetailDate();
        System.out.println("**************");
        handleSpecilDate();
        System.out.println("**************");
        compareDate();
        System.out.println("**************");
        cycleDate();
    }

    /**
     * 获取年、月、日信息
     */
    public static void getDetailDate() {
        LocalDate today = LocalDate.now();
        int year = today.getYear();
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();
        System.out.printf("Year : %d Month : %d day : %d t %n", year, month, day);
    }

    /**
     * 处理特定日期
     */
    public static void handleSpecilDate() {
        LocalDate dateOfBrith = LocalDate.of(2018, 01, 21);
        System.out.println("The specil date is :" + dateOfBrith);
    }

    /**
     * 判断两个日期是否相等
     */
    public static void compareDate() {
        LocalDate today = LocalDate.now();
        LocalDate datel = LocalDate.of(2018, 01, 21);
        if (datel.equals(today)) {
            System.out.printf("TODAY %s and DATE1 %s are same date %n", today, datel);
        }
    }

    /**
     * 处理周期性的日期
     */
    public static void cycleDate() {
        LocalDate today = LocalDate.now();
        LocalDate dateOfBrith = LocalDate.of(2018, 1, 21);
        MonthDay brithday = MonthDay.of(dateOfBrith.getMonth(), dateOfBrith.getDayOfMonth());
        MonthDay currentMonthDay = MonthDay.from(today);
        if (currentMonthDay.equals(brithday)) {
            System.out.println("Many Many happy returns of the day !!");
        } else {
            System.out.println("Sorry,today is not your birthday");
        }
    }
}
