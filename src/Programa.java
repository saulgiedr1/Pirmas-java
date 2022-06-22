public class Programa {
    public static void main(String[] args) {

        double pirmaSiena = 17.35;
        double antraSiena = 18;
        double treciaSiena = 20.47;
        double ketvirtaSiena = 16.37;
        double pirmaSiena1 = 2;
        double antraSiena1 = 4;
        double treciaSiena1 = 3;
        double ketvirtaSiena1 = 4.1;


        double perimetras = namoPerimetras(pirmaSiena, antraSiena, treciaSiena, ketvirtaSiena);
        double perimetras1 = namoPerimetras(pirmaSiena1, antraSiena1, treciaSiena1, ketvirtaSiena1);


        System.out.println("perimetras = " + perimetras);
        System.out.println("perimetras1 = " + perimetras1);
    }

    public static double namoPerimetras(double a, double b, double c, double d){
        return a+b+c+d;
    }
}
