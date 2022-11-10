package klatchkrone.at;


public class Artikel {

    private String titel;
    private String content;

    public Artikel(String titel, String content) {
        this.titel = titel;
        this.content = content;
    }

    public String getTitel() {
        return titel;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Artikel to String output{" +
                "titel='" + titel + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
