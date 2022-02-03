
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.util.Arrays;
//import java.util.Scanner;
import java.awt.Color;
import java.awt.Font;

public class Main {


    //Main Frame
    private static JFrame frameMain;
    private static JPanel panelMain;
    private static JLabel volunteerTab;
    private static JButton toVolunteer;
    private static JLabel participantTab;
    private static JButton toParticipant;
    private static JLabel listTab;
    private static JButton toList;

    //Main Frame Design
    private static JLabel mainTitle;
    private static JLabel mainSubTitle;
    private static JLabel mainDescription;

    //About Us
    private static JButton toAbout;
    private static JFrame frameA;
    private static JPanel panelA;
    private static JTextArea aboutDescription;
    private static JButton returnA;
    private static JLabel aboutTitle;
    private static JLabel mainTitleA;
    private static JLabel mainSubTitleA;
  
   

    //Volunteer Frame
    private static JFrame frame;
    private static JPanel panel;
    private static JLabel userLabel;
    private static JTextField userText;
    private static JButton submit;
    private static JLabel volunteers;
    private static String[] vList = new String[5];
    private static int vCounter = 0;
    private static JButton returnV;
    private static JLabel mainTitleV;
    private static JLabel mainSubTitleV;

    //Volunteer Frame Design
    private static JLabel volunteerTitle;
    

    //Participant FRAME
    private static JFrame frameP;
    private static JPanel panelP;
    private static JLabel userLabelP;
    private static JTextField userTextP;
    private static JButton submitP;
    private static JLabel participantP;
    private static String[] pList = new String[40];
    private static int pCounter = 0;
    private static JButton returnP;
    private static JLabel mainTitleP;
    private static JLabel mainSubTitleP;

    //Participant Design Frame
    private static JLabel participantTitle;

    //List Frame
    private static JFrame frameL;
    private static JPanel panelL;
    private static JList listTabV;
    private static JList listTabP;
    private static JButton returnL;
    

    public static void main(String[] args) {
        // GUI    
        
        //Main Page
        panelMain = new JPanel();
        frameMain = new JFrame();
        frameMain.setSize(1200,650);
        frameMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        frameMain.add(panelMain);

        panelMain.setLayout(null);

        //Main Page Design
        panelMain.setBackground(Color.WHITE);
        
        mainTitle = new JLabel("Mental Link");
        mainTitle.setFont(new Font("Calibri", Font.BOLD, 50));
        mainTitle.setBounds(10, 0, 600, 80);
        panelMain.add(mainTitle);

        mainSubTitle = new JLabel("Help Those in Need");
        mainSubTitle.setFont(new Font("Calibri", Font.ITALIC, 25));
        mainSubTitle.setBounds(10, 70, 400, 25);
        panelMain.add(mainSubTitle);


        //About Us 
        toAbout = new JButton("About Us");
        toAbout.setFont(new Font("Calibri", Font.BOLD, 25));
        toAbout.setBackground(Color.DARK_GRAY);
        toAbout.setForeground(Color.WHITE);
        toAbout.setBounds(50, 300, 250, 50);

        toAbout.addActionListener(new ActionListener(){
          @Override
            public void actionPerformed(ActionEvent e) {
                frameMain.setVisible(false);
                frameA.setVisible(true);

               
            }
        });


        //volunteer

        toVolunteer= new JButton("Volunteer");
        toVolunteer.setFont(new Font("Calibri", Font.BOLD, 25));
        toVolunteer.setBounds(50,450,250,50);
        toVolunteer.setBackground(Color.DARK_GRAY);
        toVolunteer.setForeground(Color.WHITE);
        toVolunteer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameMain.setVisible(false);
                frame.setVisible(true);
            }
        });

        //Participants

        toParticipant= new JButton("Participate");
        toParticipant.setFont(new Font("Calibri", Font.BOLD, 25));
        toParticipant.setBounds(500,450,250,50);
        toParticipant.setBackground(Color.DARK_GRAY);
        toParticipant.setForeground(Color.WHITE);
        toParticipant.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameMain.setVisible(false);
                frameP.setVisible(true);
            }
        });

        //List-------

        toList = new JButton("Members");
        toList.setFont(new Font("Calibri", Font.BOLD, 25));
        toList.setBounds(500,300,250,50);
        toList.setBackground(Color.DARK_GRAY);
        toList.setForeground(Color.WHITE);
        toList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameMain.setVisible(false);
                frameL.setVisible(true);
            }
        });

        panelMain.add(toAbout);
        panelMain.add(toList);
        panelMain.add(toParticipant);
        panelMain.add(toVolunteer);

        frameMain.setVisible(true);


        // Volunteer Tab--------------
        panel = new JPanel();
        frame = new JFrame();
        frame.setSize(850,650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        frame.add(panel);

        panel.setLayout(null);

        userLabel = new JLabel("Name: ");
        userLabel.setBounds(200,420,80,25);
        panel.add(userLabel);

        userText = new JTextField();
        userText.setBounds(250,420,165,25);
        panel.add(userText);

        submit= new JButton("Submit");
        submit.setFont(new Font("Calibri", Font.BOLD, 15));
        submit.setBounds(200,450,100,25);
        submit.setBackground(Color.DARK_GRAY);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(vCounter < 5) {
                    String name = userText.getText();
                    vList[vCounter] = name;
                    volunteers.setText("You Have Been Added As A Volunteer");
                    userText.setText("");
                    vCounter += 1;
                } else{
                    volunteers.setText("All Volunteer Slots Filled");
                    userText.setText("");
                }
            }
        });
        panel.add(submit);

        returnV = new JButton("Return to Home");
        returnV.setFont(new Font("Calibri", Font.BOLD, 12));
        returnV.setBounds(500,500,150,50);
        returnV.setBackground(Color.DARK_GRAY);
        returnV.setForeground(Color.WHITE);
        returnV.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                volunteers.setText("");
                frame.setVisible(false);
                frameMain.setVisible(true);
            }
        });
        panel.add(returnV);

        volunteers = new JLabel("");
        volunteers.setBounds(200,450,400,85);
        panel.add(volunteers);

        //Volunteer Tab Design

        panel.setBackground(Color.WHITE);

        volunteerTitle = new JLabel("Volunteer to Help Patients with Mental Health Issues");
        volunteerTitle.setFont(new Font("Calibri", Font.ITALIC, 25));
        volunteerTitle.setBounds(75, 250, 1000, 25);
        panel.add(volunteerTitle);
        
        mainTitleV = new JLabel("Mental Link");
        mainTitleV.setFont(new Font("Calibri", Font.BOLD, 50));
        mainTitleV.setBounds(10, 0, 600, 80);
        panel.add(mainTitleV);

        mainSubTitleV = new JLabel("Help Those in Need");
        mainSubTitleV.setFont(new Font("Calibri", Font.ITALIC, 25));
        mainSubTitleV.setBounds(10, 70, 400, 25);
        panel.add(mainSubTitleV);

        frame.setVisible(false);
        

        //Participants Tab-----------------
        panelP = new JPanel();
        frameP = new JFrame();
        frameP.setSize(850,650);
        frameP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        frameP.add(panelP);

        panelP.setLayout(null);

        userLabelP = new JLabel("Name: ");
        userLabelP.setBounds(200,420,80,25);
        panelP.add(userLabelP);

        userTextP = new JTextField();
        userTextP.setBounds(250,420,165,25);
        panelP.add(userTextP);

        submitP= new JButton("Submit");
        submitP.setBounds(200,450,100,25);
        submitP.setFont(new Font("Calibri", Font.BOLD, 15));
        submitP.setBackground(Color.DARK_GRAY);
        submitP.setForeground(Color.WHITE);
        
        submitP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(pCounter < 50) {
                    String name = userTextP.getText();
                    if(vList[(int)Math.ceil(pCounter/10)] != null) {
                        pList[pCounter] = name + "(" + vList[(int) Math.ceil(pCounter / 8)] + ")";
                    } else{
                        pList[pCounter] = name;
                    }
                    participantP.setText("You Have Been Added As A Participant");
                    userTextP.setText("");
                    pCounter += 1;
                } else{
                    participantP.setText("All Participant Slots Filled");
                    userTextP.setText("");
                }
            }
        });
        panelP.add(submitP);

        returnP = new JButton("Return to Home");
        returnP.setFont(new Font("Calibri", Font.BOLD, 12));
        returnP.setBounds(500,500,150,50);
        returnP.setBackground(Color.DARK_GRAY);
        returnP.setForeground(Color.WHITE);
        returnP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                participantP.setText("");
                frameP.setVisible(false);
                frameMain.setVisible(true);
            }
        });
        panelP.add(returnP);

                //Participant Tab Design

        panelP.setBackground(Color.WHITE);

        participantTitle = new JLabel("Apply to Receive Therapy from a Mental Health Professional");
        participantTitle.setFont(new Font("Calibri", Font.ITALIC, 25));
        participantTitle.setBounds(25, 250, 1000, 25);
        panelP.add(participantTitle);
          

        participantP = new JLabel("");
        participantP.setBounds(200,450,400,85);
        panelP.add(participantP);

        mainTitleP = new JLabel("Mental Link");
        mainTitleP.setFont(new Font("Calibri", Font.BOLD, 50));
        mainTitleP.setBounds(10, 0, 600, 80);
        panelP.add(mainTitleP);

        mainSubTitleP = new JLabel("Help Those in Need");
        mainSubTitleP.setFont(new Font("Calibri", Font.ITALIC, 25));
        mainSubTitleP.setBounds(10, 70, 400, 25);
        panelP.add(mainSubTitleP);

        frameP.setVisible(false);


        //List Tab-------------------
        panelL = new JPanel();
        frameL = new JFrame();
        frameL.setSize(1200,650);
        frameL.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        frameL.add(panelL);

        panelL.setLayout(null);

        listTabP = new JList(pList);
        listTabP.setVisibleRowCount(5);
        listTabP.setFixedCellHeight(15);

        listTabP.setBorder(BorderFactory.createTitledBorder("Participants"));

        listTabP.setBounds(450,50,300,520);

        panelL.add(listTabP);

        listTabV = new JList(vList);
        listTabV.setVisibleRowCount(5);
        listTabV.setFixedCellHeight(100);

        listTabV.setBorder(BorderFactory.createTitledBorder("Volunteers"));

        listTabV.setBounds(75,50,200,520);

        panelL.add(listTabV);

        returnL = new JButton("Return to Home");
        returnL.setFont(new Font("Calibri", Font.BOLD, 12));
        returnL.setBounds(290,500,150,50);
        returnL.setBackground(Color.DARK_GRAY);
        returnL.setForeground(Color.WHITE);
        returnL.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameL.setVisible(false);
                frameMain.setVisible(true);
            }
        });
        panelL.add(returnL);

        frameL.setVisible(false);

        //About Us Tab-------------

        frameA = new JFrame();
        panelA = new JPanel();
        frameA.setSize(1200,650);
        frameA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        frameA.add(panelA);

        panelA.setLayout(null);

        returnA = new JButton("Return to Home");
        returnA.setFont(new Font("Calibri", Font.BOLD, 12));
        returnA.setBackground(Color.DARK_GRAY);
        returnA.setForeground(Color.WHITE);
        returnA.setBounds(500,500,150,50);
        returnA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameA.setVisible(false);
                frameMain.setVisible(true);
            }
        });
        panelA.add(returnA);

                //About Design

                aboutDescription = new JTextArea("Our application's purpose is to allow patients and mental health \nprofessionals to easily connect online and avoid contact during a \npandemic. This ease of contact also allows for patients to make \nappointments and get therapy at any time and anywhere.");
                aboutDescription.setBounds(175, 275, 500, 75);
                aboutDescription.setFont(new Font("Calibri", Font.ITALIC, 15));
                panelA.add(aboutDescription);
                aboutDescription.setEditable(false);

                 panelA.setBackground(Color.WHITE);

                aboutTitle = new JLabel("About Us");
                aboutTitle.setBounds(175,195,100,100);
                panelA.add(aboutTitle);

                mainTitleA = new JLabel("Mental Link");
        mainTitleA.setFont(new Font("Calibri", Font.BOLD, 50));
        mainTitleA.setBounds(10, 0, 600, 80);
        panelA.add(mainTitleA);

        mainSubTitleA = new JLabel("Help Those in Need");
        mainSubTitleA.setFont(new Font("Calibri", Font.ITALIC, 25));
        mainSubTitleA.setBounds(10, 70, 400, 25);
        panelA.add(mainSubTitleA);

        
    }
}
