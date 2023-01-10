package day45_Abstraction.shape;

public class Square extends Shape implements Volume {

    private int side;

    public Square( int side) {
        super("Square");
        setSide(side);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if (side<=0){
            throw new RuntimeException("Invalid side "+ side);
        }
        this.side = side;
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return side*4;
    }

    @Override
    public String toString() {
        return "Square{" +
                super.toString() +
                ", side=" + side +
                '}';
    }

    @Override
    public double volume() {
        return 0;
    }
}
