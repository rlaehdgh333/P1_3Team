package com.sist;
import javax.swing.*;
import java.awt.*;
public class Login extends JPanel{
	Image back;
	JLabel la1,la2;
	JTextField tf;
	JPasswordField pf;
	JButton b1,b2;
	//���� (�ʱ�ȭ)
	/*
	 * JPanel =>�ε�
	 * 			1)������ ȣ��
	 * 			2)update() => clearRect()
	 * 			  paint() => paintConponent()
	 * 			==>ȭ�� ����
	 */	
	public Login()
	{
		back=getToolkit().getDefaultToolkit().getImage("C:\\image\\back.jpg");
		la1=new JLabel("ID");
		la2=new JLabel("PWD");
		tf=new JTextField();
		pf=new JPasswordField();
		b1=new JButton("�α���");
		b2=new JButton("ȸ������");	
		
		//��ġ
		/*setLayout(new GridLayout(3, 2, 5, 5));
		//5�� �¿찣�� �׸��� ���Ʒ�����
		//3�� ���ο��ִ� �� 2�� ���ο� �ִ°� 2�� ��(ĭ������ �����ϸ�)
		 */		
		setLayout(null); //null�� ����ڰ� ���� �����Ѵ�. �α���â ����� ���� ����
		la1.setBounds(10, 15, 30, 30);
		//10+30 �� 45(����5����) 15+30�� 45
		tf.setBounds(45, 15, 150, 30);
		la2.setBounds(10, 50, 30, 30);
		pf.setBounds(45, 50, 150, 30);
		
		JPanel p=new JPanel(); //FlowLayout
		p.add(b1);
		p.add(b2); 
		p.setBounds(10,85,185,35);  //��� �κ�
		p.setOpaque(false); //����
		//�߰�
		add(la1); add(tf);
		add(la2); add(pf);
		//add(b1); add(b2);
		add(p);
		//�߰��Ǵ� ������� �Ǿ��־����.
	}
	@Override
	protected void paintComponent(Graphics g) {
		//paintComponent �ڵ� ȣ��
		g.drawImage(back, 0, 0, getWidth(),getHeight(),this);
	}
	
}

