package quotes;

public class Api {
    private String quoteText;
    private String quoteAuthor;

    public Api(String quoteText, String quoteAuthor) {
        this.quoteText = quoteText;
        this.quoteAuthor = quoteAuthor;
    }

    public String toString(){
        return String.format("Quote: %s - %s", this.quoteText, this.quoteAuthor);
    }

    public String getAuthor() {
        return quoteAuthor;
    }

    public String getText() {
        return quoteText;
    }
    
}
