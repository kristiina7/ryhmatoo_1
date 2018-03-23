import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int vahemik;
        int mitu;

        //loome aksnad ja küsime aknatest sisendid
        //String tehe = JOptionPane.showInputDialog(null, "Millised tehted? (liitmine/lahutamine/korrutamine/jagamine/segamini):", "Tehte valimine", JOptionPane.QUESTION_MESSAGE);

        String[] tehted = {"liitmine", "lahutamine", "korrutamine", "jagamine", "segamini"};
        Object tehe = JOptionPane.showInputDialog(null, "Valige tehe:", "Tehte valimine",JOptionPane.INFORMATION_MESSAGE, null, tehted, tehted[0]);


        String vah = JOptionPane.showInputDialog(null, "Mitme piires: ", "Vahemik", JOptionPane.QUESTION_MESSAGE);
        String kogus = JOptionPane.showInputDialog(null, "Mitu tehet?: ", "Tehete hulk", JOptionPane.QUESTION_MESSAGE);
        while (true) {
            try {
                //proovime arvulised sisendid teisendada täisarvudeks
                vahemik = Integer.parseInt(vah);
                mitu = Integer.parseInt(kogus);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vigane sisend! Palun sisestada täisarv");
                vah = JOptionPane.showInputDialog(null, "Vigane sisend! Palun sisesta täisarv. Mitme piires: ", "Vahemik", JOptionPane.QUESTION_MESSAGE);
                kogus = JOptionPane.showInputDialog(null, "Vigane sisend! Palun sisesta täisarv. Mitu tehet?: ", "Tehete hulk", JOptionPane.QUESTION_MESSAGE);
            }
        }
        Scanner scan = new Scanner(System.in);/*
        System.out.println("Millised tehted? (liitmine/lahutamine/korrutamine/jagamine/segamini):");
        String tehe = scan.next();
        System.out.println("Mitme piires: ");
        String vah = scan.next();
        while (true) {
            try {
                //proovime arvulised sisendid teisendada täisarvudeks
                vahemik = Integer.parseInt(vah);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vigane sisend! Palun sisestada täisarv");
                System.out.println("Mitme piires: ");
                vah = scan.next();
            }
        }
        System.out.println("Mitu tehet?: ");
        String kogus = scan.next();
        while (true) {
            try {
                //proovime arvulised sisendid teisendada täisarvudeks
                mitu = Integer.parseInt(kogus);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vigane sisend! Palun sisestada täisarv");
                System.out.println("Mitu tehet?: ");
                kogus = scan.next();
            }
        }*/
        //Loome tulemuste salvestamiseks listi
        ArrayList<Integer> tulemused = new ArrayList<>();

        for (int i = 0; i < mitu; i++) { //teeb sisestatud arvu tehteid
            Tehe uus;

            if (tehe.equals("liitmine")) { //vastavalt sellele, mis tehe sisestati
                uus = new Liitmine(vahemik);
            } else if (tehe.equals("lahutamine")) {
                uus = new Lahutamine(vahemik);
            } else if (tehe.equals("korrutamine")) {
                uus = new Korrutamine(vahemik);
            } else if (tehe.equals("jagamine")) {
                uus = new Jagamine(vahemik);
            } else if (tehe.equals("segamini")) { //äkki saab ka kuidagi paremini seda kirjutada
                int arv = (int) (Math.random() * 4);
                switch (arv) {
                    case 0:
                        uus = new Liitmine(vahemik);
                        break;
                    case 1:
                        uus = new Lahutamine(vahemik);
                        break;
                    case 2:
                        uus = new Korrutamine(vahemik);
                        break;
                    default:
                        uus = new Jagamine(vahemik);
                }
            } else break;

            //kuvab tehted aknasse
            String vastused = JOptionPane.showInputDialog(null, uus.prindiTehe(), "Vastus", JOptionPane.QUESTION_MESSAGE);
            //ja loeb vastuse täisarvuna
            int vastus = Integer.parseInt(vastused);


            //System.out.println(uus.prindiTehe());
            //int vastus = scan.nextInt();

            //sisestab vastavalt kas 0 või 1 tulemuste listi
            tulemused.add(uus.kontrolli(vastus));
        }
        System.out.println(tulemused);
        int tulemus = 0;
        for (int el : tulemused){
            tulemus += el;
        }
        JOptionPane.showMessageDialog(null, "Punkte: " + tulemus + "/" + mitu, "Lõppulemus", JOptionPane.PLAIN_MESSAGE);

    }
}
