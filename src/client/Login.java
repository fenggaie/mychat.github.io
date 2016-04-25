package client;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.Socket;

public class Login extends JFrame implements ActionListener {

	private JTextField txtServer,txtUserName;
	private JPasswordField txtPwd;
	private JButton btnLogin,btnRegist,btnExit;
	
	private JPanel p;
	public Login(){
		
		super("登录窗");//设置登录窗体标题
		JLabel lblServer,lblUserName,lblPwd;
		//创建组件对象
		lblServer=new JLabel("服务器：");
		lblUserName=new JLabel("用户名：");
		lblPwd=new JLabel("口 令：");
		
		txtServer=new JTextField(20);
		txtUserName=new JTextField(20);
		txtPwd=new JPasswordField(20);
		
		btnLogin=new JButton("登陆");
		btnRegist=new JButton("注册");
		btnExit=new JButton("退出");
		
		//创建面板，并添加组件
		p=new JPanel();
		p.setLayout(null);
		p.add(lblServer);
		p.add(txtServer);
		p.add(lblUserName);
		p.add(txtUserName);
		p.add(lblPwd);
		p.add(txtPwd);
		p.add(btnLogin);
		p.add(btnRegist);
		p.add(btnExit);
		//设置组件在面板的位置		
		lblServer.setBounds(5, 30, 100, 30);
		txtServer.setBounds(105, 30, 100, 25);
		
		lblUserName.setBounds(5, 65, 100, 30);
		txtUserName.setBounds(105, 65, 100, 25);
		
		lblPwd.setBounds( 5, 100, 100, 30);
		txtPwd.setBounds(105, 100 , 100, 25);
		
		btnLogin.setBounds(10, 135, 60,  25);
		btnRegist.setBounds(90, 135, 60,  25);
		btnExit.setBounds(170, 135, 60,  25);
	
		//给窗体添加面板
		getContentPane().add(p);
		
		//设置窗口属性	
		setSize(250, 220);
		setVisible(true);
		
		//按钮注册监听
		btnLogin.addActionListener(this);
		btnRegist.addActionListener(this);
		btnExit.addActionListener(this);
		
		//设置窗口关闭按钮的操作
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public void actionPerformed(ActionEvent arg0) {
		//获得数据源
		JButton  source=(JButton)arg0.getSource();
		if(source==btnLogin)	{  
			//如果是登录按钮的话，检查用户名与口令不空时登陆
			if(txtUserName.getText().equals(""))
				JOptionPane.showMessageDialog(null, "用户名不能为空");
			if(txtPwd.getPassword().length ==0)
				JOptionPane.showMessageDialog(null, "口令不能为空");
			if(!(txtUserName.getText().equals("")) && txtPwd.getPassword().length !=0)
				login();
		}
		if(source==btnRegist){
			//如果是登录按钮的话,调用注册窗口
			regist();
		}
		if(source==btnExit){
			//如果是退出按钮的话，
			System.exit(1);
		}
	}
	//登陆按钮调用
	public void login(){
		
	}
	// 注册按钮调用
	public void regist(){
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Login();

	}
         
}
