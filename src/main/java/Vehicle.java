import java.time.LocalDate;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue(){
        double depretiation = 0;
        LocalDate today =  LocalDate.now();
        int currentYear = today.getYear();
        int yearsOld = currentYear - this.year;

        if (yearsOld <= 3 && yearsOld >=0){
            depretiation = .03 * yearsOld;
        } else if (yearsOld <= 6) {
            depretiation = .06 * yearsOld;
        } else if (yearsOld <= 10) {
            depretiation = .08 * yearsOld;
        }


        return 2;
    }
}
