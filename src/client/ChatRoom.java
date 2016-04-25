package client;
import java.awt.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class ChatRoom extends JFrame  implements ActionListener{
//���ڿؼ�����
	private   JPanel  downPanel;
	private   JLabel lblOnLineUserList,lblOnLineTotal ,lblOnLineCount,lblMessage;
	private  JLabel lblToUser,lblChatContent;
	
	private JList  lstUserList;
	private JTextArea  txtMessage;
	private JComboBox cmbUser,cmbFace;
	private String  onLineUserList[]={"������"};
	private JTextField  txtChatContent;
	private JButton btnSend,btnClear,btnSave,btnExt;
	
	String chatUser;   //��ǰ�û���
public ChatRoom(String  name){
	//���������Լ�������
	  super("�����ҡ��û���"+name+"��");
	 chatUser=name;
	downPanel=new JPanel(); downPanel.setBackground(Color.GREEN);
	//������ǩ�ؼ�
	lblOnLineUserList=new JLabel("�������û��б�");
	lblOnLineTotal=new JLabel("��������:");
	lblOnLineCount=new JLabel("0");
	lblMessage=new JLabel("��������Ϣ��");
	
	lstUserList=new JList();
		
	lstUserList.setBackground(Color.pink);
	txtMessage=new JTextArea(18,35 );
	txtMessage.setBackground(Color.white);
	//Ϊʹ�����û��б���й����������б���������
	JScrollPane  jscrollP=new JScrollPane  (lstUserList);  
	//Ϊʹ����������ʾ�����й����������ı����������
	JScrollPane  jscrollP2=new JScrollPane  (txtMessage);  

	//��ӿؼ�/*
 
	this.getContentPane().add(lblOnLineUserList);
	this.getContentPane().add(this.lblOnLineTotal);
	this.getContentPane().add(this.lblOnLineCount); 
	this.getContentPane().add(this.lblMessage);
	this.getContentPane().add(jscrollP);         //����б������
	this.getContentPane().add(jscrollP2);    //����ı�������
	
	lblOnLineUserList.setBounds(5, 5, 110, 20);
	lblOnLineTotal.setBounds( 120, 5, 60, 20);
	lblOnLineCount.setBounds( 180, 5, 20,20  );
	lblMessage.setBounds( 250, 5, 100, 20);
	
	jscrollP.setBounds(5, 25, 200, 320);	 
	jscrollP2.setBounds( 210, 25, 380, 320);

	//��һ������
	lblToUser=new JLabel("��ԣ�");
	lblChatContent=new JLabel("˵��");
	 
	//�����ؼ�	
	//��һ������
	cmbUser=new  JComboBox(onLineUserList);  //�û��б�
	cmbFace=new  JComboBox(new String[] { "����", "΢Ц",
			"��Ц", "��ϲ", "����", "���", "�ٺ�", "ɵЦ", "����", "����", "����", "����",
			"����", "����", "����", "��ŭ", "����", "����", "����", "�ʺ�", "��Ц", "���",
			"ʾ��", "����", "����" });                   //�����б�
	
	txtChatContent=new JTextField(25);//�óߴ������Ӱ�����
	btnSend=new JButton("����");
	btnClear=new JButton("����");
	btnSave=new JButton("����");
	btnExt=new JButton("�˳�");
	
	//��ӿؼ�
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
	 
//���ô����Լ����������
	this.getContentPane().setLayout(null);		 
	this.getContentPane().add(downPanel); 
	downPanel.setBounds(0, 350, 600, 150);
	this.setSize(600, 500);
	this.setVisible(true);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//ע�����
	btnSend.addActionListener(this);
	btnClear.addActionListener(this);
	btnSave.addActionListener(this);
	btnExt.addActionListener(this);
	  
	
}

 
	//��ť�¼�
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton  sourceObj=(JButton)arg0.getSource();
		if(sourceObj.equals(btnSend)){   //���������Ͱ�ť
			sendMessage();
		}
		if(sourceObj.equals(btnClear)){    //��������հ�ť
				clearMessage();
			}
		if(sourceObj.equals(btnSave)){  //���������水ť
			saveMessage();
		}
		if(sourceObj.equals(btnExt)){  //�������˳���ť
			exitChat();
		}
		
	}
	//�˳�
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
