public class Liitmine extends Tehe {

    public String prindiTehe(){
        return arv1 + "+" + arv2;
    }

    public Liitmine(int vahemik){
        super(vahemik);
        tulemus = arv1 + arv2;
    }

}