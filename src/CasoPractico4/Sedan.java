package CasoPractico4;

public class Sedan extends Car{
    private int length;

    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    public double GetSalePrice(){
        if (length > 20)
            return super.GetSalePrice() *0.95;
        else
            return super.GetSalePrice() * 0.9;
    }
}
