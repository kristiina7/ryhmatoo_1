public class Korrutamine extends Tehe {

    public void prindiTehe(){
        System.out.println(arv1 + "*" + arv2);
    }

    public Korrutamine(int vahemik){
        super(vahemik);
        if (arv1 == 0){
            arv2 = (int) (Math.random() *vahemik);
        }
        else{
            arv2 = (int)(Math.round(Math.random()*(vahemik/arv1)));//panin siia math.round sest muidu tekkisid enamus tehteid suur arv * 0
        }
    }
}
