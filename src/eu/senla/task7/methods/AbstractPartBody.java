package eu.senla.task7.methods;

public abstract class AbstractPartBody {
    protected Materials material;

    // Конструктор без параметра
    public AbstractPartBody() {}

    // Конструктор получает значение из Enum и присваивает его переменной material
    public AbstractPartBody(Materials material) { this.material = material; }

    // Присваивает переменной material случайное значение из Enum
    public void randomMat(){
        Materials[] enums = new Materials[]{Materials.WOOD, Materials.METAL, Materials.PLASTIC};
        this.material = enums[(int)((Math.random() * enums.length))];
    }

    // Присваивает переменной material значение WOOD из Enum
    public void woodMat(){
        material = Materials.WOOD;
    }

    // Присваивает переменной material значение METAL из Enum
    public void metalMat(){
        material = Materials.METAL;
    }

    // Присваивает переменной material значение PLASTIC из Enum
    public void plasticMat(){
        material = Materials.PLASTIC;
    }

    @Override
    public String toString() {
        return material.getMater();
    }
}
