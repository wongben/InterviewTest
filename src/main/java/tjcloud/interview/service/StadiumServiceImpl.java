package tjcloud.interview.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tjcloud.interview.MapUtils;
import tjcloud.interview.Repositories.StadiumRepository;
import tjcloud.interview.models.Stadium;

@Service
public class StadiumServiceImpl implements StadiumService {
	@Autowired
	private StadiumRepository stadiumRepository;
	
	/**
	 * 
	 * @param longitude 经度
	 * @param latitude 纬度
	 * @param sideLength 矩阵边长
	 * @return 返回矩阵范围内的场馆
	 */
	@Override
	public List<Stadium> getStadiumListByLocationRectangle(double longitude,double latitude,double radius) {
		// 边长/2
		double latitudeOffset = MapUtils.getLatitudeOffset(radius);

		double longitudeOffset = MapUtils.getLongitudeOffset(latitude,radius);	
		List<Stadium> list = stadiumRepository.getStadiumListByLocation(latitude-longitudeOffset ,latitude+longitudeOffset,
				longitude-latitudeOffset,longitude+latitudeOffset);
		System.out.println(list.size());
		return list;
	}

	//@Override
	public List<Stadium> filtertStadiumListByCircle(List<Stadium> list, double longitude, double latitude, double radius) {
		return list.stream().filter(
				(stadium) ->       
				MapUtils.getDistance(latitude,longitude, stadium.getBdGPSX(), stadium.getBdGPSY()) <= radius	
		).collect(Collectors.toList());
		
	}
	
	

}
