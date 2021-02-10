package TEST.methods;

import TEST.containers.*;
import TEST.containers.ConeCont;

public class Methods {

    public static AbstrCont getRandCont(){
        AbstrCont[] abstrConts = {new ConeCont(), new CylindrCont(), new SquareCont()};
        AbstrCont randCont = abstrConts[(int)((Math.random() * abstrConts.length-1) +1)];
        return randCont;

    }
}


class Test{
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            AbstrCont cont = Methods.getRandCont();
            cont.getSize();
            System.out.println(cont);
        }
    }
}