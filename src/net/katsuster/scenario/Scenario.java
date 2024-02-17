package net.katsuster.scenario;

import java.awt.*;

public interface Scenario {
    ScenarioSwitcher getSwitcher();
    boolean getActivated();
    void setActivated(boolean a);

    void activate();
    void deactivate();
    void drawFrame(Graphics2D g2);
}
