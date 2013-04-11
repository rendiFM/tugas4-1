
class persegipanjang extends Bentuk {

    private double panjang;
    private double lebar;

    public persegipanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public persegipanjang() {
    }
    public double getLebar() {
        return lebar;
    }
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    public double getPanjang() {
        return panjang;
    }
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    @Override
    public double luas() {
        System.out.println("dalam objek persegi panjang");
        return (panjang * lebar);
    }
}
