import tech.tablesaw.api.Table;
import tech.tablesaw.plotly.Plot;
import tech.tablesaw.plotly.api.TimeSeriesPlot;

import java.io.IOException;

public class Covid {

    public void generateMultiTimeSeries(String csvFile) {
        try {
            Table covidMult = Table.read().csv(csvFile);

            System.out.println(covidMult.columnNames());

            Plot.show(TimeSeriesPlot.create("Covid", covidMult, "data", "number", "label"));

            System.out.println(covidMult.print());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void generateSingleTimeSeries(String csvFile, String nomeColonna) {
        try {
            Table covid = Table.read().csv(csvFile);

            System.out.println(covid.columnNames());

            Plot.show(TimeSeriesPlot.create("Covid ".concat(nomeColonna), covid, "data", nomeColonna));

            System.out.println(covid.print());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {

        new Covid().generateMultiTimeSeries("src/main/resources/covidMultiples.csv");

//        new Covid().generateSingleTimeSeries("src/main/resources/covid.csv", "totale_casi");
//        new Covid().generateSingleTimeSeries("src/main/resources/covid.csv", "ricoverati_con_sintomi");
//        new Covid().generateSingleTimeSeries("src/main/resources/covid.csv", "terapia_intensiva");
//        new Covid().generateSingleTimeSeries("src/main/resources/covid.csv", "totale_ospedalizzati");
//        new Covid().generateSingleTimeSeries("src/main/resources/covid.csv", "isolamento_domiciliare");
//        new Covid().generateSingleTimeSeries("src/main/resources/covid.csv", "totale_attualmente_positivi");
//        new Covid().generateSingleTimeSeries("src/main/resources/covid.csv", "nuovi_attualmente_positivi");
//        new Covid().generateSingleTimeSeries("src/main/resources/covid.csv", "dimessi_guariti");
//        new Covid().generateSingleTimeSeries("src/main/resources/covid.csv", "deceduti");
//        new Covid().generateSingleTimeSeries("src/main/resources/covid.csv", "tamponi");

    }
}
