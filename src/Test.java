import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Millised tehted? (liitmine/lahutamine/korrutamine/jagamine/kõik):");
        String tehe = scan.next();
        System.out.println("Mitme piires: ");
        int vahemik = scan.nextInt();
        System.out.println("Mitu tehet?: ");
        int mitu = scan.nextInt();

        ArrayList<Integer> tulemused = new ArrayList<>();
        for (int i = 0; i < mitu; i++) {
            Tehe uus = new Tehe(vahemik, tehe);
            uus.prindiTehe();
            int vastus = scan.nextInt();
            tulemused.add(uus.kontrolli(vastus));
        }

    }
}
