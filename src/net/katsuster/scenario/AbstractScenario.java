package net.katsuster.scenario;

import java.awt.*;

public class AbstractScenario implements Scenario {
    private ScenarioSwitcher switcher;
    private boolean activated = false;

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
}
