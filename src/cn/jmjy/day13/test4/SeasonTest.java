package cn.jmjy.day13.test4;

/**
 * @author Ciaohi
 * @date 2019/11/8 上午10:08
 */
public class SeasonTest {
    public void switchSeason(int season) {
        switch (season) {
            case Season.SEASON_SPRING:
                System.out.println("春天适合踏青...");
                break;
            case Season.SEASON_SUMMER:
                System.out.println("夏天适合游泳...");
                break;
            case Season.SEASON_FALL:
                System.out.println("秋天适合旅游...");
                break;
            case Season.SEASON_WINTER:
                System.out.println("冬天适合滑雪...");
                break;
            default:
                break;
        }
    }
    public static void main(String[] args) {
        SeasonTest seasonTest=new SeasonTest();
        seasonTest.switchSeason(Season.SEASON_SPRING);
    }
}

