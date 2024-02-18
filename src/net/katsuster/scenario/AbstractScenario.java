package net.katsuster.scenario;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import net.katsuster.draw.Drawable;

public class AbstractScenario implements Scenario {
    private ScenarioSwitcher switcher;
    private boolean activated = false;
    private List<Drawable> listDrawable = new ArrayList<>();

    public AbstractScenario(ScenarioSwitcher sw) {
        switcher = sw;
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }

    @Override
    public ScenarioSwitcher getSwitcher() {
        return switcher;
    }

    protected void setSwitcher(ScenarioSwitcher s) {
        switcher = s;
    }

    @Override
    public boolean getActivated() {
        return activated;
    }

    @Override
    public void setActivated(boolean a) {
        activated = a;
    }

    @Override
    public void activate() {
        //do nothing
    }

    @Override
    public void deactivate() {
        //do nothing
    }

    @Override
    public void drawFrame(Graphics2D g2) {
        //do nothing
    }

    public void clearDrawable() {
        listDrawable.clear();
    }

    public void addDrawable(Drawable d) {
        listDrawable.add(d);
    }

    public Drawable[] getDrawables() {
        return (Drawable[])listDrawable.toArray();
    }

    public void removeDrawable(Drawable d) {
        listDrawable.remove(d);
    }

    public void drawAllDrawable(Graphics2D g2) {
        for (Drawable d : listDrawable) {
            if (!d.getVisible()) {
                continue;
            }

            d.draw(g2);
        }
    }

    public void printErrorInner(String header, String str) {
        getSwitcher().addLogLater(header + ": " + getName() + ": " + str + "\n");
        System.err.println(header + ": " + getName() + ": " + str);
    }

    public void printError(String str) {
        printErrorInner("Error", str);
    }

    public void printWarn(String str) {
        printErrorInner("Warn ", str);
    }
}
