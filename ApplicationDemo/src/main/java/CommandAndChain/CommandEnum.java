package CommandAndChain;

import java.util.ArrayList;
import java.util.List;

public enum CommandEnum {
    LS("CommandAndChain.LSCommand"),
    DF("CommandAndChain.DFCommand")
    ;

    CommandEnum(String value) {
        this.value = value;
    }

    private String value;

    public String getValue() {
        return this.value;
    }

    public static List<String> getNames() {
        CommandEnum[] commandEnums = CommandEnum.values();
        List<String> names = new ArrayList<>();
        for (CommandEnum c : commandEnums) {
            names.add(c.name().toLowerCase());
        }
        return names;
    }
}
