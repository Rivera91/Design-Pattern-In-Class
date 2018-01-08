package nyc.c4q.designpatternice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import nyc.c4q.designpatternice.enums.Months;
import nyc.c4q.designpatternice.enums.MoonPhases;
import nyc.c4q.designpatternice.enums.RainbowColors;
import nyc.c4q.designpatternice.static_factory_methods.Cars;

import static nyc.c4q.designpatternice.enums.Months.FEBRUARY;
import static nyc.c4q.designpatternice.enums.Months.JANUARY;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Months currentMonth;
        MoonPhases currentPhase;
        RainbowColors currentColor;



        Cars car1 = Cars.getInstance();
        Cars car2 = Cars.getInstance();



        logg(WhatMonthIsIt(FEBRUARY));
        logg(WhatMonthIsIt(JANUARY));

        loggg(MoonPhases.FIRST_QUARTER.toString());
        loggg(MoonPhases.FULL_MOON.toString());

        logggg(RainbowColors.GREEN.toString());
        logggg(RainbowColors.BLUE.toString());



    }

    public void logg(String input) {

        Log.e("Current month?", input);

    }

    public void loggg(String input) {
        Log.e("Current Moon phase?", input );

    }

    public void logggg(String input) {
        Log.e("What color am I?", input);
    }


    public String WhatMonthIsIt(Months currentMonth){
        String result = " ";

        if(currentMonth != null){

        }

        switch (currentMonth){

            case JANUARY:
                result = "It is January";
                break;

            case FEBRUARY:
                result = "It is February";
                break;

            case MARCH:
                result = "It is March";
                break;

            case APRIL:
                result = "It is April";
                break;

            case MAY:
                result = "It is May";
                break;

            case JUNE:
                result = "It is June";
                break;

            case JULY:
                result = "It is July";
                break;

            case AUGUST:
                result = "It is August";
                break;

            case SEPTEMBER:
                result = "It is September";
                break;

            case OCTOBER:
                result = "It is October";
                break;

            case NOVEMBER:
                result = "It is November";
                break;

            case DECEMBER:
                result = "It is December";
                break;
        }
        return result;
    }
}
