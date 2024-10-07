import java.util.Scanner;




public class Main {
    public static void main(String[]args){


 Scanner construction = new Scanner(System.in);

 System.out.println("How many pieces of lumbar do you need?");
 int lumbar = Integer.parseInt(construction.nextLine());

 System.out.println("How many windows do you need?");
 int windows = Integer.parseInt(construction.nextLine());

 System.out.println("What is the tax rate in your area?");
 double tax = Double.parseDouble(construction.nextLine());

 double boardPrice = 11.50;
 double windowPrice = 25.75;

//object creation
ConstructionPrice constructionPricer = new ConstructionPrice(boardPrice, windowPrice, tax); //creates an INSTANCE which tells the CONSTRUCTOR class what the variables are
//calculate
double totalCost = constructionPricer.calculateTotalCost(lumbar, windows);
double grandTotal = constructionPricer.calculateTotalPostTax(lumbar, windows);
System.out.println("Total cost: " +  String.format("%.2f", totalCost));
System.out.println("Total after tax: " + String.format("%.4f", grandTotal)); //using string format to make decimal places using %.2f/4f


    }
}
