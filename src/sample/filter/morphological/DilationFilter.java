package sample.filter.morphological;

import javafx.scene.image.WritableImage;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;

public class DilationFilter extends AbstractMorphological {

    public DilationFilter(WritableImage writableImage) {
        super(writableImage);
    }

    @Override
    protected Integer getColorKey() {
        return Collections.max(map.entrySet(), Comparator.comparingInt(Map.Entry::getKey)).getKey();
    }
}
