package CasoPractico4;

public class Truck extends Car{
    private int weight;

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }
    public double GetSalePrice(){
        if (weight > 2000)
            return super.GetSalePrice() *0.9;
        else
            return super.GetSalePrice() * 0.8;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "weight=" + weight +
                '}';
    }
}
