package ua.hillel.messenger;

public class Logger {
    static String info(String status) {
        System.out.println(ConsoleColors.BLUE_BOLD_BRIGHT + "Status - " + status);
        return "NULL";
    }

    static String debug(String status) {
        System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT + "Status - " + status);
        return "NULL";
    }

    static String warn(String status) {
        System.out.println(ConsoleColors.PURPLE_BOLD_BRIGHT + "Status - " + status);
        return "NULL";
    }

    static String error(String status) {
        System.out.println(ConsoleColors.RED_BOLD_BRIGHT + "Status - " + status);
        return "NULL";
    }


}
