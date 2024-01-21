package com.adozgen.learnjava.genericCollectionExamples.hospital;

import com.adozgen.learnjava.genericCollectionExamples.bookshop.Book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PatientHelper {
    public static Comparator<Patient> ageComparator = new Comparator<Patient>() {
        @Override
        public int compare(Patient p1, Patient p2) {
            return Integer.compare(p1.getAge(), p2.getAge());
        }
    };

    public static Comparator<Patient> emergencyComparator = new Comparator<Patient>() {
        @Override
        public int compare(Patient p1, Patient p2) {
            return Boolean.compare(p1.getIsEmergency(), p2.getIsEmergency());
        }
    };

    public List<Patient> findIsEmergency(List<Patient> patients){
        List<Patient> patientList = new ArrayList<>(patients);
        return patientList.stream().filter(Patient::getIsEmergency).toList();
    }

    public List<Patient> sortByAge(List<Patient> patients) {
        List<Patient> sortedPatients = new ArrayList<>(patients);
        sortedPatients.sort(ageComparator);
        return sortedPatients;
    }
    public List<Patient> sortByAgeAndEmergency(List<Patient> patients) {
        List<Patient> sortedPatients = new ArrayList<>(patients);
        sortedPatients.sort(emergencyComparator);
        sortedPatients.sort(ageComparator);
        return sortedPatients;
    }

}
