import java.io.FileReader;

public class CheckedVsUncheckedExceptions {
    public static void main(String[] args) {
        
        //Write an array with 5 elements
        int[] numbers = new int[5];
        //Initialize the array  
        numbers[0] = 1;
        numbers[1] = 23;
        numbers[2] = 34;
        numbers[3] = 45;
        numbers[4] = 56;
        //Print the array
        for (int i = 0; i < numbers.length+1; ++i) {
            System.out.println(numbers[i]);
        }
        //Checked Exception

        FileReader fileReader=new FileReader("somefile.txt");
        


    }
}
