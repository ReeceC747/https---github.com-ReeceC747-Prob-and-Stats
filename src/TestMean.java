import java.util.ArrayList;

public class TestMean 
{
        public static void main(String[] args) 
    {
        Mean tester = new Mean();

        ArrayList<Integer> listOfNumbers = new ArrayList<>();

        for(int i = 0; i < 100; i++)
        {
            listOfNumbers.add(i);
        }
        System.out.println(tester.computeMean(listOfNumbers));
        //Changes made
    }
}
