public class Liitmine {
    private int vahemik;
    //praegu ümardab kõik 0-ks, äkki võtab vahemiku automaatselt 0 ja ei kasuta seda, mis konstruktoris antakse?
    private int liidetav1 = (int)(Math.random()*vahemik);
    private int liidetav2 = (int)(Math.random()*vahemik);
    private  int summa = liidetav1 + liidetav2;

    public void prindi(){
        System.out.println(liidetav1 + " + " + liidetav2);
    }
    public int kontrolli(int vastus){
        if (vastus == summa) return 1;
        else return 0;
    }
    public Liitmine(int vahemik){
        this.vahemik = vahemik;
    }

}
