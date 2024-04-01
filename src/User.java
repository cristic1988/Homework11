import java.time.LocalDate;
import java.time.Period;

public class User {
    private String name;

    private LocalDate birthday;

    private String email;

    private String phone;

    private String surname;

    private int weight;

    private int pressure;

    private int steps;

    private int age;



    public User(String name, LocalDate birthday, String email, String phone, String surname, int weight,
                int pressure, int steps) {
        this.name = name;
        this.birthday = birthday;
        this.email = email;
        this.phone = phone;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
        this.age = Period.between(birthday, LocalDate.now()).getYears();
    }



    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public int getAge() {
        return age;
    }

    public void printAccountInfo() {

        System.out.println("Name: " + name);

        System.out.println("Surname: " + surname);

        System.out.println("Birthday: " + birthday);

        System.out.println("Age: " + age);

        System.out.println("Email: " + email);

        System.out.println("Phone: " + phone);

        System.out.println("Weight: " + weight);

        System.out.println("Pressure: " + pressure);

        System.out.println("Steps: " + steps);

    }


}
