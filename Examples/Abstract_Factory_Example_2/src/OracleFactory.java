//Concreate Factory
public class OracleFactory extends DBFactory{
    @Override
    public Connection CreateConnection() {
        return OracleConnection();
    }

    @Override
    public Command CreateCommand() {
        return OracleCommand();
    }
}
