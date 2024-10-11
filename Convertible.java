public class Convertible extends Car{
    String roofType;

    public String getRoofType() {
        return roofType;
    }

    public void setRoofType(String roofType) {
        this.roofType = roofType;
    }

    public Convertible() {
        super();
        roofType = "";
    }

    public Convertible(int numWheels, double price, int numDoors, boolean isElectric, String roofType) {
        super();
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Roof Type     : " +roofType);
    }
}
