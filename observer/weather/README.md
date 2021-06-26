![without observer pattern](https://github.com/bluething/design-patterns/blob/main/images/problemwhenwedontuseobserver.png?raw=true)  
You can see at `io.github.bluething.designpattern.observer.weatherwithoutpattern.WeatherData` our class have dependency to concrete class.  
What if we want to add another display? Violating OCP.

#### Implement observer pattern 1

As you can see at [this commit](https://github.com/bluething/design-patterns/commit/fbc8e05237b26c6951d2c4f823a6f153289b389f)  
We create a Subject and Observer interface then implement it. But we have a problem, measurements pass to the observer.  
```java
        for (Observer o : observers) {
            o.update(temperature, humidity, pressure);
        }
```  
What if we have other unit?  
Is update() the best place to call display()? Implement MVC pattern.

#### Implement observer pattern 2

As you can see at [this commit](https://github.com/bluething/design-patterns/commit/cfcaeef73c15e4452712b0dd9487d00145397307)  
We change the way observer get the data, from push to pull. Using reference to subject we get the data via getter.  
Is there any way to avoid getter?