package ru.itmo.coursework02;

class ContCommand implements Command{
    Game game;
    User u;
    public ContCommand(Game game) {
        this.game = game;
    }
    public Game getGame() {
        return game;
    }
    @Override
    public void execute(User user){
        game.cont(user);
    }
}