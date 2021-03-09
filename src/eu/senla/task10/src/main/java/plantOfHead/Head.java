package plantOfHead;


import methods.AbstractPartBody;
import methods.Materials;
import methods.Methods;

public class Head extends AbstractPartBody {

    public Head() { super.material = Methods.getRandomMat(); }

    public Head(Materials material) { super(material);}

    @Override
    public String toString() {
        return "[Голова - " + super.toString() + ']';
    }
}







