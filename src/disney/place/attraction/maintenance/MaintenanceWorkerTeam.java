package disney.place.attraction.maintenance;

import disney.place.attraction.Attraction;

public abstract class MaintenanceWorkerTeam{
    public static int SENIOR = 2;
    public static int JUNIOR = 1;

    protected int level;

    protected MaintenanceWorkerTeam nextTeam;
    //将sendtohigherteam 改为此函数
    public void setHigherTeam(MaintenanceWorkerTeam nextTeam){
        this.nextTeam = nextTeam;
    }

    public void handle(int level, Attraction attraction){
        if(this.level <= level){
            repair(attraction);
        }
        if(nextTeam != null){
            nextTeam.handle(level, attraction);
        }
    }
    //新添加该函数
    protected abstract void repair(Attraction attraction);

}
