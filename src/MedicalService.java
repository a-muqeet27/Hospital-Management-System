public class MedicalService implements BillableItem{
    double durationInMinutes;
    double ratePerMinute;

    public double getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(double durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public double getRatePerMinute() {
        return ratePerMinute;
    }

    public void setRatePerMinute(double ratePerMinute) {
        this.ratePerMinute = ratePerMinute;
    }

    public MedicalService(double durationInMinutes, double ratePerMinute) {
        this.durationInMinutes = durationInMinutes;
        this.ratePerMinute = ratePerMinute;
    }
    public double getPayableAmount(){
        return 0.0;
    }
}
