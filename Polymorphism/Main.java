package Com.Polymorphism;

public class Main
{
    public static void main(String [] args)
    {
        Happy h = new Happy();
        Sad s = new Sad();
        Confused c = new Confused();
        System.out.println("This is for the sad moment");
        System.out.println(s.getPerson());
        s.moodtype();
        System.out.println("This is for the happy moment");
        System.out.println(h.getPerson());
        h.moodtype();
        System.out.println("This is for the confused moment");
        System.out.println(c.getPerson());
        c.moodtype();
    }
}
