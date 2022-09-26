import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radio.Radio;


public class RadioTest {

    @Test
    public void shoudCurrentRadio() {
        Radio sound = new Radio();

        sound.setCurrentRadioStationNumber(8);

        int expected = 8;
        int actual = sound.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudSetMinRadioStationNumber() {
        Radio sound = new Radio();

        sound.setMinRadioStationNumber();

        int expected = 0;
        int actual = sound.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shoudSetMaxRadioStationNumber() {
        Radio sound = new Radio();

        sound.setMaxRadioStationNumber();

        int expected = 9;
        int actual = sound.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudNotSetMinRadioStationNumber() {
        Radio sound = new Radio();

        sound.setMinRadioStationNumber();

        int expected = 0;
        int actual = sound.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudNotSetMaxRadioStationNumber() {
        Radio sound = new Radio();

        sound.setMaxRadioStationNumber();

        int expected = 9;
        int actual = sound.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shoudNextRadio() {
        Radio sound = new Radio();
        sound.setCurrentRadioStationNumber(7);

        sound.next();

        int expected = 8;
        int actual = sound.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudBorderNextRadio() {
        Radio sound = new Radio();
        sound.setCurrentRadioStationNumber(9);

        sound.next();

        int expected = 0;
        int actual = sound.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudBorderPrevRadio() {
        Radio sound = new Radio();
        sound.setCurrentRadioStationNumber(0);

        sound.prev();

        int expected = 9;
        int actual = sound.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudPrevRadio() {
        Radio sound = new Radio();
        sound.setCurrentRadioStationNumber(7);

        sound.prev();

        int expected = 6;
        int actual = sound.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudSoundVolume() {
        Radio sound = new Radio();

        sound.setSoundVolume(8);

        int expected = 8;
        int actual = sound.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudSetMaxSoundaVolume() {
        Radio sound = new Radio();

        sound.setMaxSoundVolume();

        int expected = 10;
        int actual = sound.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudSetMinSoundaVolume() {
        Radio sound = new Radio();

        sound.setMinSoundVolume();

        int expected = 0;
        int actual = sound.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shoudAddSoundaVolume() {
        Radio sound = new Radio();
        sound.setSoundVolume(3);

        sound.maxVolume();

        int expected = 4;
        int actual = sound.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudReduceSoundVolume() {
        Radio sound = new Radio();
        sound.setSoundVolume(3);

        sound.minVolume();

        int expected = 2;
        int actual = sound.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }


}
