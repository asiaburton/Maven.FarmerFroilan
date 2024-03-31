package com.zipcodewilmington.froilansfarm.Interfaces;

public interface Rider extends Ridable {
    String ride();

    boolean mount(Ridable ridable);
    boolean dismount(Ridable ridable);

}
