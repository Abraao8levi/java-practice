package Exercicio9.Topic;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Pass {
    private String name;
    private int age;

    public Pass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean isPriority() {
        return age >= 65;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name + ":" + this.age;
    }
}

class Topic {
    private List<Pass> prioritySeats;
    private List<Pass> normalSeats;
    
    
    public Topic(int capacity, int qtdPriority) {
        if (capacity < 0 || qtdPriority < 0 || qtdPriority > capacity) {
            throw new IllegalArgumentException(
                    "Capacidade e quantidade de prioridades devem ser não negativas e qtdPriority não pode ser maior que capacity.");
        }
        prioritySeats = new ArrayList<>(Collections.nCopies(qtdPriority, null));
        normalSeats = new ArrayList<>(Collections.nCopies(capacity - qtdPriority, null));
    }

    private int findFirstFreePos(List<Pass> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == null) {
                return i;
            }
        }
        return -1;
    }

    private int findByName(String name, List<Pass> list) {
        for (int i = 0; i < list.size(); i++) {
            Pass pass = list.get(i);
            if (pass != null && pass.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    private boolean insertOnList(Pass pass, List<Pass> list) {
        int pos = findFirstFreePos(list);
        if (pos != -1) {
            list.set(pos, pass);
            return true;
        }
        return false;
    }

    private boolean removeFromList(String name, List<Pass> list) {
        int pos = findByName(name, list);
        if (pos != -1) {
            list.set(pos, null);
            return true;
        }
        return false;
    }

    private boolean isPassengerInTopic(String name) {
        return findByName(name, prioritySeats) != -1 || findByName(name, normalSeats) != -1;
    }

    
    // normais em assentos prioritários.
    public boolean insert(Pass pass) {
        if (isPassengerInTopic(pass.getName())) {
            System.out.println("fail: " + pass.getName() + " ja esta na topic");
            return false;
        }

        if (pass.isPriority()) {
            // Tenta inserir o passageiro prioritário primeiro nos assentos prioritários...
            if (insertOnList(pass, prioritySeats)) {
                return true;
            } 
            // ...se não conseguir, tenta nos normais.
            else if (insertOnList(pass, normalSeats)) {
                return true;
            }
        } else { // Passageiro NÃO é prioritário
            // Tenta inserir apenas nos assentos normais.
            if (insertOnList(pass, normalSeats)) {
                return true;
            }
        }

        
        System.out.println("fail: topic lotada");
        return false;
    }

    public boolean remove(String name) {
        if (removeFromList(name, prioritySeats) || removeFromList(name, normalSeats)) {
            return true;
        }
        System.out.println("fail: " + name + " nao esta na topic");
        return false;
    }

    @Override
    public String toString() {
        return "[" + Stream.concat(
                prioritySeats.stream().map(p -> "@" + (p == null ? "" : p.toString())),
                normalSeats.stream().map(p -> "=" + (p == null ? "" : p.toString())))
                .collect(Collectors.joining(" ")) + "]";
    }
}

public class Solver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    
        Topic topic = null; 

        while (true) {
            String line = scanner.nextLine();
            System.out.println("$" + line);
            String[] ui = line.split(" ");
            String cmd = ui[0];

            if (cmd.equals("end")) {
                break;
            }

            
            if (!cmd.equals("init") && topic == null) {
                System.out.println("fail: a topic nao foi inicializada. Use o comando 'init'.");
                continue;
            }

            try {
                switch (cmd) {
                    case "init":
                        if (ui.length < 3) {
                            System.out.println("fail: argumentos insuficientes para 'init'. Use: init [capacidade] [prioritarios]");
                        } else {
                            int capacity = Integer.parseInt(ui[1]);
                            int qtdPriority = Integer.parseInt(ui[2]);
                            topic = new Topic(capacity, qtdPriority);
                        }
                        break;
                    
                    case "show":
                        System.out.println(topic);
                        break;
                    
                    case "in":
                        if (ui.length < 3) {
                            System.out.println("fail: argumentos insuficientes para 'in'. Use: in [nome] [idade]");
                        } else {
                            String name = ui[1];
                            int age = Integer.parseInt(ui[2]);
                            topic.insert(new Pass(name, age));
                        }
                        break;
                    
                    case "out":
                        if (ui.length < 2) {
                            System.out.println("fail: argumentos insuficientes para 'out'. Use: out [nome]");
                        } else {
                            topic.remove(ui[1]);
                        }
                        break;
                    
                    default:
                        System.out.println("fail: comando invalido");
                }
            } catch (NumberFormatException e) {
                System.out.println("fail: argumento numerico invalido. Idade e capacidade devem ser numeros.");
            } catch (IllegalArgumentException e) { // Captura a exceção do construtor da Topic
                System.out.println("fail: " + e.getMessage());
            }
        }
        scanner.close();
    }
}