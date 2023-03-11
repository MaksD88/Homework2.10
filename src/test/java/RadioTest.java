import ru.netology.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class RadioTest {
    private int radioSize = 2;
    Radio receiver = new Radio(radioSize);

    
    @Test
    public void getNumberCurrentStationTest () {

        int expected = receiver.getStartNumberStation();
        int actual = receiver.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    
    @Test
    public void setNumberCurrentStationTest () {

        receiver.setNumberCurrentStation(radioSize);

        int expected = receiver.getStartNumberStation();
        int actual = receiver.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    
    @Test
    public void setNegativeNumberCurrentStationTest () {

        receiver.setNumberCurrentStation(-1);

        int expected = receiver.getStartNumberStation();
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
    public void setPreEdgeNumberCurrentStationTest () {

        receiver.setNumberCurrentStation(radioSize -1);

        int expected = receiver.getEndNumberStation();
        int actual = receiver.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    
    @Test
    public void setZeroNumberCurrentStationTest () {

        receiver.setNumberCurrentStation(0);

        int expected = 0;
        int actual = receiver.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    
    @Test
    public void setPreZeroNumberCurrentStationTest () {

        receiver.setNumberCurrentStation(1);

        int expected = 1;
        int actual = receiver.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    
    @Test
    public void nextTestNine () {

        receiver.setNumberCurrentStation(radioSize -1);
        receiver.next();

        int expected = 0;
        int actual = receiver.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

   
    @Test
    public void nextTestValid () {

        receiver.next();

        int expected = 1;
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
    public void prevTestZero () {

        receiver.prev();

        int expected = receiver.getEndNumberStation();
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

        int expected = 0;
        int actual = receiver.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    
    @Test
    public void plusSoundVolumeTest () {

        receiver.volumePlus();

        int expected = 1;
        int actual = receiver.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
    
    @Test
    public void plusSoundVolumeValidTest () {

        for (int i = 0; i < 5; i++) {
            receiver.volumePlus();
        }
