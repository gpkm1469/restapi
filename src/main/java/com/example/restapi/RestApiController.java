package com.example.restapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestApiController {

    @GetMapping("/students")
    public ResponseEntity<List<StudentDTO>> getStudents() {

        List<StudentDTO> studentList = new ArrayList<>();
        StudentDTO s1 = new StudentDTO("gk@test.com","gp","starter");
        StudentDTO s2 = new StudentDTO("kk@test.com","kk","intermediate");
        studentList.add(s1);
        studentList.add(s2);

        return ResponseEntity.ok(studentList);

    }

    @GetMapping("/hello")
    public ResponseEntity<String> getHello() {



        return ResponseEntity.ok("Hello Bud! Hope you are doing fine. Have a good day!");

    }

    @PostMapping("/iihreservev")
    public ResponseEntity<String> postReserveData(@RequestBody List<IIHReserveVDTO> iihReserveDataList) {

        System.out.println(iihReserveDataList.size());

        iihReserveDataList.forEach(i -> System.out.println(i.toString()));

        return ResponseEntity.ok("OKAY");

    }

}
