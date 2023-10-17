package com.company;

public class G2 {
    private String nameCham;
    private String position;

    public G2(String nameCham, String position) {
        this.nameCham = nameCham;
        this.position = position;
    }

    @Override
    public String toString() {
        return "G2{" +
                "nameCham='" + nameCham + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
