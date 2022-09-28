package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    @Test
    public void Radio() {
        Radio sound = new Radio(10, 0, 100, 0);

        Assertions.assertEquals(10, sound.getMaxRadioStationNumber());
        Assertions.assertEquals(0, sound.getMinRadioStationNumber());
        Assertions.assertEquals(0, sound.getMinSoundVolume());
        Assertions.assertEquals(100, sound.getMaxSoundVolume());
        Assertions.assertEquals(0,sound.getCurrentRadioStationNumber());
        Assertions.assertEquals( 0,sound.getSoundVolume());
    }


    @Test
    public void shoudCurrentRadio() {
        Radio sound = new Radio(10, 0, 100, 0);

        sound.setCurrentRadioStationNumber(8);

        int expected = 8;
        int actual = sound.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudSetMinRadioStationNumber() {
        Radio sound = new Radio(10, 0, 100, 0);

        sound.setMinRadioStationNumber();

        int expected = 0;
        int actual = sound.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shoudSetMaxRadioStationNumber() {
        Radio sound = new Radio(10, 0, 100, 0);

        sound.setMaxRadioStationNumber();

        int expected = 10;
        int actual = sound.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudNotSetMinRadioStationNumber() {
        Radio sound = new Radio(10, 0, 100, 0);

        sound.setMinRadioStationNumber();

        int expected = 0;
        int actual = sound.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudNotSetMaxRadioStationNumber() {
        Radio sound = new Radio(10, 0, 100, 0);

        sound.setMaxRadioStationNumber();

        int expected = 10;
        int actual = sound.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shoudNextRadio() {
        Radio sound = new Radio(10, 0, 100, 0);
        sound.setCurrentRadioStationNumber(7);

        sound.next();

        int expected = 8;
        int actual = sound.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudBorderNextRadio() {
        Radio sound = new Radio(10, 0, 100, 0);
        sound.setCurrentRadioStationNumber(10);

        sound.next();

        int expected = 0;
        int actual = sound.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudBorderPrevRadio() {
        Radio sound = new Radio(10, 0, 100, 0);
        sound.setCurrentRadioStationNumber(0);

        sound.prev();

        int expected = 10;
        int actual = sound.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudPrevRadio() {
        Radio sound = new Radio(10, 0, 100, 0);
        sound.setCurrentRadioStationNumber(7);

        sound.prev();

        int expected = 6;
        int actual = sound.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudMaxCurrentRadio() {
        Radio sound = new Radio(10, 0, 100, 0);

        sound.setCurrentRadioStationNumber(11);

        int expected = 0;
        int actual = sound.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudMinCurrentRadio() {
        Radio sound = new Radio(10, 0, 100, 0);

        sound.setCurrentRadioStationNumber(-1);

        int expected = 0;
        int actual = sound.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shoudSoundVolume() {
        Radio sound = new Radio(10, 0, 100, 0);

        sound.setSoundVolume(8);

        int expected = 8;
        int actual = sound.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

   @Test
    public void shoudSetMaxSoundaVolume() {
       Radio sound = new Radio(10, 0, 100, 0);

       sound.setMaxSoundVolume();

       int expected = 100;
        int actual = sound.getSoundVolume();

       Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudSetMinSoundaVolume() {
        Radio sound = new Radio(10, 0, 100, 0);

        sound.setMinSoundVolume();

        int expected = 0;
        int actual = sound.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shoudAddSoundaVolume() {
        Radio sound = new Radio(10, 0, 100, 0);
        sound.setSoundVolume(3);

        sound.maxVolume();

        int expected = 4;
        int actual = sound.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudAddNoBorderSoundaVolume() {
        Radio sound = new Radio(10, 0, 100, 0);
        sound.setSoundVolume(101);

        sound.maxVolume();

        int expected = 1;
        int actual = sound.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudMaxSoundaVolume() {
        Radio sound = new Radio(10, 0, 100, 0);
        sound.setSoundVolume(100);

        sound.maxVolume();

        int expected = 100;
        int actual = sound.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudMinNoBorderSoundaVolume() {
        Radio sound = new Radio(10, 0, 100, 0);
        sound.setSoundVolume(-1);

        sound.minVolume();

        int expected = 0;
        int actual = sound.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudMinSoundaVolume() {
        Radio sound = new Radio(10, 0, 100, 0);
        sound.setSoundVolume(0);

        sound.minVolume();

        int expected = 0;
        int actual = sound.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudReduceSoundVolume() {
        Radio sound = new Radio(10, 0, 100, 0);
        sound.setSoundVolume(1);

        sound.minVolume();

        int expected = 0;
        int actual = sound.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

}
