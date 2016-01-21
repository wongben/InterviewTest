package tjcloud.interview.service;

import java.util.List;

import tjcloud.interview.models.Stadium;

public interface StadiumService {
	public List<Stadium> getStadiumListByLocationRectangle(double d,double e,double sideLength);
	
	public List<Stadium> filtertStadiumListByCircle(List<Stadium> list,double longitude,double latitude,double radius);

}
