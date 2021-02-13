package eu.senla.task5.final_ver.methods;

import eu.senla.task5.final_ver.containers.*;

public class Methods {

    // Метод возвращает рандомный контейнер
    public static AbstrCont getRandCont(){
        AbstrCont[] abstrConts = {new ConeCont(), new CylindrCont(), new SquareCont()};
        AbstrCont randCont = abstrConts[(int)((Math.random() * abstrConts.length-1) +1)];
        return randCont;
    }
}


