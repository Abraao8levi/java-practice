package Exercicio3;

 
public class Motorcycle {
    private Person person; //agregacao
    private int power;
    private int time;
    
    //Inicia o atributo power, time com zero e person com null
    public Motorcycle(int power){
        this.power = power;
        this.time = 0;
        this.person = null;
    }

    public int getPower() {
        return power;
    }

    public int getTime() {
        return time;
    }

    public Person getPerson() {
        return person;
    }

    
    //Se estiver vazio, coloca a pessoa na moto e retorna true
    public boolean enter(Person person) {
        if(this.person == null){
            this.person = person;
            return true;
        } else {
            System.out.println("fail: busy motorcycle");
            return false;


        }
    }

    public Person leave() {
        if (person != null) {
            Person personLeaveving = person;
            this.person = null;
            return personLeaveving;
            
        } else{
            System.out.println("fail: empty  motorcycle");
            return null;
        }
    }
    //Comprar mais tempo
    public void buyTime(int time) {
        this.time += time;
    }

    public void drive(int time){
        if (this.time == 0) {
            System.out.println("fail: buy time first");
            return;
        }
        if (person == null) {
            System.out.println("fail: empty motorcycle");
            return;
            
        }
        if (person.getAge()>10) {
            System.out.println( "fail: too old to ride" );
            return ;
            
        }
        if (this.time >= time ) {
            this.time -= time;
            
        } else {
            System.out.println("fail: time finished after"+ this.time +"minutes");
            this.time =0;
        }

    }
    //buzinar
    public String honk(){
        int pot = 1;
        while (pot < power) {
            pot++;
        }
        return "P" + "e".repeat(pot) + "m";
    }
    public String toString(){
        String personStr = (person == null) ? "empty" : person.toString();
        return "power:" + power + ", time:" + time + ", person:(" + personStr + ")"; 
    }


    
}