package eu.senla.task7.main;

import eu.senla.task7.methods.Materials;
import eu.senla.task7.plantOfBody.Body;
import eu.senla.task7.plantOfHead.Head;
import eu.senla.task7.robot.Robot;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------Авторежим-------------------------");
        for (int i = 1; i < 10; i++) {
            Robot rob = new Robot();
            System.out.println("№" + i + ") " + rob);
        }

        System.out.println("-------------------------Ручной режим-------------------------");
        Head head = new Head(Materials.METAL);
        System.out.println(head + "\n");

        Body body = new Body();
        body.metalMat();
        System.out.println(body + "\n");

        Robot robot = new Robot();
        robot.add(head);
        robot.add(body);
        System.out.println(robot + "\n");

        Robot robot2 = new Robot("Би-БИ", head, body);
        System.out.println(robot2 + "\n");


    }
}
