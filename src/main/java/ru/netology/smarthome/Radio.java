package ru.netology.smarthome;

public class Radio {
    private int stationNumber;
    private int stationAmount = 10;
    private int volume;

    public Radio(int stationAmount) {
        this.stationAmount = stationAmount;
    }

    public Radio() {
    }

    public int getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(int newStationNumber) {
        if (newStationNumber < stationAmount) {
            if (newStationNumber >= 0) {
                stationNumber = newStationNumber;
            }
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        volume = newVolume;
    }

    public void next() {
        if (stationNumber < (stationAmount - 1)) {
            stationNumber = stationNumber + 1;
        } else {
            stationNumber = 0;
        }
    }

    public int getStationAmount() {
        return stationAmount;
    }

    public void prev() {
        if (stationNumber > 0) {
            stationNumber = stationNumber - 1;
        } else {
            stationNumber = stationAmount - 1;
        }
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume = volume + 1;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }
    }
}