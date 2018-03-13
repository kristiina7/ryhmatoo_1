public class Tehe {
    private int vahemik;
    private String tehe;
    private int arv1 = (int)(Math.random()*vahemik); //võtab praegu vahemiku alati 0, äkki ei vaata seda mis konstruktor annab vaid loob arvud juba enne ja võtab vahemiku automaatselt 0?
    private int arv2 = (int)(Math.random()*vahemik);
    private int tulemus;

    public void prindiTehe(){
        String mark;
        if (tehe.equals("liitmine")){
            mark = " + ";
            tulemus = arv1 + arv2;
        }
        else if (tehe.equals("lahutamine")){
            mark = " - ";
            tulemus = arv1 - arv2;
        }
        else if (tehe.equals("korrutamine")){
            mark = " * ";
            tulemus = arv1*arv2;
        }
        else{
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
