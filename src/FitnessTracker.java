import java.time.LocalDate;

public class FitnessTracker {
    public static void main(String[] args) {

        LocalDate birthday1 = LocalDate.of(2001,02,14);
        User user1 = new User("Rita", birthday1, "rita@mail.com", "125867", "Tores", 60, 120, 140000);
        LocalDate birthday2 = LocalDate.of(1999, 01, 17);
        User user2 = new User ("Seth", birthday2, "seth@mail.com", "589745", "Hogan", 78, 125, 134000);
        LocalDate birthday3 = LocalDate.of(2010, 05, 22);
        User user3 = new User ("Ben", birthday3, "ben@mail.com", "658478", "Waker", 80, 123, 145000);
        user1.printAccountInfo();
        System.out.println();
        user2.printAccountInfo();
        System.out.println();
        user3.printAccountInfo();
        System.out.println();

        user1.setSteps(141000);
        user1.setWeight(59);

        user2.setSteps(135000);
        user2.setWeight(77);
        user1.printAccountInfo();
        System.out.println();
        user2.printAccountInfo();

    }
}
