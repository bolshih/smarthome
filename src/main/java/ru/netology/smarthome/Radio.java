package ru.netology.smarthome;

public class Radio {
    private int stationNumber;
    public int volume;

    public int getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(int newStationNumber) {
        if (newStationNumber <= 9) {
            if (newStationNumber >= 0) {
                stationNumber = newStationNumber;
            }
        }
    }

    public void next() {
        if (stationNumber < 9) {
            stationNumber = stationNumber + 1;
        } else {
            stationNumber = 0;
        }
    }

    public void prev() {
        if (stationNumber > 0) {
            stationNumber = stationNumber - 1;
        } else {
            stationNumber = 9;
        }
    }

    public void increaseVolume() {
        if (volume < 10) {
            volume = volume + 1;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }
    }
}