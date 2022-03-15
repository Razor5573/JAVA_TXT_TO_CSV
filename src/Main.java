public class Main {
    public static void main(String[] args) {
        TreeMapFiller stat = new TreeMapFiller();
        String pathTxt = "file.txt";
        String pathCsv = "out.csv";
        stat.read(pathTxt);
        SortTreeMap sortStat = new SortTreeMap();
        Output.csvOutput(sortStat.SortByValue(stat.getTreeMap()), pathCsv, stat.getTotalCounter());
    }
}