package ru.itmo.homeworks.hw6.conquerorOfThePeaks;

public class Application {
// 3 группы для восхождений на 3 различных горы.
    //В первой группе 3 альпиниста (набор закрыт)
    //Во второй и третьей группах по 2 альпиниста (набор в эти группы открыт)
public static void main(String[] args) {
    //climbers
    //1
    Climber climber01 = new Climber();
    climber01.name = "Fill Grey";
    climber01.address = "Bern, Switzerland";
    String climber01Info = climber01.getClimberInfo();
    //2
    Climber climber02 = new Climber();
    climber02.name = "Chris Smith";
    climber02.address = "Edinburgh, Scotland";
    String climber02Info = climber02.getClimberInfo();
    //3
    Climber climber03 = new Climber();
    climber03.name = "Alexander Roy";
    climber03.address = "Amsterdam, Netherlands";
    String climber03Info = climber03.getClimberInfo();
    //4
    Climber climber04 = new Climber();
    climber04.name = "Oleg Smirnov";
    climber04.address = "Kazan, Russia";
    String climber04Info = climber04.getClimberInfo();
    //5
    Climber climber05 = new Climber();
    climber05.name = "John Park";
    climber05.address = "Helsinki, Finland";
    String climber05Info = climber05.getClimberInfo();
    //6
    Climber climber06 = new Climber();
    climber06.name = "David Crown";
    climber06.address = "Cairo, Egypt";
    String climber06Info = climber06.getClimberInfo();
    //7
    Climber climber07 = new Climber();
    climber07.name = "Nik West";
    climber07.address = "Prague, Czech";
    String climber07Info = climber07.getClimberInfo();

//________________________________________________________
    //Mountains
    //1
    Mountain mount01 = new Mountain();
    mount01.name = "Everest";
    mount01.address = "China";
    mount01.height = 8_848.86;
    //2
    Mountain mount02 = new Mountain();
    mount02.name = "Montblanc";
    mount02.address = "France";
    mount02.height = 4_810;
    //3
    Mountain mount03 = new Mountain();
    mount03.name = "Ararat";
    mount03.address = "Turkey";
    mount03.height = 5_165;
//________________________________________________________

    Group group01 = new Group();
    //group01.climber = {climber01Info, climber02Info, climber03Info};
    //group01.mountain = mount01.getMountInfo();





}
}
