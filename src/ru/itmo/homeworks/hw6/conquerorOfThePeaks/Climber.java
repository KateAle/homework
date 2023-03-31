package ru.itmo.homeworks.hw6.conquerorOfThePeaks;

public class Climber {
    //Альпинист создаётся с именем (не менее 3 символов)
    // и адресом проживания (не менее 5 символов).
    private final  String name;
    private final  String address;

    public Climber(String name, String address){
        if (name == null || name.length() < 3){
            throw new IllegalArgumentException("climber не менее 3 символов");
        }
        if (address == null || address.length() < 5){
            throw new IllegalArgumentException("address не менее 5 символов");
        }
        this.name = name;
        this.address = address;
    }
}
    /*


    public void setName(String climberName){
        if (climberName == null || climberName.length() < 3){
            throw new IllegalArgumentException("climber не менее 3 символов");
        }
        name = climberName;
    }
    public void setAddress(String climberAddress){
        if (climberAddress == null || climberAddress.length() < 3){
            throw new IllegalArgumentException("address не менее 5 символов");
        }
        address = climberAddress;
    }

    public String getClimberInfo () {
        return name + " , " + address;
    }

}*/
