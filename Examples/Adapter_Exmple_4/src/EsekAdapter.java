public class EsekAdapter implements IAt_Hareketler {
    private String name = "Muzaffer";
    private String tur = "Esek";
    private int hiz = 0;
    private double direnc = 300.0d;

    Esek e2 = new Esek();

    @Override
    public void Kos() {
        e2.setHiz(e2.getHiz() + 40);
        System.out.println(e2.getName() + " Kos ..... Hiz :" + e2.getHiz());
    }

    @Override
    public void Atla() {
        e2.setDirenc(e2.getDirenc() - 3);
        System.out.println(e2.getName() + " Atla ..... Direnc :" + e2.getDirenc());
    }

    @Override
    public void Depar() {
        e2.setDirenc(e2.getDirenc() - 9);
        e2.setHiz(e2.getHiz() + 50);
        System.out.println(e2.getName() + " Depar ..... Hiz : " + e2.getHiz() + " | Direnc :" + e2.getDirenc());
    }

    @Override
    public void Yavasla() {
        e2.setHiz(e2.getHiz() - 30);
        System.out.println(e2.getName() + " Yavasla ..... Hiz :" + e2.getHiz());
    }

    @Override
    public void Dur() {
        e2.setHiz(0);
        System.out.println(e2.getName() + " Dur ..... Hiz :" + e2.getHiz());
    }

    @Override
    public void SonDurum(){
        System.out.println("*-------Son Durum\nIsim : "+this.getName()+"\nDirenc : "+this.getDirenc()+"\nHiz : "+this.getHiz()+"\n*-------");
    }

//GETTER - SETTER
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHiz() {
        return e2.getHiz();
    }

    public void setHiz(int hiz) {
        this.hiz = hiz;
    }

    public double getDirenc() {
        return direnc;
    }

    public void setDirenc(double direnc) {
        this.direnc = direnc;
    }

    public String getTur() {
        return this.tur;
    }
}
