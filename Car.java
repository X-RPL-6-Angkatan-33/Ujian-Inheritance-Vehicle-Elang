public class Car extends Vehicle{
    int numDoors;
    boolean isElectric;

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    public Car() {
        super();       
    }

    public Car(int numWheels, double price, int numDoors, boolean isElectric) {
        super();
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Doors         : " +numDoors);
        System.out.println("Electric      : " +isElectric);
        hargaAkhir = price-price*discount/100;
        System.out.println("Harga Akhir   : " + hargaAkhir);
    }

}
