public class Box
{
    private double length;
    private double width;
    private double height;

    public Box(double l, double w, double h)
    {
        length = l;
        width = w;
        height = h;
    }

    public Box(double s)
    {
        length = s;
        width = s;
        height = s;
    }

    public double volume()
    {
        return length * width * height;
    }

    public boolean anySideLongerThan(int side)
    {
        if (length > side || width > side || height > side)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void printDimensions()
    {
        System.out.println("L = " + length + ", W = " + width + ", H = " + height);
    }
}
