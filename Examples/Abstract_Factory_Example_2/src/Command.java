//Soyut Urunler
public abstract class Command {

    public abstract void Execute();

    protected String query;
    public String Query;

    public String getQuery() {
        return Query;
    }

    public void setQuery(String query) {
        Query = query;
    }
}
