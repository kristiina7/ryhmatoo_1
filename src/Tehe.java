//Loome abstraktse peaklassi
abstract public class Tehe {
    //loome isendiväljad nii, et saame neid samas kasutas hiljem ka kasutada
    protected int vahemik;
    protected int arv1;
    protected int arv2;
    protected int tulemus;
    //Loome meetodi, mida hakkame alamklassides kasutama, et väljastada tehet sõnena/küsimusena
    abstract public String prindiTehe();
    //Meetod, mis kontrollib kas sisestatud vastus on õige
    public int kontrolli(int vastus) {
        if (vastus == tulemus) {
            System.out.println("Õige");
            return 1;
        } else {
            System.out.println("Vale, õige oleks olnud: " + tulemus);
            return 0;
        }
    }
    //meetod, millega tehakse tehe. Määratud on algsed arvud, mida vastavalt tehete vajadusele alamklassided muudetakse
    public Tehe(int vahemik){
        this.vahemik = vahemik;
        this.arv1 = (int) (Math.random() * (vahemik));
        this.arv2 = (int) (Math.random() * (vahemik-arv1));

    }
}