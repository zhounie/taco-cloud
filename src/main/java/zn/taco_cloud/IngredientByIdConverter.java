package zn.taco_cloud;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import zn.taco_cloud.Ingredient.Type;

// ingredientMap.put("FLIO", new Ingredient("FLTO", "Flour Tortilla", Type.WRAP));
// ingredientMap.put("COTO", new Ingredient("COTO", "Gorn Tortilla", Type.WRAP));
// ingredientMap.put("GRBF", new Ingredient("GRBF", "Ground Beef", Type.PROTEIN));
// ingredientMap.put("CARN", new Ingredient("CARN", "Carnitas", Type.PROTEIN));
// ingredientMap.put("TMTO", new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES));
// ingredientMap.put("LETC", new Ingredient("LETC", "Lettuce", Type.VEGGIES));
// ingredientMap.put("GHED", new Ingredient("GHED", "Cheddar", Type.CHEESE));
// ingredientMap.put("JACK", new Ingredient("JACK", "Monterrey Jack", Type.CHEESE));
// ingredientMap.put("SLSA", new Ingredient("SLSA", "Salsa", Type.SAUCE));
// ingredientMap.put("SRCR", new Ingredient("SRCR", "Sour Cream", Type.SAUCE));

@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {

    private IngredientRepository ingredientRepository;

    public IngredientByIdConverter(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public Ingredient convert(String id) {
        return ingredientRepository.findById(id).orElse(null);
    }
}
