package entities.mappedSuperClassDemo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
//@Table(name="municipal_staff")
@DiscriminatorValue("municipal")
public class MunicipalStaff extends Staff{
	
	@Column(name="ward_no")
	int wardNo;

	public int getWardNo() {
		return wardNo;
	}

	public void setWardNo(int wardNo) {
		this.wardNo = wardNo;
	}
	
}
