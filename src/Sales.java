
import javax.swing.JOptionPane;
public class Sales {


    /*Write a program, using dialog boxes, which prompts the user to enter a quantity, price, discount(as an integer) and sales tax(as an integer).
    The program should output the subtotal, tax total and total cost. Output should have proper currency format and proper rounding.

    Hint: You can use \n inside a String literal to make a new line, helpful for the dialog box output.

    Example:

    What is the sale price?: 4.99
    What is the discount?: 10
    How many are you buying?: 5
    What is the sales tax?: 7

    Subtotal: $22.46
    Tax Total: $1.57
    Total Cost: $24.03
     */


    public static void main(String[] args) {
        String inputString;
        int quantity;
        double price;
        int discount;
        double _tax;


        inputString = JOptionPane.showInputDialog("How many shirts are you buying? ");
        quantity = Integer.parseInt(inputString);

        inputString = JOptionPane.showInputDialog("What is the price of the shirts ?");
        price = Double.parseDouble(inputString);

        inputString = JOptionPane.showInputDialog("if there is a discount what is the percent? ");
        discount = Integer.parseInt(inputString);

        inputString = JOptionPane.showInputDialog("What is the sales tax? ");
        _tax = Double.parseDouble(inputString);

        final  double TAX = _tax/100.0;

        double subTotal = price * quantity;
        double discountPrice = subTotal - discount;
        double discountTotal = discountPrice * 1 + _tax;
        double taxTotal = discountTotal + _tax;
        double totalPrice = subTotal + taxTotal;


        System.out.println("You bought " + quantity + " shirts for " + price + " per shirt. ");
        System.out.println("subtotal: " + subTotal);
        System.out.println("discount price: " + discountPrice);
        System.out.println("tax: " + taxTotal);
        System.out.println("Total:" + totalPrice );







    }

}
