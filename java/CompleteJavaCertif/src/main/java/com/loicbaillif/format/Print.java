package com.loicbaillif.format;

public class Print {
    static final short MAX_SIZE = 80;

    public static void title(
            String text, short innerSize, char innerFill, char outerFill) {
        // This will print a title line, with text centered over 80 chars
        // And with 2 filling characters: one outside, one inside
        short textLength = (short) text.length();
        if (textLength > MAX_SIZE
                || innerSize > MAX_SIZE
                || textLength > innerSize
        ) {
            System.out.println(text);
        } else {
            short innerGap = (short) ((innerSize - textLength) / 2);
            short outerGap = (short) ((MAX_SIZE - innerSize) / 2);

            for (short i = 0; i < outerGap; i++) {
                System.out.print(outerFill);
            }
            System.out.print((MAX_SIZE - innerSize) % 2 == 0 ? "" : outerFill);

            for (short i = 0; i < innerGap; i++) {
                System.out.print(innerFill);
            }
            System.out.print((innerSize - textLength) % 2 == 0
                    ? ""
                    : innerFill);

            System.out.print(text);

            for (short i = 0; i < innerGap; i++) {
                System.out.print(innerFill);
            }

            for (short i = 0; i < outerGap; i++) {
                System.out.print(outerFill);
            }

            System.out.println();

        }

    }

    public static void title(String text, short size) {

    }
}
