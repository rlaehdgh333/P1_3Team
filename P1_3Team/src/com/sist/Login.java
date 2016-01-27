package com.sist;
import javax.swing.*;
import java.awt.*;
public class Login extends JPanel{
	Image back;
	JLabel la1,la2;
	JTextField tf;
	JPasswordField pf;
	JButton b1,b2;
	//저장 (초기화)
	/*
	 * JPanel =>로딩
	 * 			1)생성자 호출
	 * 			2)update() => clearRect()
	 * 			  paint() => paintConponent()
	 * 			==>화면 변경
	 */	
	public Login()
	{
		back=getToolkit().getDefaultToolkit().getImage("C:\\image\\back.jpg");
		la1=new JLabel("ID");
		la2=new JLabel("PWD");
		tf=new JTextField();
		pf=new JPasswordField();
		b1=new JButton("로그인");
		b2=new JButton("회원가입");	
		
		//배치
		/*setLayout(new GridLayout(3, 2, 5, 5));
		//5는 좌우간격 그리고 위아래간격
		//3은 세로에있는 값 2는 가로에 있는값 2개 들어감(칸막으로 생각하면)
		 */		
		setLayout(null); //null은 사용자가 직접 지정한다. 로그인창 모양을 직접 지정
		la1.setBounds(10, 15, 30, 30);
		//10+30 은 45(간격5포함) 15+30은 45
		tf.setBounds(45, 15, 150, 30);
		la2.setBounds(10, 50, 30, 30);
		pf.setBounds(45, 50, 150, 30);
		
		JPanel p=new JPanel(); //FlowLayout
		p.add(b1);
		p.add(b2); 
		p.setBounds(10,85,185,35);  //가운데 부분
		p.setOpaque(false); //투명
		//추가
		add(la1); add(tf);
		add(la2); add(pf);
		//add(b1); add(b2);
		add(p);
		//추가되는 순서대로 되어있어야함.
	}
	@Override
	protected void paintComponent(Graphics g) {
		//paintComponent 자동 호출
		g.drawImage(back, 0, 0, getWidth(),getHeight(),this);
	}
	
}

