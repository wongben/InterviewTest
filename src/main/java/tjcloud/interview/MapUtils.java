package tjcloud.interview;

public class MapUtils {
	
	//地球半径，为了简化问题，认为地球是一个完美的球体而不是椭球体,单位KM
	private static final double EARTH_RADIUS = 6378.137;
	
	private static double rad(double angle) {
		return angle * Math.PI / 180.0;
	}
	/**
	 * 输入距离，返回维度偏差
	 * @param distance 
	 * @return 
	 */ 
	public static double getLatitudeOffset(double distance){
		return distance * 180 / (Math.PI * EARTH_RADIUS * 1000);	
	}
	
	/**
	 * 输入当前坐标的维度Latitude，和需要偏差的距离，如在维度31度，东西方向偏差1000米
	 * @param pointLatitude
	 * @param distance
	 * @return
	 */
	public static double getLongitudeOffset(double pointLatitude , double distance){
		return distance * 180 / (Math.PI * EARTH_RADIUS * 1000 * Math.cos(rad(pointLatitude)));
	}
	
	
	

//	1°经度差对应的东西方向的距离是与其纬度有密切关系的。
//	赤道上经度相差1°对应的弧长大约是111千米
//	具体数据如下：
//	纬度  1°经度差对应的东西距离
//	20°  104公里
//	26°  100公里
//	30°  96公里
//	36°  90公里
//	40°  85公里
//	44°  80公里
//	51°  70公里
//	经纬度在不同地区，每度距离差是不同的，如果假定地球是完美的球体（这样假设误差不是很大）的话，纬度为 B 的地区：
//	纬度变化一度，球面南北方向距离变化：πR/180 ........111.7km
//	经度变化一度，球面东西方向距离变化：πR/180*cosB ....111.7*cosB
//	比如北京 B = 40、cosB = 0.766，经度变化1度，则东西方向距离变化 85.567km
	
	public static double getDistance(double lat1, double lng1, double lat2, double lng2) {
		double radLat1 = rad(lat1);
		double radLat2 = rad(lat2);
		double a = radLat1 - radLat2;
		double b = rad(lng1) - rad(lng2);
		double s = 2 * Math.asin(Math.sqrt(
				Math.pow(Math.sin(a / 2), 2) + Math.cos(radLat1) * Math.cos(radLat2) * Math.pow(Math.sin(b / 2), 2)));
		s = s * EARTH_RADIUS;
		s = Math.round(s * 10000) / 10000;
		return s ;
	}

	public static double D_jw(double wd1, double jd1, double wd2, double jd2) {
		double x, y, out;
		double PI = 3.14159265;
		double R = 6.371229 * 1e6;

		x = (jd2 - jd1) * PI * R * Math.cos(((wd1 + wd2) / 2) * PI / 180) / 180;
		y = (wd2 - wd1) * PI * R / 180;
		out = Math.hypot(x, y);
		return out / 1000;
	}
	//经度121.513155 纬度 31.303584
	public static void main(String args[]) {
		// 31.1795100,121.3944810
		System.out.println(getLongitudeOffset(31.41 , 25 * 1000));
//		System.out.println(MapUtils.GetDistance(102.6592, 25.0751, 102.7655, 24.9525));
//		System.out.println(MapUtils.D_jw(102.6592, 25.0751, 102.7655, 24.9525));
	}
}
