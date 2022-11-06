import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.Scanner;

public class MyFrame extends JFrame implements ActionListener  {


    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();
    JPanel panel5 = new JPanel();
    JPanel panel6 = new JPanel();
    JPanel panel7 = new JPanel();



    JButton button1 = new JButton("Add");
    JButton button2 = new JButton("Add");
    JButton button3 = new JButton("Add");
    JButton button4 = new JButton("Add");
    JButton button5 = new JButton("Add");
    JButton button6 = new JButton("'Add");
    JButton button7 = new JButton("Add");

    JTextArea event1 = new JTextArea("Today's plans!");
    JTextArea event2 = new JTextArea("Today's plans!");
    JTextArea event3 = new JTextArea("Today's plans!");
    JTextArea event4 = new JTextArea("Today's plans!");
    JTextArea event5 = new JTextArea("Today's plans!");
    JTextArea event6 = new JTextArea("Today's plans!");
    JTextArea event7 = new JTextArea("Today's plans!");




    JTextArea addEvents1 = new JTextArea("Events:");
    JTextArea addEvents2 = new JTextArea("Events:");
    JTextArea addEvents3 = new JTextArea("Events:");
    JTextArea addEvents4 = new JTextArea("Events:");
    JTextArea addEvents5 = new JTextArea("Events:");
    JTextArea addEvents6 = new JTextArea("Events:");
    JTextArea addEvents7 = new JTextArea("Events:");
  MyFrame (){

      this.setTitle("Calendar");
      this.setSize(1000, 700);
      this.setLayout(new GridLayout());


      panel1.setLayout(new BoxLayout(panel1,1));
      addEvents1.setBorder(BorderFactory.createLineBorder(Color.black));
      event1.setBorder(BorderFactory.createLineBorder(Color.black));

     // event1.setEditable(false);
    LocalDate now = LocalDate.now();

      if (now.isEqual(now.plusDays(0).minusDays(now.getDayOfWeek().getValue()-1))){
          panel1.setBackground(Color.cyan);
      }
      if (now.isEqual(now.plusDays(1).minusDays(now.getDayOfWeek().getValue()-1))){
          panel2.setBackground(Color.cyan);
      }
      if (now.isEqual(now.plusDays(2).minusDays(now.getDayOfWeek().getValue()-1))){
          panel3.setBackground(Color.cyan);
      }
      if (now.isEqual(now.plusDays(3).minusDays(now.getDayOfWeek().getValue()-1))){
          panel4.setBackground(Color.cyan);
      }
      if (now.isEqual(now.plusDays(4).minusDays(now.getDayOfWeek().getValue()-1))){

          panel5.setBackground(Color.cyan);
      }if (now.isEqual(now.plusDays(5).minusDays(now.getDayOfWeek().getValue()-1))){
          panel6.setBackground(Color.cyan);
      }
      if (now.isEqual(now.plusDays(6).minusDays(now.getDayOfWeek().getValue()-1))){
          panel7.setBackground(Color.cyan);
      }



      panel1.add(new JLabel(String.valueOf(now.minusDays(now.getDayOfWeek().getValue()-1))));
      panel1.add(event1);
      button1.addActionListener(this);
      panel1.add(addEvents1);
      panel1.add(button1);
      super.add(panel1);

      panel2.setLayout(new BoxLayout(panel2,1));
      addEvents2.setBorder(BorderFactory.createLineBorder(Color.black));
      event2.setBorder(BorderFactory.createLineBorder(Color.black));
      panel2.add(new JLabel(String.valueOf(now.plusDays(1).minusDays(now.getDayOfWeek().getValue()-1))));
      panel2.add(event2);
      panel2.add(addEvents2);
      button2.addActionListener(this);
      panel2.add(button2);
      this.add(panel2);

      panel3.setLayout(new BoxLayout(panel3,1));
      addEvents3.setBorder(BorderFactory.createLineBorder(Color.black));
      event3.setBorder(BorderFactory.createLineBorder(Color.black));
      panel3.add(new JLabel(String.valueOf(now.plusDays(2).minusDays(now.getDayOfWeek().getValue()-1))));
      button3.addActionListener(this);
      panel3.add(event3);
      panel3.add(addEvents3);
      panel3.add(button3);
      this.add(panel3);


      panel4.setLayout(new BoxLayout(panel4,1));
      addEvents4.setBorder(BorderFactory.createLineBorder(Color.black));
      event4.setBorder(BorderFactory.createLineBorder(Color.black));
      panel4.add(new JLabel(String.valueOf(now.plusDays(3).minusDays(now.getDayOfWeek().getValue()-1))));
      button4.addActionListener(this);
      panel4.add(event4);
      panel4.add(addEvents4);
      panel4.add(button4);
      this.add(panel4);

      panel5.setLayout(new BoxLayout(panel5,1));
      addEvents5.setBorder(BorderFactory.createLineBorder(Color.black));
      event5.setBorder(BorderFactory.createLineBorder(Color.black));
      panel5.add(new JLabel(String.valueOf(now.plusDays(4).minusDays(now.getDayOfWeek().getValue()-1))));
      button5.addActionListener(this);
      panel5.add(event5);
      panel5.add(addEvents5);
      panel5.add(button5);
      this.add(panel5);


      panel6.setLayout(new BoxLayout(panel6,1));
      addEvents6.setBorder(BorderFactory.createLineBorder(Color.black));
      event6.setBorder(BorderFactory.createLineBorder(Color.black));
      panel6.add(new JLabel(String.valueOf(now.plusDays(5).minusDays(now.getDayOfWeek().getValue()-1))));
      button6.addActionListener(this);
      panel6.add(event6);
      panel6.add(addEvents6);
      panel6.add(button6);
      this.add(panel6);

      panel7.setLayout(new BoxLayout(panel7,1));
      addEvents7.setBorder(BorderFactory.createLineBorder(Color.black));
      event7.setBorder(BorderFactory.createLineBorder(Color.black));
      panel7.add(new JLabel(String.valueOf(now.plusDays(6).minusDays(now.getDayOfWeek().getValue()-1))));
      button7.addActionListener(this);
      panel7.add(event7);
      panel7.add(addEvents7);
      panel7.add(button7);
      this.add(panel7);

      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      this.setVisible(true);

  }

    @Override
    public void actionPerformed(ActionEvent e) {
      boolean plans = true;
      while (plans){

          if(e.getSource()==button1){
              String events = event1.getText() + "\n" + addEvents1.getText();
              event1.setText(events);
              //addEvents1.setVisible(false);
              event1.setVisible(true);
              //button1.setVisible(false);
              break;

          }
          else if (e.getSource()==button2){
              String events = event2.getText() + "\n" + addEvents2.getText();
              event2.setText(events);
              //addEvents1.setVisible(false);
              event2.setVisible(true);
              //button1.setVisible(false);
              break;

          }
          else if (e.getSource()==button3){
              String events = event3.getText() + "\n" + addEvents3.getText();
              event3.setText(events);
              //addEvents1.setVisible(false);
              event3.setVisible(true);
              //button1.setVisible(false);
              break;
          }
          else if (e.getSource()==button4){
              String events = event4.getText() + "\n" + addEvents4.getText();
              event4.setText(events);
              //addEvents1.setVisible(false);
              event4.setVisible(true);
              //button1.setVisible(false);
              break;
          }
          else if (e.getSource()==button5){
              String events = event5.getText() + "\n" + addEvents5.getText();
              event5.setText(events);
              //addEvents1.setVisible(false);
              event5.setVisible(true);
              //button1.setVisible(false);
              break;
          }
          else if (e.getSource()==button6){
              String events = event6.getText() + "\n" + addEvents6.getText();
              event6.setText(events);
              //addEvents1.setVisible(false);
              event6.setVisible(true);
              //button1.setVisible(false);
              break;
          }
          else if (e.getSource()==button7){
              String events = event7.getText() + "\n" + addEvents7.getText();
              event7.setText(events);
              //addEvents1.setVisible(false);
              event7.setVisible(true);
              //button1.setVisible(false);
              break;
          }
      }

    }
}

