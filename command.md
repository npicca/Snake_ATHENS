We decided to implement the command pattern in the GameOver class, to easily reset the game states.
A few classes, like Snake and Grid, implement the Restart interface, which specifies a restart method that resets the class state.
These classes, at construction time, call GameOver.addRestartable(this), so that GameOver can know that the class needs to be restarted on GameOver.
When you lose the game, the GameOver.reset() method is called, and the restart() method is called for each Restar class
