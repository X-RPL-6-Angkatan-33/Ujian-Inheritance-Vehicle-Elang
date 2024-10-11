public class Bicycle extends Vehicle{
    String bikeType;

    public String getBikeType() {
        return bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }

    public Bicycle() {
        super();
    }

    public Bicycle(int numWheels, double price, double hargaAkhir) {
        super();
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Bike Type     : " +bikeType);
        hargaAkhir = price-price*discount/100;
        System.out.println("Harga Akhir   : " + hargaAkhir);
    }
}
