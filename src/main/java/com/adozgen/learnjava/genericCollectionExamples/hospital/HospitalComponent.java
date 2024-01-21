package com.adozgen.learnjava.genericCollectionExamples.hospital;


import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class HospitalComponent {
    @PostConstruct
    public void init(){
        List<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Alice", 30, false));
        patients.add(new Patient("Bob", 40, true));
        patients.add(new Patient("Charlie", 25, true));

        PatientHelper patientHelper = new PatientHelper();


        // Yaşa Göre Sıralama
        List<Patient> sortedPatients = patientHelper.sortByAge(patients);
        System.out.println("Yaşa Göre Sıralama:" + sortedPatients);

        System.out.println("------------------------------------");

        List<Patient> sortedPatients2 = patientHelper.sortByAgeAndEmergency(patients);
        System.out.println("Aciliyet Durumu ve Yaşa Göre Sıralanan Hastalar: " + sortedPatients2);

        System.out.println("------------------------------------");

        List<Patient> sortedPatients3 = patientHelper.findIsEmergency(patients);
        System.out.println("Aciliyet Durumu: " + sortedPatients3);


    }
}
