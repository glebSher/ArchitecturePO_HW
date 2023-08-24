package ModelElements;

import java.util.ArrayList;
import java.util.List;

/**
 * PoligonalModel
 */
public class PoligonalModel {

    public List<Poligon> Poligons;

    public List<Texture> Textures;

    public PoligonalModel(List<Texture> textures){
        Textures = textures;
        Poligons = new ArrayList<>(0);
    }
}