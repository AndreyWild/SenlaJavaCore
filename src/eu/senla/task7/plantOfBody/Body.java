package eu.senla.task7.plantOfBody;

import eu.senla.task7.methods.*;

public class Body extends AbstractPartBody{

    public Body() { super.material = Methods.getRandomMat(); }

    public Body(Materials material) { super.material = material; }

    @Override
    public String toString() {
        return "[Туловище - " + super.toString() + ']';
    }
}
