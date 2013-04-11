
class Lingkaran extends Bentuk {

    private double jarijari;
    private double phi = 3.14;

    public Lingkaran(double jarijari) {
        this.jarijari = jarijari;
    }

    public double getJarijari() {
        return jarijari;
    }

    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }

    public double getPhi() {
        return phi;
    }

    public void setPhi(double phi) {
        this.phi = phi;
    }

    @Override
    public double luas() {
        System.out.println("dalam objek lingkaran");
        return (phi * jarijari * jarijari);
    }
}
