import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {

        System.out.println(" Задание 1 ");
        int age = 2;
        if (age >= 2 && age <= 6) {
            System.out.println(" Если возраст человека равен " + age + " ,то ему нужно ходить в детский сад");
        } else if (age > 6 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в школу");
        } else if (age > 18 && age <= 24) {
            System.out.printf(" Если возраст человека равен " + age + " ,то ему нужно ходить в университет");
        } else if (age >= 24) {
            System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить на работу");
        }
        System.out.println("Задание 2");
        int numberOfYears = 4;
        if (numberOfYears < 5) {
            System.out.println(" Ребенок не может кататься на аттракционе");
        } else if (numberOfYears >= 5 && numberOfYears < 14) {
            System.out.println(" Ребенок может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else if (numberOfYears >= 14) {
            System.out.println(" Ребенок может кататься без сопровождения взрослого");
        }
        System.out.println(" Задание 3");
        int one = 5;
        int two = 1;
        int free = 3;
        if (one > two) {
            if (one >= free) {
                System.out.println(" Максимальное число " + one);
            } else {
                System.out.println("Максимальное число " + free);
            }
        } else if (two > one) {
            if (two >= free) {
                System.out.println(" Максимальное число " + two);
            } else {
                System.out.println(" Максимальное число " + free);
            }
        } else {
            if (one > free) {
                System.out.println(" Максимальное число " + one);
            } else if (one < free) {
                System.out.println(" Максимальное число " + free);
            } else {
                System.out.println(" все  3 числа равны ");
            }
        }}
    }








