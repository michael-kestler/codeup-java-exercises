package abstractClassNotes;

class Accountant extends Employee {
    public Accountant(String name, String department) {
        super(name, department);
    }

    public String work(){
        return "crunching numbers";
    }
}
