public class LaboratoryTest implements BillableItem{
    double testCost;

    public double getTestCost() {
        return testCost;
    }

    public void setTestCost(double testCost) {
        this.testCost = testCost;
    }

    public LaboratoryTest(double testCost) {
        this.testCost = testCost;
    }
    public double getPayableAmount(){
        return testCost;
    }
    void addBillableItem(BillableItem item){};
}
