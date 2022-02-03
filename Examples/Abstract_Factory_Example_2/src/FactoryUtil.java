public class FactoryUtil {
    public static DBFactory GetFactory(String db_name) throws Exception {
        if (db_name.equals("SQL")) {
            return new SQLFactory();
        }
        if (db_name.equals("Oracle")) {
            return new OracleFactory();
        }
        throw new Exception("error");
    }
}
