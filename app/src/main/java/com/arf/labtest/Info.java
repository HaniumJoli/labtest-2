package com.arf.labtest;

public  class Info {
    private int units;
    private String genre_name;
    public Info(int units, String genre_name) {
        this.units = units;
        this.genre_name = genre_name;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public String getGenre_name() {
        return genre_name;
    }

    public void setGenre_name(String genre_name) {
        this.genre_name = genre_name;
    }
}
