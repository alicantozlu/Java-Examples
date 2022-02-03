public class SQLFactory extends DBFactory {
    @Override
    public Connection CreateConnection() {
        return new SQLConnection();
    }

    @Override
    public Command CreateCommand() {
        return new SQLCommand();
    }
}
