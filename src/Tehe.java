abstract public class Tehe {
    protected int vahemik;
    protected int arv1;
    protected int arv2;
    protected int tulemus;

    abstract public void prindiTehe();

    public int kontrolli(int vastus) {
        if (vastus == tulemus) {
            System.out.println("Õige");
            return 1;
        } else {
            System.out.println("Vale, õige oleks olnud: " + tulemus);
            return 0;
        }
    }

    public Tehe(int vahemik){
        this.vahemik = vahemik;
        this.arv1 = (int) (Math.random() * (vahemik));
        this.arv2 = (int) (Math.random() * (vahemik-arv1));

    }
}