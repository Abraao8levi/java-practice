package Exercicio7.pulapula;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.Collectors;

class Kid {
    private String name;
    private int age;

    public Kid(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }
}

class Trampoline {
    private LinkedList<Kid> kids;

    public Trampoline() {
        kids = new LinkedList<>();
    }

    public void arrive(Kid kid) {
        kids.add(kid);
    }

    public void enter() {
        if (!kids.isEmpty()) {
            Kid kid = kids.removeFirst();
            System.out.println(kid.getName() + " entrou no trampolim.");
        } else {
            System.out.println("fail: nenhum kid na fila");
        }
    }

    public void leave() {
        if (!kids.isEmpty()) {
            Kid kid = kids.removeLast();
            System.out.println(kid.getName() + " saiu do trampolim.");
        } else {
            System.out.println("fail: nenhum kid na fila");
        }
    }

    public void removeKid(String name) {
        kids = kids.stream()
                .filter(kid -> !kid.getName().equals(name))
                .collect(Collectors.toCollection(LinkedList::new));
    }

    @Override
    public String toString() {
        if (kids.isEmpty()) {
            return "nenhum kid na fila";
        }
        return kids.stream()
                .map(Kid::toString)
                .collect(Collectors.joining(", "));
    }
}

class Solver {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Trampoline tramp = new Trampoline();
        while (true) {
            String line = scanner.nextLine();
            System.out.println("$" + line);
            String[] ui = line.split(" ");
            if (ui[0].equals("end")) {
                break;
            } else if (ui[0].equals("arrive")) { // name age
                tramp.arrive(new Kid(ui[1], Integer.parseInt(ui[2])));
            } else if (ui[0].equals("enter")) {
                tramp.enter();
            } else if (ui[0].equals("leave")) {
                tramp.leave();
            } else if (ui[0].equals("remove")) {// name
                tramp.removeKid(ui[1]);
            } else if (ui[0].equals("show")) {
                System.out.println(tramp);
            } else {
                System.out.println("fail: comando invalido");
            }
        }
        scanner.close();
    }











    
}
