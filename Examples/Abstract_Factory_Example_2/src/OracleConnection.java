public class OracleConnection extends Connection{
    @Override
    public void Connect() {
        System.out.println("Oracle`a Baglandi");
    }

    @Override
    public String connectionString() {
        return null;
    }
}
