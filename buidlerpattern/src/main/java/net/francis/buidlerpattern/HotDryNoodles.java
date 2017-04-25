package net.francis.buidlerpattern;

/**
 * Created by Francis on 2017/4/7.
 * <p>
 * 原始做法
 */

public class HotDryNoodles {
    private boolean addShallot;
    private boolean addParsley;
    private boolean addChili;
    private boolean addSauerkraut;

    /**
     * @param addShallot    葱花
     * @param addParsley    香菜
     * @param addChili      辣椒
     * @param addSauerkraut 酸菜
     */
    public HotDryNoodles(boolean addShallot, boolean addParsley, boolean addChili, boolean addSauerkraut) {
        this.addShallot = addShallot;
        this.addParsley = addParsley;
        this.addChili = addChili;
        this.addSauerkraut = addSauerkraut;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("A bowl of hot-dry noodles has : ");
        if (this.addShallot) {
            builder.append("葱花.");
        }
        if (this.addParsley) {
            builder.append("香菜.");
        }
        if (this.addChili) {
            builder.append("辣椒.");
        }
        if (this.addSauerkraut) {
            builder.append("酸菜.");
        }

        return builder.toString();
    }
}
