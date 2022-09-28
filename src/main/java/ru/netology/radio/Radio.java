package ru.netology.radio;

public class Radio {

    private int maxRadioStationNumber = 10;
    private int minRadioStationNumber = 0;
    private int currentRadioStationNumber = minRadioStationNumber;

    private int maxSoundVolume = 100;
    private int minSoundVolume = 0;

    private int soundVolume = minSoundVolume;


    public Radio(int maxRadioStationNumber, int minRadioStationNumber, int maxSoundVolume, int minSoundVolume) {
        this.maxRadioStationNumber = maxRadioStationNumber;
        this.minRadioStationNumber = minRadioStationNumber;
        this.maxSoundVolume = maxSoundVolume;
        this.minSoundVolume = minSoundVolume;
    }


    public int getMaxRadioStationNumber() {
        return maxRadioStationNumber;
    }

    public int getMinRadioStationNumber() {
        return minRadioStationNumber;
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < minRadioStationNumber) {
            return;
        }
        if (newCurrentRadioStationNumber > maxRadioStationNumber) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public void setMinRadioStationNumber() {
        currentRadioStationNumber = minRadioStationNumber;
    }

    public void setMaxRadioStationNumber() {
        currentRadioStationNumber = maxRadioStationNumber;
    }


    public void next() {
        if (currentRadioStationNumber == maxRadioStationNumber) {
            currentRadioStationNumber = minRadioStationNumber;
            return;
        }
        currentRadioStationNumber++;
    }

    public void prev() {
        if (currentRadioStationNumber == minRadioStationNumber) {
            currentRadioStationNumber = maxRadioStationNumber;
            return;
        }
        currentRadioStationNumber--;
    }


    public int getMaxSoundVolume() {
        return maxSoundVolume;
    }

    public int getMinSoundVolume() {
        return minSoundVolume;
    }


    public int getSoundVolume() {
        return soundVolume;
    }


    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume < minSoundVolume) {
            return;
        }
        if (newSoundVolume > maxSoundVolume) {
            return;
        }
        soundVolume = newSoundVolume;
    }

    public void setMaxSoundVolume() {
        soundVolume = maxSoundVolume;
    }

    public void setMinSoundVolume() {
        soundVolume = minSoundVolume;
    }


    public void maxVolume() {
        if (soundVolume == maxSoundVolume) {
            this.soundVolume = soundVolume;
        }
        if (soundVolume < maxSoundVolume) {
            soundVolume = soundVolume + 1;
        }
    }


    public void minVolume() {
        if (soundVolume == minSoundVolume) {
            this.soundVolume = soundVolume;
        }
        if (soundVolume > minSoundVolume) {
            soundVolume = soundVolume - 1;
        }
    }
}

