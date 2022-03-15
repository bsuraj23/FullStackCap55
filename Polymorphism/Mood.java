package Com.Polymorphism;

public interface Mood
{
    String person= "I am a person";
    default  String getPerson()
    {
        return person;
    }
    void moodtype();
}
