package joseph.basic.day08;

public class Inheritance2 {
    public static void main(String[] args) {

    }
}

class People {
    String talk;
    String eat;
    String walk;
    String sleep;

    public void talk(){}
    public void eat(){}
    public void walk(){}
    public void sleep(){}
}

class Student extends People {
    String study;
    public void study(){}
}

class Researcher extends People{
    String research;
    public void research(){}
}

class StudentWorker extends People{
    String work;
    public void work(){}
}

class Professor extends People{
    String teach;
    public void teach(){}
}
