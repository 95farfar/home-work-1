public class Abstractclass{

    public static void main(String[] args) {
        EventWindow win = new EventWindow (600,600, "Turtle Window");
        ExtendedTurtle t1 = new ExtendedTurtle( win, 300,300);
        t1.setSpeed(20);
        t1.penDown();
        t1.DrawRectangle(100, 50);
        
    }
//De som subklasserna har gemensamt, de ärver det härifrån
{
