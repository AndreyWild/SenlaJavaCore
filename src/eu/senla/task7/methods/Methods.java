package eu.senla.task7.methods;

public class Methods {

    // Возвращает случайный материал из Enum
    public static Materials getRandomMat(){
        // Создаем массив enum-ов и сразу его инициализируем
        Materials[] enums = new Materials[]{Materials.WOOD, Materials.METAL, Materials.PLASTIC};
        // Возвращаем случайное enum значение
        return enums[(int)((Math.random() * enums.length))];
    }

    // Возвращает случайное имя
    public static String getRandomName(){
        String [] names = {"Вертер", "Электроник", "Бендер Сгибатель Родригес",
                "C-3PO", "Робокоп", "R2D2", "Робокоп", "Чаппи",
                "Оптимус Прайм", "Бишоп 341-B", "TARS", "WALL-E",
                "Т-1000", "Т-800", "Бамблби", "Вальтрон", "Gundam", };
        return names[(int)((Math.random() * names.length))];
    }

}
