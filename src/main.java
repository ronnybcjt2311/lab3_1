import javax.swing.*;

public class main {
    public static void main(String[] args) {
        //String input = JOptionPane.showInputDialog("ใส่ตัวเลข","0");
        //JOptionPane.showMessageDialog(null,input,"title",JOptionPane.INFORMATION_MESSAGE);
        int ans = JOptionPane.showConfirmDialog(null,"รักหรือป่าว","ถามเธอ",JOptionPane.YES_NO_OPTION);

        if(ans == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"รักนะจุ๊ฟๆ");
        }else{
            JOptionPane.showMessageDialog(null,"จำไว้เลย");
        }
    }
}
