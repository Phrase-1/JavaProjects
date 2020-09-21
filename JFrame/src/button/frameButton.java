package button;

	import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JOptionPane;

	public class frameButton extends JFrame{
		private JButton button=new JButton("按键");
		public frameButton()
		{
			setSize(300,300);		//设置窗体大小
			setLocation(400, 400);	//设置窗体显示位置
			setTitle("ButtonFrame");	//设置窗体标题栏
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//设置窗体默认关闭事件
			setLayout(new FlowLayout());	//设置布局管理器
			//添加按键事件
			button.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent event) {
					JOptionPane.showMessageDialog(null, "点击了按键！");
					//JOptionPane.showMessageDialog(null,"点击了按键！", "普通消息提示框",JOptionPane.PLAIN_MESSAGE);
					//JOptionPane.showMessageDialog(null, "警告，点击了按键！","消息警告提示框",JOptionPane.WARNING_MESSAGE);
					//JOptionPane.showMessageDialog(null, "错误，点击了按键！","消息错误提示框",JOptionPane.ERROR_MESSAGE);
					//int n = JOptionPane.showMessageDialog(null, "点击了按键！你会了吗？","消息yes-no提示框",JOptionPane.YES_NO_CANCEL_OPTION);
					//int n = JOptionPane.showConfirmDialog(null, "你会了吗?", "标题",JOptionPane.YES_NO_OPTION); //返回值为0或1
					//if(n ==1) JOptionPane.showMessageDialog(null,"Let's press on！", "普通消息提示框",JOptionPane.PLAIN_MESSAGE);
					//else JOptionPane.showMessageDialog(null,"Congratulation！", "普通消息提示框",JOptionPane.PLAIN_MESSAGE);
					
					/*Object[] obj2 ={ "路人甲", "路人乙", "路人丙" };  
					String s = (String) JOptionPane.showInputDialog(null,"请选择你的身份:\n", "身份", JOptionPane.PLAIN_MESSAGE, new ImageIcon("icon.gif"), obj2, "足球");
                    if(s.equals("路人甲"))  
                    {
                       
                    	
                    }*/
					//String s = JOptionPane.showInputDialog(null,"请输入：\n","title",JOptionPane.PLAIN_MESSAGE); 
					//System.out.println(s);
				}
			});
			add(button);	//添加按键
		}
		public static void main(String[] args) {
			frameButton frame=new frameButton();	
			frame.setVisible(true);	//显示窗体		
		}
	}