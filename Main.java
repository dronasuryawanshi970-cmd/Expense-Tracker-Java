import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Expense> expense = new ArrayList<>();

        while (true) {

            System.out.println("\n==== Expense Tracker ====");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Show Total");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if(choice == 1) {

                System.out.print("Enter title: ");
                String title = sc.nextLine();

                System.out.print("Enter amount: ");
                double amount = sc.nextDouble();
                sc.nextLine();

                System.out.print("Enter category: ");
                String category = sc.nextLine();

                Expense e = new Expense(title, amount, category);

                expense.add(e);

                System.out.println("Expense added successfully!");
            }

            else if(choice == 2) {

                for(Expense e : expense) {
                    e.display();
                }
            }

            else if(choice == 3) {

                double total = 0;

                for(Expense e : expense) {
                    total += e.amount;
                }

                System.out.println("Total Expenses: ₹" + total);
            }

            else if(choice == 4) {
                break;
            }
        }
    }
}