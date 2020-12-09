package com.liqinbian.sm.component;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName ImgPanel
 * @Description 自定义绘制背景图的面板类
 * @Author huachengyu
 * @Date 2020/12/8
 **/
public class ImgPanel extends JPanel {
    private String fileName;

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    protected void paintComponent(Graphics g) {
        ImageIcon icon = new ImageIcon("D:/pictures" + fileName);
        Image image = icon.getImage();
        g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), icon.getImageObserver());
    }
}
