package robot;

import methods.Materials;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import plantOfBody.Body;
import plantOfHead.Head;
import static methods.Materials.*;
import static org.junit.jupiter.api.Assertions.*;


public class RobotTest {

    Robot robot = new Robot();

    @Test
    @DisplayName("Should head not null")
    void shouldHeadNotNull(){
        Head head = new Head();
        robot.add(head);
        assertNotNull(robot.head);
    }

    @Test
    @DisplayName("Should body not null")
    void shouldBodyNotNull(){
        Body body = new Body();
        robot.add(body);
        assertNotNull(robot.body);
    }

    @Test
    @DisplayName("Should name not null")
    void shouldNameNotNull(){
        assertNotNull(robot.name);
    }

    @Test
    @DisplayName("Should Head Material In Parameter")
    void shouldHeadMaterialInParameter(){
        Materials[] material = {WOOD, METAL, PLASTIC};
        for (int i = 0; i < material.length; i++) {
            robot = new Robot();
            Head head = new Head(material[i]);
            this.robot.add(head);
            assertEquals(material[i], this.robot.head.getMaterial());
        }
    }

    @Test
    @DisplayName("Should Body Material In Parameter")
    void shouldBodyMaterialInParameter(){
        Materials[] material = {WOOD, METAL, PLASTIC};
        for (int i = 0; i < material.length; i++) {
            robot = new Robot();
            Body body = new Body(material[i]);
            this.robot.add(body);
            assertEquals(material[i], this.robot.head.getMaterial());
        }
    }

}