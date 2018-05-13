package com.example.demo.service.Impl;

import com.example.demo.domain.grilDomain;
import com.example.demo.repository.grilRepository;
import com.example.demo.service.grilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class grilImpl implements grilService {

    @Autowired
    grilRepository _grilRepository;
    @Override
    public List<grilDomain> getGrilByAge(Integer age) {
        return _grilRepository.findAllByAge(age);
        //return null;
    }
}
