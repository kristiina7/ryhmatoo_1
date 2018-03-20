import java.util.ArrayList;
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Millised tehted? (liitmine/lahutamine/korrutamine/jagamine/segamini):");
        String tehe = scan.next();
        System.out.println("Mitme piires: ");
        int vahemik = scan.nextInt();
        System.out.println("Mitu tehet?: ");
        int mitu = scan.nextInt();

        ArrayList<Integer> tulemused = new ArrayList<>();

        for (int i = 0; i < mitu; i++) { //teeb sisestatud arvu tehteid
            Tehe uus;

            if (tehe.equals("liitmine")){ //vastavalt sellele, mis tehe sisestati
                uus = new Liitmine(vahemik);
            }
            else if(tehe.equals("lahutamine")){
                uus = new Lahutamine(vahemik);
            }
            else if (tehe.equals("korrutamine")){
                uus = new Korrutamine(vahemik);
            }
            else if (tehe.equals("jagamine")){
                uus = new Jagamine(vahemik);
            }
            else if (tehe.equals("segamini")){ //äkki saab ka kuidagi paremini seda kirjutada
                int arv = (int) (Math.random()*4);
                switch(arv){
                    case 0:
                        uus = new Liitmine(vahemik);
                        break;
                    case 1:
                        uus = new Lahutamine(vahemik);
                        break;
                    case 2:
                        uus = new Korrutamine(vahemik);
                        break;
                    default: uus = new Jagamine(vahemik);
                }
            }

            else {
                System.out.println("Vigane sisend");
                break;
            }

            uus.prindiTehe();

            int vastus = scan.nextInt();
            tulemused.add(uus.kontrolli(vastus));
        }
        System.out.println(tulemused);

    }
}
