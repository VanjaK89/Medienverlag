package klatch.krone.at;

public class WebAbonnent implements Abonnent{

    private String name;
    private Medienverlag klatch;
    public WebAbonnent(String name, Medienverlag klatch) {
        this.name = name;
        this.klatch = klatch;
        klatch.addSubscribe(this);
    }

    @Override
    public String getName() {
        return name;
    }

    //wenn Medieverlag einen neuen Artikel heraus bringt
    @Override
    public void erhalte(Artikel artikel) {
        System.out.println("Web Abonnent " + name + " hat eine neue Link erhalten, mit dem Artikel: " + artikel.getTitel());
    }
}
