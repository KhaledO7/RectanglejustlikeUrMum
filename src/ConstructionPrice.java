
public class ConstructionPrice { //class
    private double boardPrice;
    private double windowPrice;
    private double taxRate;


    public ConstructionPrice(double boardPrice, double windowPrice, double taxRate) //constructor; where we define variables..?
    {
        this.boardPrice = boardPrice;
        this.windowPrice = windowPrice;
        this.taxRate = taxRate;


        // Methods



    }
    public double calculateTotalCost(int numBoards, int numWindows) // you can place ANY variables (think of them as filler variables) in here as long as it fits the arguments, which will be in the runner class
    {
    double totalCost = (numBoards * boardPrice + numWindows * windowPrice);
    return totalCost;

    }


    public double calculateTotalPostTax(int numBoards, int numWindows) // you can place ANY variables in here as long as it fits the arguments, which will be in the runner class
    {
        double totalCost = (numBoards * boardPrice + numWindows * windowPrice);
        double grandTotal = totalCost +  (totalCost * taxRate);
        return grandTotal;

    }

    public void printInformation() // you can place ANY variables in here as long as it fits the arguments, which will be in the runner class
    {



    }
}

