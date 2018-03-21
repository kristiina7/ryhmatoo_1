public class Liitmine extends Tehe {

    public void prindiTehe(){
        System.out.println(arv1 + "+" + arv2);
    }

    public Liitmine(int vahemik){
        super(vahemik);
        tulemus = arv1 + arv2;
    }

}