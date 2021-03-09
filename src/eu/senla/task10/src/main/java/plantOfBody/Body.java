package plantOfBody;


import methods.AbstractPartBody;
import methods.Materials;
import methods.Methods;

public class Body extends AbstractPartBody {

    public Body() { material = Methods.getRandomMat(); }

    public Body(Materials material) { super(material); }

    @Override
    public String toString() {
        return "[Туловище - " + super.toString() + ']';
    }
}
