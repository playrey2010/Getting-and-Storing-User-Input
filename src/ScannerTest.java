import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        String firstInitial;
        String lastName;
        int houseNumber;
        String streetName;
        String streetType;
        String city;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the String from the instructions: (P Sherman 42 Wallaby Way Sydney)");
        firstInitial = sc.next();
        lastName = sc.next();
        houseNumber = sc.nextInt();
        streetName = sc.next();
        streetType = sc.next();
        city = sc.next();

        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);
        System.out.println("firstInitial: " + firstInitial + "\nlastName: " + lastName
                            + "\nhouseNumber: " + houseNumber);
    }
}
