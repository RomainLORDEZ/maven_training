package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SampleTest {

    @Test
    void addition(){
        int numadd_1 = 3;
        int numadd_2 = 7;
        Sample sample = new Sample();
        int addition = sample.op(Sample.Operation.ADD,numadd_1,numadd_2);
        Assertions.assertThat(addition).isEqualTo(10);
    }

    @Test
    void multiplication(){
        int munmult_1 = 3;
        int munmult_2 = 7;
        Sample sample = new Sample();
        int multiplication = sample.op(Sample.Operation.MULT,munmult_1,munmult_2);
        Assertions.assertThat(multiplication).isEqualTo(21);
    }
}
