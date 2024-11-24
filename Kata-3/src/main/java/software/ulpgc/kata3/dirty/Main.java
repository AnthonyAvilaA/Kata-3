package software.ulpgc.kata3.dirty;

import software.ulpgc.kata3.clean.ToggleChartCommand;
import software.ulpgc.kata3.kata2.Title;
import software.ulpgc.kata3.kata2.TsvFileTitleReader;

import java.io.File;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\antho\\Downloads\\title.basics.tsv");
        List<Title> titles = new TsvFileTitleReader(file).read();
        HashMap<Title.TitleType, Integer> histogram = new HashMap<>();
        for (Title title : titles) {
            histogram.put(title.getTitleType(), histogram.getOrDefault(title.getTitleType(),0) + 1);
        }

        MainFrame mainFrame = new MainFrame();
        mainFrame.add("toggle", new ToggleChartCommand(mainFrame.display, histogram));
        mainFrame.setVisible(true);
    }
}
