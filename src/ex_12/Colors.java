package ex_12;

public enum Colors {
    DEFAULT("\u001B[0m"),
    BLACK("\u001B[30m"),
    RED("\u001B[31m"),
    GREEN ( "\u001B[32m"),
    YELLOW ( "\u001B[33m"),
    BLUE ( "\u001B[34m"),
    MAGENTA ( "\u001B[35m"),
    CYAN ( "\u001B[36m"),
    WHITE ( "\u001B[37m"),
    BRIGHT_BLACk( "\u001B[90m"),
    BRIGHT_RED( "\u001B[91m"),
    BRIGHT_GREEN( "\u001B[92m"),
    BRIGHT_YELLOW( "\u001B[93m"),
    BRIGHT_BLUE( "\u001B[94m"),
    BRIGHT_MAGENTA( "\u001B[95m"),
    BRIGHT_CYAN( "\u001B[96m"),
    BRIGHT_WHITE( "\u001B[97m");

    private final String key;

    public String getKey() {
        return key;
    }

    Colors(String key) {
        this.key = key;
    }
}
