package com.neuedu.homework.May28.test;

import com.neuedu.homework.May28.means.note;

public class testNote {
    public static void main(String[] args) {

        note note = new note('黄');
        note note1 = new note(30);
        note note2 = new note('白',50);
        note note3 = new note(70,'黑');
        System.out.print(note + "\n" + note1 + "\n" + note2 + "\n" + note3 + "\n");
    }
}
