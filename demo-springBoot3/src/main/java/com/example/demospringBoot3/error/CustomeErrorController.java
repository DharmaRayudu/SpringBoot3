package com.example.demospringBoot3.error;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomeErrorController implements ErrorController {
    private static final String PATH="/error";

    @RequestMapping(PATH)
    //@ResponseBody
    public ProblemDetail handle404() {
        ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, "Requested URL does not exist");
        return problemDetail;
    }

//    @Override
//    public String getErrorPath() {
//        return PATH;
//    }
}
