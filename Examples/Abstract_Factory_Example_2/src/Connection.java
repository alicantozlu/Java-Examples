//Soyut Urunler
public abstract class Connection {
    public abstract void Connect();
    protected String connectionString;
    public abstract String connectionString();

    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }
}
