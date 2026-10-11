package problem6;

public class Square extends Forme {
    private double side;
    public Square(double side){
        if (side < 0) {
            this.side=-side;
        }
        this.side=side;
    }
    @Override
    public double getSurface() {
        return Math.round(side*side*100.0)/100.0;
    }

    @Override
    public String toString() {
        return "Square (side " + side + " cm)";
    }
}
