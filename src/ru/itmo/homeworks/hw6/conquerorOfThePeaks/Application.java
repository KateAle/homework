package ru.itmo.homeworks.hw6.conquerorOfThePeaks;

public class Application {
// 3 группы для восхождений на 3 различных горы.
    //В первой группе 3 альпиниста (набор закрыт)
    //Во второй и третьей группах по 2 альпиниста (набор в эти группы открыт)
public static void main(String[] args) {
    //climbers
    //1
    Climber climber01 = new Climber("Fill Grey", "Bern, Switzerland");
    Climber climber02 = new Climber("Chris Smith", "Edinburgh, Scotland");
    Climber climber03 = new Climber("Alexander Roy", "Amsterdam, Netherlands");
    Climber climber04 = new Climber("Oleg Smirnov", "Kazan, Russia");
    Climber climber05 = new Climber("John Park", "Helsinki, Finland");
    Climber climber06 = new Climber("David Crown", "Cairo, Egypt");
    Climber climber07 = new Climber("Nik West", "Prague, Czech");
//________________________________________________________
    //Mountains
    Mountain mount01 = new Mountain("Everest", "China", 8_848.86);
    Mountain mount02 = new Mountain("Montblanc", "France", 4_810);
    Mountain mount03 = new Mountain("Ararat", "Turkey", 5_165);
//________________________________________________________

    Group group01 = new Group(mount01);
    group01.recruit(climber01);
    group01.recruit(climber02);
    group01.recruit(climber03);
    //group01.getMembers();
    group01.groupMembers(climber01);

    Group group02 = new Group(mount02);
    group02.recruit(climber04);
    group02.recruit(climber05);
    group02.groupMembers(climber04);



    Group group03 = new Group(mount03);
    group03.recruit(climber06);
    group03.recruit(climber07);



}





}

