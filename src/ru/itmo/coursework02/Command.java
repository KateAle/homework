package ru.itmo.coursework02;

import java.io.IOException;
import java.io.Serializable;

public interface Command {
    void execute(User user) throws IOException;

    Game getGame();
}