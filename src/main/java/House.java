public class House extends Asset {
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue(){
        double value;
        switch (condition){
            case 1:
                value = this.squareFoot * 180.0;
                System.out.println("Excellent condition" + value);
                break;
            case 2:
                value = this.squareFoot * 130.0;
                System.out.println("Good condition" + value);
                break;
            case 3:
                value = this.squareFoot * 90;
                System.out.println("Fair condition" + value);
                break;
            case 4:
                value = this.squareFoot * 80;
                System.out.println("Poor condition" + value);
                break;
            default:
                value = 0;
                System.out.println("super bad condition");

        }
        return value;
    }

}
