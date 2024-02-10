import java.awt.Font;
import java.awt.Graphics2D;

public class TextBox {
    private int charNum = 0;
    String firstRow,secondRow;

    public TextBox(String first, String second) {
        firstRow = first;
        secondRow = second;
    }

    public void text(Graphics2D g2) {
        int firstLenght = firstRow.length();
        int secondLenght = secondRow.length();

        g2.setFont(new Font("TimesRoman", Font.PLAIN, 40)); 
        if(charNum < firstRow.length()) {
            String cur = firstRow.substring(0,charNum+1);
            g2.drawString(cur,20,480);
        }
        else if(charNum < firstLenght + secondLenght){
            g2.drawString(firstRow, 20, 480);
            String cur = secondRow.substring(0,charNum-firstRow.length()+1);
            g2.drawString(cur,20,540);
        } else {
            g2.drawString(firstRow, 20, 480);
            g2.drawString(secondRow,20,540);
        }
        charNum++;
    }
}
