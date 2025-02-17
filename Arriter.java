import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;
public class Arriter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements");
        int n = s.nextInt();
        ArrayList<Integer> nu = new ArrayList<>(n); 
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            int number = s.nextInt();
            nu.add(number);
        }
        ListIterator<Integer> lt = nu.listIterator();
        System.out.println("Removing even numbers:");
        while (lt.hasNext()) {
            Integer cu = lt.next();
            if (cu % 2 == 0) {
                lt.remove();
            }
        }
        System.out.println("ArrayList after removing even numbers: " + nu);
        if (lt.hasPrevious()) {
            lt.previous();
            lt.remove();
            System.out.println("Removed last element using previous method: " + nu);
        } else {
            System.out.println("No elements to remove");
        }  
    }
}
/*
 Enter number of elements5
Enter 5 numbers:
2
8
6
1
5
Removing even numbers:
ArrayList after removing even numbers: [1, 5]
Removed last element using previous method: [1]

 */
