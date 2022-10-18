import java.util.Objects;

public class Human {
    int yearOfBirth;
    String name;
    String currentCity;
    String job;

    Human(int yearOfBirth, String name, String currentCity, String job) {
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
        if (Objects.equals(name, "")) {
            this.name = "--Информация не указана--";
        } else {
            this.name = name;
        }
        if (Objects.equals(name, "")) {
            this.currentCity = "--Информация не указана--";
        } else {
            this.currentCity = currentCity;
        }
        if (Objects.equals(name, "")) {
            this.job = "--Информация не указана--";
        } else {
            this.job = job;
        }
    }



    void greetings() {
            System.out.println("Привет! Меня зовут " + name + ". " + "Я из города " + currentCity + ". " + "Я родился в " + yearOfBirth + " году. Я работаю на должности " + job + ". Будем знакомы!");
        }
    }


