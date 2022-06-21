package ru.netology.smarthome;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int stationNumber;
    private int stationAmount = 10;
    private int volume;

    public void setStationNumber(int newStationNumber) {
        if (newStationNumber < stationAmount) {
            if (newStationNumber >= 0) {
                stationNumber = newStationNumber;
            }
        }
    }

    public void next() {
        if (stationNumber < (stationAmount - 1)) {
            stationNumber = stationNumber + 1;
        } else {
            stationNumber = 0;
        }
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