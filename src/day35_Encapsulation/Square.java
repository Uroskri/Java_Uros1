package day35_Encapsulation;

public class Square {

    private double sideOfTheSquare;

    public double getSideOfTheSquare() {
        return sideOfTheSquare;
    }

    public void setSideOfTheSquare(double sideOfTheSquare) {
        if (sideOfTheSquare <=0){
            return;
        }
        this.sideOfTheSquare = sideOfTheSquare;
    }

    public Square() {
        setSideOfTheSquare(sideOfTheSquare);
    }

    public double calcArea(){

        double calcArea = getSideOfTheSquare()*getSideOfTheSquare();


return calcArea;
    }


    public double calcPerimeter(){
        double perimeter = getSideOfTheSquare()*4;
return perimeter;
    }


    public String toString() {
        return "Square{" +
                "sideOfTheSquare=" + sideOfTheSquare +
                "perimeter=" + calcPerimeter() +
                "Area Of The Square=" + calcArea() +
                '}';
    }
}
