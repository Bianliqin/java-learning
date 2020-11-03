package com.bianliqin.study.javadaily;

/**
 * @ClassName EnumTest
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/11/3
 **/
enum ColorEnum{
        RED,
        BLUE,
        YELLOW,
        GREEN
    }

    public class EnumTest {
        public static void main(String[] args) {
            ColorEnum colorEnum = ColorEnum.GREEN;
            switch (colorEnum){
                case RED:
                    System.out.println("Red");
                    break;
                case BLUE:
                    System.out.println("Blue");
                    break;
                case GREEN:
                    System.out.println("Green");
                    break;
                case YELLOW:
                    System.out.println("Yellow");
                    break;
                default:
                    break;
            }
        }
    }
