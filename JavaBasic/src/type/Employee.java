package type;

public class Employee {
	private int empNumber;
    private String empName;
    private String empDepartment;
    private String empRank;
    private int empSalary;
    
    public void setEmpNumber(int empNumber) {
    	this.empNumber = empNumber;
    }
    
    public int getEmpNumber() {
    	return empNumber;
    }
    
    public void setEmpName(String empName) {
    	this.empName = empName;
    }
    
    public String getEmpName() {
    	return empName;
    }
    
    public void setEmpDepartment(String empDepartment) {
    	this.empDepartment = empDepartment;
    }
    
    public String getEmpDepartment() {
    	return empDepartment;
    }
    
    public void setEmpRank(String empRank) {
    	this.empRank = empRank;
    }
    
    public String getEmpRank() {
    	return empRank;
    }
    
    public void setEmpSalary(int empSalary) {
    	this.empSalary = empSalary;
    }
    
    public int getEmpSalary() {
    	return empSalary;
    }
    
    // 해당 학생의 정보를 출력해주는 메소드
    public void printInfo() {
    	System.out.printf("번호: %04d번 이름: %s\n", empNumber, empName);
        System.out.println("부서: " + empDepartment + " 직급: " + empRank);
        System.out.println("월급: " + empSalary + "만원");
        
    }
}
