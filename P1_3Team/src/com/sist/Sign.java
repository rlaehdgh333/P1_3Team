package com.sist;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Sign extends JFrame implements ActionListener{
	Image back;
	JLabel laName,laId,laPw,laC;
	JTextField id,name;
	JPasswordField pw;
	JButton b1,b2,c1,c2,c3,c4;
	
	//저장 (초기화)
	/*
	 * JPanel =>로딩
	 * 			1)생성자 호출
	 * 			2)update() => clearRect()
	 * 			  paint() => paintConponent()
	 * 			==>화면 변경
	 */	
	public Sign()
	{
		
	
		back=getToolkit().getDefaultToolkit().getImage("C:\\image\\back.jpg");
		laName = new JLabel("이름");
		laId = new JLabel("ID");
		laPw = new JLabel("PW");
		laC = new JLabel("캐릭터");
		
		name = new JTextField();
		id = new JTextField();
		pw = new JPasswordField();
		
		b1 = new JButton("회원가입");
		b2 = new JButton("취소");
		
		
		for(int i =1; i<=4;i++){
			
			ImageIcon ch1 =new ImageIcon("C:\\image\\down.gif");
			JButton btn1 = new JButton(ch1);
		}
		ImageIcon ch1 =new ImageIcon("C:\\image\\down.gif");
		JButton btn1 = new JButton(ch1);
		
		ImageIcon ch2 =new ImageIcon("C:\\image\\up.gif");
		JButton btn2 = new JButton(ch2);
		
		ImageIcon ch3 =new ImageIcon("C:\\image\\left.gif");
		JButton btn3 = new JButton(ch3);
		
		ImageIcon ch4 =new ImageIcon("C:\\image\\right.gif");
		JButton btn4 = new JButton(ch4);
		
		c1 = btn1;
		c2 = btn2;
		c3 = btn3;
		c4 = btn4;
		
		//배치
		//setLayout(new GridLayout(3, 2, 5, 5));
		//5는 좌우간격 그리고 위아래간격
		//3은 세로에있는 값 2는 가로에 있는값 2개 들어감(칸막으로 생각하면)
			
		setLayout(null); //null은 사용자가 직접 지정한다. 로그인창 모양을 직접 지정
		laName.setBounds(10, 15, 30, 30);
		laId.setBounds(10, 50, 30, 30);
		laPw.setBounds(10, 85, 30, 30);
		laC.setBounds(10, 120, 39, 30);

		name.setBounds(45, 15, 150, 30);
		id.setBounds(45, 50, 150, 30);
		pw.setBounds(45, 85, 150, 30);
		
		c1.setBounds(55, 120, 30, 30);
		c2.setBounds(95, 120, 30, 30);
		c3.setBounds(135, 120, 30, 30);
		c4.setBounds(175, 120, 30, 30);
		
		
		JPanel p=new JPanel(); //FlowLayout
		p.add(b1);
		p.add(b2);
		
		p.setBounds(10,150,185,35);  //가운데 부분
		p.setOpaque(false); //투명
		//추가
		add(laName);add(name);
		add(laId);add(id);
		add(laPw);add(pw);
		add(laC);add(c1);add(c2);add(c3);add(c4);
		//add(b1); add(b2);
		add(p);
		
		//추가되는 순서대로 되어있어야함.
		setSize(230,235);
	    //setVisible(true);
	    
	    b1.addActionListener(this);
	    b2.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1){
			JOptionPane.showMessageDialog(null,"회원가입완료!!");
			dispose();
	    }else if(e.getSource()==b2){
	    	 dispose();
	    }
	}
	
}

