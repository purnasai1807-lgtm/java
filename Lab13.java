import java.util.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

class Lab13{
    public static void main(String args[]) {

        Hashtable<String, String> ht = new Hashtable<>();

        try {
            FileInputStream fin = new FileInputStream("std.txt");
            Scanner sc = new Scanner(fin);

            String[] arr;
            String s;

            while (sc.hasNextLine()) {
                s = sc.nextLine().trim();

                if (s.isEmpty()) {
                    continue;
                }

                arr = s.split("\\s+", 2);

                if (arr.length == 2) {
                    ht.put(arr[0], arr[1]);
                    System.out.println(arr[0] + ":" + arr[1]);
                }
            }

            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("File std.txt not found.");
            return;
        }

        System.out.println("\nHASH TABLE IS");
        System.out.println("--------------------");
        System.out.println("KEY : VALUE");

        for (Map.Entry<String, String> entry : ht.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n---- MENU ----");
            System.out.println("1. Search by Name");
            System.out.println("2. Search by Mobile");
            System.out.println("3. Exit");
            System.out.print("Enter Your Option (1, 2, 3): ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                sc.nextLine();
                continue;
            }

            int opt = sc.nextInt();
            sc.nextLine();

            if (opt == 1) {
                System.out.print("Enter Name: ");
                String name = sc.nextLine().trim();

                if (ht.containsKey(name)) {
                    System.out.println("Mobile is " + ht.get(name));
                } else {
                    System.out.println("Name not found.");
                }

            } else if (opt == 2) {
                System.out.print("Enter Mobile Number: ");
                String mobile = sc.nextLine().trim();

                boolean found = false;

                for (Map.Entry<String, String> entry : ht.entrySet()) {
                    if (entry.getValue().equals(mobile)) {
                        System.out.println("Name is " + entry.getKey());
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Mobile number not found.");
                }

            } else if (opt == 3) {
                System.out.println("Exiting application...");
                break;

            } else {
                System.out.println("Invalid option. Please choose 1, 2, or 3.");
            }
        }

        sc.close();
    }
}