/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package lost;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.net.URL;

public class bonus {

    int x;
    int y;
    Image bonus;

    public bonus(int x, int y) {
        URL MedikURL = this.getClass().getResource("imBonus.gif");
        bonus = Toolkit.getDefaultToolkit().getImage(MedikURL);
        this.x = x;
        this.y = y;
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, 52, 52);
    }
}

