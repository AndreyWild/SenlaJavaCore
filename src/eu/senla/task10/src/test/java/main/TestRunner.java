package main;

import methods.MaterialsTest;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import plantOfBody.BodyTest;
import plantOfHead.HeadTest;
import robot.RobotTest;


public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(MaterialsTest.class,
                MaterialsTest.class, BodyTest.class, HeadTest.class, RobotTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }

}
