package ru.netology.smarthome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestRadio {

    @ParameterizedTest
    @CsvSource({"-1, 0",
            "10, 0"
    })

    public void shuldSetStation(int stationNumber, int expection) {
        Radio radio = new Radio();
        radio.setStationNumber(stationNumber);

        int actual = radio.getStationNumber();

        Assertions.assertEquals(expection, actual);
    }

    @Test

    public void shouldSetNextStation() {
        Radio radio = new Radio();
        radio.setStationNumber(3);
        radio.next();

        int expected = 4;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetPrevStation() {
        Radio radio = new Radio();
        radio.setStationNumber(7);
        radio.prev();

        int expected = 6;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldCycleNextStation() {
        Radio radio = new Radio();
        radio.setStationNumber(9);
        radio.next();

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldCyclePrevStation() {
        Radio radio = new Radio();
        radio.setStationNumber(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"5, 6",
            "10, 10"
    })

    public void shouldIncreaseVolume(int volume, int expected) {
        Radio radio = new Radio();
        radio.volume = volume;
        radio.increaseVolume();

        int actual = radio.volume;

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvSource({"5, 4",
            "0, 0"
    })

    public void shouldDecreaseVolume(int volume, int expected) {
        Radio radio = new Radio();
        radio.volume = volume;
        radio.decreaseVolume();

        int actual = radio.volume;

        Assertions.assertEquals(expected, actual);

    }
}
