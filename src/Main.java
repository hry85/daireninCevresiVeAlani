import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double pi=3.14;
        double r;
        double cevre;
        double alan;
        int merkezAcisi;
        double daireDilimininAlani;
        Scanner input=new Scanner(System.in);
        System.out.print("Yari capi giriniz : ");
        r=input.nextDouble();

        cevre=(2*pi*r);
        System.out.println("Dairenin cevresi : " + cevre);

        alan=(pi*pi*r);
        System.out.println("Dairenin alani : " +alan);
        System.out.println("---------------------------------------");
        //Daire diliminin alani

        System.out.print("Alfa acisinin degerini giriniz : ");
        merkezAcisi=input.nextInt();

        daireDilimininAlani=(pi*(r*r)*merkezAcisi)/360;
        System.out.println("Daire diliminin alani : " +daireDilimininAlani);




    }
}
