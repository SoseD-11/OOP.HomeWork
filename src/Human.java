

public class Human {
    int yearOfBirth;
    String name;
    String currentCity;
    String job;

    Human(int yearOfBirth, String name, String currentCity, String job){
        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.currentCity = currentCity;
        this.job = job;
    }

    void greetings() {
        System.out.println("Привет! Меня зовут " + name + ". " + "Я из города " + currentCity + ". " +  "Я родился в " + yearOfBirth + " году. Я работаю на должности " + job + ". Будем знакомы!");

    }
}

