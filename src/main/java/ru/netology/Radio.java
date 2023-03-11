package ru.netology;
public class Radio {


    
    private int totalNumberStation;
    private int startNumberStation = 0;
    private int endNumberStation;

    private int numberCurrentStation = startNumberStation;
    private int soundVolume;


    public Radio() {
        this.totalNumberStation = 10;

        this.endNumberStation = totalNumberStation - 1;


    }

    public Radio(int size) {
        this.totalNumberStation = size;

        this.endNumberStation = size - 1;
    }


   

    public int getNumberCurrentStation() {
        return numberCurrentStation;
    }

    public int getStartNumberStation() {
        return startNumberStation;
    }

    public int getEndNumberStation() {
        return endNumberStation;
    }

   
    public void setNumberCurrentStation(int newNumberCurrentStation) {
        if (newNumberCurrentStation < startNumberStation) {
            return;
        }
        if (newNumberCurrentStation > endNumberStation) {
            return;
        }
        numberCurrentStation = newNumberCurrentStation;
    }

    

    public void next() {
        if (numberCurrentStation == endNumberStation) {
            numberCurrentStation = startNumberStation;
            return;
        }
        numberCurrentStation++;

    }

 
    public void prev() {
        if (numberCurrentStation == startNumberStation) {
            numberCurrentStation = endNumberStation;
            return;
        }
        numberCurrentStation--;
    }

    
    public int getSoundVolume() {
        return soundVolume;
    }


   
    public void volumePlus() {
        if (soundVolume == 100) {
            return;
        }
        soundVolume++;
    }

    
    public void volumeMinus() {
        if (soundVolume == 0) {
            return;
        }
        soundVolume--;
    }
}
