public abstract class Prisma {
    protected double hoehe;

    Prisma(){}

    Prisma(double hoehe){
        this.hoehe=hoehe;
    }

    public abstract double berrechneFläche();

    public abstract  double berrechneUmfang();

    public double berrecheVolumen(){
        return hoehe*berrechneFläche();
    }


}
