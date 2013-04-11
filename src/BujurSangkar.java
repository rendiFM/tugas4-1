
class bujursangkar extends Bentuk {

    private double sisi;

    public bujursangkar(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double luas() {
        System.out.println("dalam objek bujursangkar");
        return (sisi * sisi);
    }
}