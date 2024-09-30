import java.util.ArrayList;
import java.util.Scanner;

public class App {

   static ArrayList<SportApp> logs = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean run = true;

        while (run) {
            System.out.println("1. Add new activity");
            System.out.println("2. Show all activities");
            System.out.println("3. Total time spent on activities");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addSport(scanner);
                    break;
                case 2:
                    showAllSports();
                    break;
                case 3:
                    totalTimeSpent();
                    break;
                case 4:
                    run = false;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    private static void addSport(Scanner scanner) {
        System.out.println("Enter sport name: ");
        String sportName = scanner.next();

        System.out.println("Enter duration (hours): ");
        int duration = scanner.nextInt();

        System.out.println("Enter day of the week: ");
        String dayOfWeek = scanner.next();


        SportApp sport = new SportApp(sportName, duration, dayOfWeek);
        logs.add(sport);
        System.out.println("Sport added: " + sport);
    }

    private static void showAllSports() {
        for (SportApp sportApp : logs) {
            System.out.println(sportApp);
        }
    }

    private static void totalTimeSpent() {
        int totalDuration = 0;
        for (SportApp sportApp : logs) {
            totalDuration += sportApp.getDuration();
        }
        System.out.println("Total time spent: " + totalDuration);
    }
}
