public class Lahutamine extends Tehe {

    public String prindiTehe(){
        return arv1 + "-" + arv2;
    }

    public Lahutamine(int vahemik){
        super(vahemik);
        while(arv1-arv2 < 0){ //et ei tekiks tulemuseks negatiivset arvu
            arv2 = (int) (Math.random() * (vahemik-arv1));
        }
        tulemus = arv1 - arv2;
    }
}
