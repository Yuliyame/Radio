import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class RadioTest {

    @Test
    public void testZeroStationPosition() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMinusOneStationPosition() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testOneStationPosition() {
        Radio radio = new Radio ();
        radio.setCurrentStation(1);

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFiveStationPosition() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testSixStationPosition() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSevenStationPosition() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinusOneVolumePosition() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testZeroVolumePosition() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testOneVolumePosition() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public  void testNinetyNineVolumePosition() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testHundredVolumePosition() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextStationOne() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.next();

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testNextStationTwo() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.next();

        int expected = 2;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testNextStationNine() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.next();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testNextStationZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
}

