package ru.itmo.homeworks.hw6.conquerorOfThePeaks;

import java.util.Arrays;

public class Group {
    //идёт набор в группу или нет;
    //массив альпинистов;
    //гора;
    //должна быть возможность добавить альпиниста в группу (в массив),
    // если набор ещё идёт

    private Climber[] climbers;
    private Mountain mount;
    private int i;

    public Group(Mountain mount) {
        if (mount == null) {
            throw new IllegalArgumentException("Exception: mount");
        }
        this.mount = mount;
        climbers = new Climber[3];
    }

    public String getGroupName() {
        String groupName = mount.name;
        return groupName;
    }

    public void recruit(Climber climber) {
        if (climber == null) {
            throw new IllegalArgumentException("Exception: climber");
        }
        if (i >= climbers.length) {
            throw new IllegalArgumentException("набор в группу " + mount.name + " закрыт");
        }
        climbers[i] = climber;
        i++;
    }

    public void groupMembers( Climber climber) {

        /*for (i = 0; i > climbers.length; i++) {
            if (climbers[i] == null) {
              return ("В группе " + mount.name + " осталось " + (climbers.length - i) + " свободных мест");
          }
          if (climbers[2] == null) {
              return ("В группе " + mount.name + " нет свободных мест");
         }

        }
        return "ошибка";*/

            if (climber == null) {
                System.out.println("В группу добавляют только альпинистов");
                return;
            }
            if (climbers.length == i) {
                System.out.println("В группе " + mount.name + " нет свободных мест");
                return;
            }
            climbers[i] = climber;
            i++;
        }
    }






