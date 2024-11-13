
import java.awt.*;
import javax.swing.*;

public class Tugas_3 {
public static void main(String[] args) {
// frame
JFrame frame = new JFrame();
 CardLayout card = new CardLayout();
 frame.setSize(500, 350);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setLayout(card);

 // blank label
 JLabel blankLabel = new JLabel("");
 // panel signup
 JPanel signUp = new JPanel();

 signUp.setLayout(new BorderLayout());
 // header
 JPanel header = new JPanel();
 header.setLayout(new FlowLayout());
 JLabel title = new JLabel("SIGN UP");
 title.setFont(new Font(null, Font.ITALIC, 20));
 title.setForeground(Color.decode("#2A3663"));
 header.add(title);
 // content
 JPanel main = new JPanel(new GridBagLayout());  
 JPanel content = new JPanel();
 content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
 // name
 JPanel namePanel = new JPanel();
 namePanel.setLayout(new BoxLayout(namePanel, BoxLayout.Y_AXIS));
 JLabel name = new JLabel("Nama");
 name.setAlignmentX(Component.CENTER_ALIGNMENT);
 JTextField namefield = new JTextField();
 namefield.setPreferredSize(new Dimension(350, 30));
 namefield.setMaximumSize(new Dimension(350, 30));
 namePanel.add(name);
 namePanel.add(namefield);
 namePanel.add(Box.createRigidArea(new Dimension(0, 10)));
 content.add(namePanel);
 // email
 JPanel emailPanel = new JPanel();
 emailPanel.setLayout(new BoxLayout(emailPanel, BoxLayout.Y_AXIS));
 JLabel email = new JLabel("Email");
 email.setAlignmentX(Component.CENTER_ALIGNMENT);
 JTextField emailfield = new JTextField();
 emailfield.setPreferredSize(new Dimension(350, 30));
 emailfield.setMaximumSize(new Dimension(350, 30));
 emailPanel.add(email);
 emailPanel.add(emailfield);
 emailPanel.add(Box.createRigidArea(new Dimension(0, 10)));
 content.add(emailPanel);
 // password
 JPanel passwordPanel = new JPanel();
 passwordPanel.setLayout(new BoxLayout(passwordPanel, BoxLayout.Y_AXIS));
 JLabel password = new JLabel("Password");
 password.setAlignmentX(Component.CENTER_ALIGNMENT);
 JPasswordField passwordfield = new JPasswordField();
 passwordfield.setPreferredSize(new Dimension(350, 30));
 passwordfield.setMaximumSize(new Dimension(350, 30));
 passwordPanel.add(password);
 passwordPanel.add(passwordfield);
 passwordPanel.add(Box.createRigidArea(new Dimension(0, 20)));
 content.add(passwordPanel);
 // signup
 JButton signup = new JButton("Sign Up");
 signup.setAlignmentX(Component.CENTER_ALIGNMENT);
 signup.setMaximumSize(new Dimension(100, 30));
 signup.setBackground(Color.decode("#FAF6E3"));
 signup.setForeground(Color.decode("#2A3663"));
 content.add(signup);
 main.add(content);
 // footer
 JPanel footer = new JPanel();
 footer.setLayout(new FlowLayout(FlowLayout.CENTER));
 // to login
 JLabel toLogin = new JLabel("Udah ada akun?");
 toLogin.setForeground(Color.decode("#2A3663"));
 footer.add(toLogin);
 // loginbutton
 JButton login2 = new JButton("Login");
 login2.setBackground(Color.decode("#FAF6E3"));
 login2.setForeground(Color.decode("#2A3663"));
 footer.add(login2);
 login2.addActionListener(e -> card.show(frame.getContentPane(), "Login"));
 // blank1
 JPanel blank1 = new JPanel();
 blank1.add(blankLabel);
 // blank2
 JPanel blank2 = new JPanel();
 blank2.add(blankLabel);

 signUp.add(header, BorderLayout.NORTH);
 signUp.add(main, BorderLayout.CENTER);
 signUp.add(footer, BorderLayout.SOUTH);
 signUp.add(blank1, BorderLayout.WEST);
 signUp.add(blank2, BorderLayout.EAST);
  
//'''''''''''''''''''''''''LOGIN'''''''''''''''''''''''''


 //login
 JPanel Login = new JPanel();
 Login.setLayout(new BorderLayout());
 // header
 JPanel header2 = new JPanel();
 header2.setLayout(new FlowLayout());
 JLabel title2 = new JLabel("LOGIN");
 title2.setFont(new Font(null, Font.ITALIC, 20));
 title2.setForeground(Color.decode("#2A3663"));
 header2.add(title2);
// content
JPanel main2 = new JPanel();
main2.setLayout(new BoxLayout(main2, BoxLayout.Y_AXIS));
JPanel content2 = new JPanel();
content2.setLayout(new BoxLayout(content2, BoxLayout.Y_AXIS));
// email
JLabel email2 = new JLabel("Email");
email2.setAlignmentX(Component.CENTER_ALIGNMENT);
content2.add(email2);
JTextField emailfield2 = new JTextField();
emailfield2.setAlignmentX(Component.CENTER_ALIGNMENT);
emailfield2.setMaximumSize(new Dimension(350, 30));
content2.add(emailfield2);
content2.add(Box.createRigidArea(new Dimension(0, 30)));
// password
JLabel password2 = new JLabel("Password");
password2.setAlignmentX(Component.CENTER_ALIGNMENT);
content2.add(password2);
JPasswordField passwordfield2 = new JPasswordField();
passwordfield2.setAlignmentX(Component.CENTER_ALIGNMENT);
passwordfield2.setMaximumSize(new Dimension(350, 30));
content2.add(passwordfield2);
content2.add(Box.createRigidArea(new Dimension(0, 30)));
//Tombol lgn
  JButton login = new JButton("Login");
  login.setAlignmentX(Component.CENTER_ALIGNMENT);
  login.setMaximumSize(new Dimension(100, 30));
  login.setBackground(Color.decode("#FAF6E3"));
  login.setForeground(Color.decode("#2A3663"));
  content2.add(login);

  main2.add(content2);
  // footer
  JPanel footer2 = new JPanel();
  footer2.setLayout(new FlowLayout(FlowLayout.CENTER));

  //signup
  JLabel toSignUp = new JLabel("Mau bikin akun?");
  toSignUp.setForeground(Color.decode("#2A3663"));
  footer2.add(toSignUp);

  //tombol signp
  JButton signup2 = new JButton("Sign Up");
 signup2.setBackground(Color.decode("#FAF6E3"));
  signup2.setForeground(Color.decode("#2A3663"));
  footer2.add(signup2);
  signup2.addActionListener(e -> card.show(frame.getContentPane(), "Sign Up"));

  // blank
  JPanel blank3 = new JPanel();
  blank3.add(blankLabel);
  // blank
  JPanel blank4 = new JPanel();
  blank4.add(blankLabel);

  Login.add(header2, BorderLayout.NORTH);
  Login.add(main2, BorderLayout.CENTER);
  Login.add(footer2, BorderLayout.SOUTH);
  Login.add(blank3, BorderLayout.WEST);
  Login.add(blank4, BorderLayout.EAST);

  frame.add(signUp, "Sign Up");
  frame.add(Login, "Login");

  frame.setVisible(true);
    }
}