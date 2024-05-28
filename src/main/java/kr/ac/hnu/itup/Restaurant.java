package kr.ac.hnu.itup;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data // 기본생성자, getters & setters, hashcode(), toSting()을 만들어 줌
public class Restaurant {
    String name;
    String address;
    String phone;
    Chef chef;
}