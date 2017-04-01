package cal;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class CalcFrame extends JFrame {
	//显示计算结果
	private JLabel labelResult;
	
	//按钮上的标签
	private String[] tiltles={"","","","C","7","8","9","del","4","5","6","/","1","2","3","-","0",".","=","+"};
	
	//按钮本身
	private JButton[]  buttons=new JButton[tiltles.length];
	

	// 构造方法
	public CalcFrame() {
		// TODO Auto-generated constructor stub
		initui();
		setVisible(true);
	}

	// 初始化UI
	private void initui() {
		// TODO Auto-generated method stub
		setTitle("计算器");
		setSize(320, 480);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//添加结果标签
		labelResult=new JLabel("0.0");
		
		labelResult.setBorder(new EmptyBorder(20, 10, 20, 10));
		labelResult.setHorizontalAlignment(SwingConstants.RIGHT);
		labelResult.setFont(new Font("微软雅黑",Font.PLAIN, 32));
		add(labelResult,BorderLayout.NORTH);
		
		//添加按钮    按钮面板  设计布局   将面板放到中间  
		JPanel   butPanel=new JPanel(new GridLayout(5, 4,5,5)); //网格布局
		add(butPanel,BorderLayout.CENTER);
		
		//往butPanel里面添加按钮
		for (int i = 0; i < tiltles.length; i++) {
			if(tiltles[i].length()==0){
				
				butPanel.add(new JLabel(""));
				
			}else{
				
				  buttons[i]=new JButton(tiltles[i]);
				  butPanel.add(buttons[i]);
				
				
				
			}
			
		}

	}

}
