package entities.mappedSuperClassDemo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@Entity
@Table(name="staff")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type" , discriminatorType = DiscriminatorType.STRING)

//@MappedSuperclass    					// used as parent class not a tabel
public abstract class Staff {

	@Id
	@Column(name = "staff_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int staffNo;

	@Column(name = "staff_name")
	String staffName;

	public int getStaffNo() {
		return staffNo;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	
}
