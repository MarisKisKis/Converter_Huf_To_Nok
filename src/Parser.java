import java.util.ArrayList;
import java.util.HashMap;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
public class Parser {
    private static Document getPage() throws IOException {
        Document doc = Jsoup.connect("http://www.cbr.ru/scripts/XML_daily.asp").get();
        return doc;
    }

    HashMap<String, ArrayList<Double>> valutes;

    public void currencies() {
        valutes = new HashMap<>();
        ArrayList<Double> rate = new ArrayList<>();

        rate = new ArrayList<>();
        rate.add(30.9381);
        valutes.put("Венгерский форинт", rate);
        rate = new ArrayList<>();
        rate.add(11.9318);
        valutes.put("Норвежская крона", rate);
    }

  public double hufValue(double huf) {

        for (String forintsName : valutes.keySet()) {
            if (forintsName.equals("Венгерский форинт")) {
                for (ArrayList<Double> rate : valutes.values()) {
                    for (Double hufRate : rate) {
                        huf = hufRate;

                    }
                }
            }
        }
        return huf;
    }

    public double nokValue(double nok) {

        for (String noksName : valutes.keySet()) {
            if (noksName.equals("Норвежская крона")) {

                for (ArrayList<Double> rate : valutes.values()) {
                    for (Double nokRate : rate) {
                        nok = nokRate;

                    }
                }
            }
        } return nok;
    }
}


