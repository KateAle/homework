package ru.itmo.coursework02;

public class ExitCommand implements Command{
    Game game;
    public ExitCommand(Game game) {
        this.game = game;
    }
    public Game getGame() {
        return game;
    }
    @Override
    public void execute(User user) {
        game.exit(user);
    }
}