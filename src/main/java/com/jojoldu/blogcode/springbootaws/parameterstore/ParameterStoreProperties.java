package com.jojoldu.blogcode.springbootaws.parameterstore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jojoldu@gmail.com on 12/07/2020
 * Blog : http://jojoldu.tistory.com
 * Github : http://github.com/jojoldu
 */

@Getter
@Setter
@NoArgsConstructor
@Configuration
public class ParameterStoreProperties {

    @Value("${encrypt.key}")
    private String encryptKey;
}
