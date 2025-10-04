public class PrescriptionDrug implements BillableItem{
    int quantity;
    double unitPrice;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public PrescriptionDrug(int quantity, double unitPrice) {
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
    public double getPayableAmount(){
        return quantity * unitPrice;
    }
    void addBillableItem(BillableItem item){};
}
