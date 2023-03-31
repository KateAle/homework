package ru.itmo.homeworks.hw6.conquerorOfThePeaks;

public class Mountain {
    // Гора создаётся с названием (не менее 4 символов),
// страной (не менее 4 символов)
// и высотой (не менее 100 метров)
    public final String name;
    private final String address;
    private final double height;

    public Mountain(String name, String address, double height) {
        if (name == null || name.length() < 4) {
            throw new IllegalArgumentException("mount не менее 4 символов");
        }
        if (address == null || address.length() < 4) {
            throw new IllegalArgumentException("address не менее 4 символов");
        }
        if (height == 0 || height < 100) {
            throw new IllegalArgumentException("height не менее 100");
        }
        this.name = name;
        this.address = address;
        this.height = height;
    }
}