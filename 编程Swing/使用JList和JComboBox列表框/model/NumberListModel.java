package Java.编程Swing.使用JList和JComboBox列表框.model;

import javax.swing.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class NumberListModel extends AbstractListModel<BigDecimal> {
    BigDecimal start;
    BigDecimal end;
    BigDecimal step;

    public NumberListModel(BigDecimal start, BigDecimal end, BigDecimal step) {
        this.start = start;
        this.end = end;
        this.step = step;
    }

    @Override
    public int getSize() {
        int floor = (int) Math.floor(end.subtract(step).divide(step, 2, RoundingMode.HALF_DOWN).doubleValue());
        return floor + 1 ;
    }

    @Override
    public BigDecimal getElementAt(int index) {
        BigDecimal ele = new BigDecimal(index).multiply(step).add(step).setScale(2, RoundingMode.HALF_DOWN);
        return ele;
    }
}