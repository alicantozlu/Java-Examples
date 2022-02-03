public class Esek implements IEsek_Hareketler {

    private String name = "Muzaffer";
    private String tur = "Esek";
    private int hiz = 0;
    private double direnc = 300.0d;

    @Override
    public void Yuru() {
        this.hiz += 20;
        System.out.println(this.name + " Yuru ..... Hiz :" + this.hiz);
    }

    @Override
    public void Anir() {
        this.direnc -= 1.5;
        System.out.println(this.getName() + " Anir ..... Direnc :" + this.direnc);
    }

    @Override
    public void Ciftele() {
        this.direnc -= 3.5;
        System.out.println(this.getName() + " Ciftele ..... Direnc :" + this.direnc);
    }

    public void sonDurum(){
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
        return hiz;
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
