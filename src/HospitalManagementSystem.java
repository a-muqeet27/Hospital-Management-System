import java.util.Scanner;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            while (!scanner.hasNextInt()) {
                scanner.next();
            }
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    ConsultationService consultation = new ConsultationService(30.0, 10.0);
                    invoice.addBillableItem(consultation);
                    System.out.println("Consultation Service Added.\n");
                    break;
                case 2:
                    LaboratoryTest labTest = new LaboratoryTest(100);
                    invoice.addBillableItem(labTest);
                    System.out.println("Laboratory Test Added.\n");
                    break;
                case 3:
                    PrescriptionDrug drug = new PrescriptionDrug(5, 400);
                    invoice.addBillableItem(drug);
                    System.out.println("Prescription Drug Added.\n");
                    break;
                case 4:
                    String[] tests = {"ECG"};
                    CardiologyConsultation cardiology = new CardiologyConsultation(30.0, 20.0, tests);
                    invoice.addBillableItem(cardiology);
                    System.out.println("Cardiology Consultation Added.\n");
                    break;
                case 5:
                    invoice.getTotalPayableAmount();
                    System.out.println("\n");
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        scanner.close();
    }

    static void displayMenu() {
        System.out.println("Press 1 for Adding Consultation Service");
        System.out.println("Press 2 for Adding Laboratory Test");
        System.out.println("Press 3 for Prescription Drug");
        System.out.println("Press 4 for Cardiology Consultation");
        System.out.println("Press 5 for Total Income");
        System.out.println("Press 6 for Exit");
        System.out.print("Choose desired option: \n");
    }
}
