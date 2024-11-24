package software.ulpgc.kata3.dirty;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import software.ulpgc.kata3.clean.Barchart;

public class JFreeChartAdapter {
    public static JFreeChart adapt(Barchart barchart) {
        return ChartFactory.createBarChart(
                "",
                barchart.getTitle(),
                "count",
                datasetOf(barchart)
        );
    }

    private static CategoryDataset datasetOf(Barchart barchart) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (String key: barchart.getKeys()) {
            dataset.addValue(barchart.getValue(key), "", key);
        }
        return dataset;
    }
}
