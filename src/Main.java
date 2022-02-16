public class Main {
    public static void main(String[] args) {
        TreeMapFiller toCsv = new TreeMapFiller();
        SortTreeMap sorttxt = new SortTreeMap();
        Output outputCsv = new Output();
        String pathTxt = "C:\\Users\\nikit\\IdeaProjects\\lab1\\src\\file.txt";
        String pathCsv = "C:\\Users\\nikit\\IdeaProjects\\lab1\\src\\out.csv";
        toCsv.read(pathTxt);
        Output.csvOutput(toCsv.getTreeMap(), sorttxt.sortByValue(toCsv.getTreeMap()), pathCsv);
    }
}