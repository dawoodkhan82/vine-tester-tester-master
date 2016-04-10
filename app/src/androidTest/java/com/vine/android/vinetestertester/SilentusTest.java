package com.vine.android.vinetestertester;

import org.junit.Before;
import org.junit.Test;
import org.junit.Rule;
import org.junit.runner.RunWith;

import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.rule.ActivityTestRule;
import android.test.suitebuilder.annotation.LargeTest;
import static org.junit.Assert.assertTrue;
import android.support.test.InstrumentationRegistry;
import android.test.ActivityInstrumentationTestCase2;
import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.hasDescendant;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.Matchers.instanceOf;

@RunWith(AndroidJUnit4.class)
@LargeTest

public class SilentusTest{

    @Rule
    public ActivityTestRule<Silentus> mActivityRule = new ActivityTestRule<>(
            Silentus.class, false);

    @Test
    public void checkSubmitComment(){

        //3 second delay in thread
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Check if 5th thumbnail (index 4) is displayed
        onData(instanceOf(Insangus.class))
                .inAdapterView(allOf(withId(R.id.secus), isDisplayed()))
                .atPosition(4)
                .check(matches(isDisplayed()));

        //Click on 5th thumbnail
        onData(instanceOf(Insangus.class))
                .atPosition(4)
                .perform(click());

        //Clear comment text field
        onView(withId(R.id.rothus)).perform(replaceText(""));

        //Type "Hello World!" in comment text field and then close keyboard
        onView(withId(R.id.rothus)).perform(typeText("Hello World!"), closeSoftKeyboard());

        //Check add comment button is displayed
        onView(withId(R.id.pestifer))
                .check(matches(isDisplayed()));

        //Click add comment to submit comment
        onView(withId(R.id.pestifer))
                .perform(click());

        //Confirm if "Hello World!" comment is submitted
//        onData(instanceOf(String.class))
//                .inAdapterView(allOf(withId(R.id.vicissitudo)))
//                .atPosition(0)
//                .check(matches(hasDescendant(withText("Hello World!"))));
//

        onView(withId(R.id.vicissitudo)).check(matches(withText("Hello World!")));
//        onView(withId(R.id.vicissitudo)).check(ViewAssertions.matches(ViewMatchers.withText("Hello World!")));

    }
}

