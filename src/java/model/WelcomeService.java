/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Calendar;

/**
 *
 * @author benja_000
 */
public class WelcomeService {

    private Calendar cal = Calendar.getInstance();
    private String name;

    public WelcomeService(String name) {
        this.name = name;
    }

    public WelcomeService() {

    }

    public Calendar getCal() {
        return cal;
    }

    public void setCal(Calendar cal) {
        this.cal = cal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
