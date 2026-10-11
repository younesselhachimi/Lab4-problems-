package problem6;

public class Circle  extends Forme{
    private double radius;
    public Circle(double radius){
        if (radius < 0) {
            this.radius=-radius;
        }
        this.radius=radius;
    }
    @Override
    public double getSurface() {
        return Math.round(Math.PI * radius * radius*100.0)/100.0 ;
    }

    @Override
    public String toString() {
        return "Circle (radius " + radius + " cm)";
    }
}
