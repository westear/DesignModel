package CommandAndChain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

/**
 * linux 命令的值对象，它把一个命令解析为：
 *  命令名: commandName
 *  选项: param
 *  操作数: data
 * 例如：ls -l /usr
 */
public class CommandVO {

    public final static String DIVIDE_FLAG = " ";
    public final static String PREFIX = "-";

    private String commandName;

    private ArrayList<String> paramList = new ArrayList<>();

    private ArrayList<String> dataList = new ArrayList<>();

    public String getCommandName() {
        return this.commandName;
    }

    public ArrayList<String> getParamList() {
        if(this.paramList.isEmpty() ) {
            this.paramList.add("");
        }
        return new ArrayList<>(new HashSet<>(this.paramList));
    }

    public ArrayList<String> getDataList() {
        return this.dataList;
    }

    public CommandVO(String commandStr) {
        if(Objects.nonNull(commandStr) && commandStr.length() != 0) {
            String[] complexStr = commandStr.split(DIVIDE_FLAG);
            this.commandName = complexStr[0];
            for (int i = 1; i < complexStr.length; i++) {
                String str = complexStr[i];
                if(str.indexOf(PREFIX) == 0) {
                    this.paramList.add(str.replace(PREFIX,"").trim());
                } else {
                    this.paramList.add(str.trim());
                }
            }
        } else {
            System.out.println("命令解析失败");
        }
    }

}
