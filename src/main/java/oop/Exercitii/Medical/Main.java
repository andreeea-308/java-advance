package oop.Exercitii.Medical;
/*Exercise 3: Encapsulation
    Develop a healthcare system where patients have medical records and medications. Create classes for Patient, MedicalRecord,
    and Medication. Encapsulate the medical record and medication information within the Patient class, allowing access only through
    methods like addMedication() and updateMedicalRecord(). Ensure that medications and medical records are kept private and
    only accessible through appropriate methods like getMedications() and getMedicalRecord().
 */
public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Ana", 36,
                new MedicalRecord("Gripa", "Boală infecțioasă cauzată de un virus Influenza", 654835));
        patient.add(new Medication("Paracetamol", new MedicationType("Pastila"), 25.5));
        patient.displayMedication();
        System.out.println(patient);
        patient.updateMedicalRecord(new MedicalRecord("Sanatos", "-", patient.getMedicalRecord().getID()));
        System.out.println(patient);
    }
}
