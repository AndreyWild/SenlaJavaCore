package plantOfHead;


import methods.Methods;
import methods.AbstractPartBody;
import methods.Materials;

public class Head extends AbstractPartBody {

    public Head() { super.material = Methods.getRandomMat(); }

    public Head(Materials material) { super(material);}

    @Override
    public String toString() {
        return "[Голова - " + super.toString() + ']';
    }
}







