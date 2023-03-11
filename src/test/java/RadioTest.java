import ru.netology.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class RadioTest {


    @Test
    public void getNumberCurrentStationTest () {
        Radio receiver = new Radio();

        int expected = 0;
        int actual = receiver.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void setNumberCurrentStationTest () {
        Radio receiver = new Radio();

        receiver.setNumberCurrentStation(11);

        int expected = 0;
        int actual = receiver.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNegativeNumberCurrentStationTest () {
        Radio receiver = new Radio();

        receiver.setNumberCurrentStation(-1);

        int expected = 0;
        int actual = receiver.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setValidNumberCurrentStationTest () {
        Radio receiver = new Radio();

        receiver.setNumberCurrentStation(5);

        int expected = 5;
        int actual = receiver.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setEdgeNumberCurrentStationTest () {
        Radio receiver = new Radio();

        receiver.setNumberCurrentStation(9);

        int expected = 9;
        int actual = receiver.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void setPreEdgeNumberCurrentStationTest () {
        Radio receiver = new Radio();

        receiver.setNumberCurrentStation(8);

        int expected = 8;
        int actual = receiver.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setZeroNumberCurrentStationTest () {
        Radio receiver = new Radio();

        receiver.setNumberCurrentStation(0);

        int expected = 0;
        int actual = receiver.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPreZeroNumberCurrentStationTest () {
        Radio receiver = new Radio();

        receiver.setNumberCurrentStation(1);

        int expected = 1;
        int actual = receiver.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void nextTestNine () {
        Radio receiver = new Radio();

        receiver.setNumberCurrentStation(9);
        receiver.next();

        int expected = 0;
        int actual = receiver.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextTestValid () {
        Radio receiver = new Radio();

        receiver.setNumberCurrentStation(8);
        receiver.next();

        int expected = 9;
        int actual = receiver.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void nextComboTestValid () {
        Radio receiver = new Radio();
        for (int i = 0; i < 4; i++) {
            receiver.next();
        }

        int expected = 4;
        int actual = receiver.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextTestValidFirst () {
        Radio receiver = new Radio();

        receiver.next();

        int expected = 1;
        int actual = receiver.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevTestZero () {
        Radio receiver = new Radio();

        receiver.prev();

        int expected = 9;
        int actual = receiver.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevTestValid () {
        Radio receiver = new Radio();

        receiver.setNumberCurrentStation(7);
        receiver.prev();

        int expected = 6;
        int actual = receiver.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getSoundVolumeTest () {
        Radio receiver = new Radio();

        int expected = 0;
        int actual = receiver.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void plusSoundVolumeTest () {
        Radio receiver = new Radio();

        receiver.volumePlus();

        int expected = 1;
        int actual = receiver.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void plusSoundVolumeValidTest () {
        Radio receiver = new Radio();

        for (int i = 0; i < 5; i++) {
            receiver.volumePlus();
        }

        int expected = 5;
        int actual = receiver.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void plusSoundVolumeLimitTest () {
        Radio receiver = new Radio();

        for (int i = 0; i < 10; i++) {
            receiver.volumePlus();
        }

        int expected = 10;
        int actual = receiver.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void plusSoundVolumeOverLimitTest () {
        Radio receiver = new Radio();

        for (int i = 0; i < 11; i++) {
            receiver.volumePlus();
        }

        int expected = 10;
        int actual = receiver.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minusSoundVolumeTest () {
        Radio receiver = new Radio();

        receiver.volumeMinus();

        int expected = 0;
        int actual = receiver.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void minusSoundVolumeValidTest () {
        Radio receiver = new Radio();

        for (int i = 0; i < 3; i++) {
            receiver.volumePlus();
        }
        for (int i = 0; i < 2; i++) {
            receiver.volumeMinus();
        }

        int expected = 1;
        int actual = receiver.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
}