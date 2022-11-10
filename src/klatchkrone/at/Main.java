package klatchkrone.at;

public class Main {
    public static void main(String[] args) {

        Medienverlag klatch = new Medienverlag();
        Artikel artikel1 = new Artikel("Baby Hund rettet Kind", "Kleiner Welpe überrascht uns alle mit seinem großen Mut");
        Artikel artikel2 = new Artikel("Ultra spanenden Rettung von einem" + "Vogel der von einem Baum herunter gefallen ist" + "\n", "Es waren die furchteinfloeszendsten 20cm senes Lebens." + "Klicken Sie (hier) um zu erfahren wie es ihm geht(Webcam).");
        System.out.println(artikel1.toString() + "\n\n" + artikel2.toString());

        Abonnent Peter = new PrintAbonnent("Peter", klatch);
        Abonnent Hans = new PrintAbonnent("Hans", klatch);
        Abonnent Wilhelm = new SMSAbonnent("Wilhelm", klatch);
        Abonnent Meixi = new WebAbonnent("Meixi", klatch);

        klatch.addSubscribe(Meixi);
        klatch.addSubscribe(Wilhelm);
        System.out.println("Artikel ---------------1----------------------------------------------------");
        klatch.veroefentliche(artikel1);
        System.out.println("Artikel ---------------2----------------------------------------------------");
        klatch.veroefentliche(artikel2);


    }
}
