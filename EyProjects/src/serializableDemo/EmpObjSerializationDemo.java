package serializableDemo;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class EmpObjSerializationDemo {
	
	public static void main(String[] args) {
		
		EmpObjSerializationDemo impl = new EmpObjSerializationDemo();
		impl.writeData();
		impl.readData();
	}
	
	private void writeData() {
		
		Employee db[] = {
				new Employee("Akshay",21,54321.12),
				new Employee("Brijesh",23,38321.12),
				new Employee("Rahul",21,47321.12)
		};
		
		try(FileOutputStream fos = new FileOutputStream("D:\\JavaAndReact\\empObject.ser");
			ObjectOutputStream sout = new ObjectOutputStream(fos);){
			
				for(int i=0;i<db.length;i++) {
					// This method will convert object into byte.
					sout.writeObject(db[i]);
				}
				
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
	
	private void readData()  {
		try(FileInputStream fis = new FileInputStream("D:\\JavaAndReact\\empObject.ser");
				ObjectInputStream sin = new ObjectInputStream(fis);){
			
			Employee e = (Employee) sin.readObject();
			e.display();
			e = (Employee) sin.readObject();
			e.display();
			e = (Employee) sin.readObject();
			e.display();
			
		} catch(IOException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException c) {
			c.printStackTrace();
		}
	}

}
