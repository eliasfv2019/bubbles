import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A bit of empty space for bubbles to float in.
 * 
 * @author Michael Kölling
 * @version 1.0
 */
public class Space extends World
{
    /**
     * Create Space. Make it black.
     */
    public Space()
    {
        super(900, 600, 1);
        getBackground().setColor(Color.BLACK);
        getBackground().fill();
        setup();
    }

    private void setup(){
        int i = 0;
        while (i <21){
            addObject(new Bubble(),Greenfoot.getRandomNumber(800),Greenfoot.getRandomNumber(600));
            i++;
        }
        int f = 0;
        int x = 300;
        int y = 100;
        while(f<10){
            addObject(new Bubble(),x,y);
            f++;
            x = x + 40;
        }
    }

}
