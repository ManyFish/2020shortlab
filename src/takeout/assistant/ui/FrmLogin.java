package takeout.assistant.ui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import takeout.assistant.control.AdministratorManager;
import takeout.assistant.model.BeanAdministrator;
import takeout.assistant.util.BaseException;

//"A"开头为管理员类账号，"U"开头为用户类账号，"B"开头为商家类账号，"R"开头为骑手类账号
public class FrmLogin extends JDialog implements ActionListener {
	private JPanel toolBar = new JPanel();
	private JPanel workPane = new JPanel();
	private Button btnLogin = new Button("登陆");
	private Button btnCancel = new Button("退出");
	private JLabel labelUser = new JLabel("用户：");
	private JLabel labelPwd = new JLabel("密码：");
	private Button btnRegist = new Button("注册");
	private JComboBox cmbUsertype= new JComboBox(new String[] { "管理员", "用户","商家","骑手"});
	
	private JTextField edtUserId = new JTextField(20);
	private JPasswordField edtPwd = new JPasswordField(20);

	public FrmLogin(Frame f, String s, boolean b) {
		super(f, s, b);
		toolBar.setLayout(new FlowLayout(FlowLayout.RIGHT));
		toolBar.add(btnLogin);
		toolBar.add(btnCancel);
		this.getContentPane().add(toolBar, BorderLayout.SOUTH);
		workPane.add(labelUser);
		workPane.add(edtUserId);
		workPane.add(labelPwd);
		workPane.add(edtPwd);
		this.getContentPane().add(workPane, BorderLayout.CENTER);
		this.setSize(300, 140);
		// 屏幕居中显示
		double width = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		double height = Toolkit.getDefaultToolkit().getScreenSize().getHeight();
		this.setLocation((int) (width - this.getWidth()) / 2,
				(int) (height - this.getHeight()) / 2);

		this.validate();

		btnLogin.addActionListener(this);
		btnCancel.addActionListener(this);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()== this.btnLogin) {
			AdministratorManager am = new AdministratorManager();
			String userid=this.edtUserId.getText();
			String pwd=new String(this.edtPwd.getPassword());
			String usertype=this.cmbUsertype.getSelectedItem().toString();
			/*try {
				BeanAdministrator user=sum.loadUser(userid);
				if(pwd.equals(user.getPwd())){
					SystemUserManager.currentUser=user;
					setVisible(false);
				}
				else{
					JOptionPane.showMessageDialog(null,  "密码错误","错误提示",JOptionPane.ERROR_MESSAGE);
				}
			} 
			catch (BaseException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage(), "错误",JOptionPane.ERROR_MESSAGE);
				return;
			}
			this.setVisible(false);*/
			
		} else if (e.getSource() == this.btnCancel) {
			System.exit(0);
		} 
	}

}
