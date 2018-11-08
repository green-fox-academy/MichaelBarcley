import java.util.ArrayList;
import java.util.Scanner;

public class JosephusProblem {
    public static void main(String... args) {
        greeter();
        Scanner scanner = new Scanner(System.in);
        int participants = scanner.nextInt();
        josephusSolver(participants);
    }

    public static void greeter() {
        System.out.println("Greetings Challenger!");
        System.out.println("Are you heading into Josephus situation, but you don't want to die?");
        System.out.println("Don't worry! Tell me how many people will be there and I'll tell you where you should stand compared to the first guy!");
    }

    public static void josephusSolver(int numberOfPeople) {
        ArrayList<Integer> peopleList = new ArrayList<>();
        for (int i = 1; i <= numberOfPeople; i++) {
            peopleList.add(i);
        }
        while (peopleList.size() > 1) {
            for (int i = 0; i < peopleList.size(); i++) {
                if (i + 1 < peopleList.size()) {
                    peopleList.remove(i + 1);
                } else if (i == peopleList.size() - 1) {
                    peopleList.remove(0);
                }
            }
        }
        System.out.println("\n" + "...and the winner is: Place " + peopleList.get(0) + " if there are " + numberOfPeople +" people!");
    }
}
