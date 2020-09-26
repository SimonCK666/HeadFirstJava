/**
 * @author Simon
 * @version 1.0
 * @ID 1930026144
 * @date 2020/7/8 10:26
 * @Driscirbe 运用参数与返回类型
 */
public class ElectricGuitar {
    String brand;
    int numOfPickups;
    boolean rockStarUsesIt;

    String getBrand() {
        return brand;
    }
    void setBrand(String aBrand) {
        brand = aBrand;
    }
    int getNumOfPickups() {
        return numOfPickups;
    }
    void setNumOfPickups(int num) {
        numOfPickups = num;
    }
    boolean getRockStarUsesIt() {
        return rockStarUsesIt;
    }
    void setRockStarUsesIt(boolean yesOrNo) {
        rockStarUsesIt = yesOrNo;
    }
}
