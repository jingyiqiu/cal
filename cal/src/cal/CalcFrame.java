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
	//��ʾ������
	private JLabel labelResult;
	
	//��ť�ϵı�ǩ
	private String[] tiltles={"","","","C","7","8","9","del","4","5","6","/","1","2","3","-","0",".","=","+"};
	
	//��ť����
	private JButton[]  buttons=new JButton[tiltles.length];
	

	// ���췽��
	public CalcFrame() {
		// TODO Auto-generated constructor stub
		initui();
		setVisible(true);
	}

	// ��ʼ��UI
	private void initui() {
		// TODO Auto-generated method stub
		setTitle("������");
		setSize(320, 480);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//��ӽ����ǩ
		labelResult=new JLabel("0.0");
		
		labelResult.setBorder(new EmptyBorder(20, 10, 20, 10));
		labelResult.setHorizontalAlignment(SwingConstants.RIGHT);
		labelResult.setFont(new Font("΢���ź�",Font.PLAIN, 32));
		add(labelResult,BorderLayout.NORTH);
		
		//��Ӱ�ť    ��ť���  ��Ʋ���   �����ŵ��м�  
		JPanel   butPanel=new JPanel(new GridLayout(5, 4,5,5)); //���񲼾�
		add(butPanel,BorderLayout.CENTER);
		
		//��butPanel������Ӱ�ť
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
