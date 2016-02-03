package com.sist;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MakeRoom extends JFrame implements ActionListener{
   JLabel la1, la2, la3, la4;
   JTextField tf;
   JRadioButton rb1,rb2;
   JPasswordField pf;
   JComboBox box;
   JButton b1,b2;
   //{}
   public MakeRoom(){
      la1 = new JLabel("방이름");
      la2 = new JLabel("상태");
      la3 = new JLabel("비밀번호");
      la4 = new JLabel("인원");
      
      tf= new JTextField();
      pf = new JPasswordField();
      rb1=new JRadioButton("공개");
      rb2=new JRadioButton("비공개");
      
      la3.setVisible(false);
      pf.setVisible(false);
      
      ButtonGroup bg = new ButtonGroup();
      bg.add(rb1); bg.add(rb2);
      rb1.setSelected(true);
      
      box = new JComboBox();
      for(int i=2;i<=6;i++){
         box.addItem(i+"명");
      }
      
      b1=new JButton("확인");
      b2=new JButton("취소");
      
      
      setLayout(null);
      la1.setBounds(10,15,40,30);
      tf.setBounds(55, 15, 150, 30);
      
      la2.setBounds(10,50,40,30);
      rb1.setBounds(55, 50, 70, 30);
      rb2.setBounds(130,50,70,30);
      
      la3.setBounds(25,85,60,30);
      pf.setBounds(90, 85, 100, 30);
      
      la4.setBounds(10,120,40,30);
      box.setBounds(90, 120, 100, 30);
      
      JPanel p = new JPanel();
      p.add(b1);
      p.add(b2);
      p.setBounds(10,155,195,35);
      
      //추가
      add(la1);add(tf);
      add(la2);add(rb1);add(rb2);
      add(la3);add(pf);
      add(la4);add(box);
      add(p);
      
      setSize(230,235);
      //setVisible(true);
      
      
      rb1.addActionListener(this);
      rb2.addActionListener(this);
      
      b2.addActionListener(this);
   }


   public static void main(String[] args) {
      // TODO Auto-generated method stub

      new MakeRoom();
   }


   @Override
   public void actionPerformed(ActionEvent e) {
      // TODO Auto-generated method stub
      if(e.getSource()==rb1){
         pf.setVisible(false);
         la3.setVisible(false);
         pf.setText("");
      }else if(e.getSource()==rb2){
         pf.setVisible(true);
         la3.setVisible(true);
         pf.setText("");
         pf.requestFocus();
      }else if(e.getSource()==b2){
    	  dispose();
      }
   }

}