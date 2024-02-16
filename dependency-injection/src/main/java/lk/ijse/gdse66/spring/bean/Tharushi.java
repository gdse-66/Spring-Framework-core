package lk.ijse.gdse66.spring.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("Long Hair")
public class Tharushi implements GoodGirl{
    @Override
    public void love() {
        System.out.println("Tharushi loves him so much");
    }
}
