package Denemeler;

class at_1 {
    private String isim;
    private int boy;
    private int yas;

    private String kos(int yas,int boy) {
        double a = yas * boy;
        return "En fazla " + a + " metre kosar.";
    }

    protected String getKos(int yas,int boy){
        return kos(yas,boy);
    }


    public at_1() {
    }

    public at_1(String isim, int boy, int yas) {
        this.isim = isim;
        this.boy = boy;
        this.yas = yas;
    }

    public void setName(String name) {
        this.isim = name;
    }

    public String getName() {
        return isim;
    }
    private String at(){
        return "at severim";
    }

    protected void kal(){
        System.out.println(at());
    }
}
