package io.github.bluething.designpattern.observer.weatherwithpattern;

public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
