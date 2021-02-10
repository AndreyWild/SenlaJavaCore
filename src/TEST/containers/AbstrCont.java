package TEST.containers;

public abstract class AbstrCont {
    final protected int SMALL = 10;
    final protected int BIG = 20;
    protected int [] size = {10, 20};
    protected int randomSize = size[(int)((Math.random() * size.length))];

    protected final int [] DENSITY_WATER = {1000, 2000};
    protected int randomDensity = DENSITY_WATER[(int)((Math.random() * DENSITY_WATER.length))];
    protected int hight = (int)((Math.random() * 92) +10);

    protected double scale = Math.pow(10, 3);





//    public int getRandomSize() {
//        return randomSize;
//    }
//
//    public int getRandomDensity() {
//        return randomDensity;
//    }
//
//    public int getHight() {
//        return hight;
//    }

    abstract public double getWeight();

    public boolean getSize(){
        return (randomSize == 10)? true : false;
    }


    @Override
    public String toString() {
        return "Размер=" + randomSize +
                ", Плотность=" + randomDensity +
                ", Высота=" + hight;

    }



}

