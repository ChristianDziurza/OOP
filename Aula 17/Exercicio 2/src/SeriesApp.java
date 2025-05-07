public class SeriesApp {
    public static void main(String[] args) {
        Series[] series = new Series[2];
        series[0] = new MaisDois();
        series[1] = new MaisTres();
        executa(series);
    }

    public static void executa(Series[] series) {
       for(int i=0;i<10;i++){
            System.out.println("Series Par: "+ series[0].getNext());
        }
        System.out.println();
        for(int i=0;i<10;i++){
            System.out.println("Series Impaar: "+ series[1].getNext());
        }
    }
}
