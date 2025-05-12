public class Entrevistador{
    private String idioma;
    public void entrevista(Falante f) {
        if (f instanceof Estudante) {
            System.out.println("OlÁ, Estudante!");
        } else if (f instanceof Robo) {
            System.out.println("OlÁ, Robo");
            Robo r = (Robo) f;
            r.reboot();
        }
        idioma = f.seuIdioma();
        f.falar();
        System.out.println("Vou entrevistar voc� em " + idioma);
    }
}
