public class Jagamine extends Tehe {

    public String prindiTehe(){
        return (arv1 + "/" + arv2);
    }

    public Jagamine(int vahemik){
        super(vahemik);
        arv2 = (int)(Math.random()*vahemik/arv1);
        while (arv2 == 0 || arv1*arv2 > vahemik){ //et ei tekiks nulliga jagamist ja arvud jääksid antud vahemikku
            arv2 = (int)(Math.random()*vahemik/arv1);
        }
        int a = arv1;
        arv1 = arv1*arv2;
        tulemus = a;

    }
}