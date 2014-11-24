import se.bjorknas.graphics.EventWindow;

/**
 * 
 * @author Farand Al Rubaae
 */
public class Rectangle extends GeoShapes implements Comparable {
    
    protected int sideA, sideB;
    
    /**
     * Här ges sidaA och sideB värderna a respektive b.
     * @param a
     * @param b 
     */
    public Rectangle (int a, int b){
        //super();
        sideA = a;
        sideB = b;
        
    }
    
   /**
    * Denna metod beräknar arean för figuren rektangel.
    * @return arena som en int
    */
    public int calcRectArea(){
        return  sideA  * sideB;
    }
   
   /**
    * Denna metod beräknar omkretsen för figuren rektangel.
    * @return omkretsen som en int
    */
    public int calcRectOmkrets(){
        return sideA * 2 + sideB * 2;
    }
   
    /**
     * Denna metod är för att rita ut rektangeln.
     * @param win
     */
    @Override
    public void drawShape(EventWindow win){
        win.drawRect(posX, posY, sideB, sideA);
        
    }
   

    @Override
    public int compareTo(GeoShapes o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}    

