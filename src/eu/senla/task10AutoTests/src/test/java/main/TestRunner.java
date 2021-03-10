package main;

/**
 * Автозапуск всех тестов
 */

import org.junit.gen5.junit4.runner.JUnit5;
import org.junit.gen5.junit4.runner.Packages;
import org.junit.runner.RunWith;

@RunWith(JUnit5.class)
@Packages({ "methods", "plantOfBody", "plantOfHead", "robot"})
public class TestRunner {
}
