package tjcloud.interview;

public class MapUtils {
	
	//地球半径，为了简化问题，认为地球是一个完美的球体而不是椭球体,单位千米
	private static final double EARTH_RADIUS = 6378.137;
	
	/**
	 * 角度进制转换，如把45度，转为PI/4 
	 * @param angle
	 * @return
	 */
	private static double rad(double angle) {
		return angle * Math.PI / 180.0;
	}
	
	//TODO:可在下列增加你需要的方法

}
