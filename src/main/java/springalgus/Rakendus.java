package springalgus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Rakendus {
	@RequestMapping("/algus")
    String tervitusfunktsioon() {
        return "Tere hommikust!";
        //https://tluspringboot.herokuapp.com/algus
    }
    
    @RequestMapping("/tervitus")
    String tervitus2(String eesnimi){
        return "Tere, "+eesnimi;
        //https://tluspringboot.herokuapp.com/tervitus?eesnimi=Merily
    }
    
    @RequestMapping("/korrutus")
    int korrutamine (int a, int b){
        return a*b;
        //https://tluspringboot.herokuapp.com/korrutus?a=2&b=3
    }
    
    @RequestMapping("/division")
    String divide (int a, int b){
        return a+" divided by "+b+" equals "+a/b;
        //https://tluspringboot.herokuapp.com/division?a=2&b=3
    }
    
    @RequestMapping("/sum")
    int sum (String numbers) {
//        int sum = 0;
//        String[] numberSplit = numbers.split(",");
//        for (String n : numberSplit)
//            sum += Integer.parseInt(n.trim());
//        return sum;
        return java.util.Arrays.stream(numbers.split(",")).
                mapToInt(s -> Integer.parseInt(s.trim())).sum();
        //https://tluspringboot.herokuapp.com/sum?numbers=1,%202,%203,%204
    }
        
    public static void main(String[] args) {
		//System.getProperties().put("server.port", 40305);
        SpringApplication.run(Rakendus.class, args);
    }
}
