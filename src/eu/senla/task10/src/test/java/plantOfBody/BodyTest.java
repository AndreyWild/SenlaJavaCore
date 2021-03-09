package plantOfBody;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static methods.Materials.*;
import static org.junit.jupiter.api.Assertions.*;

public class BodyTest {
    private Body body;

    @Test
    @DisplayName("Should material of body is wood of Constructor")
    void shouldMaterialOfBodyIsWoodOfConstructor(){
        body = new Body(WOOD);
        assertEquals(WOOD, body.getMaterial());
    }

    @Test
    @DisplayName("Should material of body is metal of Constructor")
    void shouldMaterialOfBodyIsMetalOfConstructor(){
        body = new Body(METAL);
        assertEquals(METAL, body.getMaterial());
    }

    @Test
    @DisplayName("Should material of body is plastic of Constructor")
    void shouldMaterialOfBodyIsPlasticOfConstructor(){
        body = new Body(PLASTIC);
        assertEquals(PLASTIC, body.getMaterial());
    }

    @BeforeEach
    void createNewHead(){
        body = new Body();
    }

    @Test
    @DisplayName("Should not null")
    void shouldNotNull(){
        assertNotNull(body.getMaterial());
    }

    @Test
    @DisplayName("Should material of body is wood")
    void shouldMaterialOfBodyIsWood() {
        body.woodMat();
        assertEquals(WOOD, body.getMaterial());
    }

    @Test
    @DisplayName("Should material of body is metal")
    void shouldMaterialOfBodyIsMetal() {
        body.metalMat();
        assertEquals(METAL, body.getMaterial());
    }

    @Test
    @DisplayName("Should material of body is plastic")
    void shouldMaterialOfBodyIsPlastic() {
        body.plasticMat();
        assertEquals(PLASTIC, body.getMaterial());
    }

}