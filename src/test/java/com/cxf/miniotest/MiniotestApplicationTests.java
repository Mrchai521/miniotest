package com.cxf.miniotest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MiniotestApplicationTests {

    @Test
    void contextLoads() {
        String A= "a";
        String B = "a";
        System.out.println(A==B);
        System.out.println(A.equals(B));
        System.out.println((A==B)&&(A.equals(B)));

    }

}
