package com.sist;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class WaitRoom extends JPanel {
	Image back;
	JTable table1, table2, table3;
	// 테이블관리
	DefaultTableModel model1, model2, model3;
	// 채팅 3가지
	JTextArea ta;
	JTextField tf;
	JComboBox box;
	JPanel movie; // 동영상
	JButton b1, b2, b3, b4, b5, b6;

	public WaitRoom() {
		String[][] col3 = new String[1][1];
		back = getToolkit().getDefaultToolkit().getImage("C:\\image\\back.jpg");
		String[] coll = { "방이름", "공개/비공개", "인원" };
		// 타이틀 잡기
		String[][] row1 = new String[0][3];
		// 배열인데 계속 추가 됨
		model1 = new DefaultTableModel(row1, coll);
		table1 = new JTable(model1);
		JScrollPane js1 = new JScrollPane(table1);

		String[] col2 = { "ID", "대화명", "성별", "위치" };
		// 타이틀 잡기
		String[][] row2 = new String[0][4];
		// 배열인데 계속 추가 됨
		model2 = new DefaultTableModel(row2, col2);
		table2 = new JTable(model2);
		JScrollPane js2 = new JScrollPane(table2);

/*		col3[0][0] = "대기중 인원";
		col3[1][0] = "ID";
		col3[1][1] = "승률";

		// 타이틀 잡기
		String[][] row3 = new String[1][2];
		// 배열인데 계속 추가 됨
		model1 = new DefaultTableModel(row3, col3);
		table1 = new JTable(model3);
		JScrollPane js4 = new JScrollPane(table3);
*/
		// 채팅
		ta = new JTextArea();
		JScrollPane js3 = new JScrollPane(ta);
		tf = new JTextField();
		box = new JComboBox();
		box.addItem("black");
		box.addItem("blue");
		box.addItem("pink");
		box.addItem("green");
		box.addItem("cyan");

		movie = new JPanel();
		movie.setBackground(Color.black);

		b1 = new JButton("방만들기");
		b2 = new JButton("방 들어가기");
		b3 = new JButton("게임신청");
		b4 = new JButton("쪽지보내기");
		b5 = new JButton("정보 보기");
		b6 = new JButton("나가기");

		JPanel p = new JPanel();
		// 묶을때 패널로 묶기
		p.setLayout(new GridLayout(3, 2, 5, 5));
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);

		setLayout(null);
		js1.setBounds(10, 15, 500, 320);
		js2.setBounds(10, 340, 240, 220);
		// js4.setBounds(505, 340,240, 200);
		
		js3.setBounds(515, 15, 265, 200);
		
		// 첫번째+세번째= 800이 넘으면 안됨 20은 간격을 빼고 생각해야됨 결국 780이됨
		tf.setBounds(515, 220, 170, 30);
		box.setBounds(695, 220, 85, 30);
		movie.setBounds(515, 255, 265, 180); // j3
		p.setBounds(515, 440, 265, 120);
		add(js1);
		add(js2);
		add(js3);
		add(tf);
		add(box);
		add(movie);
		add(p);
	}

	@Override
	protected void paintComponent(Graphics g) {
		// paintComponent 자동 호출
		g.drawImage(back, 0, 0, getWidth(), getHeight(), this);
	}
}
