public class ConsultationService extends MedicalService{
    public ConsultationService(double durationInMinutes, double ratePerMinute) {
        super(durationInMinutes, ratePerMinute);
    }

    public double getPayableAmount(){
        return durationInMinutes * ratePerMinute;
    }
    void addBillableItem(BillableItem item){};
}
