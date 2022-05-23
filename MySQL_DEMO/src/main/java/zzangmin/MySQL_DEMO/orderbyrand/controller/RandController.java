package zzangmin.MySQL_DEMO.orderbyrand.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import zzangmin.MySQL_DEMO.orderbyrand.entity.Item_rand;
import zzangmin.MySQL_DEMO.orderbyrand.service.RandService;

@RestController
@RequiredArgsConstructor
public class RandController {

    private final RandService randService;

    @GetMapping("randGet_V1")
    public List<Item_rand> randGet_V1() {
        return randService.findAllByRandom();

    }

//    @GetMapping("randGet_V2")
//    public String randGet_V2() {
//
//        return "redirect:/";
//    }

}
