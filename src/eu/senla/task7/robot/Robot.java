package eu.senla.task7.robot;


import eu.senla.task7.methods.*;

import eu.senla.task7.plantOfBody.Body;
import eu.senla.task7.plantOfHead.Head;

public class Robot implements Addable {
    String name;
    Head head;
    Body body;

    public Robot(String name, Head head, Body body) {
        this.name = name;
        this.head = head;
        this.body = body;
    }

    public Robot() {
        name = Methods.getRandomName();
        head = new Head();
        body = new Body();
    }

    @Override
    public String toString() {
        return "Robot \"" + name + "\" " + body+ " " + head;
    }


    @Override
    public void add(Object t) {
        if (t instanceof Head){
            head = (Head)t;
        } if (t instanceof Body){
            body = (Body)t;
        }
    }
}
