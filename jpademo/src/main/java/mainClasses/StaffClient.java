package mainClasses;

import javax.persistence.EntityManager;

import entities.mappedSuperClassDemo.MedicalStaff;
import entities.mappedSuperClassDemo.MunicipalStaff;

public class StaffClient {

	public static void main(String[] args) {
		
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		
		MunicipalStaff mps = new MunicipalStaff();
		mps.setStaffName("Shekar");
		mps.setWardNo(2);
		em.persist(mps);
		
		MedicalStaff ms = new MedicalStaff();
		ms.setStaffName("Yash");
		ms.setHospitalName("MSR");
		em.persist(ms);
		
		em.getTransaction().commit();
		
		JPAUtil.cleanUp();
		
	}
}
