public class Test {

    public static void main(String[]args){

        Prisma d=new DreieckPrisma(10,10);
        Prisma q=new Quader(2,4,6);
        Prisma gleichseitigerQuader=new Quader(2);

        System.out.println(d.berrecheVolumen());

        System.out.println(q.berrecheVolumen());

        System.out.println(gleichseitigerQuader.berrecheVolumen());

    }
}
