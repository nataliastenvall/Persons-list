package ru.geekbrains.lesson_5;
import ru.geekbrains.lesson_5.Person;

public class Main {

    public static void main(String[] args) {


        Person[] persArray = new Person[5]
            persArray[0] = new Person("Stenvall Bjorn Johan", "892312312", "ivivan@mailbox.com", 30000, 30);
            persArray[1] = new Person("Markkanen Lourdes Lulu", "890554611", "fara@mailbox.com", 25000, 40);
            persArray[2] = new Person("Zidkova Ivana Petra", "890554611", "kara@gmail.com", 25000, 45);
            persArray[3] = new Person("Zhalthuntdinov Ildar Renat", "890554611", "sara@gmail.com", 25000, 60);
            persArray[4] = new Person("Daurova Daria Ivana", "890554611", "dara@gmail.com", 25000, 60);


        public void checkTheAge () {
            for (int i = 0; i < persArray.length; i++) {
                if (age >= 40) {
                    System.out.println(persArray[i]);
                } else continue;
            }
        }
    }
}