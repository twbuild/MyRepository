package com.example.demo.service;

import com.example.demo.domain.grilDomain;
import java.util.List;

public interface grilService {
    List<grilDomain> getGrilByAge(Integer age);
}
