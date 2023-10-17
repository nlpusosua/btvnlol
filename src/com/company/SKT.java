package com.company;

public class SKT {
    private String nameCham;
    private String position;

    public SKT(String nameCham, String position) {
        this.nameCham = nameCham;
        this.position = position;
    }

    @Override
    public String toString() {
        return "SKT{" +
                "nameCham='" + nameCham + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
