package CommandAndChain;

/**
 * 模拟 df 命令读取结果
 */
public class DiskManager {

    public static String df() {
        return "/\t10485760\n/user\t104857600\n/home\t104857600\n";
    }

    public static String df_k() {
        return "/\t10240\n/user\t10240\n/home\t10240\n";
    }

    public static String df_g() {
        return "/\t10\n/user\t10\n/home\t10\n";
    }
}
