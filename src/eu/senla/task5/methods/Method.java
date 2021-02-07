package eu.senla.task5.methods;

public class Method {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {

            int a = (int)((Math.random() * 2) +1);
            System.out.println(a);
        }

        int diametr = 6;
        int hight = 8;

        double c = Math.PI * (Math.pow((diametr/2), 2))*hight;
        double d = Math.floor(c);

        System.out.println(d);



    }
}
