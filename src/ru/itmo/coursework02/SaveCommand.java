package ru.itmo.coursework02;

class SaveCommand implements Command{
    Game game;
    User u;
    public SaveCommand(Game game) {
        this.game = game;
    }
    @Override
    public void execute(User user) {
        game.save(user);
    }
}