package zzangmin.MySQL_DEMO.orderbyrand.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import zzangmin.MySQL_DEMO.orderbyrand.entity.Item_rand;
import zzangmin.MySQL_DEMO.orderbyrand.entity.Item_rand_improved;
import zzangmin.MySQL_DEMO.orderbyrand.repository.RandRepository;
import zzangmin.MySQL_DEMO.orderbyrand.service.RandService;

@RestController
@RequiredArgsConstructor
public class RandController {

    private final RandService randService;
    private final RandRepository randRepository;

    @GetMapping("randGet_V1")
    public List<Item_rand> randGet_V1() {
        return randRepository.findAll();
    }

    @GetMapping("randGet_V2")
    public List<Item_rand_improved> randGet_V2() {
        return randRepository.findAll_improved();
    }

}
