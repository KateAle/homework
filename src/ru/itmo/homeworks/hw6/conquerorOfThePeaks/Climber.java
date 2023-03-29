package ru.itmo.homeworks.hw6.conquerorOfThePeaks;

public class Climber {
    //Альпинист создаётся с именем (не менее 3 символов)
    // и адресом проживания (не менее 5 символов).
    public String name;
    public String address;


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

}
