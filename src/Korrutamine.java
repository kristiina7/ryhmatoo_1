//Loome alamklassi
public class Korrutamine extends Tehe {
    //peame moodustama peaklassis oleva abstaktse meetodi
    public String prindiTehe(){
        return (arv1 + "*" + arv2);
    }

    public Korrutamine(int vahemik){
        //peaklassist saame vahemiku
        super(vahemik);
        arv1 = (arv1/arv2);


        /*
        //tegin selle vahemiku 2 korda väiksemaks, siis on rohkem ka muid tehteid kui vaid *1 ja *0
        arv1 = (int)(Math.random()*(vahemik/2));
        // kui arv1 on 0, siis teine arv võib olla ükskõik milline antud vahemikust
        if (arv1 == 0){
            arv2 = (int) (Math.random() *vahemik);
        }
        else{
            //arv2 peab olema selline, et korrutis ei tuleks suurem vahemikust
            arv2 = (int)(Math.round(Math.random()*(vahemik/arv1)));//panin siia math.round sest muidu tekkisid enamus tehteid suur arv * 0
        }
        */

        tulemus = arv1 * arv2;
    }
}
