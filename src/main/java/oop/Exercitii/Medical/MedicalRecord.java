package oop.Exercitii.Medical;

public class MedicalRecord {
    private String nameDisease;
    private String diagnostic;
    private long ID;

    public MedicalRecord(String nameDisease, String diagnostic, long ID) {
        this.nameDisease = nameDisease;
        this.diagnostic = diagnostic;
        this.ID = ID;
    }

    public String getNameDisease() {
        return nameDisease;
    }

    public void setNameDisease(String nameDisease) {
        this.nameDisease = nameDisease;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "MedicalRecord{" +
                "nameDisease='" + nameDisease + '\'' +
                ", diagnostic='" + diagnostic + '\'' +
                ", ID=" + ID +
                '}';
    }
}
