package ru.itmo.coursework02;

import java.io.IOException;

public  class StartCommand implements Command{
    Game game;
    public StartCommand(Game game) {
        this.game = game;
    }
    public Game getGame() {
        return game;
    }
    @Override
    public void execute(User user) throws IOException {
        game.start(user);
    }
}