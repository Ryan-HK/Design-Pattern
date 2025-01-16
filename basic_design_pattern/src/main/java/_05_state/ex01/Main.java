package _05_state.ex01;

import _03_template.ex01.Coffee;
import _03_template.ex01.Tea;

public class Main {


    /**
     * State Pattern
     */
    public static void main(String[] args) {

        Door door = new Door();
        door.open();
        door.open();
        door.close();
        door.close();

    }

}