package klatchkrone.at;

public class PrintAbonnent implements Abonnent{
    private String name;
    private Medienverlag klatch;
    public PrintAbonnent(String name, Medienverlag klatch) {
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
        System.out.println("Print Abonnent " + name + " hat eine neue Zeitung erhalten, mit dem Artikel: " + artikel.getTitel());
    }
}
