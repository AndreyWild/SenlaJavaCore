package eu.senla.task7.robot;
import eu.senla.task7.methods.*;
import eu.senla.task7.plantOfBody.Body;
import eu.senla.task7.plantOfHead.Head;

public class Robot implements Addable {
    String name;
    Head head;
    Body body;
    static int count=0;

    public Robot(String name, Head head, Body body) {
        count++;
        this.name = name;
        this.head = head;
        this.body = body;
    }

    public Robot() {
        count++;
        name = Methods.getRandomName();
        head = new Head();
        body = new Body();
    }

    @Override
    public void add(Object t) {
        if (t instanceof Head){
            head = (Head)t;
        } if (t instanceof Body){
            body = (Body)t;
        }
    }

    @Override
    public String toString() {
        return "Robot #"+ count +" \"" + name + "\" " + body+ " " + head;
    }
}
