import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Millised tehted? (liitmine/lahutamine/korrutamine/jagamine/kõik):");
        String tehe = scan.next();
        System.out.println("Mitme piires:10/20/100 ");
        int vahemik = scan.nextInt();
        System.out.println("Mitu tehet?: ");
        int mitu = scan.nextInt();

        ArrayList<Integer> tulemused = new ArrayList<>();

        for (int i = 0; i < mitu; i++) {
            if (tehe.equals("liitmine")){
                Liitmine uus = new Liitmine(vahemik);
                uus.prindi();
                int vastus = scan.nextInt();
                tulemused.add(uus.kontrolli(vastus));

            }
        }

    }
}
