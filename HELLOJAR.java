import vn.edu.ptit.Invoice;
import vn.edu.ptit.Rule;
import vn.edu.ptit.Student;
import vn.edu.ptit.Subject;
import view.InvoiceView;
import java.util.ArrayList;
import java.util.Scanner;

class PaymentController
{
    private final Invoice invoice;

    public PaymentController()
    {
        int totalTINCHI = 0;
        Scanner scanner = new Scanner(System.in);
        String StudentID = scanner.nextLine();
        String StudentName = scanner.nextLine();
        Student A = new Student(StudentID,StudentName);
        int numSub = scanner.nextInt(); scanner.nextLine();
        ArrayList<Subject> AllSubject = new ArrayList<Subject>();
        while(numSub>0)
        {
            String code = scanner.nextLine();
            String SubName = scanner.nextLine();
            int credit = scanner.nextInt(); scanner.nextLine();
            Subject newSub = new Subject(SubName,code,credit);
            totalTINCHI+=credit;
            AllSubject.add(newSub);
            numSub--;
        }
        String RuleCode = scanner.nextLine();
        String RuleName = scanner.nextLine();
        double moneyValue = scanner.nextDouble();scanner.nextLine();
        scanner.close();
        Rule X = new Rule(RuleCode,RuleName,moneyValue);
        double mustPay = moneyValue*totalTINCHI;
        Invoice result = new Invoice(X);
        result.setSt(A);
        result.setAlSubject(AllSubject);
        result.setAmount(mustPay);
        invoice = result;
    }

    public Invoice getInvoice()
    {
        return invoice;
    }
}
public class HELLOJAR
{
    public static void main(String[] args) {
        PaymentController pc = new PaymentController();
        //Output for test
        Invoice invoice = pc.getInvoice();
        InvoiceView.show(invoice);
    }
}
