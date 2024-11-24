package software.ulpgc.kata3.clean;

import software.ulpgc.kata3.dirty.JFreeChartDisplay;
import software.ulpgc.kata3.kata2.Title;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class ToggleChartCommand implements Command {
    private final JFreeChartDisplay display;
    private final Map<Title.TitleType, Integer> histogram;
    private int i;

    public ToggleChartCommand(JFreeChartDisplay display, HashMap<Title.TitleType, Integer> histogram) {
        this.display = display;
        this.histogram = histogram;
        this.i = 0;
    }

    @Override
    public void execute() {
        this.i++;
        display.display(getChart());
    }

    private Barchart getChart() {
        return i%2==0?
                getTitlesChart():
                getGendersChart();
    }

    private Barchart getGendersChart() {
        Barchart barchart = new Barchart("Titles");
        barchart.add("male", 250);
        barchart.add("female", 360);
        return barchart;
    }

    private Barchart getTitlesChart() {
        Barchart barchart = new Barchart("Titles");
        for (Title.TitleType titleType: histogram.keySet()) {
            barchart.add(titleType.toString(), histogram.get(titleType));
        }
        return barchart;
    }
}
