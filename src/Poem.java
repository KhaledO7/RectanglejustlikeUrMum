public class Poem
{
    private String name;

    // Constructor
    public Poem(String yourName)
    {
        name = yourName;
    }


    public void printPoem()
    {
        printFirstHalf();
        printSecondHalf();
    }

    // Print the first half of the poem
    public void printFirstHalf()
    {
        System.out.println("Hello " + name + "!");
        System.out.println("I have a poem for you");
    }

    // Print the second half of the poem
    public void printSecondHalf()
    {
        System.out.println("Roses are red");
        System.out.println("Violets are blue");
        System.out.println("AP CSA is awesome!");
        printLastLine();
    }


    public void printLastLine()
    {
        System.out.println("And that's the end - see you!");
    }
}
