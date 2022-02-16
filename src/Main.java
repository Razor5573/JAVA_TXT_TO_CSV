public class Main {
    public static void main(String[] args) {
        TreeMapFiller stat = new TreeMapFiller();
        SortTreeMap sorttxt = new SortTreeMap();
        Output outputCsv = new Output();
        String pathTxt = "file.txt";
        String pathCsv = "out.csv";
        stat.read(pathTxt);
        Output.csvOutput(sorttxt.sortByValue(stat.getTreeMap()), pathCsv, stat.getTotalCounter());
    }
}