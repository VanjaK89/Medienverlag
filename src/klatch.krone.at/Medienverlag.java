package klatch.krone.at;

import java.util.ArrayList;
import java.util.List;

//sollte abstract ein
public class Medienverlag {

    private  ArrayList<Abonnent> abonnenten = new ArrayList<>();


    public void veroefentliche(Artikel artikel1) {
        for(Abonnent einAbonnent: abonnenten){
            einAbonnent.erhalte(artikel1);
            System.out.println("Medienverlag: " + einAbonnent.getName() + " wurde hinzugefügt");
        }
    }

    public void addSubscribe(Abonnent a){
        abonnenten.add(a);
    }
    public void removeSubscriber(Abonnent a){
        abonnenten.remove(a);
    }
}
