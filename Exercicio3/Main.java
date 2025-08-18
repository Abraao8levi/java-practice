package Exercicio3;

import java.util.*;


public class Main {
    static Motorcycle motoca = new Motorcycle(1);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String line = input(scanner);
            args = line.split(" ");
            write('$' + line);

            if (args[0].equals("show")) {
                System.out.println(motoca);
            } else if (args[0].equals("init")) {
                motoca = new Motorcycle(Integer.parseInt(args[1]));
            } else if (args[0].equals("enter")) {
                motoca.enter(new Person(args[1], Integer.parseInt(args[2])));
            } else if (args[0].equals("end")) {
                break;
            } else if (args[0].equals("leave")) {
                Person person = motoca.leave();
                if (person != null) {
                    System.out.println(person.toString());
                }
            } else if (args[0].equals("honk")) {
                System.out.println(motoca.honk());
            } else if (args[0].equals("buy")) {
                motoca.buyTime(Integer.parseInt(args[1]));
            } else if (args[0].equals("drive")) {
                motoca.drive(Integer.parseInt(args[1]));
            } else {
                System.out.println("fail: comando invalido");
            }
        }
    }

    public static String input(Scanner scanner) {
        return scanner.nextLine();
    }

    public static void write(String value) {
        System.out.println(value);
    }
}
