import java.util.ArrayList;

public class Invoice {
    private ArrayList<BillableItem> list;
    BillableItem[] List;

    public Invoice() {
        list = new ArrayList<>();
    }

    public BillableItem[] getList() {
        return List;
    }

    public void setList(BillableItem[] list) {
        List = list;
    }

    public void addBillableItem(BillableItem item) {
        list.add(item);
    }

    public double getTotalPayableAmount() {
        double total = 0.0;
        for (BillableItem item : list) {
            total = total + item.getPayableAmount();
        }
        System.out.println("Total Payable Amount: $" + total);
        return total;
    }
}
