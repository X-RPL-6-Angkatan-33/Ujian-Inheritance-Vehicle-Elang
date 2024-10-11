public class Vehicle {
    int numWheels;
    double price;
    public double discount;
    double hargaAkhir;

    public int getNumWheels() {
        return this.numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return this.discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getHargaAkhir() {
        return this.hargaAkhir;
    }

    public void setHargaAkhir(double hargaAkhir) {
        this.hargaAkhir = hargaAkhir;
    }

    public Vehicle() {
        price = 0;
    }

    public void print() {
        System.out.println("Number Wheels : " +numWheels);
        System.out.println("Price         : " +price);
        
    }
}