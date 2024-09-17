import java.util.ArrayList;

public class TestMean 
{
        public static void main(String[] args) 
    {
        Mean testerED = new Mean();

        ArrayList<Integer> listOfNumbers = new ArrayList<>();

        for(int i = 0; i < 100; i++)
        {
            listOfNumbers.add(i);
        }
        System.out.println(testerED.computeMean(listOfNumbers));
        //Changes made
        
        
        System.out.println("Hello World!");
    }
}
