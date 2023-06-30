
public class  FitnessTracker {
    private final String name;
    private final int birthDay;
    private final int birthMonth;
    private final int birthYear;
    private final String email;
    private final String phone;
    public String surname;
    public double weight;
    public String pressure;
    public int steps;
    private final int age;
    public FitnessTracker(String name, int birthDay, int birthMonth, int birthYear, String email, String phone) {
        this.name = name;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.email = email;
        this.phone = phone;
        this.surname = "";
        this.weight = 0;
        this.pressure = "";
        this.steps = 0;
        this.age = calculateAge();
    }

    private int calculateAge() {
        int currentYear = 2020;
        return currentYear - birthYear;
    }



    public void printAccountInfo() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Date of Birth: " + birthDay + "/" + birthMonth + "/" + birthYear);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Weight: " + weight);
        System.out.println("Blood Pressure: " + pressure);
        System.out.println("Steps: " + steps);
        System.out.println();


    }
}

