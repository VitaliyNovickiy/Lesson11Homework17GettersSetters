
public class  FitnessTracker {
    private  String name;
    public String surname;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private  String email;
    private  String phone;
    public double weight;
    public String pressure;
    public int steps;
    private  int age;

    public FitnessTracker(String name,String surname, int birthDay, int birthMonth, int birthYear,
                          String email, String phone,double weight,String pressure, int steps) {
        this.name = name;
        this.surname = surname;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.email = email;
        this.phone = phone;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
        this.age = calculateAge();
    }



    private int calculateAge() {
        int currentYear = 2020;
        return currentYear - birthYear;
    }


    @Override
    public String toString() {
        return "FitnessTracker " +
                "name: " + name + '\'' +
                ", surname: " + surname + '\'' +
                ", birthDay: " + birthDay +
                ", birthMonth: " + birthMonth +
                ", birthYear: " + birthYear + '\n' +
                " email: " + email + '\'' +
                ", phone: " + phone + '\'' +
                ", weight: " + weight +
                ", pressure: " + pressure + '\'' +
                ", steps: " + steps +
                ", age: " + age +'\n' + '\n';
    }

    public void printAccountInfo() {

        System.out.printf(toString());

    }

    public String getName() {return name;}
    public int getBirthDay() {return birthDay;}
    public int getBirthMonth() {return birthMonth;}
    public int getBirthYear() {return birthYear;}
    public String getEmail() {return email;}
    public String getPhone() {return phone;}
    public int getAge() {return age;}

    public void setSurname(String surname) {this.surname = surname;}
    public void setWeight(double weight) {this.weight = weight;}
    public void setPressure(String pressure) {this.pressure = pressure;}
    public void setSteps(int steps) {this.steps = steps;}
}

