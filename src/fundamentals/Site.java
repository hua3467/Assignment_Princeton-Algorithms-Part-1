/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentals;

/**
 *
 * @author aaronyang
 */
public class Site {
    protected int x;
    protected int y;
    static int id = 0;
    private boolean status = false;
    
    public Site(int x, int y){
        this.x = x;
        this.y = y;
        id++;
    }
    
    public void setStates(){
        status = true;
    }
}
