package CasoPractico4;

public class Ford extends Car{
    private int year;
    private int manofacturerDiscount;

    public Ford(int speed, double regularPrice, String color, int year, int manofacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manofacturerDiscount = manofacturerDiscount;
    }

    public double GetSalePrice(){
            return super.GetSalePrice()-manofacturerDiscount;
    }

    @Override
    public String toString() {
        return "Ford{" +
                "year=" + year +
                ", manofacturerDiscount=" + manofacturerDiscount +
                '}';
    }
}
