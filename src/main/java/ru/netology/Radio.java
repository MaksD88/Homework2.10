package ru.netology;

public class Radio {

    private int numberCurrentStation;
    private int soundVolume;

    public int getNumberCurrentStation() {
        return numberCurrentStation;
    }


    public void setNumberCurrentStation(int newNumberCurrentStation) {
        if (newNumberCurrentStation < 0) {
            return;
        }
        if (newNumberCurrentStation > 9) {
            return;
        }
        numberCurrentStation = newNumberCurrentStation;
    }

    public void next() {
        if (numberCurrentStation == 9) {
            numberCurrentStation = 0;
            return;
        }
        numberCurrentStation++;

    }
    public void prev() {
        if (numberCurrentStation == 0) {
            numberCurrentStation = 9;
            return;
        }
        numberCurrentStation--;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void volumePlus() {
        if (soundVolume == 10) {
            //soundVolume = 10;
            return;
        }
        soundVolume++;
    }

    public void volumeMinus() {
        if (soundVolume == 0) {
            //soundVolume = 0;
            return;
        }
        soundVolume--;

    }
}
