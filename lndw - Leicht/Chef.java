// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * Will den Dieb fangen so das er nicht alle Laptops klaut
 */
public class Chef extends Actor
{

    /**
     * 
     */
    public Chef()
    {
        final GreenfootImage img = getImage();
        img.scale(90, 90);
        setImage(img);
    }

    /**
     * Act - do whatever the Chef wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(5);
        if (isAtEdge()) {
            turn(17);
        }
        if (isTouching(Versteck.class)) {
            turn(35);
        }
        if (Greenfoot.getRandomNumber(100) > 90) {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (isTouching(Dieb.class)) {
            removeTouching(Dieb.class);
            getWorld().showText("Verloren", 300, 300);
            Greenfoot.stop();
        }
    }
}
