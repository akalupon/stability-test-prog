package com.android.calculator2;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class NumM2 {

    @Rule
    public ActivityTestRule<Calculator> mActivityTestRule = new ActivityTestRule<>(Calculator.class);

    @Test
    public void numM2() {
        ViewInteraction button = onView(
                allOf(withId(R.id.digit_9), withText("9"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button.perform(click());

        ViewInteraction calculatorEditText = onView(
                allOf(withId(R.id.formula),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("9"), closeSoftKeyboard());

        ViewInteraction button2 = onView(
                allOf(withId(R.id.digit_8), withText("8"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button2.perform(click());

        ViewInteraction calculatorEditText2 = onView(
                allOf(withId(R.id.formula), withText("9"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("98"), closeSoftKeyboard());

        ViewInteraction button3 = onView(
                allOf(withId(R.id.digit_4), withText("4"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button3.perform(click());

        ViewInteraction calculatorEditText3 = onView(
                allOf(withId(R.id.formula), withText("98"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("984"), closeSoftKeyboard());

        ViewInteraction button4 = onView(
                allOf(withId(R.id.digit_3), withText("3"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button4.perform(click());

        ViewInteraction calculatorEditText4 = onView(
                allOf(withId(R.id.formula), withText("984"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("9843"), closeSoftKeyboard());

        ViewInteraction button5 = onView(
                allOf(withId(R.id.digit_6), withText("6"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button5.perform(click());

        ViewInteraction calculatorEditText5 = onView(
                allOf(withId(R.id.formula), withText("9843"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("98436"), closeSoftKeyboard());

        ViewInteraction button6 = onView(
                allOf(withId(R.id.op_mul), withText("×"), withContentDescription("times"),
                        withParent(withId(R.id.pad_operator)),
                        isDisplayed()));
        button6.perform(click());

        ViewInteraction calculatorEditText6 = onView(
                allOf(withId(R.id.formula), withText("98436"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("98436×"), closeSoftKeyboard());

        ViewInteraction button7 = onView(
                allOf(withId(R.id.digit_5), withText("5"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button7.perform(click());

        ViewInteraction calculatorEditText7 = onView(
                allOf(withId(R.id.formula), withText("98436×"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("98436×5"), closeSoftKeyboard());

        ViewInteraction button8 = onView(
                allOf(withId(R.id.digit_9), withText("9"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button8.perform(click());

        ViewInteraction calculatorEditText8 = onView(
                allOf(withId(R.id.formula), withText("98436×5"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("98436×59"), closeSoftKeyboard());

        ViewInteraction button9 = onView(
                allOf(withId(R.id.digit_7), withText("7"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button9.perform(click());

        ViewInteraction calculatorEditText9 = onView(
                allOf(withId(R.id.formula), withText("98436×59"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("98436×597"), closeSoftKeyboard());

        ViewInteraction button10 = onView(
                allOf(withId(R.id.digit_1), withText("1"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button10.perform(click());

        ViewInteraction calculatorEditText10 = onView(
                allOf(withId(R.id.formula), withText("98436×597"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("98436×5971"), closeSoftKeyboard());

        ViewInteraction editText = onView(
                allOf(withId(R.id.result), withText("587761356"),
                        childAtPosition(
                                allOf(withId(R.id.display),
                                        childAtPosition(
                                                IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class),
                                                0)),
                                1),
                        isDisplayed()));
        editText.check(matches(withText("587761356")));

    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
