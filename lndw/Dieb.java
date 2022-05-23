// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Dieb extends Actor
{

    /**
     * 
     */
    public Dieb()
    {
        GreenfootImage avatar = getImage();
        avatar.scale(60, 80);
        setImage(avatar);
    }

    /**
     * Steuert den Dieb in eine Richtung abhängig davon welche Taste der Nutzer gedrückt hat
     */
    public void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("right")) {
            setRotation(0);
            move(5);
        }
        if (Greenfoot.isKeyDown("left")) {
            setRotation(0);
            move(-5);
        }
        if (Greenfoot.isKeyDown("up")) {
            setRotation(270);
            move(5);
        }
        if (Greenfoot.isKeyDown("down")) {
            setRotation(90);
            move(5);
        }
    }

    /**
     * Act - do whatever the Arbeiter wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkKeyPress();
        checkForLaptop();
    }

    /**
     * Überprüft ob der Dieb einen Laptop berührt und klaut ihn. Außerdem ist das Spiel beendet wenn es keine Laptops mehr gibt
     */
    public void checkForLaptop()
    {
        if (isTouching(Laptop.class)) {
            removeTouching(Laptop.class);
            if (getWorld().getObjects(Laptop.class).size() == 0) {
                getWorld().showText("Gewonnen", 300, 300);
                Greenfoot.stop();
            }
        }
    }
}
