package ru.itmo.coursework02;

import java.io.IOException;

public class LoadCommand implements Command{
    Game game;
    User u;
    public LoadCommand(Game game) {
        this.game = game;
    }

    public Game getGame() {
        return game;
    }

    @Override
    public void execute(User user) throws IOException  {
        game.load(user);
    }
}