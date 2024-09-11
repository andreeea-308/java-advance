package oop.Exercitii.Medical;

import java.util.ArrayList;
import java.util.List;

public class Patient {
    private String name;
    private int age;
    private MedicalRecord medicalRecord;
    private List<Medication> medication;

    public Patient(String name, int age, MedicalRecord medicalRecord) {
        this.name = name;
        this.age = age;
        this.medicalRecord = medicalRecord;
        this.medication = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MedicalRecord getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(MedicalRecord medicalRecord) {
        this.medicalRecord = medicalRecord;
    }

    public List<Medication> getMedication() {
        return medication;
    }

    public void setMedication(List<Medication> medication) {
        this.medication = medication;
    }

    public void add(Medication medication) {
        this.medication.add(medication);
    }

    public void displayMedication() {
        System.out.println(this.medication);
    }

    public void updateMedicalRecord(MedicalRecord medicalRecord1) {
        setMedicalRecord(medicalRecord1);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", medicalRecord=" + medicalRecord +
                ", medication=" + medication +
                '}';
    }
}
