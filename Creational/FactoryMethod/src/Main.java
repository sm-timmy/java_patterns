import model.building.Building;
import model.project.PoolDiggingProject;
import model.project.Project;
import model.project.SmallHouseProject;

public class Main {
    public static void main(String[] args) {
        Project houseProject = new SmallHouseProject();
        Building house = houseProject.createBuilding();
        System.out.println(
                "Постройка бытовки стандартных размеров.\n" +
                "Цена: %f\n".formatted(house.countBuildingPrice()));

        Project poolProject = new PoolDiggingProject();
        Building pool = poolProject.createBuilding();
        System.out.println(
                "Копка бассейна 5м*5м*5м.\n" +
                        "Цена: %f\n".formatted(pool.countBuildingPrice()));

    }
}