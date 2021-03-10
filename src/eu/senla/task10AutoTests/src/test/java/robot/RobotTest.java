package robot;


import methods.Materials;
import plantOfBody.Body;
import plantOfHead.Head;
import org.junit.gen5.api.DisplayName;
import org.junit.gen5.api.Test;
import org.junit.gen5.junit4.runner.JUnit5;
import org.junit.runner.RunWith;

import static org.junit.gen5.api.Assertions.assertEquals;
import static org.junit.gen5.api.Assertions.assertNotNull;


@RunWith(JUnit5.class)
public class RobotTest {

    Robot robot = new Robot();

    @Test
    @DisplayName("Should head not null")
    void shouldHeadNotNull(){
        Head head = new Head();
        robot.add(head);
        assertNotNull(robot.head);
        System.out.println("Should head not null passed!");
    }

    @Test
    @DisplayName("Should body not null")
    void shouldBodyNotNull(){
        Body body = new Body();
        robot.add(body);
        assertNotNull(robot.body);
        System.out.println("Should body not null passed!");
    }

    @Test
    @DisplayName("Should name not null")
    void shouldNameNotNull(){
        assertNotNull(robot.name);
        System.out.println("Should name not null passed!");
    }

    @Test
    @DisplayName("Should Head Material In Parameter")
    void shouldHeadMaterialInParameter(){
        Materials[] material = {Materials.WOOD, Materials.METAL, Materials.PLASTIC};
        for (int i = 0; i < material.length; i++) {
            robot = new Robot();
            Head head = new Head(material[i]);
            this.robot.add(head);
            assertEquals(material[i], this.robot.head.getMaterial());
            System.out.println("Should Head Material " + material[i] + " In Parameter passed!");
        }
    }

    @Test
    @DisplayName("Should Body Material In Parameter")
    void shouldBodyMaterialInParameter(){
        Materials[] material = {Materials.WOOD, Materials.METAL, Materials.PLASTIC};
        for (int i = 0; i < material.length; i++) {
            robot = new Robot();
            Body body = new Body(material[i]);
            this.robot.add(body);
            assertEquals(material[i], this.robot.body.getMaterial());
            System.out.println("Should Body Material " + material[i] + " In Parameter passed!");
        }
    }

}