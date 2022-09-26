package ru.netology.radio;

public class Radio {
    public int currentRadioStationNumber;
    public int soundVolume;

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < 0) {
            return;
        }
        if (newCurrentRadioStationNumber > 9) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public void setMinRadioStationNumber() {
        currentRadioStationNumber = 0;
    }

    public void setMaxRadioStationNumber() {
        currentRadioStationNumber = 9;
    }


    public void next() {
        if (currentRadioStationNumber == 9) {
            currentRadioStationNumber = 0;
            return;
        }
        currentRadioStationNumber++;
    }

    public void prev() {
        if (currentRadioStationNumber == 0) {
            currentRadioStationNumber = 9;
            return;
        }
        currentRadioStationNumber--;
    }

    public int getSoundVolume() {
        return soundVolume;
    }


    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume < 0) {
            return;
        }
        if (newSoundVolume > 10) {
            return;
        }
        soundVolume = newSoundVolume;
    }

    public void setMaxSoundVolume() {
        soundVolume = 10;
    }

    public void setMinSoundVolume() {
        soundVolume = 0;
    }


    public void maxVolume() {
        if (soundVolume == 10) {
            this.soundVolume = soundVolume;
        }
        if (soundVolume < 10) {
            soundVolume = soundVolume + 1;
        }
    }


    public void minVolume() {
        if (soundVolume == 0) {
            this.soundVolume = soundVolume;
        }
        if (soundVolume > 0) {
            soundVolume = soundVolume - 1;
        }
    }
}

