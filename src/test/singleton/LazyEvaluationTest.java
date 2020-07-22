package test.singleton;

import com.drapala.singleton.LazyEvaluation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class LazyEvaluationTest {

    @Test
    public void lazyEvaluationTest() {
        int value = 20;
        LazyEvaluation singleton = LazyEvaluation.getInstance();
        singleton.setValue(value);
        singleton = null;
        singleton = LazyEvaluation.getInstance();
        assertEquals(value, singleton.getValue());
    }

}
