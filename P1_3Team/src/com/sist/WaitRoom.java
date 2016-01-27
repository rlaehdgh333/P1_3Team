package com.sist;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
public class WaitRoom extends JPanel{
	Image back;
	JTable table1,table2,table3;
	DefaultTableModel model1,model2,model3;
	JTextArea ta;
	JTextField tf;
	JComboBox box;
	JPanel movie;
	JButton b1,b2;
	
	public WaitRoom()
	{
		back=Toolkit.getDefaultToolkit().getImage("c:\\image\\back.jpg");
		String[] coll={"방이름","인원","게임상태"};
		String[][] row1=new String[0][3];
		model1=new DefaultTableModel(row1, coll);
		table1=new JTable(model1);
		JScrollPane js1=new JScrollPane(table1);
		
		String[] col2={"순위","ID","승률"};
		String[][] row2=new String[0][3];
		model2=new DefaultTableModel(row2, col2);
		table2=new JTable(model2);
		JScrollPane js2=new JScrollPane(table2);
		
		String[] col4={"ID","승률"};
		String[][] row4=new String[0][2];
		model3=new DefaultTableModel(row4, col4);
		table3=new JTable(model3);
		JScrollPane js4=new JScrollPane(table3);
		
		//채팅
		ta=new JTextArea();
		JScrollPane js3=new JScrollPane(ta);
		tf=new JTextField();
		box=new JComboBox();
		box.addItem("black");
		box.addItem("blue");
		box.addItem("pink");
		box.addItem("green");
		box.addItem("cyan");
		
		movie=new JPanel();
		movie.setBackground(Color.black);
		
		b1=new JButton("방만들기");
		b2=new JButton("도움말");
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(1,1,5,5));
		p.add(b1);
		p.add(b2);
		
		p.setOpaque(false);
		
		setLayout(null);
		js1.setBounds(10, 10, 500, 325);
		js3.setBounds(10, 340, 500, 190);
		tf.setBounds(10, 535, 410, 30);
		box.setBounds(425, 535, 85, 30);
		js2.setBounds(515, 10, 265, 160);
		js4.setBounds(515, 175, 265, 160);
		movie.setBounds(515, 340, 265, 180);
		p.setBounds(515, 525, 265, 40);
		
		add(js1);
		add(js3);
		add(tf);
		add(box);
		add(js2);
		add(js4);
		add(movie);
		add(p);
	}
	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(back, 0, 0, getWidth(),getHeight(),this); 
	}

}
