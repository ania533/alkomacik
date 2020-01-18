package pl.code.academy.alkomacik.Service;
import lombok.ToString;
import org.springframework.stereotype.Service;
import pl.code.academy.alkomacik.Model.alkohole;
import pl.code.academy.alkomacik.Model.danePodstawowe;
import pl.code.academy.alkomacik.Model.gender;

import java.math.BigDecimal;

import static org.apache.coyote.http11.Constants.a;
import static pl.code.academy.alkomacik.Model.gender.KOBIETA;

@ToString
@Service

public class serviceAlkomacik implements IServiceAlkomat {
    public static final float density = 0.79f;


    public boolean checkGender(gender gender) {
        if (gender.equals(KOBIETA)) {
            return true;
        } else {
            return false;
        }
    }

    public float promilleCalculator(danePodstawowe danePodstawowe) {
        if (danePodstawowe.getAlkohole().equals(alkohole.wódka)) {
            float a = density * danePodstawowe.getQuanity() * danePodstawowe.getVolume() * 0.40f;
            return a;
        }
        if (danePodstawowe.getAlkohole().equals(alkohole.piwo)) {
            float a = density * danePodstawowe.getQuanity() * danePodstawowe.getVolume() * 0.05f;
            return a;
        }
        if (danePodstawowe.getAlkohole().equals(alkohole.wino)) {
            float a = density * danePodstawowe.getQuanity() * danePodstawowe.getVolume() * 0.12f;
            return a;
        }
        return 0;
    }

        public float ericPattern (danePodstawowe danePodstawowe){
            float k = checkGender(KOBIETA) ? 0.6f : 0.7f;
            float w = danePodstawowe.getWeight();
            float a = promilleCalculator(danePodstawowe);
            float wzórEricka = a / (k * w);
            return wzórEricka;
        }
    }








