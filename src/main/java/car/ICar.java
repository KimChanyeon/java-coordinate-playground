package car;

public interface ICar {
    /**
     * 리터당 이동 거리. 즉, 연비
     */
    double getDistancePerLiter();

    /**
     * 여행하려는 거리
     */
    double getTripDistance();

    /**
     * 차종의 이름
     */
    String getName();
}
