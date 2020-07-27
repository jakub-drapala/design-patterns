package test.singleton;

import com.drapala.singleton.BillPugh;
import com.drapala.singleton.LazyEvaluation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Singleton {

    @Test
    public void lazyEvaluationTest() {
        int value = 20;
        LazyEvaluation singleton = LazyEvaluation.getInstance();
        singleton.setValue(value);
        singleton = null;
        singleton = LazyEvaluation.getInstance();
        assertEquals(value, singleton.getValue());
    }

    @Test
    public void billPughTest() {
        int value = 20;
        BillPugh singleton = BillPugh.getInstance();
        singleton.setValue(value);
        BillPugh singleton2 = BillPugh.getInstance();
        assertEquals(value, singleton2.getValue());
    }
}
