package entities.mappedSuperClassDemo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
//@Table(name = "medical_staff")
@DiscriminatorValue("medical")
public class MedicalStaff extends Staff {

	@Column(name = "hospital_name")
	String hospitalName;

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

}
