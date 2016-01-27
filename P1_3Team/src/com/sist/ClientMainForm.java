package com.sist;
import java.awt.*;//Layout
import javax.swing.*;//window
import java.awt.event.*;
public class ClientMainForm extends JFrame
implements ActionListener{
	
	
	CardLayout card= new CardLayout();
	Login login=new Login(); //login은패널
	WaitRoom wr=new WaitRoom();
	Sign sign = new Sign();
	
	// String name1 = name.getText().trim(); JTextField
	public ClientMainForm()
	{
		setLayout(card);//BoarderLayout
		
		add("LOG",login);
		add("WR",wr);
		add("SIGN",sign);
		//크기
		setSize(800, 600);
		setLocation(200,200);
		//윈도우 보여라
		setVisible(true);
		setResizable(false);
		
		login.b1.addActionListener(this);
		login.b2.addActionListener(this);
		wr.tf.addActionListener(this);
		sign.b1.addActionListener(this);
		sign.b2.addActionListener(this);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//생성자 호출
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
		else if(e.getSource() == login.b2){
			setSize(250, 250);
			card.show(getContentPane(),"SIGN");
			
		}
	/*	else if(e.getSource() == "WR".b2){
			setSize(250, 250);
			card.show(getContentPane(),"SIGN");
			
		}*/
		else if(e.getSource() == sign.b1){
			// if(name1.length <= 2 || name1.length >= 10){}
			setSize(800, 600);
			
			setLocation(200,200);
			JOptionPane.showMessageDialog(null,"회원가입완료!!");
			
			card.show(getContentPane(),"LOG");
			
			
		}
		else if(e.getSource() == sign.b2){
			setSize(800, 600);
		
			card.show(getContentPane(),"LOG");
		}
		else if(e.getSource()==wr.tf)
		{
			String data=wr.tf.getText();
			wr.ta.append(data+"\n");
			wr.tf.setText("");
		}
	}

}
