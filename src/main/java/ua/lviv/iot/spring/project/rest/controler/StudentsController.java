package ua.lviv.iot.spring.project.rest.controler;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.spring.project.rest.models.Students;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@RequestMapping("/students")
@RestController
public class StudentsController {

    private final Map<Integer, Students> students = new HashMap<>();

    private final AtomicInteger idCounter = new AtomicInteger();

    @GetMapping
    public List<Students> getStudents() {
        return new LinkedList<Students>(students.values());
    }

    @GetMapping(path = "/{id}")
    public Students getStudent(final @PathVariable("id") Integer studentsId) {
        return students.get(studentsId);
    }

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public Students createStudent(@RequestBody Students students) {

        students.setId(idCounter.incrementAndGet());
        this.students.put(students.getId(), students);

        return students;
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Students> deleteStudent(@PathVariable("id") Integer studentId) {
        HttpStatus status = students.remove(studentId) == null ? HttpStatus.NOT_FOUND : HttpStatus.OK;

        return ResponseEntity.status(status).build();
    }

    @PutMapping(path = "/{id}")
    public Students updateStudents(final @PathVariable("id") Integer studentsId, final @RequestBody Students students) {
        students.setId(studentsId);
        return this.students.put(students.getId(), students);
    }
}


