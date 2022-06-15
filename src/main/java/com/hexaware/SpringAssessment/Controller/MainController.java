package com.hexaware.SpringAssessment.Controller;

import com.hexaware.SpringAssessment.Entity.Books;
import com.hexaware.SpringAssessment.Entity.Library;
import com.hexaware.SpringAssessment.Service.DataService;
import com.hexaware.SpringAssessment.Service.DataServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


@RestController
public class MainController {

    @Autowired
    private DataService service;

    @GetMapping("/getbooks")
    public List<Map> GetBooks(){

        Function<Library, Map> getBook = (library) -> {
            Map<String, List> returnThis = new HashMap<>();
            List<Books> books = this.service.findAllGroupByLibrary(library).stream().toList();
            returnThis.put(library.getLibraryName(), books);
            return returnThis;
        };
        return this.service.getAllLibrary().stream().map(getBook).collect(Collectors.toList());
//        return z;
    }

    @GetMapping("/countbooks")
    public List<Map> CountBooks(){
        Function<Library, Map> getBookCount = (library) -> {
            Map<String, Long> returnThis = new HashMap<>();
            long bookCount = this.service.findAllGroupByLibrary(library).stream().count();
            returnThis.put(library.getLibraryName(), bookCount);
            return returnThis;
        };
        return this.service.getAllLibrary().stream().map(getBookCount).collect(Collectors.toList());
    }


}
