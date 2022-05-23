package zzangmin.MySQL_DEMO.orderbyrand.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import zzangmin.MySQL_DEMO.orderbyrand.entity.Item_rand;
import zzangmin.MySQL_DEMO.orderbyrand.repository.RandRepository;

@Service
@RequiredArgsConstructor
public class RandService {

    @Autowired
    private final RandRepository randRepository;

    @Transactional(readOnly = true)
    public List<Item_rand> findAllByRandom() {
        return randRepository.findAll();
    }




}
