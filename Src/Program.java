public class Program {
    public static void main(String[] args) {

                FitnessTracker user1 = new FitnessTracker("Alice", "Simson",1,12,
                        1985, "alice.gmail.com","5252514",58,120+"/"+80,12000);
               user1.printAccountInfo();

               user1.setSteps(10500);
               user1.setWeight(68);
               user1.printAccountInfo();


                FitnessTracker user2 = new FitnessTracker("Bob", "Peterson",2,10,
                        1988, "bob.gmail.com","53232514",78,120+"/"+70,10000);
                user2.printAccountInfo();

                user2.setSurname("Bronson");
                user2.setWeight(63);
                user2.setPressure("120/100");
                user2.printAccountInfo();


                FitnessTracker user3 = new FitnessTracker("Andriy", "Jameson",10,9,
                        1977, "andriy.gmail.com","53356514",85,110+"/"+70,1000);
                user3.printAccountInfo();

    }
}
