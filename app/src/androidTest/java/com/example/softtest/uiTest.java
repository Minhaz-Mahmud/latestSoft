package com.example.softtest;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.ViewAction;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;

public class uiTest {
  @Rule
    public ActivityScenarioRule<MainActivity> activityActivityScenarioRule=
          new ActivityScenarioRule<>(MainActivity.class);

  @Test
    public void testInsert(){
      Espresso.onView(ViewMatchers.withId(R.id.shape))
              .perform(ViewActions.typeText("Circle"));
      Espresso.onView(ViewMatchers.withId(R.id.color))
              .perform(ViewActions.typeText("Red"));

      Espresso.onView(ViewMatchers.withId(R.id.button))
              .perform(ViewActions.click());



      Espresso.onView(ViewMatchers.withId(R.id.show_shape))
              .check(ViewAssertions.matches
                      (ViewMatchers.withText("The shape is Circle\nIt's area is 78.5\nIt's perimeter is 31.4\n")));


  }





}
