package eu.senla.task7.plantOfHead;

import eu.senla.task7.methods.*;

public class Head extends AbstractPartBody {

    public Head() { super.material = Methods.getRandomMat(); }

    public Head(Materials material) { super(material);}

    @Override
    public String toString() {
        return "[Голова - " + super.toString() + ']';
    }
}







