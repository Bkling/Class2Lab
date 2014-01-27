/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author benja_000
 */
public class WelcomeService {

    private final Calendar cal = Calendar.getInstance();
    private final Calendar morning = Calendar.getInstance();
    private final Calendar evening = Calendar.getInstance();
    private final Calendar night = Calendar.getInstance();
    private String name;
    private String saying;

    public WelcomeService(String name) {
        this.name = name;
    }

    public String getTimeOfDay() {
        morning.set(Calendar.HOUR, 11);
        evening.set(Calendar.HOUR, 12);
        night.set(Calendar.HOUR, 17);

        if (cal.get(Calendar.HOUR_OF_DAY) <= (morning.get(Calendar.HOUR_OF_DAY))) {
           saying = "Good Morning";
        } else if (cal.get(Calendar.HOUR_OF_DAY) >= (evening.get(Calendar.HOUR_OF_DAY)) && cal.get(Calendar.HOUR_OF_DAY) < (evening.get(Calendar.HOUR_OF_DAY))) {
           saying = "Good Afternoon";
        } else if (cal.get(Calendar.HOUR_OF_DAY) >= (night.get(Calendar.HOUR_OF_DAY))) {
          saying = "Good Evening";
        }
        return saying;
    }

    public String getOutput(String name) {
        return saying + ", " + name + ". Welcome!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSaying() {
        return saying;
    }

    public void setSaying(String saying) {
        this.saying = saying;
    }

}
