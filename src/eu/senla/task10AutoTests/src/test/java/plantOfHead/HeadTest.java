package plantOfHead;

import methods.Materials;
import org.junit.gen5.api.BeforeEach;
import org.junit.gen5.api.DisplayName;
import org.junit.gen5.api.Test;
import org.junit.gen5.junit4.runner.JUnit5;
import org.junit.runner.RunWith;

import static org.junit.gen5.api.Assertions.assertEquals;
import static org.junit.gen5.api.Assertions.assertNotNull;

@RunWith(JUnit5.class)
public class HeadTest {
    private Head head;

    @Test
    @DisplayName("Should material of body is wood of Constructor")
    void shouldMaterialOfBodyIsWoodOfConstructor() {
        head = new Head(Materials.WOOD);
        assertEquals(Materials.WOOD, head.getMaterial());
        System.out.println("Should material of body is wood of Constructor passed!");
    }

    @Test
    @DisplayName("Should material of body is metal of Constructor")
    void shouldMaterialOfBodyIsMetalOfConstructor() {
        head = new Head(Materials.METAL);
        assertEquals(Materials.METAL, head.getMaterial());
        System.out.println("Should material of body is metal of Constructor passed!");
    }

    @Test
    @DisplayName("Should material of body is plastic of Constructor")
    void shouldMaterialOfBodyIsPlasticOfConstructor() {
        head = new Head(Materials.PLASTIC);
        assertEquals(Materials.PLASTIC, head.getMaterial());
        System.out.println("Should material of body is plastic of Constructor passed!");
    }

    @BeforeEach
    void createNewHead() {
        head = new Head();
    }

    @Test
    @DisplayName("Should not null")
    void shouldNotNull() {
        assertNotNull(head.getMaterial());
        System.out.println("Should not null passed!");
    }

    @Test
    @DisplayName("Should material of body is wood")
    void shouldMaterialOfBodyIsWood() {
        head.woodMat();
        assertEquals(Materials.WOOD, head.getMaterial());
        System.out.println("Should material of body is wood passed!");
    }

    @Test
    @DisplayName("Should material of body is metal")
    void shouldMaterialOfBodyIsMetal() {
        head.metalMat();
        assertEquals(Materials.METAL, head.getMaterial());
        System.out.println("Should material of body is metal passed!");
    }

    @Test
    @DisplayName("Should material of body is plastic")
    void shouldMaterialOfBodyIsPlastic() {
        head.plasticMat();
        assertEquals(Materials.PLASTIC, head.getMaterial());
        System.out.println("Should material of body is plastic passed!");
    }

}