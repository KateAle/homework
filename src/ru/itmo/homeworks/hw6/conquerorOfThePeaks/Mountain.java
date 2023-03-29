package ru.itmo.homeworks.hw6.conquerorOfThePeaks;

public class Mountain {
// Гора создаётся с названием (не менее 4 символов),
// страной (не менее 4 символов)
// и высотой (не менее 100 метров)
    public String name;
    public String address;
    public double height;
    public void setName(String mountName){
        if (mountName == null || mountName.length() < 4){
            throw new IllegalArgumentException("mount не менее 3 символов");
        }
        name = mountName;
    }
    public void setAddress(String mountAddress){
        if (mountAddress == null || mountAddress.length() < 4){
            throw new IllegalArgumentException("address не менее 5 символов");
        }
        address = mountAddress;
    }
    public void setHeight(Double mountHeight){
        if ( mountHeight==0 || mountHeight < 100){
            throw new IllegalArgumentException("height не менее 100");
        }
        height = mountHeight;
    }

    public String getMountInfo () {
        return (name + " , " + address+" , "+height+ " m");
    }

}
