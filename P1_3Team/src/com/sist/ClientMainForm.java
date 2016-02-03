package com.sist;
import java.awt.*;//Layout
import javax.swing.*;//window
import java.awt.event.*;
public class ClientMainForm extends JFrame
implements ActionListener{
	
	CardLayout card= new CardLayout();
	Login login=new Login(); //login���г�
	WaitRoom wr=new WaitRoom();
	Sign sign = new Sign();
	Help h=new Help();
	MakeRoom mr=new MakeRoom();
	
	// String name1 = name.getText().trim(); JTextField
	public ClientMainForm()
	{
		setLayout(card);//BoarderLayout
		
		add("LOG",login);
		add("WR",wr);
		//ũ��
		setSize(800, 600);
		setLocation(200,150);
		//������ ������
		setVisible(true);
		setResizable(false);
		
		login.b1.addActionListener(this);
		login.b2.addActionListener(this);
		wr.tf.addActionListener(this);
		wr.b1.addActionListener(this);
		wr.b2.addActionListener(this);
		wr.b3.addActionListener(this);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������ ȣ��
		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
			//Jtattoo.jar
		}catch(Exception ex){}
		ClientMainForm cm=new ClientMainForm();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==login.b1)
		{
			card.show(getContentPane(), "WR");
		}
		else if(e.getSource()==login.b2)
		{
			sign.setBounds(500, 300, 230, 235);
	        sign.setVisible(true);
		}
		else if(e.getSource()==wr.tf)
		{
			String data=wr.tf.getText(); //�����Է��Ѱ� ��������
			wr.ta.append(data+"\n"); //ä��â�� �����̰� ���ٳ�����
			wr.tf.setText("");
		}
		else if(e.getSource()==wr.b1)
		{
			mr.setBounds(500, 300, 230, 235);
	        mr.setVisible(true);
		}
		else if(e.getSource()==wr.b2)
		{
			h.setBounds(285, 180, 300, 300);
			h.setVisible(true);
		}
		else if(e.getSource()==wr.b3)
		{
			dispose();
	    	System.exit(0);
		}
	}

}
