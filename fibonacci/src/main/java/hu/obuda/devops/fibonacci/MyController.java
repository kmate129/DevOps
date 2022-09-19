package hu.obuda.devops.fibonacci;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MyController {

    @Autowired
    MyService service;
    
    @GetMapping("/fibonacci/{n}")
    public String Fibonacci(@PathVariable("n") Integer n )
    {
        ArrayList<Integer> values = this.service.GetFibonaccis(n);

        
    }
}
