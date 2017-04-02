package Transformation;
import cucumber.api.Transformer;

public class SummTransformer extends Transformer<Integer> {

    @Override
    public Integer transform(String summ)
    {
        return summ.length();
    }
}
