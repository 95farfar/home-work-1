import se.bjorknas.graphics.EventWindow;


/**
 * 
 * @author: Farand Al Rubaae
 */
public class Circle extends GeoShapes implements Comparable {
    
    protected double sideD;
    
    
    /**
     * Här ges sideD värdet sideD
     * @param sideD 
     */
    public Circle (double sideD){
        super();
        this.sideD = sideD;
    }
    
    /**
     * Denna metod beräknar arean för figuren cirkel.
     * @return arean som en double
     */  
    public double calcCirArea(){
        return  (sideD * sideD * 3.14/4);
    }
   
    /**
     * Denna metod beräknar omkretsen för figuren cirkel.
     * @return omkretsen som en double.
     */
    public double calcCirOmkrets(){
        return (sideD/2 * 2 * 3.14);
    }

    /**
     * Denna metod är för att rita ut cirkeln.
     * @param win 
     */
    @Override
    public void drawShape(EventWindow win){
        win.drawCirc(posX, posY,(int)sideD);
    }
   
    /**
     * Detta ska vara comparable, den jämför arean på figurerna.
     * @param o
     * @return int
     */
    /*
    @Override
    public int compareTo(GeoShapes o){
    
        final int Cirkel = -1;
        final int Lika = 0;
        final int Rektangel = 1;
    
        if (this.calcRectArea() < o.calcCirArea ()){
            return Cirkel;
        }
        if (this.calcRectArea() > o.calcCirArea ()){
            return Rektangel;
        }else{
            return Lika;
        }
    }
    */

    @Override
    public int compareTo(GeoShapes o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}    

        
    
 
