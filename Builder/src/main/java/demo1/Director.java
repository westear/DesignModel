package demo1;

import java.util.ArrayList;

/**
 * 导演类，负责模型组装顺序
 */
public class Director {

    private ArrayList<String> sequence = new ArrayList<>();

    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();

    /**
     * A类型的奔驰模型，start -> stop
     * @return BenzModel
     */
    public BenzModel getABenzModel() {
        //清理组装现场
        this.sequence.clear();
        //组装顺序
        this.sequence.add("start");
        this.sequence.add("stop");
        //按照顺序返回一个奔驰车
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    /**
     * B类型的奔驰模型，engine boom -> start -> stop
     * @return BenzModel
     */
    public BenzModel getBBenzModel() {
        this.sequence.clear();
        this.sequence.add("engine boom");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    /**
     * C类型的宝马模型，alarm -> start -> stop
     * @return BMWModel
     */
    public BMWModel getCBMWModel() {
        //清理组装现场
        this.sequence.clear();
        //组装顺序
        this.sequence.add("alarm");
        this.sequence.add("start");
        this.sequence.add("stop");
        //按照顺序返回一个宝马车
        this.benzBuilder.setSequence(this.sequence);
        return (BMWModel) this.bmwBuilder.getCarModel();
    }

    /**
     * D类型的宝马模型，start
     * @return BMWModel
     */
    public BMWModel getDBMWModel() {
        //清理组装现场
        this.sequence.clear();
        //组装顺序
        this.sequence.add("start");
        //按照顺序返回一个宝马车
        this.benzBuilder.setSequence(this.sequence);
        return (BMWModel) this.bmwBuilder.getCarModel();
    }

    //往下还可以组装很多种类型
}
