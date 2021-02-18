package eu.senla.task7.methods;

public enum Materials {
    WOOD("Дерево"),
    METAL("Металл"),
    PLASTIC("Пластик");

    private String mater;

    Materials(String mater) {
        this.mater = mater;
    }

    public  String getmater(){
        return mater;
    }
}
