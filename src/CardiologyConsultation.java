public class CardiologyConsultation extends ConsultationService{
    String additionalTests[];
    public double durationMinutes;
    public double ratePerMinute;

    public String[] getAdditionalTests() {
        return additionalTests;
    }

    public void setAdditionalTests(String[] additionalTests) {
        this.additionalTests = additionalTests;
    }

    public double getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(double durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    @Override
    public double getRatePerMinute() {
        return ratePerMinute;
    }

    @Override
    public void setRatePerMinute(double ratePerMinute) {
        this.ratePerMinute = ratePerMinute;
    }

    public CardiologyConsultation(double durationInMinutes, double ratePerMinute, String[] additionalTests) {
        super(durationInMinutes, ratePerMinute);
        this.additionalTests = additionalTests;
    }

    @Override
    public double getPayableAmount() {
        double amount = super.getPayableAmount();
        double testCost = 0.0;
        for (String test : additionalTests) {
            switch (test.toLowerCase()) {
                case "ECG":
                    testCost = testCost + 200;
                    break;
                case "Others":
                    testCost = testCost + 100;
                    break; 
            }
        }
        return amount + testCost;
    }
    void addBillableItem(BillableItem item){};
}
