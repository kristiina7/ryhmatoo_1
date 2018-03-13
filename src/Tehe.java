public class Tehe {
    private int vahemik;
    private String tehe;
    private int arv1;
    private int arv2;
    private int tulemus;

    public void prindiTehe(){
        arv1 = (int)(Math.random()*vahemik);
        String mark;
        if (tehe.equals("liitmine")){
            arv2 = (int) (Math.random() * (vahemik-arv1));
            mark = " + ";
            tulemus = arv1 + arv2;
        }
        else if (tehe.equals("lahutamine")){
            arv2 = (int) (Math.random() * arv1);
            mark = " - ";
            tulemus = arv1 - arv2;
        }
        else if (tehe.equals("korrutamine")){
            if (arv1 == 0){
                arv2 = (int) (Math.random() *vahemik);
            }
            else{
                arv2 = (int)(Math.round(Math.random()*(vahemik/arv1)));//panin siia math.round sest muidu tekkisid enamus tehteid suur arv * 0
            }
            mark = " * ";
            tulemus = arv1*arv2;
        }
        else{
            arv2 = (int)(Math.random()*vahemik);
            mark = " / ";
            int a = arv1;
            this.arv1 = arv1*arv2;
            this.tulemus = a;
        }
        System.out.println(arv1 + mark + arv2);
    }
    public int kontrolli(int vastus){
        if (vastus == tulemus) return 1;
        else return 0;
    }


    public Tehe(int vahemik, String tehe){
        this.vahemik = vahemik;
        this.tehe = tehe;

    }
}
