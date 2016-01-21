package tjcloud.interview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tjcloud.interview.models.Stadium;
import tjcloud.interview.service.StadiumService;

@RestController
@RequestMapping("/stadium")
public class StadiumController {
	
	//TODO:可在下面增加你需要的属性和方法
	
	
	/**
	 * 输入lng经度,lnt维度,半径radius,输出 经纬度为原点，半径radius范围内的，所有场馆列表
	 * @param lng 经度
	 * @param lnt 维度
	 * @param radius 半径
	 * @return
	 */
	public List<Stadium> getStadiumList(
			@RequestParam(value = "lng", defaultValue = "121.47260290961", required =false) Double lng,
			@RequestParam(value = "lnt", defaultValue = "31.340836837682", required =false) Double lnt,
			@RequestParam(value = "radius") Double radius) {
		
		//TODO:实现此方法
		
		return null;

	}

}