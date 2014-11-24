import se.bjorknas.graphics.EventWindow;

/**
 * 
 * @author Farand Al Rubaae
 */
public abstract class GeoShapes{

    protected int posX, posY;
    //protected double CArea;
    //protected int RArea;
    
    /**
     * Här ges posX och posY sina värden.
     * Det som är kommenterat ska vara till comparable.
     */
    public GeoShapes(){
        posX = 200;
        posY = 200;
        //CArea = calcCirArea;
        //RArea = calcRectArea;
                
        
    }
   
    /**
     * Med hjälp av dessa två ska man kunna köra comparable. 
     */
    /*
    public abstract int calcRectArea ();
    public abstract double calcCirArea ();
    */
    
    /**
     * Denna är ritmetoden.
     * @param win 
     */
    public abstract void drawShape(EventWindow win);
    
    
}
