package lost;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.net.URL;
public class Block {

    int x;
    int y;
    Image block;

    public Block(int x, int y) {
        URL blockURL = this.getClass().getResource("imBlock.png");
        block = Toolkit.getDefaultToolkit().getImage(blockURL);
        this.x = x;
        this.y = y;
    }
    ///////กำหนดพิกัดว่าตัวละครมันชนจระเข้เมื่อไหร่////////
    public Rectangle getBounds() {
        return new Rectangle(x, y, 30, 37);
    }
}
