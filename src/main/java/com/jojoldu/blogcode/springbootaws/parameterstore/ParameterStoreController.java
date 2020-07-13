package com.jojoldu.blogcode.springbootaws.parameterstore;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jojoldu@gmail.com on 13/07/2020
 * Blog : http://jojoldu.tistory.com
 * Github : http://github.com/jojoldu
 */

@RequiredArgsConstructor
@RestController
public class ParameterStoreController {
    private final ParameterStoreProperties properties;

    @GetMapping("/parameter-store/key")
    public String getKey() {
        return properties.getEncryptKey();
    }
}
