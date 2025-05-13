public class ArrayDemo {
    public static void main(String[] args) {
        
        // Declare
            int[] numbers;
        // Construct
            numbers=new int[10];
        // Initialize
            numbers[0]=1;
            numbers[1]=23;
            numbers[2]=34;
            numbers[3]=45;
            numbers[4]=56;
            numbers[5]=67;
            numbers[6]=78;
            numbers[7]=89;
            numbers[8]=91;
            numbers[9]=100;

            for (int i = 0; i < numbers.length; ++i) {
                     System.out.println(numbers[i]);
            }
          

    }
}
