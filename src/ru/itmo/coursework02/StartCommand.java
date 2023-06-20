package ru.itmo.coursework02;

public  class StartCommand implements Command{
    Game game;
    public StartCommand(Game game) {
        this.game = game;
    }
    @Override
    public void execute(User user) {
        game.start();
    }
}