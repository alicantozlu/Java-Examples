public class At implements IAt_Hareketler {

    private String name = "Yilki";
    private String tur = "At";
    private int hiz = 0;
    private double direnc = 100.0d;

    @Override
    public void Kos() {
        this.hiz += 100;
        System.out.println(this.getName() + " Kos ..... Hiz :" + this.hiz);
    }

    @Override
    public void Atla() {
        this.direnc -= 3.5;
        if (this.hiz > 250) {
            this.direnc -= 8.5;
            System.out.println(this.getName() + " cok hizli ...");
        }
        System.out.println(this.getName() + " Atla ..... Direnc :" + this.direnc);
    }

    @Override
    public void Depar() {
        this.hiz += 240;
        System.out.println(this.getName() + " Depar ..... Hiz :" + this.hiz);
    }

    @Override
    public void Yavasla() {
        this.hiz -= 100;
        System.out.println(this.getName() + " Yavasla ..... Hiz :" + this.hiz);
    }

    @Override
    public void Dur() {
        this.hiz = 0;
        this.direnc = 0;
        System.out.println(this.getName() + " Dur ..... Hiz :" + this.hiz + " | Direnc :" + this.direnc);
    }

    @Override
    public void SonDurum(){
        System.out.println("*-------Son Durum\nIsim : "+this.getName()+"\nDirenc : "+this.getDirenc()+"\nHiz : "+this.getHiz()+"\n*-------");
    }

    //GETTER - SETTER
    public void setDirenc(double d) {
        this.direnc = d;
    }

    public double getDirenc() {
        return direnc;
    }

    public void setHiz(int h) {
        this.hiz = h;
    }

    public int getHiz() {
        return this.hiz;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return this.name;
    }

    public String getTur() {
        return this.tur;
    }
}
