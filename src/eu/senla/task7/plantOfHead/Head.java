package eu.senla.task7.plantOfHead;

import eu.senla.task7.methods.*;

public class Head extends AbstractPartBody {

    public Head() { super.material = Methods.getRandomMat(); }

    public Head(Materials material) { super.material = material; }

    @Override
    public String toString() {
        return "[Голова - " + super.toString() + ']';
    }
}

class Test{
    public static void main(String[] args) {
        Head headdd = new Head(Materials.METAL);
    }
}






