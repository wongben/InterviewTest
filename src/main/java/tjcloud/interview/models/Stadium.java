package tjcloud.interview.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 场馆Model
 * @author WongBen
 *
 */
@Entity
@Table(name = "D_STADIUM")
public class Stadium implements Serializable {

	/**
	 * @Fields serialVersionUID
	 */
	private static final long serialVersionUID = -818290923178807709L;

	@Id
	@Column(name = "stadium_id")
	private Integer stadiumId;

	@Column(name = "stadium_name")
	private String stadiumName;

	@Column(name = "stadium_address")
	private String stadiumAddress;
	
	@Column(name = "baidu_gps_x")
	private Double bdGPSX;

	@Column(name = "baidu_gps_y")
	private Double bdGPSY;

	public Integer getStadiumId() {
		return stadiumId;
	}

	public void setStadiumId(Integer stadiumId) {
		this.stadiumId = stadiumId;
	}

	public String getStadiumName() {
		return stadiumName;
	}

	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}

	public String getStadiumAddress() {
		return stadiumAddress;
	}

	public void setStadiumAddress(String stadiumAddress) {
		this.stadiumAddress = stadiumAddress;
	}

	public Double getBdGPSY() {
		return bdGPSY;
	}

	public void setBdGPSY(Double bdGPSY) {
		this.bdGPSY = bdGPSY;
	}

	public Double getBdGPSX() {
		return bdGPSX;
	}

	public void setBdGPSX(Double bdGPSX) {
		this.bdGPSX = bdGPSX;
	}

}
