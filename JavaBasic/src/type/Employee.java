package type;

public class Employee {
	private int empNumber;
    private String empName;
    private String empDepartment;
    private String empRank;
    private int empSalary;
    
    
    
    public int getEmpNumber() {
		return empNumber;
	}



	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}



	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public String getEmpDepartment() {
		return empDepartment;
	}



	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}



	public String getEmpRank() {
		return empRank;
	}



	public void setEmpRank(String empRank) {
		this.empRank = empRank;
	}



	public int getEmpSalary() {
		return empSalary;
	}



	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	// equals()
	public boolean equals(Object o) {
		if (o instanceof Employee) {
			Employee e = (Employee)o;
			if (this.empNumber == e.empNumber) {
                return true;
			}    
		}
		return false;
	}
	

	// 해당 학생의 정보를 출력해주는 메소드
    public void printInfo() {
    	System.out.printf("번호: %04d번 이름: %s\n", empNumber, empName);
        System.out.println("부서: " + empDepartment + " 직급: " + empRank);
        System.out.println("월급: " + empSalary + "만원");
        
    }
}
