import java.util.ArrayList;
import java.util.Scanner;

public class findSmallLarge {
    public Scanner input = new Scanner(System.in);

    // take in LCV in getCounter() and pass to getNumber()
    public int getCounter() {
        System.out.println("how many numbers do you want to enter? ");
        int limit = input.nextInt();

        return limit;
    }

    // Add to array while array.size() is less than or equal to limit. use limit as LCV
    public int getNumbers(int limit) {
        System.out.println("Please enter each number followed by the enter key: ");
        ArrayList<Integer> aList1 = new ArrayList<>();

        do {
            int userNumbers = input.nextInt();
            aList1.add(userNumbers);

            return userNumbers;
        }
        while (aList1.size() <= limit);
    }
}

