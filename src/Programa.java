public class Programa {
    public static void main(String[] args) {

        double pirmaSiena = 17.35;
        double antraSiena = 18;
        double treciaSiena = 20.47;
        double ketvirtaSiena = 16.37;


        double perimetras = namoPerimetras(pirmaSiena, antraSiena, treciaSiena, ketvirtaSiena);


        System.out.println("perimetras = " + perimetras);
    }

    public static double namoPerimetras(double a, double b, double c, double d){
        return a+b+c+d;
    }
}
