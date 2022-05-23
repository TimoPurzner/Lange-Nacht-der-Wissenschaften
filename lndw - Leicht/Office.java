// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * Enthält alle Objekte die auf dem Spielfeld dargestellt werden.
 *  - Versteck
 *  - Dieb
 *  - Chef
 *  - Latop
 */
public class Office extends World
{

    /**
     * Wird beim erstellen der Welt aufgerufen
     */
    public Office()
    {
        super(600, 600, 1);
        Dieb player =  new Dieb();
        Chef martin =  new Chef();
        addObject(player, 400, 400);
        addObject(martin, 150, 50);
        addObject( new Laptop(), 50, 50);
        addObject( new Laptop(), 500, 500);
        addObject( new Laptop(), 50, 550);
        addObject( new Versteck(), 250, 150);
        addObject( new Versteck(), 300, 550);
    }
}
