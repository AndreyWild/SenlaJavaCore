package plantOfBody;


import org.junit.gen5.api.BeforeEach;
import org.junit.gen5.api.DisplayName;
import org.junit.gen5.api.Test;
import org.junit.gen5.junit4.runner.JUnit5;
import org.junit.runner.RunWith;

import static methods.Materials.*;
import static org.junit.gen5.api.Assertions.assertEquals;
import static org.junit.gen5.api.Assertions.assertNotNull;


@RunWith(JUnit5.class)
public class BodyTest {
    private Body body;

    @Test
    @DisplayName("Should material of body is wood of Constructor")
    void shouldMaterialOfBodyIsWoodOfConstructor(){
        body = new Body(WOOD);
        assertEquals(WOOD, body.getMaterial());
        System.out.println("Should material of body is wood of Constructor passed!");
    }

    @Test
    @DisplayName("Should material of body is metal of Constructor")
    void shouldMaterialOfBodyIsMetalOfConstructor(){
        body = new Body(METAL);
        assertEquals(METAL, body.getMaterial());
        System.out.println("Should material of body is metal of Constructor passed!");
    }

    @Test
    @DisplayName("Should material of body is plastic of Constructor")
    void shouldMaterialOfBodyIsPlasticOfConstructor(){
        body = new Body(PLASTIC);
        assertEquals(PLASTIC, body.getMaterial());
        System.out.println("Should material of body is plastic of Constructor passed!");
    }

    @BeforeEach
    void createNewHead(){
        body = new Body();
    }

    @Test
    @DisplayName("Should not null")
    void shouldNotNull(){
        assertNotNull(body.getMaterial());
        System.out.println("Should not null passed!");
    }

    @Test
    @DisplayName("Should material of body is wood")
    void shouldMaterialOfBodyIsWood() {
        body.woodMat();
        assertEquals(WOOD, body.getMaterial());
        System.out.println("Should material of body is wood passed!");
    }

    @Test
    @DisplayName("Should material of body is metal")
    void shouldMaterialOfBodyIsMetal() {
        body.metalMat();
        assertEquals(METAL, body.getMaterial());
        System.out.println("Should material of body is metal passed!");
    }

    @Test
    @DisplayName("Should material of body is plastic")
    void shouldMaterialOfBodyIsPlastic() {
        body.plasticMat();
        assertEquals(PLASTIC, body.getMaterial());
        System.out.println("Should material of body is plastic passed!");
    }

}