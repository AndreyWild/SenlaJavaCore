package eu.senla.task7.plantOfBody;

import eu.senla.task7.methods.*;

public class Body extends AbstractPartBody{

    public Body() { material = Methods.getRandomMat(); }

    public Body(Materials material) { super(material); }

    @Override
    public String toString() {
        return "[Туловище - " + super.toString() + ']';
    }
}
