/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package lost;

import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;

class Obfloor {
    static LinkedList<floor> e = new LinkedList<>();
    floor temp;
    public Obfloor(){
    }
    public void removefloor(){
        for(int i = 0 ; i<e.size();i++){
            e.remove();
        }
    }
    
    public void createfloor(int x,int y){
        addfloor(new floor(x,y));
    }
    
    public void draw(Graphics g,Color c){
        for (int i = 0; i<e.size();i++){
            temp = e.get(i);
            temp.draw(g,c);
        }    
    }
    
    public void addfloor(floor f){
        e.add(f);
    }
    public static LinkedList<floor> getfloorBounds(){
        return e;
    }
}

