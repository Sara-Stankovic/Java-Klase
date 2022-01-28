package Glumci;

public class GlumciTest {

    public static void main(String[] args) {

        Glumac g1 = new Glumac("Morgan","Freeman",'m',84,9.6,false);
        Glumac g2 = new Glumac("Branka","Katic",'z',51,8.9,true);

        System.out.println(g1.toString());
        System.out.println(g2.toString());

    }

}
