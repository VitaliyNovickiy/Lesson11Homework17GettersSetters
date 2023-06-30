public class Program {
    public static void main(String[] args) {

                FitnessTracker user1 = new FitnessTracker("John", 15, 6, 1990,
                        "john@mail.com", "1234567890");
                user1.surname = "Smith";
                user1.weight = 65;
                user1.pressure = "110/80";
                user1.steps = 5625;
                user1.printAccountInfo();

                FitnessTracker user2 = new FitnessTracker("Alice", 10, 9, 1985,
                        "alice@mail.com", "9876543210");
                user2.surname = "Smith";
                user2.weight = 50;
                user2.pressure = "110/70";
                user2.steps = 10000;
                user2.printAccountInfo();

                FitnessTracker user3 = new FitnessTracker("Bob", 20, 3, 2000,
                        "bob@mail.com", "5555555555");
                user3.surname = "James";
                user3.weight = 99;
                user3.pressure = "120/70";
                user3.steps = 8852;
                user3.printAccountInfo();
    }
}
