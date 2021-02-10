package TEST.Main;

import TEST.containers.*;


public class Main {
    public static void main(String[] args) {
        AbstrCont[] cot_s = new AbstrCont[10];
        double weight = 0;
        for (int i = 0; i < cot_s.length/2; i++) {
            AbstrCont container = new ConeCont();
            cot_s[i] = container;
        }
        for (int i = 5; i < cot_s.length; i++) {
            AbstrCont container = new CylindrCont();
            cot_s[i] = container;
        }
        for (AbstrCont s : cot_s){
            weight += s.getWeight();
            System.out.println(s.getSize());
            System.out.println(s);
        }
        System.out.println(weight);
    }







//        double allWeight = 0;
//        for (int i = 0; i < 30; i++) {
//             AbstractContainer container = new ConeCont();
////            AbstractContainer container = new CylindrCont();
////            AbstractContainer container = new SquareCont();
//            System.out.println(container);
//            allWeight += container.getWeight();
//        }
//        System.out.println(allWeight);
//    }
}
