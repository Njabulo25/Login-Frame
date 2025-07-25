
package loginframe.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

public class LoginFrame extends JFrame
{
    //Declare all compenents.
    
    //Declare 6 panles.
    JPanel headingPnl;
    JPanel loginDetailsPnl;
    JPanel usernamePnl;
    JPanel passwordPnl;
    JPanel btnPnl;
    JPanel mainPnl;
    
    
    //Declare 3 labels.
    JLabel headingLabel;
    JLabel usernameLabel;
    JLabel passwordLabel;
    
    //Declare 1 Text field.
    JTextField usernameField;
    
    //Declare 1 password field.
    JPasswordField passwordField;
    
    //Declare 3 butons.
    JButton submitBtn;
    JButton clearBtn;
    JButton exitBtn;
    
    

    public LoginFrame()
    {
        //Page settings.
        this.setTitle("Login page");
        this.setSize(600, 650);
        this.setResizable(true);
        this.setDefaultLookAndFeelDecorated(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //Initialize JPanels.
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        loginDetailsPnl = new JPanel(new GridLayout(2,1,1,1));
        loginDetailsPnl.setBorder(new TitledBorder(new LineBorder(Color.BLUE,1,true),"Login details"));
        usernamePnl  = new JPanel(new FlowLayout(FlowLayout.LEFT));
        passwordPnl  = new JPanel(new FlowLayout(FlowLayout.LEFT));
        btnPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        mainPnl = new JPanel(new BorderLayout());
        
        //Initialize JLabel
        headingLabel = new JLabel("Login");
        headingLabel.setForeground(Color.red);
        headingLabel.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        headingLabel.setFont(new Font(Font.SANS_SERIF,Font.BOLD + Font.ITALIC, 30));
        
        usernameLabel = new JLabel("Username: ");
        passwordLabel = new JLabel("Password: ");
        
        //Initialize Text field.
        usernameField = new JTextField(10);
        usernameField.setFocusable(true);
        
        //Initialize password field.
        passwordField = new JPasswordField(10);
        
        //Initialize butons.
        submitBtn = new JButton("Submit");
        clearBtn = new JButton("Clear");
        exitBtn = new JButton("Exit");
        
        //add heading to Panel.
        headingPnl.add(headingLabel);
        
        // add username to Panel.
        usernamePnl.add(usernameLabel);
        usernamePnl.add(usernameField);
        
        //add password to the panel.
        passwordPnl.add(passwordLabel);
        passwordPnl.add(passwordField);
        
        //add  buttons to the panel;
        btnPnl.add(submitBtn);
        btnPnl.add(clearBtn);
        btnPnl.add(exitBtn);
        
        //add login and detail to the Panl
        loginDetailsPnl.add(usernamePnl);
        loginDetailsPnl.add(passwordPnl);
        
        //add all to main Panel.
        mainPnl.add(headingPnl,BorderLayout.NORTH);
        mainPnl.add(loginDetailsPnl, BorderLayout.CENTER);
        mainPnl.add(btnPnl, BorderLayout.SOUTH);
        
        //add to the frame
        this.add(mainPnl);
        
        //page settings.
        
        this.setVisible(true);
        
        
 
        
        
        
        
        
        
    }
    
    
}
