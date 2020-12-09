package com.liqinbian.sm.frame;

import com.liqinbian.sm.entity.Admin;
import com.liqinbian.sm.factory.ServiceFactory;
import com.liqinbian.sm.utils.ResultEntity;


import javax.swing.*;



/**
 * @ClassName AdminLoginFrame
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/11/17
 **/
public class AdminLoginFrame extends JFrame {
    private JPanel mainPanel;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton loginBtn;
    private JButton resetBtn;
    private JLabel 密码;
    private JLabel 账号;


    public AdminLoginFrame() {
        this.setTitle("AdminLoginFrame");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        loginBtn.addActionListener(e ->{
            //获得输入的账号和密码，注意密码框组件的使用方法
            String account = textField1.getText().trim();
            String password = new String(passwordField1.getPassword()).trim();
            ResultEntity resultEntity = ServiceFactory.getAdminServiceInstance().adminLogin(account,password);
            JOptionPane.showMessageDialog(mainPanel,resultEntity.getMessage());
            if (resultEntity.getCode()==0){
                //关闭登录界面，进入主界面
                this.dispose();
                Admin admin = (Admin) resultEntity.getData();
                new MainFrame(admin.getAdminName());
            }else{
                textField1.setText("");
                passwordField1.setText("");
            }
        });
        resetBtn.addActionListener(e->{
            textField1.setText("");
            passwordField1.setText("");
        });
    }

    public static void main(String[] args)  {
        new AdminLoginFrame();
    }
}
