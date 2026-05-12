public class Expense {
        String title;
    double amount;
    String category;

    Expense(String title, double amount, String category) {
        this.title = title;
        this.amount = amount;
        this.category = category;
    }

    void display() {
        System.out.println(title + " | ₹" + amount + " | " + category);
    }
}
