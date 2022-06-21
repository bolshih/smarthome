package ru.netology.smarthome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestRadio {
    @Test
    public void shouldSetStaitionAmount() {
        Radio radio = new Radio(25);

        Assertions.assertEquals(25, radio.getStationAmount());
    }

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
        Radio radio = new Radio(25);
        radio.setStationNumber(24);
        radio.next();

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldCyclePrevStation() {
        Radio radio = new Radio(25);
        radio.setStationNumber(0);
        radio.prev();

        int actual = radio.getStationNumber();

        Assertions.assertEquals(radio.getStationAmount() - 1, actual);
    }

    @ParameterizedTest
    @CsvSource({"5, 6",
            "100, 100"
    })

    public void shouldIncreaseVolume(int volume, int expected) {
        Radio radio = new Radio();
        radio.setVolume(volume);
        radio.increaseVolume();

        Assertions.assertEquals(expected, radio.getVolume());

    }

    @ParameterizedTest
    @CsvSource({"5, 4",
            "0, 0"
    })

    public void shouldDecreaseVolume(int volume, int expected) {
        Radio radio = new Radio();
        radio.setVolume(volume);
        radio.decreaseVolume();

        Assertions.assertEquals(expected, radio.getVolume());

    }
}
