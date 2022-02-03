 class Client {
    public static void main(String[] args) {
        ICardReaderAdapter reader = new XBankCardReaderAdapter();
        var result = reader.ReadCardData();
        System.out.println(result);
    }

}

//ADAPTEE  
 class XBankPOSReader {
    public String ReadFromCard() {
        return "X bank Pos cihazi calisiyor.";
    }
}

//TARGET
 interface ICardReaderAdapter {
    public String ReadCardData();
}
//ADAPTER
 class XBankCardReaderAdapter implements ICardReaderAdapter {
    @Override
    public String ReadCardData() {
        XBankPOSReader posReader = new XBankPOSReader();
        return posReader.ReadFromCard();
    }
}

