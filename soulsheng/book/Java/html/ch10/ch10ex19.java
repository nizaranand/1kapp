import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.Timer.*;
class HelpAboutDialog extends JFrame{
	private JDialog helpAbout;
	private JButton okButton,frameButton;;
	private Container contentPanel;
	private JFrame frame;
	private Timer myTimer;
	private int Counter=0;
	public HelpAboutDialog(){
		super("JDialogʾ��");
		setSize(400,300);
		contentPanel=getContentPane();
		contentPanel.setLayout(new BorderLayout());
		Font ft=new Font("����",Font.BOLD,30);
		frameButton=new JButton("����ϵͳ");
		frameButton.setFont(ft);
		contentPanel.add(frameButton,BorderLayout.CENTER); 
		frameButton.addActionListener(new CalButton());
		addWindowListener(new WindowDestroyer());
		
		Font ft1=new Font("����",Font.PLAIN,14);
		frame=new JFrame("�Ի���");
		helpAbout=new JDialog(frame,"parent container",true);
		Container dialogcp=helpAbout.getContentPane();
		dialogcp.setLayout(new BorderLayout());
		
		JLabel imageLabel=new JLabel(new ImageIcon("javalogo.gif"));
		dialogcp.add(imageLabel,BorderLayout.WEST);
				
		JPanel authorInfoPane=new JPanel();
		authorInfoPane.setLayout(new GridLayout(1,1));
		JTextArea aboutContent=new JTextArea("�ߵȽ���������,2005��5��,����ΰ�����½����");
		aboutContent.setFont(ft1);
		authorInfoPane.add(aboutContent);
		dialogcp.add(authorInfoPane,BorderLayout.NORTH);
		
		JPanel OKPane=new JPanel();
		okButton=new JBut