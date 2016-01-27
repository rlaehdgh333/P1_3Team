package com.sist;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class WaitRoom extends JPanel {
	Image back;
	JTable table1, table2, table3;
	// ���̺����
	DefaultTableModel model1, model2, model3;
	// ä�� 3����
	JTextArea ta;
	JTextField tf;
	JComboBox box;
	JPanel movie; // ������
	JButton b1, b2, b3, b4, b5, b6;

	public WaitRoom() {
		String[][] col3 = new String[1][1];
		back = getToolkit().getDefaultToolkit().getImage("C:\\image\\back.jpg");
		String[] coll = { "���̸�", "����/�����", "�ο�" };
		// Ÿ��Ʋ ���
		String[][] row1 = new String[0][3];
		// �迭�ε� ��� �߰� ��
		model1 = new DefaultTableModel(row1, coll);
		table1 = new JTable(model1);
		JScrollPane js1 = new JScrollPane(table1);

		String[] col2 = { "ID", "��ȭ��", "����", "��ġ" };
		// Ÿ��Ʋ ���
		String[][] row2 = new String[0][4];
		// �迭�ε� ��� �߰� ��
		model2 = new DefaultTableModel(row2, col2);
		table2 = new JTable(model2);
		JScrollPane js2 = new JScrollPane(table2);

/*		col3[0][0] = "����� �ο�";
		col3[1][0] = "ID";
		col3[1][1] = "�·�";

		// Ÿ��Ʋ ���
		String[][] row3 = new String[1][2];
		// �迭�ε� ��� �߰� ��
		model1 = new DefaultTableModel(row3, col3);
		table1 = new JTable(model3);
		JScrollPane js4 = new JScrollPane(table3);
*/
		// ä��
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

		b1 = new JButton("�游���");
		b2 = new JButton("�� ����");
		b3 = new JButton("���ӽ�û");
		b4 = new JButton("����������");
		b5 = new JButton("���� ����");
		b6 = new JButton("������");

		JPanel p = new JPanel();
		// ������ �гη� ����
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
		
		// ù��°+����°= 800�� ������ �ȵ� 20�� ������ ���� �����ؾߵ� �ᱹ 780�̵�
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
		// paintComponent �ڵ� ȣ��
		g.drawImage(back, 0, 0, getWidth(), getHeight(), this);
	}
}
