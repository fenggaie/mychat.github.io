package client;
import java.awt.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class ChatRoom extends JFrame  implements ActionListener{
//窗口控件声名
	private   JPanel  downPanel;
	private   JLabel lblOnLineUserList,lblOnLineTotal ,lblOnLineCount,lblMessage;
	private  JLabel lblToUser,lblChatContent;
	
	private JList  lstUserList;
	private JTextArea  txtMessage;
	private JComboBox cmbUser,cmbFace;
	private String  onLineUserList[]={"所有人"};
	private JTextField  txtChatContent;
	private JButton btnSend,btnClear,btnSave,btnExt;
	
	String chatUser;   //当前用户名
public ChatRoom(String  name){
	//创建窗口以及面板对象
	  super("聊天室【用户："+name+"】");
	 chatUser=name;
	downPanel=new JPanel(); downPanel.setBackground(Color.GREEN);
	//创建标签控件
	lblOnLineUserList=new JLabel("【在线用户列表】");
	lblOnLineTotal=new JLabel("在线人数:");
	lblOnLineCount=new JLabel("0");
	lblMessage=new JLabel("【聊天信息】");
	
	lstUserList=new JList();
		
	lstUserList.setBackground(Color.pink);
	txtMessage=new JTextArea(18,35 );
	txtMessage.setBackground(Color.white);
	//为使在线用户列表带有滚动条，将列表框填入面板
	JScrollPane  jscrollP=new JScrollPane  (lstUserList);  
	//为使聊天内容显示区带有滚动条，将文本域填入面板
	JScrollPane  jscrollP2=new JScrollPane  (txtMessage);  

	//添加控件/*
 
	this.getContentPane().add(lblOnLineUserList);
	this.getContentPane().add(this.lblOnLineTotal);
	this.getContentPane().add(this.lblOnLineCount); 
	this.getContentPane().add(this.lblMessage);
	this.getContentPane().add(jscrollP);         //添加列表框的面板
	this.getContentPane().add(jscrollP2);    //添加文本域的面板
	
	lblOnLineUserList.setBounds(5, 5, 110, 20);
	lblOnLineTotal.setBounds( 120, 5, 60, 20);
	lblOnLineCount.setBounds( 180, 5, 20,20  );
	lblMessage.setBounds( 250, 5, 100, 20);
	
	jscrollP.setBounds(5, 25, 200, 320);	 
	jscrollP2.setBounds( 210, 25, 380, 320);

	//下一个面板的
	lblToUser=new JLabel("你对：");
	lblChatContent=new JLabel("说：");
	 
	//创建控件	
	//下一个面板的
	cmbUser=new  JComboBox(onLineUserList);  //用户列表
	cmbFace=new  JComboBox(new String[] { "表情", "微笑",
			"甜笑", "惊喜", "嘻嘻", "扮酷", "嘿嘿", "傻笑", "好奇", "媚眼", "鬼脸", "陶醉",
			"害羞", "生气", "嚷嚷", "发怒", "伤心", "高明", "菜鸟", "问号", "狂笑", "大哭",
			"示爱", "呻吟", "想想" });                   //表情列表
	
	txtChatContent=new JTextField(25);//该尺寸会严重影响界面
	btnSend=new JButton("发送");
	btnClear=new JButton("清屏");
	btnSave=new JButton("保存");
	btnExt=new JButton("退出");
	
	//添加控件
	//downPanel.setLayout(null);
	this.downPanel.add(this.lblToUser);
	this.downPanel.add(this.cmbUser);
	this.downPanel.add(this.lblChatContent);
	this.downPanel.add(this.txtChatContent);
	this.downPanel.add(cmbFace );
	this.downPanel.add(this.btnSend);
	this.downPanel.add(btnClear );
	this.downPanel.add(btnSave );
	this.downPanel.add(btnExt );
	
	
	lblToUser.setBounds(5, 5, 15, 10);
	cmbUser.setBounds( 20, 5, 20 , 10);
	lblChatContent.setBounds( 40, 5, 10, 10);
	txtChatContent.setBounds(50, 5, 20, 10);  
	cmbFace.setBounds( 72, 5, 20, 10);
	btnSend.setBounds(90, 5, 20, 10);
	 
//设置窗口以及窗口内面板
	this.getContentPane().setLayout(null);		 
	this.getContentPane().add(downPanel); 
	downPanel.setBounds(0, 350, 600, 150);
	this.setSize(600, 500);
	this.setVisible(true);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//注册监听
	btnSend.addActionListener(this);
	btnClear.addActionListener(this);
	btnSave.addActionListener(this);
	btnExt.addActionListener(this);
	  
	
}

 
	//按钮事件
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton  sourceObj=(JButton)arg0.getSource();
		if(sourceObj.equals(btnSend)){   //监听到发送按钮
			sendMessage();
		}
		if(sourceObj.equals(btnClear)){    //监听到清空按钮
				clearMessage();
			}
		if(sourceObj.equals(btnSave)){  //监听到保存按钮
			saveMessage();
		}
		if(sourceObj.equals(btnExt)){  //监听到退出按钮
			exitChat();
		}
		
	}
	//退出
	private void exitChat() {
	
		
	}
	private   void saveMessage() {
		//  
		
	}
	private void clearMessage() {
		// 
		this.txtMessage.setText("");
	}
	private void sendMessage() {
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ChatRoom("feng");

	}
	 

}
