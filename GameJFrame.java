package chapter8722;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    int[][] arr1 = new int[4][4];
    int x = 0;
    int y = 0;
    int[][] win={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,0}};
    public GameJFrame() {
        initJFrame();

        initJMenuBar();
        initData();
        initImage();
        this.setVisible(true);

    }
    int step=0;
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");
    JMenuItem accountItem = new JMenuItem("公众号");
    private void initData() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                x= i / 4;
                y= i % 4;
            }
                arr1[i / 4][i % 4] = arr[i];
        }


    }


    private void initImage() {
        this.getContentPane().removeAll();
        if(victory()){
            JLabel newImage=new JLabel(new ImageIcon(""));
            newImage.setBounds(203,283,197,73);
            this.getContentPane().add(newImage);
        }
        JLabel stepCount=new JLabel("步数："+step);
        stepCount.setBounds(50,30,100,20);
        this.getContentPane().add(stepCount);
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                int number = arr1[j][i];
                JLabel jLabel = new JLabel(new ImageIcon("src\\chapter8722\\Image\\" + number + ".png"));
                jLabel.setBounds(i * 105 + 83, j * 105 + 134, 105, 105);
                jLabel.setBorder(new BevelBorder(1));
                // this.add(jLabel);
                this.getContentPane().add(jLabel);
            }
        }
        JLabel image = new JLabel(new ImageIcon("src\\chapter8722\\Image\\qq.jpg"));
        image.setBounds(40, 40, 508, 560);
        this.getContentPane().add(image);
        this.getContentPane().repaint();
    }

    private void initJMenuBar() {
        JMenuBar jMenuBar = new JMenuBar();
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");


        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);
        functionJMenu.add(accountItem);
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);
        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);
        this.setJMenuBar(jMenuBar);

    }

    private void initJFrame() {
        this.setSize(603, 680);
        this.setTitle("游戏操作");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        this.setLayout(null);
        this.addKeyListener(this);
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code=e.getKeyCode();
        if(code==65){
            this.getContentPane().removeAll();
            JLabel jLabel=new JLabel(new ImageIcon("src\\chapter8722\\Image\\R-C.jpg"));
            jLabel.setBounds(83,134,420,420);
            this.getContentPane().add(jLabel);
            JLabel image = new JLabel(new ImageIcon("src\\chapter8722\\Image\\qq.jpg"));
           image.setBounds(40, 40, 508, 560);
           this.getContentPane().add(image);
            this.getContentPane().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(victory()){
            return;
        }
        int code = e.getKeyCode();
        if (code == 37) {
            System.out.println("向左移动");
            if(y==3){
                return;
            }
            arr1[x][y] = arr1[x][y + 1];
            arr1[x][y + 1] = 0;
            y++;
            step++;
            initImage();
        } else if (code == 38) {
            System.out.println("向上移动");
            if(x==3){
                return;
            }
            arr1[x][y] = arr1[x + 1][y];
            arr1[x + 1][y] = 0;
            x++;
            step++;
            initImage();
        } else if (code == 39) {
            System.out.println("向右移动");
            if(y==0){
                return;
            }
            arr1[x][y] = arr1[x][y- 1];
            arr1[x][y- 1] = 0;
            y--;
            step++;
            initImage();
        } else if (code == 40) {
            System.out.println("向下移动");
            if(x==0){
                return;
            }
            arr1[x][y] = arr1[x - 1][y];
            arr1[x - 1][y] = 0;
            x--;
            step++;
            initImage();
        }else if(code==65){
            initImage();
        }else if(code==87){
            arr1=new int[][]{
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,0}
            };
            initImage();
        }
    }
    public boolean victory(){
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if(arr1[i][j]!=win[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj=e.getSource();
        if(obj==replayItem){
            System.out.println("重新游戏");
            step=0;
            initData();
            initImage();

        }else if(obj==reLoginItem){
            System.out.println("重新登录");
            this.setVisible(false);
            new LoginJFrame();
        }else if(obj==closeItem){
            System.out.println("关闭游戏");
            System.exit(0);
        }else if(obj==accountItem){
            System.out.println("公众号");
            JDialog jd=new JDialog();
            JLabel jb=new JLabel(new ImageIcon(""));
            jb.setBounds(0,0,258,258);
            jd.getContentPane().add(jb);
            jd.setSize(344,344);
            jd.setAlwaysOnTop(true);
            jd.setLocationRelativeTo(null);
            jd.setModal(true);
            jd.setVisible(true);
        }
    }
}
