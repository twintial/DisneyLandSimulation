package disney.place.attraction.maintenance;

import disney.place.attraction.Attraction;

// 用到的设计模式有 责任链模式

/**
 * {@code MaintenanceWorkerTeam} class 是维修游乐设施的维修队父类
 * 当 {@link Attraction} 的状态变为 {@link Maintaining} 的时候需要先通知初级施工队
 */
public abstract class MaintenanceWorkerTeam{
    public static int SENIOR = 2; // 高级
    public static int JUNIOR = 1; // 初级

    protected int level;

    protected MaintenanceWorkerTeam nextTeam; // 责任链的下一级

    /**
     * 用于设置下一级的队伍
     * @param nextTeam
     */
    protected void setHigherTeam(MaintenanceWorkerTeam nextTeam){
        this.nextTeam = nextTeam;
    }

    /**
     * 为attracttion处理等级为level的维修任务
     * @param level 处理此维修任务需要的等级
     * @param attraction 需要维修的游乐设施
     */
    public void handle(int level, Attraction attraction){
        if(this.level <= level){
            repair(attraction);
        }
        if(nextTeam != null){
            nextTeam.handle(level, attraction);
        }
    }

    protected abstract void repair(Attraction attraction);

}
