package kata7.view;

import kata7.model.Attribute;
import kata7.model.Histogram;
import java.util.List;

public class HistogramBuilder<T> {

    private final List<T> list;

    public HistogramBuilder(List<T> list) {
        this.list = list;
    }

    public <A> Histogram<A> build(Attribute<T, A> attribute) {
        Histogram<A> histogram = new Histogram<>();
        list.stream().forEach((item) -> {
            histogram.increment(attribute.get(item));
        });
        return histogram;
    }

}
