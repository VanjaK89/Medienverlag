package klatch.krone.at;

public class SMSAbonnent implements Abonnent {
    private String name;
    private Medienverlag klatch;
    public SMSAbonnent(String name, Medienverlag klatch) {
        this.name = name;
        this.klatch = klatch;
        klatch.addSubscribe(this);
    }

    public String getName() {
        return name;
    }

    //wenn Medieverlag einen neuen Artikel heraus bringt
    @Override
    public void erhalte(Artikel artikel) {
        System.out.println("SMS Abonnent " + name + " hat eine neue SMS erhalten, mit dem Artikel: " + artikel.getTitel());
    }
}
