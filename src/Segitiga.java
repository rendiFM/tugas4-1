
class segitiga extends Bentuk {

    private double alas;
    private double tinggi;

    public segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double luas() {
        System.out.println("dalam objek segitiga");
        return ((alas * tinggi) / 2);
    }
}
