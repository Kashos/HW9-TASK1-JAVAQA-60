package ru.netology.javaqa60;
public class Radio {

    private int maxStationNumber = 9;
    private int minStationNumber = 0;
    private int minVolume = 0;
    private  int maxVolume = 100;
    private int stationNumber = minStationNumber;
    private int currentVolume = minVolume;
    public Radio(int numberOfStation) {
        this.minStationNumber = minStationNumber;
        this.maxStationNumber = numberOfStation - 1;
        this.stationNumber = minStationNumber;
    }
    public int getStationNumber() {
        return stationNumber;
    }
    public int getMinStationNumber() {
        return minStationNumber;
    }
    public  int getMaxStationNumber() {
        return maxStationNumber;
    }
    public int getMinVolume() {
        return minVolume;
    }
    public int getMaxVolume() {
        return maxVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setStationNumber(int newStationNumber) {
        if (newStationNumber < minStationNumber) {
            return;
        }
        if (newStationNumber > maxStationNumber) {
            return;
        }
        stationNumber = newStationNumber;
    }

    public void setNextStation() {
        if (stationNumber < maxStationNumber) {
            stationNumber = stationNumber + 1;
        } else {
            stationNumber = minStationNumber;
        }
    }

    public void setPreviousStation() {
        if (stationNumber > minStationNumber) {
            stationNumber = stationNumber - 1;
        } else {
            stationNumber = maxStationNumber;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 10;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void reduceVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 10;
        } else {
            currentVolume = minVolume;
        }
    }
}
