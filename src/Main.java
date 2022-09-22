import java.sql.SQLOutput;

public class Main
{
    public static void main(String[] args)
    {
        String party = "Z";

        System.out.println("Please enter your party affiliation (D,R,I) anything else will be considered 'other.'");

        if (party.equalsIgnoreCase("D"))
        {
            System.out.println("You are a Democrat");
        }
        else if (party.equalsIgnoreCase("R"))
        {
            System.out.println("You are a Republican");
        }
        else if (party.equalsIgnoreCase("I"))
        {
            System.out.println("You are an Independent");
        }
        else
        {
            System.out.println("You are a different party");
        }
    }
}