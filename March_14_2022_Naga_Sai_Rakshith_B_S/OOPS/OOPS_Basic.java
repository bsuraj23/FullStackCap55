package March_14_2022.OOPS;

class Pen{
    public int id;
    public String color;

    public void write(String color)
    {
        System.out.println("Writing with color: "+color);
    }
}

public class OOPS_Basic {
    public static void main(String args[])
    {
        Pen pen1 = new Pen();
        pen1.id=1;
        pen1.color="Blue";
        pen1.write(pen1.color);

        Pen pen2 = new Pen();
        pen2.id=2;
        pen2.color="Green";
        pen2.write(pen2.color);
    }
}