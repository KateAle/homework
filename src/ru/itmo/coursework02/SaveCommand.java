package ru.itmo.coursework02;

import java.io.IOException;

class SaveCommand implements Command{
    Game game;
    User u;
    public SaveCommand(Game game) {
        this.game = game;
    }
    public Game getGame() {
        return game;
    }
    @Override
    public void execute(User user) throws IOException {
        game.save(user);
    }
}