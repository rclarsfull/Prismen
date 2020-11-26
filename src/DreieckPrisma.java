public class DreieckPrisma extends Prisma{
    private double seite;



    public DreieckPrisma(double hoehe, double seite) {
        super(hoehe);
        this.seite = seite;
    }

    public double berrechneFläche(){
        return (seite*seite)/4*Math.sqrt(3);
    }

    public double berrechneUmfang(){
        return seite+seite+seite;
    }

    @Override
    public String toString() {
        return "DreieckPrisma{" +
                "seite=" + seite +
                ", höhe" +super.hoehe+
                '}';
    }
}
