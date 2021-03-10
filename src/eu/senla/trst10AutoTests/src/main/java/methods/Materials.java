package methods;

public enum Materials {

    WOOD("Дерево"),
    METAL("Металл"),
    PLASTIC("Пластик");

    private String mater;

    Materials(String mater) {
        this.mater = mater;
    }

    Materials() {
    }

    public  String getMater(){
        return mater;
    }
}
