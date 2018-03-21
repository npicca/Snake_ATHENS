We decided to use the singleton pattern for a few of the game main components, like the Grid, the MainWindow and the Score classes.
We decided to because they are inherently unique elements of the game, and to model that we at first decided to have them only have static methods, so they could be easily accessed when needed.
This however proved to be cumbersome, so we switched to a singleton pattern (there are still a few traces of the previous approach, we'll clean them in a future refactor).
Most of the singletons are implemented in very simple way, like in the following pseudocode:
```Java
public Class MyClass {
	private static MyClass instance = new MyClass();
	private MyClass(){
		//do something
	}
	public static MyClass getInstance(){
		return this.instance;
	}
}
```
