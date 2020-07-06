package ru.netology;

public class Conditioner {
    private String name;
    private int maxTemperature;
    private int minTemperature;
    private int currentTemperature;
    private boolean on;
    private int increaseCurrentTemperature;
    private int decreaseCurrentTemperature;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature > maxTemperature) {
            return;
        }
        if (currentTemperature < minTemperature) {
            return;
        }
        // здесь уверены, что все проверки прошли
        this.currentTemperature = currentTemperature;
    }

//    public void setCurrentTemperature(int currentTemperature) {
//        if (currentTemperature <= maxTemperature) {
//            if (currentTemperature >= minTemperature) {
//                this.currentTemperature = currentTemperature;
//            }
//        }
//    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getIncreaseCurrentTemperature() {
        return increaseCurrentTemperature;
    }

    public void setIncreaseCurrentTemperature(int increaseCurrentTemperature) {
        if (increaseCurrentTemperature < currentTemperature) {
            return;
        }
        if (increaseCurrentTemperature > maxTemperature) {
            return;
        }
        currentTemperature += 1;

        this.increaseCurrentTemperature = increaseCurrentTemperature;
    }

    public int getDecreaseCurrentTemperature() {
        return decreaseCurrentTemperature;
    }

    public void setDecreaseCurrentTemperature(int decreaseCurrentTemperature) {
        if (decreaseCurrentTemperature > currentTemperature) {
            return;
        }
        if (decreaseCurrentTemperature < minTemperature) {
            return;
        }
        currentTemperature -= 1;

        this.decreaseCurrentTemperature = decreaseCurrentTemperature;
    }
}


