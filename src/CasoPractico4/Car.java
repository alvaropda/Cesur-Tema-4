package CasoPractico4;

public class Car {
    private int speed;
    double regularPrice;
    String color;

    public Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }
    public double GetSalePrice(){
        return regularPrice;
    }


    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", regularPrice=" + regularPrice +
                ", color='" + color + '\'' +
                '}';
    }
}
