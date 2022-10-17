public class Main {
    public static void main(String[] args) {
    //Task1,2
        Human maksim = new Human(1987,"Максим","Минск","бренд-менеджер");
        Human anya = new Human(1993,"Аня","Москва","методист");
        Human katya = new Human(1994, "Катя","Калининград","продакт-менеджер");
        Human artem = new Human(1995,"Артём","Москва","директор по развитию бизнеса");

        maksim.greetings();
        anya.greetings();
        katya.greetings();
        artem.greetings();

    }
}
