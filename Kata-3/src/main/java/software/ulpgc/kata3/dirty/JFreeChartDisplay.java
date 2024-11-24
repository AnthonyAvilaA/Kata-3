package software.ulpgc.kata3.dirty;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import software.ulpgc.kata3.clean.Barchart;
import software.ulpgc.kata3.clean.ChartDisplay;

import javax.swing.*;
import java.awt.*;

public class JFreeChartDisplay extends JPanel implements ChartDisplay {
    @Override
    public void display(Barchart barchart) {
        removeAll();
        ChartPanel chartPanel = new ChartPanel(JFreeChartAdapter.adapt(barchart));
        chartPanel.setPreferredSize(new Dimension(1100, 600));
        this.add(chartPanel);
        revalidate();
    }
}
