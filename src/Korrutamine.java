public class Korrutamine extends Tehe {

    public String prindiTehe(){
        return (arv1 + "*" + arv2);
    }

    public Korrutamine(int vahemik){
        super(vahemik);
        //tegin selle vahemiku 2 korda väiksemaks, siis on rohkem ka muid tehteid kui vaid *1 ja *0
        arv1 = (int)(Math.random()*(vahemik/2));
        if (arv1 == 0){
            arv2 = (int) (Math.random() *vahemik);
        }
        else{
            arv2 = (int)(Math.round(Math.random()*(vahemik/arv1)));//panin siia math.round sest muidu tekkisid enamus tehteid suur arv * 0
        }
        tulemus = arv1 * arv2;
    }
}
