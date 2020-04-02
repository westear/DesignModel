package demo1;

import java.util.ArrayList;

/**
 * 组装奔驰车模型代码
 */
public class Client {

    public static void main(String[] args) {
//        BenzModel benzModel = new BenzModel();
//        ArrayList<String> sequence = new ArrayList<>();
//        sequence.add("engine boom");
//        sequence.add("start");
//        sequence.add("stop");
//        benzModel.setSequence(sequence);
//        benzModel.run();

        /*
         * 1.以上调用，如果需要组装成另一种模型，会很麻烦
         * 所以需要增加一个建造者抽象类
         * 修改后的场景类：
         */
        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("engine boom");
        sequence.add("start");
        sequence.add("stop");

        //要一个奔驰车
        BenzBuilder benzBuilder = new BenzBuilder();
        benzBuilder.setSequence(sequence);
        BenzModel benzModel = (BenzModel) benzBuilder.getCarModel();
        benzModel.run();

        //如果需要一个宝马车
        BMWBuilder bwmBuilder = new BMWBuilder();
        bwmBuilder.setSequence(sequence);
        BMWModel bwmModel = (BMWModel) bwmBuilder.getCarModel();
        bwmModel.run();

        /*
         * 2.如果需求改成不同模型，零件组装顺序不一样怎么办？此时需要增加一个导演类
         * 修改后的场景类如下：
         */
        Director director = new Director();
        //一万辆A类型奔驰车
        for (int i = 0; i < 10000L; i++) {
            director.getABenzModel();
        }

        //一万辆B类型奔驰车
        for (int i = 0; i < 10000L; i++) {
            director.getBBenzModel();
        }

        //一万辆C类型宝马车
        for (int i = 0; i < 10000L; i++) {
            director.getCBMWModel();
        }

        //一万辆D类型宝马车
        for (int i = 0; i < 10000L; i++) {
            director.getDBMWModel();
        }
    }
}
