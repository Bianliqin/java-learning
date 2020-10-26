package com.bianliqin.study.javadaily;

import java.io.*;

/**
 * @ClassName FileReadDemo
 * @Description 文件读取练习——用InputStream和OutputStream来实现
 * @Author huachengyu
 * @Date 2020/10/26
 **/
public class FileCopyDemo {
    public static void main(String[] args) throws IOException{
        //创建一个文件File对象，注意需要显式抛出异常（IOException是编译时异常）
        //可以用try catch 捕获，也可以在方法签名处使用 throws 抛出
        File inputFile = new File("D:/my-learning/java/src/main/java/com/.idea/com.iml");
        //创建一个字节输入流，此处有上转型对象
        InputStream is = new FileInputStream(inputFile);
        //准备和文件大小一致的字节数组
        byte[] b = new byte[(int) inputFile.length()];
        //通过字节输入流将文件读入数组
        is.read(b);
        //准备输出文件对象
        File outputFile = new File("D:/my-learning/java/src/main/java/com/.idea/c.iml");
        //准备输出流
        OutputStream os = new FileOutputStream(outputFile);
        os.write(b);
        is.close();
        os.close();
    }
}
