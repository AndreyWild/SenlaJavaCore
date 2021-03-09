package methods;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaterialsTest {

    @Test
    @DisplayName("Should material wood")
    void shouldMaterialWood() {
        assertEquals("Дерево", Materials.WOOD.getMater());
    }

    @Test
    @DisplayName("Should material metal")
    void shouldMaterialMetal() {
        assertEquals("Металл", Materials.METAL.getMater());
    }

    @Test
    @DisplayName("Should material plastic")
    void shouldMaterialPlastic() {
        assertEquals("Пластик", Materials.PLASTIC.getMater());
    }

}