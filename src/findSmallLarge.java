import java.util.Scanner;

public class findSmallLarge {
    public Scanner input = new Scanner(System.in);

    public int getCounter() {
        System.out.println("how many numbers do you want to enter? ");
        int LCV = input.nextInt();

        return LCV;
    }

    public int getNumbers(int LCV) {

        for (int i = 0; i > LCV; i++) {
            System.out.println("Please enter each number followed by the enter key: ");
            int userNumbers = input.nextInt();

            return userNumbers;
        }
        return 0;
    }

    public void addToArray(){
        int[] array1;

        

    }
}

