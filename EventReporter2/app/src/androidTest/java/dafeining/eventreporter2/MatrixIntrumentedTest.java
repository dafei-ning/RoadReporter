package dafeining.eventreporter2;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;

public class MatrixIntrumentedTest {
    @Rule
    public ActivityTestRule<ControlPanel> activityTestRule =
            new ActivityTestRule<>(ControlPanel.class);


}
