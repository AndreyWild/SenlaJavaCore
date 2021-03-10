package plantOfBody;


import methods.Methods;
import methods.AbstractPartBody;
import methods.Materials;

public class Body extends AbstractPartBody {

    public Body() { material = Methods.getRandomMat(); }

    public Body(Materials material) { super(material); }

    @Override
    public String toString() {
        return "[Туловище - " + super.toString() + ']';
    }
}
