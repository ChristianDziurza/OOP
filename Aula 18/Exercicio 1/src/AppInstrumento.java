public class AppInstrumento {
    public static void main(String[] args){
        Instrumento[] ins = new Instrumento[5];
        ins[0] = new Sopro();
        ins[1] = new SoproMetal();
        ins[2] = new SoproMadeira();
        ins[3] = new Percussao();
        ins[4] = new Corda();

        sinfonia(ins);
    }
    public static void sinfonia(Instrumento instrumento[]){
        for(Instrumento ins: instrumento){
            ins.nome();
            ins.afinar();
            ins.tocar();
            System.out.println();
        }
    }

}
