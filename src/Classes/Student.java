package Classes;

public class Student {
    String name;
    String stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;

    public Student(String name, String stuNo, int classes, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.isPass = false;

    }

    public void addBulkExamNote(int mat, int kimya, int fizik, int matSoz, int kimSoz, int fizSoz) {
        if ((mat >= 0 && mat <= 100) && (matSoz >= 0 && matSoz <= 100)) {
            this.mat.note = mat;
        }
        if ((kimya >= 0 && kimya <= 100) && (kimSoz >= 0 && kimSoz <= 100)) {
            this.kimya.note = kimya;
        }
        if ((fizik >= 0 && fizik <= 100) && (fizSoz >= 0 && fizSoz <= 100)) {
            this.fizik.note = fizik;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.kimya.note == 0 || this.fizik.note == 0) {
            System.out.println("Notlar tam olarak girilmemis.");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (isPass) {
                System.out.println("Sinifi gecti");
            } else {
                System.out.println("Sinifta kaldi.");
            }
        }
    }

    public void calcAvarage() {
        double matNote = (this.mat.note * 0.80) + (this.mat.sozluNotu * 0.20);
        double fizNote = (this.fizik.note * 0.80) + (this.fizik.sozluNotu * 0.20);
        double kimNote = (this.kimya.note * 0.80) + (this.kimya.sozluNotu * 0.20);
        this.avarage = (matNote + fizNote + kimNote) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote() {
        System.out.println("===============================");
        System.out.println("Ogrencinin adi : " + this.name);
        System.out.println("Matematik notu : " + this.mat.note);
        System.out.println("Fizik notu : " + this.fizik.note);
        System.out.println("Kimya notu : " + this.kimya.note);
    }

}
