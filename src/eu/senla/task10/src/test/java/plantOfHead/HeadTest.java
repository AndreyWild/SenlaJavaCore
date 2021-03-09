package plantOfHead;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static methods.Materials.*;
import static org.junit.jupiter.api.Assertions.*;

public class HeadTest {
    private Head head;

    @Test
    @DisplayName("Should material of body is wood of Constructor")
    void shouldMaterialOfBodyIsWoodOfConstructor() {
        head = new Head(WOOD);
        assertEquals(WOOD, head.getMaterial());

    }

    @Test
    @DisplayName("Should material of body is metal of Constructor")
    void shouldMaterialOfBodyIsMetalOfConstructor() {
        head = new Head(METAL);
        assertEquals(METAL, head.getMaterial());
    }

    @Test
    @DisplayName("Should material of body is plastic of Constructor")
    void shouldMaterialOfBodyIsPlasticOfConstructor() {
        head = new Head(PLASTIC);
        assertEquals(PLASTIC, head.getMaterial());
    }

    @BeforeEach
    void createNewHead() {
        head = new Head();
    }

    @Test
    @DisplayName("Should not null")
    void shouldNotNull() {
        assertNotNull(head.getMaterial());
    }

    @Test
    @DisplayName("Should material of body is wood")
    void shouldMaterialOfBodyIsWood() {
        head.woodMat();
        assertEquals(WOOD, head.getMaterial());
    }

    @Test
    @DisplayName("Should material of body is metal")
    void shouldMaterialOfBodyIsMetal() {
        head.metalMat();
        assertEquals(METAL, head.getMaterial());
    }

    @Test
    @DisplayName("Should material of body is plastic")
    void shouldMaterialOfBodyIsPlastic() {
        head.plasticMat();
        assertEquals(PLASTIC, head.getMaterial());
    }

}