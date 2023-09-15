import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            int age = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter age, 'q' to quit:");
            age = scanner.nextInt();
            if (age != 'q') {
                age = 7 + (age / 2);
                System.out.println("You should date someone " + age);
            }
            else {
                break;
            }
                }
            }
        }


