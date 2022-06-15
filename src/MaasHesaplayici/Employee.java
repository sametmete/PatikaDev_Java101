package MaasHesaplayici;

public class Employee {
    String name;
    double salary;
    int workHouse;
    int hireYear;

    Employee(String name, double salary, int workHouse, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHouse = workHouse;
        this.hireYear = hireYear;
    }

    public double tax() {
        double tax = 0.03;

            if (this.salary <= 1000) {
                return 0;
            }else if(this.salary > 1000) {
                return this.salary * tax;
            }else {
                return 0;
            }
    }

    public double bonus() {

            if (this.workHouse > 40) {
                double bonus = (this.workHouse - 40) * 30;
                return bonus;
            } else {
                return 0;
            }
    }

    public double raiseSalary() {
        double raiseSalary;
        int totalYear = 2021 - this.hireYear;
        if (totalYear < 10) {
            raiseSalary = this.salary * 0.05;
            return raiseSalary;
        } else if (totalYear > 9 && totalYear < 20) {
            raiseSalary = this.salary * 0.10;
            return raiseSalary;
        } else if (totalYear > 19) {
            raiseSalary = this.salary * 0.15;
            return raiseSalary;
        }else {
            return 0;
        }
    }

    public String toString(){
        double bonusTaxSalary = this.salary-tax()+bonus();
        double totalSalary = this.salary+raiseSalary();
        System.out.println("===================================================");
        System.out.println("Adi : "+this.name);
        System.out.println("Maasi : "+this.salary);
        System.out.println("Calisma saati : "+workHouse);
        System.out.println("Baslangic yili : "+hireYear);
        System.out.println("Vergi : "+tax());
        System.out.println("Bonus : "+bonus());
        System.out.println("Maas artisi : "+raiseSalary());
        System.out.println("Vergi ve bonuslar ile birlikte maas : "+bonusTaxSalary);
        System.out.println("Toplam maas : "+totalSalary);
        return null;
    }

}
