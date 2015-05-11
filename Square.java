import javafx.geometry.Side;

/**
 * Created by Анатолий on 12.05.2015.
 */
public class Square extends Rectangle {
    private double side;

    public Square() {
        super();
        return;
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, boolean filled) {
        super();
        return;
    }

    public double getSide() {
        return side * side;
    }

    public void setSide(double side) {
        this.side = side;
        return;
    }

    @Override

    public void setWidth(double side) {
        this.side = side;
    }

    public void setLength(double side) {
        this.side = side;
    }

    public String toString() {
        return "Square: subclass of " + super.toString() + "side" + side + "side" + side;
    }
}
