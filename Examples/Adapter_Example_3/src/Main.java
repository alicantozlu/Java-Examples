public class Main {

}

interface IEmail {
    void send();
}

class Email implements IEmail {

    @Override
    public void send() {
        System.out.println("Sending email.");
    }
}

interface IWeb {
    void Push();
}

class WebAdapter implements IEmail {

    private IWeb web;

    public WebAdapter(IWeb web) {
        this.web = web;
    }

    @Override
    public void send() {
        web.Push();
    }
}

