package pl.code.academy.alkomacik.Service;

import pl.code.academy.alkomacik.Model.danePodstawowe;
import pl.code.academy.alkomacik.Model.gender;

import java.math.BigDecimal;

public interface IServiceAlkomat {
    boolean checkGender (gender gender);
    float promilleCalculator(danePodstawowe danePodstawowe);
}
