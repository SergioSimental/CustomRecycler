package com.example.customrecycler


import androidx.test.espresso.DataInteraction
import androidx.test.espresso.ViewInteraction
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent

import androidx.test.InstrumentationRegistry.getInstrumentation
import androidx.test.espresso.Espresso.onData
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu
import androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.*
import androidx.test.espresso.matcher.ViewMatchers.*

import com.example.customrecycler.R

import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.TypeSafeMatcher
import org.hamcrest.core.IsInstanceOf
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

import org.hamcrest.Matchers.allOf
import org.hamcrest.Matchers.anything
import org.hamcrest.Matchers.`is`

@LargeTest
@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun mainActivityTest() {
        val recyclerView = onView(
            allOf(
                withId(R.id.recyclerview),
                childAtPosition(
                    withClassName(`is`("android.widget.LinearLayout")),
                    0
                )
            )
        )
        recyclerView.perform(actionOnItemAtPosition<ViewHolder>(0, click()))

        val recyclerView2 = onView(
            allOf(
                withId(R.id.recyclerview),
                childAtPosition(
                    withClassName(`is`("android.widget.LinearLayout")),
                    0
                )
            )
        )
        recyclerView2.perform(actionOnItemAtPosition<ViewHolder>(1, click()))

        val recyclerView3 = onView(
            allOf(
                withId(R.id.recyclerview),
                childAtPosition(
                    withClassName(`is`("android.widget.LinearLayout")),
                    0
                )
            )
        )
        recyclerView3.perform(actionOnItemAtPosition<ViewHolder>(2, click()))

        val recyclerView4 = onView(
            allOf(
                withId(R.id.recyclerview),
                childAtPosition(
                    withClassName(`is`("android.widget.LinearLayout")),
                    0
                )
            )
        )
        recyclerView4.perform(actionOnItemAtPosition<ViewHolder>(3, click()))

        val recyclerView5 = onView(
            allOf(
                withId(R.id.recyclerview),
                childAtPosition(
                    withClassName(`is`("android.widget.LinearLayout")),
                    0
                )
            )
        )
        recyclerView5.perform(actionOnItemAtPosition<ViewHolder>(4, click()))

        val recyclerView6 = onView(
            allOf(
                withId(R.id.recyclerview),
                childAtPosition(
                    withClassName(`is`("android.widget.LinearLayout")),
                    0
                )
            )
        )
        recyclerView6.perform(actionOnItemAtPosition<ViewHolder>(5, click()))

        val recyclerView7 = onView(
            allOf(
                withId(R.id.recyclerview),
                childAtPosition(
                    withClassName(`is`("android.widget.LinearLayout")),
                    0
                )
            )
        )
        recyclerView7.perform(actionOnItemAtPosition<ViewHolder>(6, click()))

        val recyclerView8 = onView(
            allOf(
                withId(R.id.recyclerview),
                childAtPosition(
                    withClassName(`is`("android.widget.LinearLayout")),
                    0
                )
            )
        )
        recyclerView8.perform(actionOnItemAtPosition<ViewHolder>(7, click()))

        val recyclerView9 = onView(
            allOf(
                withId(R.id.recyclerview),
                childAtPosition(
                    withClassName(`is`("android.widget.LinearLayout")),
                    0
                )
            )
        )
        recyclerView9.perform(actionOnItemAtPosition<ViewHolder>(8, click()))

        val recyclerView10 = onView(
            allOf(
                withId(R.id.recyclerview),
                childAtPosition(
                    withClassName(`is`("android.widget.LinearLayout")),
                    0
                )
            )
        )
        recyclerView10.perform(actionOnItemAtPosition<ViewHolder>(8, click()))

        val recyclerView11 = onView(
            allOf(
                withId(R.id.recyclerview),
                childAtPosition(
                    withClassName(`is`("android.widget.LinearLayout")),
                    0
                )
            )
        )
        recyclerView11.perform(actionOnItemAtPosition<ViewHolder>(7, click()))

        val recyclerView12 = onView(
            allOf(
                withId(R.id.recyclerview),
                childAtPosition(
                    withClassName(`is`("android.widget.LinearLayout")),
                    0
                )
            )
        )
        recyclerView12.perform(actionOnItemAtPosition<ViewHolder>(8, click()))

        val recyclerView13 = onView(
            allOf(
                withId(R.id.recyclerview),
                childAtPosition(
                    withClassName(`is`("android.widget.LinearLayout")),
                    0
                )
            )
        )
        recyclerView13.perform(actionOnItemAtPosition<ViewHolder>(9, click()))

        val recyclerView14 = onView(
            allOf(
                withId(R.id.recyclerview),
                childAtPosition(
                    withClassName(`is`("android.widget.LinearLayout")),
                    0
                )
            )
        )
        recyclerView14.perform(actionOnItemAtPosition<ViewHolder>(10, click()))

        val recyclerView15 = onView(
            allOf(
                withId(R.id.recyclerview),
                childAtPosition(
                    withClassName(`is`("android.widget.LinearLayout")),
                    0
                )
            )
        )
        recyclerView15.perform(actionOnItemAtPosition<ViewHolder>(11, click()))

        val recyclerView16 = onView(
            allOf(
                withId(R.id.recyclerview),
                childAtPosition(
                    withClassName(`is`("android.widget.LinearLayout")),
                    0
                )
            )
        )
        recyclerView16.perform(actionOnItemAtPosition<ViewHolder>(12, click()))

        val recyclerView17 = onView(
            allOf(
                withId(R.id.recyclerview),
                childAtPosition(
                    withClassName(`is`("android.widget.LinearLayout")),
                    0
                )
            )
        )
        recyclerView17.perform(actionOnItemAtPosition<ViewHolder>(13, click()))

        val recyclerView18 = onView(
            allOf(
                withId(R.id.recyclerview),
                childAtPosition(
                    withClassName(`is`("android.widget.LinearLayout")),
                    0
                )
            )
        )
        recyclerView18.perform(actionOnItemAtPosition<ViewHolder>(13, click()))

        val recyclerView19 = onView(
            allOf(
                withId(R.id.recyclerview),
                childAtPosition(
                    withClassName(`is`("android.widget.LinearLayout")),
                    0
                )
            )
        )
        recyclerView19.perform(actionOnItemAtPosition<ViewHolder>(14, click()))

        val recyclerView20 = onView(
            allOf(
                withId(R.id.recyclerview),
                childAtPosition(
                    withClassName(`is`("android.widget.LinearLayout")),
                    0
                )
            )
        )
        recyclerView20.perform(actionOnItemAtPosition<ViewHolder>(15, click()))

        val recyclerView21 = onView(
            allOf(
                withId(R.id.recyclerview),
                childAtPosition(
                    withClassName(`is`("android.widget.LinearLayout")),
                    0
                )
            )
        )
        recyclerView21.perform(actionOnItemAtPosition<ViewHolder>(16, click()))

        val recyclerView22 = onView(
            allOf(
                withId(R.id.recyclerview),
                childAtPosition(
                    withClassName(`is`("android.widget.LinearLayout")),
                    0
                )
            )
        )
        recyclerView22.perform(actionOnItemAtPosition<ViewHolder>(17, click()))

        val recyclerView23 = onView(
            allOf(
                withId(R.id.recyclerview),
                childAtPosition(
                    withClassName(`is`("android.widget.LinearLayout")),
                    0
                )
            )
        )
        recyclerView23.perform(actionOnItemAtPosition<ViewHolder>(18, click()))

        val recyclerView24 = onView(
            allOf(
                withId(R.id.recyclerview),
                childAtPosition(
                    withClassName(`is`("android.widget.LinearLayout")),
                    0
                )
            )
        )
        recyclerView24.perform(actionOnItemAtPosition<ViewHolder>(19, click()))
    }

    private fun childAtPosition(
        parentMatcher: Matcher<View>, position: Int
    ): Matcher<View> {

        return object : TypeSafeMatcher<View>() {
            override fun describeTo(description: Description) {
                description.appendText("Child at position $position in parent ")
                parentMatcher.describeTo(description)
            }

            public override fun matchesSafely(view: View): Boolean {
                val parent = view.parent
                return parent is ViewGroup && parentMatcher.matches(parent)
                        && view == parent.getChildAt(position)
            }
        }
    }
}
