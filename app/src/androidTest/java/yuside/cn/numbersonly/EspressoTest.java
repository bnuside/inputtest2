package yuside.cn.numbersonly;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isChecked;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by side on 05/01/2017.
 */

@RunWith(AndroidJUnit4.class)
@LargeTest

public class EspressoTest {

    @Rule
    public ActivityTestRule mActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void inputAlphaBetaOnly(){
        onView(withId(R.id.alphaBetaOnlyEditText)).perform(typeText("hell2o12"));
        onView(withId(R.id.alphaBetaOnlyEditText)).check(matches(withText("hello")));
//        onView(withId(R.id.alphaBetaOnlyEditText)).check(withText("hello"));
    }
    @Test
    public void sayHello(){
        onView(withText("PressMe")).perform(click());
        onView(withId(R.id.inputEdit)).check(matches(withText("Hello, World!")));
    }
}
