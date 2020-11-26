public class Quader extends Prisma {
    private double seiteA,seiteB;

    public Quader(double hoehe, double seiteA, double seiteB) {
        super(hoehe);
        this.seiteA = seiteA;
        this.seiteB = seiteB;
    }

    public Quader(double seiteA) {
        super(seiteA);
        this.seiteA = seiteA;
        this.seiteB = seiteA;
    }

    @Override
    public double berrechneFläche() {
        return seiteA*seiteB;
    }

    @Override
    public double berrechneUmfang() {
        return seiteB+seiteA*2;
    }

    @Override
    public String toString() {
        return "Quader{" +
                "seiteA=" + seiteA +
                ", seiteB=" + seiteB +
                ", höhe="+ hoehe+
                
                '}';
    }
}
