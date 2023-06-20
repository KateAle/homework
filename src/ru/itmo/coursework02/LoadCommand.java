package ru.itmo.coursework02;

public class LoadCommand implements Command{
    Game game;
    User u;
    public LoadCommand(Game game) {
        this.game = game;
    }
    @Override
    public void execute(User user) {
        game.load(user);
    }
}