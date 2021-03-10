package methods;


import org.junit.gen5.api.DisplayName;
import org.junit.gen5.api.Test;
import org.junit.gen5.junit4.runner.JUnit5;
import org.junit.runner.RunWith;

import static org.junit.gen5.api.Assertions.assertEquals;

@RunWith(JUnit5.class)
public class MaterialsTest {

    @Test
    @DisplayName("Should material wood")
    void shouldMaterialWood() {
        assertEquals("Дерево", Materials.WOOD.getMater());
        System.out.println("Should material wood passed!");
    }

    @Test
    @DisplayName("Should material metal")
    void shouldMaterialMetal() {
        assertEquals("Металл", Materials.METAL.getMater());
        System.out.println("Should material metal passed!");
    }

    @Test
    @DisplayName("Should material plastic")
    void shouldMaterialPlastic() {
        assertEquals("Пластик", Materials.PLASTIC.getMater());
        System.out.println("Should material plastic passed!");
    }

}