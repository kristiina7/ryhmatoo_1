public class Lahutamine extends Tehe {

    public void prindiTehe(){
        System.out.println(arv1 + "-" + arv2);
    }

    public Lahutamine(int vahemik){
        super(vahemik);
        while(arv1-arv2 < 0){ //et ei tekiks tulemuseks negatiivset arvu
            arv2 = (int) (Math.random() * (vahemik-arv1));
        }
        tulemus = arv1 - arv2;
    }
}
